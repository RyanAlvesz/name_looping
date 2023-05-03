package br.senai.sp.jandira;

import java.util.Scanner;

public class NameLooping {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		int repeticoes;
		
		System.out.println("Qual o seu nome?");
		nome = teclado.next();
		
		System.out.println("Número de repetições");
		repeticoes = teclado.nextInt();
		
		
		while (repeticoes > 0){
			System.out.println(nome);
			repeticoes --;
		}
		
	}

}
