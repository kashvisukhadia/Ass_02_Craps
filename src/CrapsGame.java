import java.util.Random;
import java.util.Scanner;
public class CrapsGame {
    public static void main (String []args){
        Random rand = new Random();
        Scanner in = new Scanner (System.in);
        String continueYN = "";
        int die1 = 0;
        int die2 = 0;
        int sum = 0;
        int point = 0;
        boolean done = false;
        boolean finishGame = false;

        System.out.println("Let's play craps game! ");

        do{
            finishGame = false;
            die1 = rand.nextInt(1,7);
            die2 = rand.nextInt(1,7);
            sum = die1 + die2;
            System.out.println("The number for die 1 roll is " + die1);
            System.out.println("The number for die 2 roll is " + die2);
            System.out.println("The sum is " + sum);

            if(sum == 2 || sum == 3 || sum == 12){
                System.out.println("You lost! You got crapped!");
                finishGame = true;
            }
            else if (sum == 7 || sum == 11){
                System.out.println("You got a natural! You won!");
                finishGame = true;
            }
            else{
                point = sum;
                System.out.println("You got a point and your point is "+ point);
                while(!finishGame){
                    die1 = rand.nextInt(1,7);
                    die2 = rand.nextInt(1,7);
                    sum = die1 + die2;
                    System.out.println("The number for die 1 roll is " + die1);
                    System.out.println("The number for die 2 roll is " + die2);
                    System.out.println("The sum is " + sum);

                    if (sum == point){
                        System.out.println("You made a point! You won! " );
                        finishGame = true;
                    }
                    else if (sum == 7) {
                        System.out.println("You got seven and lost!");
                        finishGame = true;
                    }
                    else{
                        System.out.println("You are trying for a point");
                    }

                }
            }
            System.out.println("Should we continue [Y/N]?");
            continueYN = in.nextLine();
            if (continueYN.equalsIgnoreCase( "N")){
                done = true;
            }

        }while(!done);
        System.out.println("Thank you for playing! ");

    }
}
