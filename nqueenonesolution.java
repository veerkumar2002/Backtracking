
public class nqueenonesolution {
    public static boolean nQueens(char board[][], int row){
        //base
        if(row == board.length){
            count++;
            return true;
        }
        // column loop
        for(int j=0; j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){
                    return true;
                }
                board[row][j]='X';//backtracking

            }
        }
        return false;
    }
    public static void printBoard(charboard[][]){
        System.out.println("_______Chessboard_________");
        for(int i=0; i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    
    } 
    static int count =0;
    public static void main(String args[]){
        int n =4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        if(nQueens(board,0)){
            System.out.println("solution is possible");
            printBoard(board);
        }
        else{
            System.out.println("solution is not possible");
        }
    }
}
