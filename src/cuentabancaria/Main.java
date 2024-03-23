package cuentabancaria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuenta cuenta1 = new Cuenta(485959, 39558584, "María", 2000);
		
		cuenta1.mostrarDatos();
		cuenta1.cargarSaldo(5000);
		cuenta1.mostrarDatos();

	}

}
