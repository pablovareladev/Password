import java.util.Random;

public class Password {

	//atributos
	private int longitud;
	private String contrasena;

	//constructores

	public Password() {

	}

	public Password(int l) {

		this.longitud = l;
		this.contrasena = generarPassword(l); 

	}


	//getters y setters

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int l) {
		this.longitud = l;
	}

	public String getContrasena(){
		return contrasena;
	}

	public void setContrasena(String c) {
		this.contrasena = c;
	}

	//metodos

	public boolean esFuerte(String c) {

		int contador = 0; 

		for(int i = 0; i < c.length(); i++) {

			//comprobacion de vocales y puntos
			if(c.charAt(i) == 'a' || c.charAt(i) == 'e' || c.charAt(i) == 'i' || 
					c.charAt(i) == 'o' || c.charAt(i) == 'u') {

				contador ++;

			}
		}

		if(c.contains(".") && contador >= 6) {
			return true;

		}else if(contador < 6){
			return false;
		}

		return false;
	}

	public String generarPassword(int l) {
		Random random = new Random();
		char aleatorio = ' ';
		String pass = "";

		for(int i = 0; i < l; i++) {
			
			aleatorio = (char) (random.nextInt(26) + 'a');
			
			//vamos concatenando los char al string
			pass += aleatorio;
			
		}
		
		pass = pass + '.';
		
		return pass;
	}

}
