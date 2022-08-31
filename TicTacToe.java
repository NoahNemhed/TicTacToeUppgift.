import java.util.Locale;
import java.util.Scanner;

public class TicTacToe {
    String[] board = {"1","2","3","4","5","6","7","8","9"};
    String user1;
    String user2;
    boolean gameOn = true;


    public TicTacToe(String user1, String user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    //Startar TicTacToe spelet.
    public void Game(){
        System.out.println("Welcome to TicTacToe!" + "\n");
        System.out.println(this.user1 + " Will play as 'X'" + " and " + this.user2 + " will play as 'O'");
        printBoard(board);
        while(gameOn){
            generateMove();
            generateMoveOpponent();
        }

    }


    private void gameOver() {

        //user1
        //Sidleds
        if(this.board[1-1].equals("X") && this.board[2-1].equals("X") && this.board[3-1].equals("X")){
            System.out.println(user1 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //Sidleds
        if(this.board[4-1].equals("X") && this.board[5-1].equals("X") && this.board[6-1].equals("X")){
            System.out.println(user1 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //Sidleds
        if(this.board[7-1].equals("X") && this.board[8-1].equals("X") && this.board[9-1].equals("X")){
            System.out.println(user1 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //Uppifrån
        if(this.board[1-1].equals("X") && this.board[4-1].equals("X") && this.board[7-1].equals("X")){
            System.out.println(user1 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //uppifrån
        if(this.board[2-1].equals("X") && this.board[5-1].equals("X") && this.board[8-1].equals("X")){
            System.out.println(user1 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //uppifrån
        if(this.board[3-1].equals("X") && this.board[6-1].equals("X") && this.board[9-1].equals("X")){
            System.out.println(user1 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //Diagonal
        if(this.board[1-1].equals("X") && this.board[5-1].equals("X") && this.board[9-1].equals("X")){
            System.out.println(user1 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //Diagonal
        if(this.board[3-1].equals("X") && this.board[5-1].equals("X") && this.board[7-1].equals("X")){
            System.out.println(user1 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }

        //-------------------------------------------------------------------------------------------

        //user2
        //Sidleds
        if(this.board[1-1].equals("O") && this.board[2-1].equals("O") && this.board[3-1].equals("O")){
            System.out.println(user2 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i);
                }
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //Sidleds
        if(this.board[4-1].equals("O") && this.board[5-1].equals("O") && this.board[6-1].equals("O")){
            System.out.println(user2 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //Sidleds
        if(this.board[7-1].equals("O") && this.board[8-1].equals("O") && this.board[9-1].equals("O")){
            System.out.println(user1 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //Uppifrån
        if(this.board[1-1].equals("O") && this.board[4-1].equals("O") && this.board[7-1].equals("O")){
            System.out.println(user2 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //uppifrån
        if(this.board[2-1].equals("O") && this.board[5-1].equals("O") && this.board[8-1].equals("O")){
            System.out.println(user2 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //uppifrån
        if(this.board[3-1].equals("O") && this.board[6-1].equals("O") && this.board[9-1].equals("O")){
            System.out.println(user2 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //Diagonal
        if(this.board[1-1].equals("O") && this.board[5-1].equals("O") && this.board[9-1].equals("O")){
            System.out.println(user1 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }
        //Diagonal
        if(this.board[3-1].equals("O") && this.board[5-1].equals("O") && this.board[7-1].equals("O")){
            System.out.println(user2 + " wins!");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }

        }


    }

    //Kollar ifall det har blivit lika genom att räkna ut hur många X och O som finns ute på brädan.
    public boolean checkTie(){
        StringBuilder X = new StringBuilder();
        StringBuilder O = new StringBuilder();

        for(int i = 0; i<this.board.length; i++){
            if(this.board[i].equals("X")){
                X.append("X");
                X.append(" ");
            }
            if(this.board[i].equals("O")){
                O.append("O");
                O.append(" ");
            }
        }
        String[] xMatches = X.toString().split(" ");
        String[] oMatches = O.toString().split(" ");
        int xCount = 0;
        int oCount = 0;
        for(int i = 0; i<xMatches.length; i++){
            xCount++;
        }
        for(int i = 0; i<oMatches.length; i++){
            oCount++;
        }
        if(xCount == 5 && oCount == 4){
            return true;
        }
        if(xCount == 4 && oCount == 5){
            return true;
        }
        return false;
    }

    //Frågar ifall man vill spela igen.
    public boolean playAgain(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wanna play again? 'Y' 'N'");
        String ans = sc.next().toUpperCase();
        switch (ans){
            case "Y":
                return true;

            case "N":
                return false;

        }
        return false;
    }

    //Printar ut brädan.
    public void printBoard(String[] b){
        for(int i = -1; i<b.length; i++){
            switch (i){
                case 0:
                    System.out.println("---------");
                    System.out.print("|" + b[i] + "|");
                    break;
                case 1:
                    System.out.print("|" + b[i] + "|");
                    break;
                case 2:
                    System.out.print("|" + b[i] + "|");
                    System.out.println();
                    System.out.println("---------");
                    break;
                case 3:
                    System.out.print("|" + b[i] + "|");
                    break;
                case 4:
                    System.out.print("|" + b[i] + "|");
                    break;
                case 5:
                    System.out.print("|" + b[i] + "|");
                    System.out.println();
                    System.out.println("---------");
                    break;
                case 6:
                    System.out.print("|" + b[i] + "|");
                    break;
                case 7:
                    System.out.print("|" + b[i] + "|");
                    break;
                case 8:
                    System.out.print("|" + b[i] + "|");
                    System.out.println();
                    System.out.println("---------");
                    break;

            }
                }
                     }

    //Spelare 1 kör sitt drag.
    public void generateMove(){
        Scanner sc = new Scanner(System.in);
        boolean move = false;
        gameOver();
        if(checkTie()){
            System.out.println("TIE");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }
        }
        while(!move){
            System.out.println(user1 + " Enter placement number.");
            int placement = sc.nextInt();
            if(validateMove(placement)){
                gameOver();
                System.out.println("Player " + user1 + " moved to " + (placement-1));
               this.board[placement-1] = "X";
               printBoard(board);
               move = true;

            }else{
                move = false;
            }
        }
    }

    //Spelare 2 kör sitt drag.
    public void generateMoveOpponent(){
        Scanner sc = new Scanner(System.in);
        boolean move = false;
        gameOver();
        if(checkTie()){
            System.out.println("TIE");
            if(playAgain()){
                for(int i = 0; i<this.board.length; i++){
                    this.board[i] = String.valueOf(i+1);

                }
                printBoard(board);
            }else{
                System.out.println("Qutting game....");
                this.gameOn = false;
            }
        }
        while(!move){
            gameOver();
            System.out.println(user2 + " Enter placement number.");
            int placement = sc.nextInt();
            if(validateMove(placement)){
                gameOver();
                this.board[placement-1] = "O";
                printBoard(board);
                move = true;
            }else{
                move = false;
            }
        }
    }

    //Kollar ifall draget är gilltigt.
    public boolean validateMove(int nr){
            if(board[nr-1] == "X" || board[nr-1] == "O"){
                System.out.println("Invalid move");
                return false;
            }


                return true;
            }

    }



