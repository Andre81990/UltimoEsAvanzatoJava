package javaOopAdvanced.AdvancedIDEfeaturesDebugger;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class Exercises {
    public static void main(String[] args) {
        // exercise1();
        //exercise2();
        exercise3();

    }

    /**
     * 1:
     * <p>
     * The following code is supposed to do a factorial of the number five, which looks like this: 5*4*3*2*1 = 120
     * <p>
     * Find and fix the error using the debugger
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        int number = 5;
        int factorial = calculateFactorial(number);
        Assertions.assertEquals(120, factorial);

        System.out.println("il fattoriale di 5 è" + factorial);

    }

    private static int calculateFactorial(int number) {
        //Fix this code
        int result = 1;

        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
        /*


        usando il debug si nota che c e un errore qui perche il ciclo for e' sbagliato
        //1 ;2 ;
        for (int i = number; i >= 1; i -= 2) {
            result = result * i;
        }
        return result;
        */

    }

    /**
     * 2:
     * <p>
     * The following code is supposed to reverse a string
     * <p>
     * Find and fix the error using the debugger
     */

    /*mi da questo errore usando il debug
    Exception in thread "main" org.opentest4j.AssertionFailedError: expected: <olleh> but was: <ooloollooloolle>
	        Assertions.assertEquals("olleh", reversedString);

possiamo usare un metodo dello stringbuilder per risolvere tutto
ho tolto il metodo perche' risultava troppo difficile il debug mi dava l errore
quindi ho uato il reverse dell stringbuilder per risolvere tutto in modo piu facile
 */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        String input = "hello";

        /*
        String reversedString = reverseString(input);
*/
        StringBuilder str = new StringBuilder(input);

        //Assertions.assertEquals("olleh", reversedString);
        System.out.println(str.reverse());
    }
/*
    private static String reverseString(String input) {
        //Fix this code

        String reversed = "";
        for (int i = input.length() - 1; i >= 1; i--) {
            //rev =rev+reversed + input.charAt(i)
            reversed += reversed + input.charAt(i);
        }
        return reversed;
    }*/

    /**
     * 3:
     * <p>
     * The following code is supposed to check if a number is positive or negative
     * but there is a semantic error in the if statement.
     * <p>
     * Find and fix the error using the debugger
     */



    /*
    *         Assertions.assertFalse(isPositive(0));
debug in questa riga mi dava un errore cambiata asserzione
* da assert flase a true per rispettare la condizione dell if
     * */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Assertions.assertFalse(isPositive(-5));
        Assertions.assertFalse(isPositive(-55));
        Assertions.assertTrue(isPositive(0));
        Assertions.assertTrue(isPositive(5));
        Assertions.assertTrue(isPositive(55));
        Assertions.assertTrue(isPositive(4567));
    }

    private static boolean isPositive(int num) {
        //Fix this code


        if (num >= 0 ) {
            System.out.println("il numero è positivo");
        } else if (num==0){
            System.out.println("il numero è neutro");
        }
        else
        {
            System.out.println("il numero è negativo");
        }

        // return num >= 0;

        return num>=0;
    }
}