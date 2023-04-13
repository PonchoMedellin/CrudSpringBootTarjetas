package com.mx.CrudSpringBootTarjetas.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Entity
@Table(name="AATARJETAS")


public class Tarjetas {
	@Id
	private int id;
	private String tipo_tarjeta;
	private String banco;
	private String titular;
	@Column(name ="NUMTARJETA",columnDefinition="NVARCHAR2(100)")
	private String numTarjeta;
	private Date fechaVencimiento;
	private int cvv;
	private double saldo;
	

}
