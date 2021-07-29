package com.example.tarjetas.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="tarjetas")
public class Tarjetas {
	
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

	private String passion;
	
	private Long minsalary;
	
	private Long maxsalary;
	
	private Long minage;
	
	private Long maxage;
	
	private String cards;

	
	public Tarjetas() {}


	
}
