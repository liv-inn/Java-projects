import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
       
        
        Random number = new Random();
        int n = number.nextInt(16);

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo! (>.<)/");
        System.out.println("Jogo de Adivinhação! Descubra qual é o número, de 0 a 15!");
        System.out.println("Insira o número: ");
        
        System.out.println("Está funcionando, e o número é:" + n);

        int numeroEscolhido = scanner.nextInt();

        if(numeroEscolhido == n){
            System.out.println("Você acertou :D");
        }else{
            System.out.println("Você errou :(");
        }
    }





}
