package ATIVIDADE_MODULO_11;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;


public class EXERCICIO_MODULO_11 {
	
	public static void main(String args[]) {
		AtividadeLista();
	}
	
	private static void AtividadeLista() {
		List<String> lista = new ArrayList<String>();
		System.out.println ("ATIVIDADE LISTA PARTE 1");
		lista.add("João Marcos");
		lista.add("Miguel Cajá");
		lista.add("Lara Queiroz");
		lista.add("Amanda Almeida");
		
		Collections.sort(lista);
		System.out.println ("    ");
		System.out.println (lista);
		
		
        }
    }
