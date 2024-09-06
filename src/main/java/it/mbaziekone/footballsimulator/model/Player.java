package it.mbaziekone.footballsimulator.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
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
	private String fistName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "preffered_foot")
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
	
	@ElementCollection
	@CollectionTable(name = "player_attributes", joinColumns = @JoinColumn(name="player_id"))
	@MapKeyColumn(name = "attribute_name")
	@Column(name = "attribute_value")
	private Map<String, Integer> attributes = new HashMap<>();

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
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

	public Map<String, Integer> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, Integer> attributes) {
		this.attributes = attributes;
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
}
