package primerEjemplo;


import java.util.*;

public class Ejercicios1to4 {
	/* Ejercicio 1

Mostrar por consola los 10 primeros n�meros enteros y los 10 primeros n�meros impares*/

	public static void main(String[] args) {
		/*System.out.println("Mostrar por consola los 10 primeros n�meros enteros y los 10 primeros n�meros impares");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			
		}
		System.out.println("------");
		
		for (int i = 1; i <= 11; i++) {
			System.out.println(i++);
			
		}*/
		
		/*Ejercicio 2

Leer 10 palabras y mostrarlas en 
orden inverso al que fueron ingresadas.*/
		
	/*	System.out.println("Leer 10 palabras y mostrarlas en orden inverso al que fueron ingresadas.");
		
		String[] palabras = new String[10];
		
		Scanner leer=new Scanner(System.in);
		
		for (int i = 0; i < 9; i++) {
			System.out.println("Ingrese la palabra "+ (i+1));
			palabras[i]=leer.nextLine();				
		}
		
		for (int i = 9; i <= palabras.length; i--) {
			System.out.println(palabras[i-1]);
							
		}
		*/
		
		/*Ejercicio 3

Leer 10 palabras, luego leer una nueva palabra e indicar 
si la misma ya hab�a sido ingresada en las 10 primeras.*/
		
/*System.out.println("Leer 10 palabras, luego leer una nueva palabra e indicar \r\n"
		+ "si la misma ya hab�a sido ingresada en las 10 primeras");
		
		String[] palabras = new String[9];
		
		Scanner leer=new Scanner(System.in);
		String npal;
		
		for (int i = 0; i < 9; i++) {
			System.out.println("Ingrese la palabra "+ (i+1));
			palabras[i]=leer.nextLine();				
		}
		System.out.println("");
		System.out.println("Ingrese nueva palabra");
		
		npal=leer.next();
		
		for (int i = 0; i < 9; i++) {
			if (palabras[i].equals(npal)) {
				System.out.println("");
				System.out.println("La palabra "+ npal + " ya fue ingresada");
			}
						
		}*/
		/*Ejercicio 4

Leer un entero y luego una lista de 20 enteros. Guardar los mayores al n�mero 
inicial y mostrarlos al final. Usar arrays, no otras colecciones.*/
		
		try (Scanner leer = new Scanner(System.in)) {
			int n=0;
			int j=0;
			int lista[];
			int lista2[];
			lista= new int [20];
			lista2=new int[lista.length];
			System.out.println("Ingrese un numero entero");
			n = leer.nextInt();
			System.out.println("");
			System.out.println("Ingrese una lista de 20 enteros");
			System.out.println("");
			for (int i = 0; i < 20; i++) {
				System.out.println("Ingrese la numero entero "+ (i+1));
				lista[i]=leer.nextInt();	
				if (lista[i]> n) {
					lista2[j]=lista[i];
					j++;
				}
			}
			for (int k = 0; k < lista2.length; k++) {
				if (lista[k]==0) {
					System.out.println("Hola Mundo");
					System.out.println("Conio XD");
				}
				else {
					System.out.println(lista2[k]);
				}
				

			}
		}
		
	
		
	}
}
		
		
	


