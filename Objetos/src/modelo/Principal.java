package modelo;
import java.util.*;
public class Principal {
	
	float lado;
	
	public static void main(String[] args) {
		
	new Principal().obtenerValor();
	}
	
	
	public void obtenerValor() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el valor del lado: ");
		lado=scan.nextFloat();
		menuPrincipal();
	}
	
	
	public void menuPrincipal() {
		Cubo c = new Cubo(lado);
		Scanner scan = new Scanner(System.in);
		String m="*******MENU*******\n";
			   m+="1)Calcular Area del Cuadrado\n";
			   m+="2)Calcular Perimetro del Cuadrado\n";
			   m+="3)Calcular Volumen del Cubo\n";
			   m+="4)Calcular Area del Cubo\n";
			   m+="5)Cancelar\n";
			   m+="6)Salir\n";
			   m+="++Elige una opcion++";
	    System.out.println(m);
		int opcion=scan.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("El area del cuadrado es: "+c.calcularArea());
			menuSecundario();
			break;
		case 2:
			System.out.println("El perimetro del cuadrado es: "+c.calcularPerimetroC());
			menuSecundario();
			break;
		case 3:
			System.out.println("El volumen del cubo es: "+c.calcularVolumen());	
			menuSecundario();
			break;
		case 4:
			System.out.println("El perimetro del cubo es: "+c.calcularPerimetro());
			menuSecundario();
			break;
		case 5:
			obtenerValor();
			break;
		case 6:
			System.err.println("Programa Terminado!");
			System.exit(0);
			break;
		}
			   
	}
	
	public void menuSecundario() {
		Scanner scan = new Scanner(System.in);
		String ms="*******OPCIONES*******\n";
		   ms+="1)Menu Principal\n";
		   ms+="2)Salir\n";
		   ms+="**Elige una opcion**";
		   System.out.println(ms);
		   int opcion=scan.nextInt();
			switch (opcion) {
			case 1:
				menuPrincipal();
				break;
			case 2:
				obtenerValor();	
				break;
			}
	}
	
}
