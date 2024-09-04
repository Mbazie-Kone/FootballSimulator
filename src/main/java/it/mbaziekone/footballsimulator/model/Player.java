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
	
	private String lastName;
	
	private LocalDate dateOfBirth;
	
	private String preferredFoot;
	
	private BigDecimal annualSalary;
	
	private BigDecimal monthlySalary;
	
	private BigDecimal marketValue;

}
