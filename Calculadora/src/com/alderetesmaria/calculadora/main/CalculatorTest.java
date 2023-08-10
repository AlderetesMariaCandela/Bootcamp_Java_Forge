package com.alderetesmaria.calculadora.main;

import com.alderetesmaria.calculadora.objetocalculadora.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Calculadora");
		
		Calculator operacion1 = new Calculator();
		
		operacion1.setOperandOne(10.5);
		
		operacion1.setOperation('+');
		
		operacion1.setOperandTwo(5.2);
		
		operacion1.performOperation();
		
		System.out.println("Resultado: " + operacion1.getResult());
	}

}
