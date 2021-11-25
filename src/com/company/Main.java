package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean numCorrecto=false;
        while(!numCorrecto) {
            System.out.println("Bienvenido al Santa Mónica, ¿que quieres beber?\n1. Ron colita\n2. Mocho\n3. Cervecita fresca\n4. Agua\n5. Chupitazo\n6. Me voy al Vannity");
            Scanner sc=new Scanner(System.in);
            int numBebida= Integer.parseInt(sc.next());
            switch (numBebida){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("No hay bebida instanciada lo siento");
                    numCorrecto=true;
                    break;
                case 6:
                    System.out.println("Ta lue!");
                    numCorrecto=true;
                    break;
                default:
                    System.out.println("Ya vas pedo?");
                    break;
            }

        }
    }

}
