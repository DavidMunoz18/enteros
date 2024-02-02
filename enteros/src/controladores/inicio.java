package controladores;

import java.util.ArrayList;
import java.util.Scanner;

public class inicio {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        
        System.out.println("Introduce números enteros (introduce 0 o un número negativo para terminar):");
        int numero;
        do {
            numero = scanner.nextInt();
            if (numero > 0) {
                numeros.add(numero);
            }
        } while (numero > 0);

        
        System.out.println("Lista original:");
        System.out.println(numeros);

       
        for (int i = 0; i < numeros.size(); i++) {
            int num = numeros.get(i);
            for (int j = i + 1; j < numeros.size(); j++) {
                if (num == numeros.get(j)) {
                    numeros.set(j, 0);
                }
            }
        }

        
        System.out.println("Lista con duplicados reemplazados por 0:");
        System.out.println(numeros);
	}		
}

		

		


