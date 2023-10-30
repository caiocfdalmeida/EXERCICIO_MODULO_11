package ATIVIDADE_MODULO_11;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;


public class ATIVIDADE_MODULO_11_PARTE_2 {

	public static void main(String[] args) {
        ArrayList<String> nomesMasculinos = new ArrayList<>();
        ArrayList<String> nomesFemininos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
	System.out.println ("ATIVIDADE LISTA PARTE 2");
	
	 while (true) {
         System.out.print("Digite um nome (ou 'sair' para encerrar): ");
         String nome = scanner.nextLine().toLowerCase();

         if (nome.equals("sair")) {
             break;
         }

         System.out.print("Digite o sexo (M/F): ");
         String sexo = scanner.nextLine().toUpperCase();

         if (sexo.equals("M")) {
             nomesMasculinos.add(nome);
         } else if (sexo.equals("F")) {
             nomesFemininos.add(nome);
         } else {
             System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
         }
     }

     System.out.println("\nNomes Masculinos:");
     for (String nome : nomesMasculinos) {
         System.out.println(nome);
     }

     System.out.println("\nNomes Femininos:");
     for (String nome : nomesFemininos) {
         System.out.println(nome);
     }
 }
}
