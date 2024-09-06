package it.mbaziekone.footballsimulator.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.EnumMap;
import java.util.Map;

import it.mbaziekone.footballsimulator.game.MentalAttribute;
import it.mbaziekone.footballsimulator.game.PhysicalAttribute;
import it.mbaziekone.footballsimulator.game.PlayerRole;
import it.mbaziekone.footballsimulator.game.TechnicalAttribute;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "preferred_foot")
	private String preferredFoot;
	
	@Column(name = "annual_salary")
	private BigDecimal annualSalary;
	
	@Column(name = "monthly_salary")
	private BigDecimal monthlySalary;
	
	@Column(name = "market_value")
	private BigDecimal marketValue;
	
	@ManyToOne
	@JoinColumn(name = "team_id")
	private Team team;
	
	@ManyToOne
	@JoinColumn(name = "nation_id")
	private Nation nationality;
	
	// Roles
	@ElementCollection
	@CollectionTable(name = "player_roles", joinColumns = @JoinColumn(name="player_id"))
	@MapKeyColumn(name = "attribute_name")
	@Enumerated(EnumType.STRING)
	@Column(name = "attribute_value")
	private Map<PlayerRole, Integer> roles = new EnumMap<>(PlayerRole.class);
	
	// Technical attributes
	@ElementCollection
    @CollectionTable(name = "technical_attributes", joinColumns = @JoinColumn(name = "player_id"))
    @MapKeyColumn(name = "attribute_name")
	@Enumerated(EnumType.STRING)
    @Column(name = "attribute_value")
    private Map<TechnicalAttribute, Integer> technicalAttributes = new EnumMap<>(TechnicalAttribute.class);
	
	// Mental attributes
	@ElementCollection
    @CollectionTable(name = "mental_attributes", joinColumns = @JoinColumn(name = "player_id"))
    @MapKeyColumn(name = "attribute_name")
    @Column(name = "attribute_value")
    private Map<MentalAttribute, Integer> mentalAttributes = new EnumMap<>(MentalAttribute.class);
	
	// Physical attributes
	@ElementCollection
    @CollectionTable(name = "physical_attributes", joinColumns = @JoinColumn(name = "player_id"))
    @MapKeyColumn(name = "attribute_name")
	@Enumerated(EnumType.STRING)
    @Column(name = "attribute_value")
    private Map<PhysicalAttribute, Integer> physicalAttributes = new EnumMap<>(PhysicalAttribute.class);
		
	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPreferredFoot() {
		return preferredFoot;
	}

	public void setPreferredFoot(String preferredFoot) {
		this.preferredFoot = preferredFoot;
	}

	public BigDecimal getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(BigDecimal annualSalary) {
		this.annualSalary = annualSalary;
	}

	public BigDecimal getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(BigDecimal monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public BigDecimal getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Nation getNationality() {
		return nationality;
	}

	public void setNationality(Nation nationality) {
		this.nationality = nationality;
	}
	
	public String getNationalityName() {
		return nationality != null ? nationality.getName() : "Unknown";
	}

	public Map<PlayerRole, Integer> getRoles() {
		return roles;
	}

	public void setRoles(Map<PlayerRole, Integer> roles) {
		this.roles = roles;
	}

	public Map<TechnicalAttribute, Integer> getTechnicalAttributes() {
		return technicalAttributes;
	}

	public void setTechnicalAttributes(Map<TechnicalAttribute, Integer> technicalAttributes) {
		this.technicalAttributes = technicalAttributes;
	}

	public Map<MentalAttribute, Integer> getMentalAttributes() {
		return mentalAttributes;
	}

	public void setMentalAttributes(Map<MentalAttribute, Integer> mentalAttributes) {
		this.mentalAttributes = mentalAttributes;
	}

	public Map<PhysicalAttribute, Integer> getPhysicalAttributes() {
		return physicalAttributes;
	}

	public void setPhysicalAttributes(Map<PhysicalAttribute, Integer> physicalAttributes) {
		this.physicalAttributes = physicalAttributes;
	}
	
}
