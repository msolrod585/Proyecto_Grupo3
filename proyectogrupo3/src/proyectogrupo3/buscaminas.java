package proyectogrupo3;

import java.util.Random;
import java.util.Scanner; 

public class buscaminas {

	
	public static void tablero(int filas, int columnas, int minas) {
		Random random = new Random();
		int contadorBombas;
		int[][] tableroNivel = new int[filas][columnas];
		for (int i = 0; i < tableroNivel.length; i++) {
			 for (int j = 0; j < tableroNivel[j].length; j ++) {
				 int bombas = random.nextInt(0,1); 
				 
			 }
			}
		return;
	}

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("¡Bienvenido al Buscaminas!");
		System.out.println("Las reglas son simples, deberá seleccionar la posición de una casilla del tablero para revelar su contenido. Si es una mina, explotará, si no es una mina, podrá seguir jugando");
		System.out.println("Presione 1, para el nivel fácil, 2 para el nivel intermedio, 3 para el nivel difícil o 4 para el nivel custom: ");
		int nivel = sc.nextInt();
		int minas;
		int filas;
		int columnas;
		int [][] tablero;
		
		switch(nivel) {
			case 1:
					
				
			case 2:
				
				
			case 3:
				
			minas = 20;
			filas = 8;
			columnas = 8;
			
			
				
				
				
			case 4:
		
				
				
				
				
				
			default: System.out.println("Selección incorrecta, intentelo de nuevo");
			nivel = sc.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}

	}

}
