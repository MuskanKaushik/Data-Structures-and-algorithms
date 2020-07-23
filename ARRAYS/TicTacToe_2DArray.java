//import java.util.*;
import java.util.Scanner;
class TicTacToe_2DArray{
    static int turn;
    static char[][] board;
    public int draw(){
        int draw = 0;
        for(int i=0; i<=2; i++) {
            for(int j=0; j<=2; j++) {
                if(board[i][j] == '*') 
                draw = 1;
            }
        }
        return draw;
    }
    public int go(){
        Scanner sc = new Scanner(System.in);
        while(turn!=9) {
            System.out.println("enter row");
            int row = sc.nextInt();
            System.out.println("enter coloumn");
            int col = sc.nextInt();
            if(board[row][col] == 'x' || board[row][col] == 'o') {
                System.out.println("Position filled. Try again");
                row = sc.nextInt();
                col = sc.nextInt();
            }
            if(board[row][col] == '*') {
                if(turn%2==0) {
                    board[row][col] = 'x';
                }
                else board[row][col] = 'o';
            }
            printing_Board();
            turn++;
        }
        if(draw()!=1) 
        System.out.println("Game ended in draw");
        sc.close();
        return turn;
    }
    public static void printing_Board(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]+ "  ");
            }
            System.out.println();
        }
    }
    
    public int won(){
        int won=0;
        if(draw()!=1) 
        System.out.println("Game Over - No one wins");
        for(int i=0; i<3; i++) {

            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0]!='*') {
                System.out.println("Someone won!");
                
                if(board[i][0] == 'x') 
                System.out.println("Player 1 won");

                else System.out.println("Player 2 won");
                won = 1;
            }
        }

        for(int i=0; i<3; i++) {

            if(board[0][i] == board[1][i] && board[2][i] == board[1][i] && board[0][i]!='*') {
                System.out.println("Someone won!");

                if(board[0][i] == 'x') 
                System.out.println("Player 1 won");

                else 
                System.out.println("Player 2 won");
                won = 1;
            }
        }
         
        if(board[0][0]==board[1][1] && board[1][1] == board[2][2] && board[0][0]!='*')
           {
            System.out.println("Someone won!");
            if(board[0][0] == 'x')
            System.out.println("Player 1 won");

            else System.out.println("Player 2 won");
            won = 1;
        }
         
        if(board[2][0]==board[1][1] && board[0][2] == board[1][1] && board[2][0]!='*') 
          {
            System.out.println("Someone won!!");
            if(board[2][0] == 'x') 
            System.out.println("Player 1 won");

            else System.out.println("Player 2 won");
            won = 1;
        }
             
        return won;

    }
    public static void main(String[] args)
    {
        TicTacToe_2DArray t = new TicTacToe_2DArray();
        board = new char[3][3];
        System.out.println("Initializing the values of board by *");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                board[i][j]='*';
            }
        }
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print(board[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    while(t.won()!=1){
         t.go();
    }
 }
}