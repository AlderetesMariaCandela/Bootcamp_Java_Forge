package com.alderetesmaria.bankaccount.bank;

public class BankAccount {

	private String nCuenta;
	private double saldoCtaCte;
	private double saldoCtaA;
	private static int nCuentasCreadas= 0;
	private static double saldoGral;
	
	
	public BankAccount() {
		nCuentasCreadas+=1;
		this.nCuenta= crearN(nCuentasCreadas);
	}

	private String crearN(int n) {
		
		String base = "0000000000";
		int digitos = String.valueOf(n).length();
		return base.substring(0, 10-digitos) + n;
	}

	public String getnCuenta() {
		return nCuenta;
	}

	public double getSaldoCtaCte() {
		return saldoCtaCte;
	}

	public void setSaldoCtaCte(double saldoCtaCte) {
		this.saldoCtaCte += saldoCtaCte;
		depositarSaldoGral(saldoCtaCte);
	}

	public double getSaldoCtaA() {
		return saldoCtaA;
	}

	public void setSaldoCtaA(double saldoCtaA) {
		this.saldoCtaA += saldoCtaA;
		depositarSaldoGral(saldoCtaA);
	}

	public static int getnCuentasCreadas() {
		return nCuentasCreadas;
	}

	public static double getSaldoGral() {
		return saldoGral;
	}

	private static void depositarSaldoGral(double saldo) {
		BankAccount.saldoGral += saldo;
	}
	private static void extraerSaldoGral(double saldo) {
		BankAccount.saldoGral -= saldo;
	}
	public double extraerCtaCte(double extraccion) {
		if (extraccion < saldoCtaCte) {
			this.saldoCtaCte -= extraccion;
			extraerSaldoGral(extraccion);
			return extraccion;
		}
		System.out.println("Saldo insuficiente");
		return 0;
	}
	public double extraerCtaAh(double extraccion) {
		if (extraccion < saldoCtaA) {
			this.saldoCtaA -= extraccion;
			extraerSaldoGral(extraccion);
			return extraccion;
		}
		System.out.println("Saldo insuficiente");
		return 0;
	}
	
}
