package com.alderetesmaria.bankaccount;

import com.alderetesmaria.bankaccount.bank.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount usuario1 = new BankAccount();
		usuario1.setSaldoCtaCte(10);
		usuario1.extraerCtaCte(5);
		usuario1.setSaldoCtaA(10);
		usuario1.extraerCtaAh(9);
		
		System.out.println("El n° de cta de usuario: " + usuario1.getnCuenta());
		System.out.println("Su saldo en CTA CTE es de: " + usuario1.getSaldoCtaCte());
		System.out.println("Su saldo en CTA AHORRO es de: " + usuario1.getSaldoCtaA());
		System.out.println("EL SALDO DEL BANCO ES DE: " + BankAccount.getSaldoGral());
	
	}
}
