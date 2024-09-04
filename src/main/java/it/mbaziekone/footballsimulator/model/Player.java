package it.mbaziekone.footballsimulator.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	@Column(name = "first_name")
	private BigDecimal monthlySalary;
	
	@Column(name = "first_name")
	private BigDecimal marketValue;

}
