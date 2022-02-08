import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//declaramos variables
		int longitud = 0;
		//pedimos datos al usuario
		System.out.println("Escriba una longitud para su contrase�a");
		longitud = teclado.nextInt();
		
		//generamos la primera instancia
		Password contrasena1 = new Password();
		//almacenamos su contrase�a en un string
		String ps = contrasena1.generarPassword(5);
		
		//le ponemos una contrase�a y mostramos por consola
		contrasena1.setContrasena(ps);
		System.out.println(contrasena1.getContrasena());
		
		
		//por consola mostraremos si es fuerte o no...
		if(contrasena1.esFuerte(ps)) {
			System.out.println("Su contrase�a es fuerte");
			
		}else {
			System.out.println("Contrase�a debil");
			
		}
		
		//generamos la segunda instancia
		Password contrasena2 = new Password(longitud);
		
		//almacenamos la contrase�a en un string
		String ps2 = contrasena2.generarPassword(longitud);
		
		//mostramos por consola la contrase�a
		System.out.println(contrasena2.getContrasena());
		
		//comprobamos si es fuerte o no y mostramos por consola
		if(contrasena2.esFuerte(ps2)) {
			System.out.println("Su contrase�a es fuerte");
			
		}else {
			System.out.println("Contrase�a debil");
			
		}
		
		
		

	}

}
