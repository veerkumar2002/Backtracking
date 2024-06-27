public class nqueen {
    public static isSafe(cahrboard[][], int row,int col){
        //verticall up
        for(int i = row-1; i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //digonal left up
        for(int i = row-1; j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diag right up
        for(int i=row-1, j= col+1; i>=0 && j <board.length; i--,j++){
            if(board[i][j]=="Q"){
                return false;
            }
        }
        return true;

    }
    public static void nQueens(char board[][], int row){
        //base
        if(row == board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row,j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);//function
                board[row][j] = 'X';//backtracking

            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("_______chess board_______");
        for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
        }
    }
    public static void main(String args[]){
        int n =4;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueens(board,0);
    }
}
