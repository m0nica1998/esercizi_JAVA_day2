package main;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
 //creare un programma che: 
	//stampi in console “Benvenuto utente, inserisci un numero da 1 a 10” 
	System.out.println("Benvenuto utente, inserisci un numero da 1 a 10");
	
	//dichiari una variabile di tipo int, valorizzata tramite lo scanner con il metodo .nextInt( ) 
	Scanner scan = new Scanner(System.in);
	int variabile = scan.nextInt();
	int quadrato = variabile * variabile;
	
	//stampi in console “il suo numero, elevato alla seconda è uguale a: [risultato]” 
	System.out.println("il suo numero, elevato alla seconda è uguale a: " + quadrato);
	
	//alla fine del metodo main chiamare il metodo dello scanner .close()
	scan.close();
	
	
	}
}
