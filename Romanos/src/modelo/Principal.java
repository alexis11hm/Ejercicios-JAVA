package modelo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digita un numero entero entre el 1 y 1000");
		String numero = scan.nextLine();
		String romano = "";
		if(Integer.parseInt(numero)<=1000) {
			if(Integer.parseInt(numero) == 1000) {
				romano += "M";
			}else {
				if(Integer.parseInt(numero)>=100) {
					romano+=convertirCentenas(Integer.parseInt(numero.charAt(0)+"00"));
					romano+=convertirDecenas(Integer.parseInt(numero.charAt(1)+"0"));
					romano+=convertirUnidades(Integer.parseInt(numero.charAt(2)+""));
				}else if(Integer.parseInt(numero)>=10) {
					romano+=convertirDecenas(Integer.parseInt(numero.charAt(0)+"0"));
					romano+=convertirUnidades(Integer.parseInt(numero.charAt(1)+""));
				}else if(Integer.parseInt(numero)>=1) {
					romano+=convertirUnidades(Integer.parseInt(numero.charAt(0)+""));
				}
			}
		}
		System.out.println("La conversión de "+numero+" a Romano es "+romano);
	}
	
	
	public static String convertirCentenas(int numero) {
		String centenas = "";
		if(numero >= 900) {
			centenas+="CM";
		}else if(numero >= 800){	
			centenas+="DCCC";
		}else if(numero >= 700) {
			centenas+="DCC";
		}else if(numero >= 600) {
			centenas+="DC";
		}else if(numero >= 500) {
			centenas+="D";
		}else if(numero >= 400) {
			centenas+="CD";
		}else if(numero >= 300) {
			centenas+="CCC";
		}else if(numero >= 200) {
			centenas+="CC";
		}else if(numero >= 100) {
			centenas+="C";
		}
		return centenas;
	}
	public static String convertirDecenas(int numero) {
		String decenas = "";
		if(numero >= 90) {
			decenas+="XC";
		}else if(numero >= 80){	
			decenas+="LXXX";
		}else if(numero >= 70) {
			decenas+="LXX";
		}else if(numero >= 60) {
			decenas+="LX";
		}else if(numero >= 50) {
			decenas+="L";
		}else if(numero >= 40) {
			decenas+="XL";
		}else if(numero >= 30) {
			decenas+="XXX";
		}else if(numero >= 20) {
			decenas+="XX";
		}else if(numero >= 10) {
			decenas+="X";
		}
		return decenas;
	}
	public static String convertirUnidades(int numero) {
		String unidades = "";
		if(numero >= 9) {
			unidades+="IX";
		}else if(numero >= 8){	
			unidades+="VIII";
		}else if(numero >= 7) {
			unidades+="VII";
		}else if(numero >= 6) {
			unidades+="VI";
		}else if(numero >= 5) {
			unidades+="V";
		}else if(numero >= 4) {
			unidades+="IV";
		}else if(numero >= 3) {
			unidades+="III";
		}else if(numero >= 2) {
			unidades+="II";
		}else if(numero >= 1) {
			unidades+="I";
		}
		return unidades;
	}
}
