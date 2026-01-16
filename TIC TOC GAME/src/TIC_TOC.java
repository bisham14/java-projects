import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TIC_TOC {
    public static void main(String[] args) {

        char[][] gameBoard = { {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}};

        printGameBoard(gameBoard);
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.print("Enter the position no btw (1-9): ");
            int playerPos = scanner.nextInt();

            setingPosition(playerPos,gameBoard, "Player");

            Random random = new Random();
            int cupPos = random.nextInt(9) + 1;
            setingPosition(cupPos,gameBoard, "CPU");

            System.out.println(playerPos);
            printGameBoard(gameBoard);

        }

    }

    public static void printGameBoard(char[][] gameBoard){

        for(char[] row : gameBoard){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }

    }

    public static void setingPosition ( int pos, char[][] gameBoard ,String user){

        char symbol = ' ';
        if( user.equals("Player")){
            symbol= 'O';
        } else if (user.equals("CPU")) {
            symbol = 'X';
        }

        switch (pos){
            case 1 : gameBoard[0][0] = symbol;
             break;
            case 2 : gameBoard[0][2] = symbol;
             break;
            case 3 : gameBoard[0][4] = symbol;
             break;
            case 4 : gameBoard[2][0] = symbol;
             break;
            case 5 : gameBoard[2][2] = symbol;
             break;
            case 6 : gameBoard[2][4] = symbol;
             break;
            case 7 : gameBoard[4][0] = symbol;
             break;
            case 8 : gameBoard[4][2] = symbol;
             break;
            case 9 : gameBoard[4][4] = symbol;
             break;
            default:
                break;


        }


    }


}


