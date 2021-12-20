package bingo;

import java.util.Scanner;

public class juegobingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);

		System.out.println("*BINGO IES MARTINEZ MONTAÑES*");
		System.out.println("          Premios:");
		System.out.println("          Linea: 100€");
		System.out.println("          Bingo: 500€");
		System.out.println();
		System.out.println("Introduce una tecla para continuar");
		//string para introducir un cadena 
		String con = sn.next();
		//PINTAMOS EL LETRERO DEL 1ºER JUGADOR
		for (int i = 0; i < 20; i++) {
			System.out.print("-");	
		}
		
		System.out.println();
		System.out.println("     JUGADOR 1 ");
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
			
		}
		
		System.out.println();
		//define la matriz 
		int [][] carton1= new int [3][5];
		//rellenarla y pintar  la matriz con un bucle for 
			int numero =1;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++) {
					//definir tiradas
					carton1[i][j]= (int)(Math.random()*9+numero);
					//columna 1
					System.out.print(" " +carton1[i][j] + "|");
					
					numero +=10;
					
				}
				numero = 1;
				System.out.println();
			}
			
	
			System.out.println(" ");
		
		//PINTAMOS EL CARTON DEL JUGADOR 2 
		for (int  i= 0;  i< 20; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.println("     JUGADOR 2 ");
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
			
		}
		
		System.out.println();
		
		int [][] carton2= new int [3][5];
		//pintamos la matriz con un bucle for 
		for (int filas = 0; filas < 3; filas++) {
			for (int columnas = 0; columnas < 5; columnas++) {
				//definir tiradas
				carton2[filas][columnas]= (int)(Math.random()*9+numero);
				//columna 1
				System.out.print(" " +carton2[filas][columnas] + "|");
				
				numero +=10;
				
			}
			numero = 1;
			System.out.println();
		}
		boolean bingo=false;
		
		do {
			   
		//SACAR BOLA
		
		System.out.println();
		System.out.println("Pulsa cualquier tecla para sacar la bola");
		String bola = sn.next();
		int bol=(int)(Math.random()*49+1);
		System.out.println("Ha salido la bola numero " + bol);
		System.out.println();
		//PINTAMOS EL LETRERO DEL 1ºER JUGADOR
				for (int i = 0; i < 20; i++) {
					System.out.print("-");	
				}
				
				System.out.println();
				System.out.println("     JUGADOR 1 ");
				for (int i = 0; i < 20; i++) {
					System.out.print("-");
					
				}
				System.out.println();
				
		//pintar 1er carton 
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j < 5; j++) {
			
			System.out.print(carton1[i][j]+" | ");
			
			}
			System.out.println("");
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
		} while (!bingo);
		
	}

}
