package it.mbaziekone.footballsimulator.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "palyers")
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
	
	@MapKeyColumn(name = "attribute_name")
	@Column(name = "attribute_value")
	private Map<String, Integer> attributes = new HashMap<>();

}
