
package Bro_code;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner (System.in);
     
        String jogar;
        
        do {            
            System.out.println("*****************************");
            System.out.println("Welcome to the Dice Roller!");
            System.out.println("*****************************");
            System.out.print(" • Push ENTER to roll: ");
            jogar = scanner.nextLine();

            if (!jogar.equalsIgnoreCase("exit")) {
            
                int rolar = random.nextInt(6);

                if (rolar == 0) {
                System.out.println(" -------");
                System.out.println("|       |");
                System.out.println("|   o   |");
                System.out.println("|       |");
                System.out.println(" -------");
                }
                else if (rolar == 1) {
                System.out.println(" -------");
                System.out.println("| o     |");
                System.out.println("|       |");
                System.out.println("|     o |");
                System.out.println(" -------");
                }
                else if (rolar == 2) {
                System.out.println(" -------");
                System.out.println("| o     |");
                System.out.println("|   o   |");
                System.out.println("|     o |");
                System.out.println(" -------");
                }
                else if (rolar == 3) {
                System.out.println(" -------");
                System.out.println("| o   o |");
                System.out.println("|       |");
                System.out.println("| o   o |");
                System.out.println(" -------");
                }
                else if (rolar == 4) {
                System.out.println(" -------");
                System.out.println("| o   o |");
                System.out.println("|   o   |");
                System.out.println("| o   o |");
                System.out.println(" -------");
                }
                else {
                System.out.println(" -------");
                System.out.println("| o   o |");
                System.out.println("| o   o |");
                System.out.println("| o   o |");
                System.out.println(" -------");
                }      
            }    
        }while (!jogar.equalsIgnoreCase("exit"));
            System.out.println("Thanks for playing!");
        scanner.close();
    }    
}
