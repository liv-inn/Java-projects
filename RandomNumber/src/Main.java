import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
       
        
        Random number = new Random();
        int n = number.nextInt(50);
        String bestBG = "EXO";
        int i = 0;

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
            
                System.out.println("You chose Guess the number! :D");
                System.out.println("Guess the number between 1 - 50");
            
                int userNumber = scanner.nextInt();
        
                if(userNumber == n){
                    System.out.println("Você acertou :D");
                }else{
                    System.out.println("Você errou :(");
                }
                break;

            case 2:
            case 3:
            case 4:

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
