import java.util.Scanner;
class Guessing_Game{
    public void greeting_section(){
        System.out.println("Welcome to number guessing game");
        System.out.println("You'll be asked to guess the number to Win the game!");
        System.out.println("You'll have 5 attempts to guess the number.... ");
    }
    public void number_guessing(){
        Scanner sc=new Scanner(System.in);
        int max=50;
        int min=1;
        int temp=0;

        double b = (int) (Math.random() * (max - min + 1)) +min;
        for (int i=0;i<5;i++){
            System.out.print("Enter a guess number between "+ min+ " and " + max+":");
            int a = sc.nextInt();
            if (a>b){
                System.out.println("You guessed the higher number!");
            }
            else if(a<b){
                System.out.println("You guessed the lower number!");
            }
            else if (a==b){
                temp=a;
               
                break;
            }

        }
            if(temp==b){
                System.out.println("Woahoo you guessed it correct. Congratulations!!"); 
            }
            else{
                System.out.println("The Generated number was: "+ b);
            }
        
    }
}





public class Main {
    public static void main(String[] args) {
        Guessing_Game gg=new Guessing_Game();
        gg.greeting_section();
        gg.number_guessing();
    }
}
