import java.util.Scanner;

public class quizegame {

    public static void main(String[] args) {

        String[] question = { "1.what is your name? ",
                                 "2.your age is?",
                                 "3.what is your best sport? ",
                                 "4.where you live?"
        };

        String[][] option = { {"1.nbfhbfdjkf", "2.bdhsjhbfj", "3.dfssgsfsa" ,"4.bisham"},
                { "1. 24","2.100","3.44","4.55"},
                {"1.basketball","2.chess","3.swimming","4.football"},
                {"1.pune","2.delhi","3.ranchi","4.bihar"}};

        int[] ans = {4,1,1,3};
        int score = 0;
        int guess;
        Scanner scanner = new Scanner(System.in);

        System.out.println("################################");
        System.out.println("WELCOME TO THE GAME");
        System.out.println("################################");

        for(int i =0;i<question.length;i++){
            System.out.println(question[i]);

            for(String opt: option[i]) {
                System.out.println(opt);
            }


                System.out.print("Enter your option(1-4): ");
                guess = scanner.nextInt();

                if(guess ==ans[i]){
                    System.out.println("############");
                    System.out.println("correct");
                    System.out.println("############");
                    score++;
                }else{
                    System.out.println("############");
                    System.out.println("WRONG");
                    System.out.println("############");
                }


        }


        scanner.close();
        System.out.println("Your final score "+score+"/"+question.length);
    }
}
