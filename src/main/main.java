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
	
	
	
	
	//creare un programma che, tramite lo scanner 
	
	//prenda in input 2 int e stampi la somma 
	
	System.out.println("Inserisci un intero");
	scan.nextLine();
	int var1 = scan.nextInt();
	
	System.out.println("Inserisci un altro intero");
	int var2 = scan.nextInt();
	int somma = var1 + var2;
	System.out.println("la somma dei due numeri è: " + somma);
	
	
	//prenda in input 3 char e stampi concatenandoli con + 
	
	System.out.println("inserisci un carattere");
	char a = scan.next().charAt(0);
	System.out.println("inserisci un carattere");
	char b = scan.next().charAt(0);
	System.out.println("inserisci un carattere");
	char c = scan.next().charAt(0);
	System.out.println("la concatenazione dei caratteri è: " + a + b + c);
	
	//prenda in input due double e stampi la divisione 
	
	System.out.println("inserisci un double");
	double d1 = scan.nextDouble();
	System.out.println("inserisci un altro double");
	double d2 = scan.nextDouble();
	double div = d1 / d2;
	System.out.println("la divisione dei due double è: " + div);
	
	
	//prenda in input un nome, un cognome, un’età, il nome di un corso e stampi “Ciao mi chiamo [nome] [cognome], ho [età] anni e sto frequentando il corso di [nome corso]
	
	
	System.out.println("inserisci un nome");
	String nome = scan.next();
	System.out.println("inserisci un cognome");
	String cognome = scan.next();
	System.out.println("inserisci un'età");
	int eta = scan.nextInt();
	System.out.println("inserisci il nome di un corso");
	String corso = scan.next();
	System.out.println("Ciao mi chiamo " + nome + " " + cognome + ", ho " + eta + " anni e sto frequentando il corso di " + corso);
	
	//alla fine del metodo main chiamare il metodo dello scanner .close()
	scan.close();
	
	
	
	}
}
