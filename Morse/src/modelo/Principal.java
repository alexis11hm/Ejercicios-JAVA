package modelo;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Morse m = new Morse();
		System.out.println("Ingresa la cadena de texto o codigo Morse: ");
		String lectura=scan.nextLine().toString().toLowerCase();
		int i=0;
		String principio=lectura.charAt(0)+"";
		String [] vector = new String[lectura.length()];
		for ( i= 0;  i< vector.length; i++) {
			if(lectura.charAt(i)==' ') {
				vector[i]="&";
			}else {
				vector[i]=lectura.charAt(i)+"";
			}
		}
		if(principio.equalsIgnoreCase(".") || principio.equalsIgnoreCase("-")) {
			for (i = 0; i < vector.length; i++) {
				if(vector[i]=="&" && vector[i+1]=="&" && vector[i+2]=="&") {
					vector[i+1]="$";
				}
			}
			lectura="";
			for (i = 0; i < vector.length; i++) {
				lectura+=vector[i];
			}
			String [] palabras =lectura.split("&");
			for (i = 0; i < palabras.length; i++) {
				System.out.print(m.convertirMorseCaracter(palabras[i]));
			}
		}else {
			for (i =0; i < lectura.length(); i++) {
				System.out.print(m.convertirCaracterMorse(lectura.charAt(i))+" ");
			}
		}
	}
}
