/*
 Task-2
 Task Name - Number Guessing Game
 */

import java.util.Random;
import java.util.Scanner;

class Game{
    static public int number;
    static public int inputNo;
    static public int Guesses = 0;
    static public int trials = 10;
    

    public int getGuesses() {
        return Guesses;
    }

    public void setGuesses(int guesses) {
        Guesses = guesses;
    }

    Game(){
        Random Rn = new Random();
        this.number = Rn.nextInt(100);
    }


    void EnterNumber(){
        System.out.println("Guess the Number:");
        Scanner In = new Scanner(System.in);
        inputNo = In.nextInt();
    }
}

       
   
public class Number_Gussing_Game_in_java extends Game{
    public static void main(String[] args) {
        
    Game g = new Game();
    System.out.println("Number is chosen b/w 1 to 100.");
    System.out.println("You have only 10 attemp to win");
    System.out.println("your point depends on your attemp.");
    
            
        for(int i=1;i<=trials;i++){
        g.EnterNumber(); 

            if(i == trials){
                System.out.println("You have exhausted  maximum attemp.\n You didn't get the point");
                System.out.println("The correct number is " +number);
                break;
                
            }
            if (inputNo==number){
                System.out.format(" Congratulations!\n You Guesses the Correct No., It is %d\n you guessed in %d attemp, So you get %d point.",number,i,(10-i)*10);
                break;
            }
            else if (inputNo<number && trials!=i){
                System.out.println("The number is greater than "+inputNo);
            }
            else if (inputNo>number&&trials!=i){
                System.out.println("The number is lower than "+inputNo);
            }
            
        }
    }            
}