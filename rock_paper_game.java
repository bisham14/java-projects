import java.util.Scanner;
import java.util.Random;

public class rock_paper_game {
    public static void main(String[] args) {
        String userChoice;
        String computerChoice;
        String[] choice ={ "rock","paper","scissors"};
        String playerAgain = "yes";

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do{
            System.out.print("Enter your choice(rock,paper,scissors): ");
            userChoice = scanner.nextLine().toLowerCase();

            if( !userChoice.equals("rock") &&
                    !userChoice.equals("paper") &&
                    !userChoice.equals("scissors")){
                System.out.println("INVALID CHOICE");
                continue; //if type wrong start form top again if not its keep containing
//                return nhi use hua kuki agar galat kiya tab code exit ho jaya ga

            }

            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer choice: "+ computerChoice);

            if( userChoice.equals(computerChoice)){
                System.out.println("It's a tie");

            }else if( (userChoice.equals("paper") && computerChoice.equals("rock"))||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))||
                    (userChoice.equals("rock") && computerChoice.equals("scissors")) ){

                System.out.println("YOU WIN");
            }
            else{
                System.out.println("you lose");
            }

            System.out.println("DO YOU WANT TO PLAY AGAIN( YES/NO ): ");
            playerAgain = scanner.nextLine().toLowerCase();

        }while(playerAgain.equals("yes"));


        System.out.println("THANKS FOR PLAYING");

        scanner.close();

    }
}
