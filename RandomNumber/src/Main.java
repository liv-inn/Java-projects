import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
       
        
        Random number = new Random();
        
       

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome! (>.<)/");
        System.out.println("Choose a game: ");
        System.out.println("1. Guess the Number");
        System.out.println("2. Number Battle");
        System.out.println("3. Guess the Word");
        System.out.println("4. Guess the best kpop boy group in the world");
        
        int options = scanner.nextInt();

        switch(options) {
            case 1:   
            int n = number.nextInt(50);
            
                System.out.println("You chose Guess the number! :D");
                System.out.println("Guess the number between 1 - 50");
                System.out.println("O numero é " + n );
            
                int userNumber = scanner.nextInt();
        
                if(userNumber == n){
                    System.out.println("Você acertou :D");
                }else{
                    System.out.println("Você errou :(");
                }
                break;

            case 2:

            System.out.println("You chose Number Battle! :D");
            System.out.println("The player and the computer pick random numbers(1-10000); the highest number wins!");
            System.out.println("Enter your number and good luck!");
            
            int nBattleUser = scanner.nextInt();
            int nBattlePC = number.nextInt(10000);

            if(nBattlePC > nBattleUser){
                System.out.println("PC won! Better luck next time... you entered " + nBattleUser +  " and the PC chose " + nBattlePC +"!");
            } else if (nBattlePC < nBattleUser){
                System.out.println("You win! Congratulations, you entered " + nBattleUser +  " and the PC chose " + nBattlePC +"!");
            }

            break;


            case 3:
            case 4:

            String bestBG = "EXO";
            int i = 0;

                System.out.println("You chose Guess the best kpop boy group in the world! :D");
                 // o scanner  pode ler a nova linha restante no buffer de entrada que é deixada após a entrada anterior, principalmente se estiver usado um scanner.nextInt() ou scanner.next() 

                

                 while(true){
                    System.out.println("The best boy group is: ");
                    scanner.nextLine();
                    String userGuessBG = scanner.nextLine();
                    i++;

                        if(userGuessBG.equals("BTS") ){
                            System.out.println("Nooo :(");
                            break;
                        }
                        else if (userGuessBG.equals(bestBG) ) {
                            System.out.println("Congratulations!! You got it right after " + i + " attempts.");
                            break;
                        } else{
                            System.out.println("Try again :)");
                            
                        }
                            
                        }
                        break;
                  
            default: 
                System.out.println("This option is not valid :( try again!");

        }

      
    }





}
