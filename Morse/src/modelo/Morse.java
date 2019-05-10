package modelo;
import static javax.swing.JOptionPane.*;
public class Morse {
	
	public String convertirCaracterMorse(char caracter) {
		String cadena="";
		switch (caracter) {
		case 'a':
			cadena=".-";
			break;
		case 'b':
			cadena="-...";
			break;
		case 'c':
			cadena="-.-.";
			break;
		case 'd':
			cadena="-..";
			break;
		case 'e':
			cadena=".";
			break;
		case 'f':
			cadena="..-.";
			break;
		case 'g':
			cadena="--.";
			break;
		case 'h':
			cadena="....";
			break;
		case 'i':
			cadena="..";
			break;
		case 'j':
			cadena=".---";
			break;
		case 'k':
			cadena="-.-";
			break;
		case 'l':
			cadena=".-..";
			break;
		case 'm':
			cadena="--";
			break;
		case 'n':
			cadena="-.";
			break;
		case 'o':
			cadena="---";
			break;
		case 'p':
			cadena=".--.";
			break;
		case 'q':
			cadena="--.-";
			break;
		case 'r':
			cadena=".-.";
			break;
		case 's':
			cadena="...";
			break;
		case 't':
			cadena="-";
			break;
		case 'u':
			cadena="..-";
			break;
		case 'v':
			cadena="...-";
			break;
		case 'w':
			cadena=".--";
			break;
		case 'x':
			cadena="-..-";
			break;
		case 'y':
			cadena="-.--";
			break;
		case 'z':
			cadena="--..";
			break;
		case '0':
			cadena="-----";
			break;
		case '1':
			cadena=".----";
			break;
		case '2':
			cadena="..---";
			break;
		case '3':
			cadena="...--";
			break;
		case '4':
			cadena="....-";
			break;
		case '5':
			cadena=".....";
			break;
		case '6':
			cadena="-....";
			break;
		case '7':
			cadena="--...";
			break;
		case '8':
			cadena="---..";
			break;
		case '9':
			cadena="----.";
			break;
		case ' ':
			cadena=" ";
			break;	
		default:
			showMessageDialog(null, "Caracter no valido", "Error", ERROR_MESSAGE);
			break;
		}
		return cadena;
	}
	
	public String convertirMorseCaracter(String cadena) {
		String salida="";
		if(cadena.equalsIgnoreCase(".-")){
			salida+="a";
		}else if(cadena.equalsIgnoreCase("-...")) {
			salida+="b";
		}else if(cadena.equalsIgnoreCase("-.-.")) {
			salida+="c";
		}else if(cadena.equalsIgnoreCase("-..")) {
			salida+="d";
		}else if(cadena.equalsIgnoreCase(".")) {
			salida+="e";
		}else if(cadena.equalsIgnoreCase("..-.")) {
			salida+="f";
		}else if(cadena.equalsIgnoreCase("--.")) {
			salida+="g";
		}else if(cadena.equalsIgnoreCase("....")) {
			salida+="h";
		}else if(cadena.equalsIgnoreCase("..")) {
			salida+="i";
		}else if(cadena.equalsIgnoreCase(".---")) {
			salida+="j";
		}else if(cadena.equalsIgnoreCase("-.-")) {
			salida+="k";
		}else if(cadena.equalsIgnoreCase(".-..")) {
			salida+="l";
		}else if(cadena.equalsIgnoreCase("--")) {
			salida+="m";
		}else if(cadena.equalsIgnoreCase("-.")) {
			salida+="n";
		}else if(cadena.equalsIgnoreCase("---")) {
			salida+="o";
		}else if(cadena.equalsIgnoreCase(".--.")) {
			salida+="p";
		}else if(cadena.equalsIgnoreCase("--.-")) {
			salida+="q";
		}else if(cadena.equalsIgnoreCase(".-.")) {
			salida+="r";
		}else if(cadena.equalsIgnoreCase("...")) {
			salida+="s";
		}else if(cadena.equalsIgnoreCase("-")) {
			salida+="t";
		}else if(cadena.equalsIgnoreCase("..-")) {
			salida+="u";
		}else if(cadena.equalsIgnoreCase("...-")) {
			salida+="v";
		}else if(cadena.equalsIgnoreCase(".--")) {
			salida+="w";
		}else if(cadena.equalsIgnoreCase("-..-")) {
			salida+="x";
		}else if(cadena.equalsIgnoreCase("-.--")) {
			salida+="y";
		}else if(cadena.equalsIgnoreCase("--..")) {
			salida+="z";
		}else if(cadena.equalsIgnoreCase("-----")) {
			salida+="0";
		}else if(cadena.equalsIgnoreCase(".----")) {
			salida+="1";
		}else if(cadena.equalsIgnoreCase("..---")) {
			salida+="2";
		}else if(cadena.equalsIgnoreCase("...--")) {
			salida+="3";
		}else if(cadena.equalsIgnoreCase("....-")) {
			salida+="4";
		}else if(cadena.equalsIgnoreCase(".....")) {
			salida+="5";
		}else if(cadena.equalsIgnoreCase("-....")) {
			salida+="6";
		}else if(cadena.equalsIgnoreCase("--...")) {
			salida+="7";
		}else if(cadena.equalsIgnoreCase("---..")) {
			salida+="8";
		}else if(cadena.equalsIgnoreCase("----.")) {
			salida+="9";
		}else if(cadena.equalsIgnoreCase("$")) {
			salida+=" ";
		}else {	
			showMessageDialog(null, "Caracter no valido", "Error", ERROR_MESSAGE);
		}
		return salida;
	}

}
