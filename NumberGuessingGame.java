import java.util.Scanner;
import java.util.Random;

/**
*
* Tanya Townsend
* Alisha Siwakoti
* CS 121
*
* This program chooses a secret number and gives higher or lower hints
* until the player guesses it. Only valid guesses are counted.
*/

        public class NumberGuessingGame {
              
              
               public static final int MAX_GUESS = 100;
               /**
               * Starts the program and call the game methods
               */
               public static void main(String[] args) {
        
               Scanner console = new Scanner(System.in);  
               int totalGames = 0;
               int totalGuesses = 0;
               int bestGame = Integer.MAX_VALUE;
              
               welcome();
               int guesses = playGame(console); 
               // play again option 
               System.out.print(" Do you want to try and play again? ");
               String answer = console.next(); 
               // repeat the players response
               while (answer.toLowerCase().startsWith("y")) {
               guesses = playGame(console);
               
               System.out.print(" Do you want to try and play again? ");
               answer = console.next();     
               }
               }
               /**
               * Displays the instructions for the guessing game.
               */
               public static void welcome() {
               System.out.println("Welcome, this program allows you to play a guessing game.");
               System.out.println("I will think of a number between 1 and " + MAX_GUESS + ".");
               System.out.println("Your goal is to guess the correct number.");
               System.out.println();       
               }
               /**
               * Runs the guessing game and countrs the valid guesses
               */
               public static int playGame(Scanner console) {  
               Random random = new Random(); 
               int secretNumber = random.nextInt(MAX_GUESS) + 1;
               
               int guess = 0;
               int guessCount = 0; 
               
               while (guess != secretNumber) { 
               System.out.print(" Your guess? ");
               if (console.hasNextInt()) { 
                  guess = console.nextInt();
               if (guess >= 1 && guess <= MAX_GUESS) {
                   guessCount++;
                
               } else {
                  System.out.println(" That is not a valid guess! ");
                  continue;                
               }    
               } else {
                   System.out.println(" This is not a valid guess! ");
                   console.next();
                   continue;
               }
                   
               if (guess > secretNumber) { 
                   System.out.println(" It's lower. ");
               } else if (guess < secretNumber) {
                   System.out.println(" It's higher. ");
               } else {
                   System.out.println(" You guess correctly in " + guessCount + " guesses! ");
                           
               }
               
}
return guessCount;
}
}