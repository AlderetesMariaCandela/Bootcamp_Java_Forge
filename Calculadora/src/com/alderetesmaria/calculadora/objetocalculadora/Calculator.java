package com.alderetesmaria.calculadora.objetocalculadora;

import com.alderetesmaria.calculadora.interfaces.Operacion;

public class Calculator implements Operacion {

	private double numero1;
	private double numero2;
	private double result;
	private char operation;
	
	public void setOperandOne(double numero){
		this.numero1 = numero;
	}
	public double getOperandOne() {
		return numero1;
	}
	public void setOperandTwo(double numero){
		this.numero2 = numero; 
	}
	public double getOperandTwo() {
		return numero2;
	}
	public double getResult() {
		return result;
	}
	public void setOperation(char operador) {
		this.operation = operador;
	}
	
	public void performOperation() {
		
		if (operation  == '+') {
			this.result = this.numero1 + this.numero2;
		}
		
	}
}
