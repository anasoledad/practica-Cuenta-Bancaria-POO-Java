package cuentabancaria;

public class Cuenta {
	int numeroCuenta;
	int dni;
	String titular;
	int saldo;
	
	public Cuenta() {
		super();
	}

	public Cuenta(int numeroCuenta, int dni, String titular, int saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void mostrarDatos() {
		System.out.println("Número de Cueta: " + numeroCuenta + ", dni: " + dni + ", titular: " + titular + ", saldo: " + saldo);
	}
	
	public void cargarSaldo(int carga) {
		saldo = saldo + carga;
	}
	
	
}
