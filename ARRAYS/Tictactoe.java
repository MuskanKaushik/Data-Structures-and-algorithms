import java.util.*;


public class Tictactoe
{
   
    private String[][] b; 
    static String X = "x";
    static String O = "o";    
    
    public Tictactoe()
    {
        
        b = new String[3][3]; 
    }
    
    public int check_Winner(String play) {
        int playInRow = 0;
        int play1 = 0;
        int play2 = 0;
        int[] playInColumn = new int[b[0].length];  
       
        
        for (int i = 0; i < b.length; i++) {
            playInRow = 0;
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] == null) {
                    continue;
                }
                if (b[i][j].equals(play)) {
                    playInRow++;
                    playInColumn[j]++;
                    if (i == j) {
                        play1++;
                    } else if (2 == i + j) {
                        play2++;
                    }
                }
                
            }
            if (playInRow == 3) {
                return 1;
            }
        }
        if (3 == play1 || 3 == play2) {
            return 1;
        }
        for (int i = 0; i < playInColumn.length; i++) {
            if (playInColumn[i] == 3) {
                return 1;
            }
        }
        return 0;    
    }

    public void printing_Board()
    {
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] == null) {
                    System.out.print("*");
                } else {
                    System.out.print(b[i][j]);
                }
                if (j < 2) {
                    System.out.print("|");
                } else {
                    System.out.println();
                } 
             }
         }
         System.out.println();
    }
    
    public void Move(String play) {
        Scanner in = new Scanner(System.in);
        int row,col;
        Boolean goodInput = false;
        while(!goodInput) {
            
            System.out.println ("Enter the value of coordinates for " + play);
                
            System.out.println("Enter the row: ");
                row = in.nextInt();
            
            System.out.println("Enter the column: ");
                col = in.nextInt();
            
             
                
            
           
            if ((row < 0) || (row > 2) || (col < 0) || (col > 2)) {
                System.out.println("input must be between 0 and 2.");
                continue;                
            } 
            
            else if (b[row][col] != null ){  
                System.out.println("already occupied");
                continue;
            }
            else {
                b[row][col] = play;
                return;
            }
        }
      
        return;
    }
    
    public static void main(String[] args) {
        
        Tictactoe t = new Tictactoe();            
            
              
        int moves = 0;
        System.out.println();
        System.out.println("X first");
        t.printing_Board();
        while (moves < 9) {
            t.Move(t.X);
            moves++;
            if (moves > 3) {
                if (t.check_Winner(X) == 1) {
                    System.out.println();
                   System.out.println(X + " Won!!!");
                   break;
                }
            }
            t.printing_Board();
            t.Move(t.O);
            moves++;
            if (moves > 3) {
                if (t.check_Winner(O) == 1) {
                    System.out.println();
                   System.out.println(O + " Won");
                   break;
                }
            }
            t.printing_Board();
            
        }
    }
}