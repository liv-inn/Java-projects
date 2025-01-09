import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Random number = new Random();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome! (^_^)/");
        System.out.println("Choose a game: ");
        System.out.println("1. Guess the Number");
        System.out.println("2. Number Battle");
        System.out.println("3. Guess the Word");
        System.out.println("4. Guess the best kpop boy group in the world");
        
        int options = scanner.nextInt();

        switch(options) {

            case 1:   

                int n = number.nextInt(20);
                
                System.out.println("You chose Guess the number! (^o^)/");
                System.out.println("Guess the number between 1 - 20! Good luck~");
                //System.out.println("Hint: The number is " + n + " (^_~)");
                
                int userNumber = scanner.nextInt();
            
                if(userNumber == n){
                    System.out.println("You got it right! (^-^)");
                } else {
                    System.out.println("Oh no, you missed... (T_T)");
                }

            break;

            case 2:

            int nBattlePC = number.nextInt(10000);

                System.out.println("You chose Number Battle! (¬_¬)");
                System.out.println("The player and the computer pick random numbers (1-10000). The highest number wins!");
                System.out.println("Enter your number and good luck! (^_^)");
                //System.out.println("Hint: The number is" + nBattlePC );

                int nBattleUser = scanner.nextInt();
               
                if(nBattlePC > nBattleUser){
                    System.out.println("PC won! (T_T) Better luck next time...");
                    System.out.println("You entered " + nBattleUser +  " and the PC chose " + nBattlePC +"!");
                } else if (nBattlePC == nBattleUser){
                    System.out.println("It's a tie! (.o.) Both numbers are the same!");
                } else{
                    System.out.println("You win! (^o^) Congratulations!");
                    System.out.println("You entered " + nBattleUser +  " and the PC chose " + nBattlePC +"!");
                }

            break;

            case 3:

                String[] wordgame = new String[10];
                wordgame[0] = "PEACH";
                wordgame[1] = "COFFEE";
                wordgame[2] = "WATER";
                wordgame[3] = "JUICE";
                wordgame[4] = "MILK";
                wordgame[5] = "SUGAR";
                wordgame[6] = "BREAD";
                wordgame[7] = "CAKE";
                wordgame[8] = "APPLE";
                wordgame[9] = "GRAPE";
                

                int idx = number.nextInt(wordgame.length);
                String randomWord = (wordgame[idx]);

                System.out.println("You chose Guess the word! (It's a food! ^_^)");
                System.out.println("The chosen word is: " + randomWord + " (^_^)");
                System.out.println("Hint: The chosen word has " + randomWord.length() + " letters!");

                scanner.nextLine();

                while(true){
               
                    String userGuessWord = scanner.nextLine();

                    if (userGuessWord.equals(randomWord)) {
                        System.out.println("Congratulations, you got it right! (^_^)");
                        break;
                        
                    } else {
                        System.out.println("Try again~ (._.)");
                    }
                }

              break;

            case 4:

                String bestBG = "EXO";
                int i = 0;

                System.out.println("You chose Guess the best kpop boy group in the world! (^o^)");
                
                scanner.nextLine();
                while(true){
                    
                    System.out.println("The best boy group is: (o_o)");
                    
                    String userGuessBG = scanner.nextLine();
                    i++;
                    
                    if (userGuessBG.equals(bestBG)) {
                        System.out.println("Congratulations!! You got it right after " + i + " attempts! (^o^)");
                        break;
                    } else {
                        System.out.println("Try again (^_^)");
                    }
                }

            break;

            default: 
                System.out.println("This option is not valid! Try again! (T_T)");

        }
    }
}
