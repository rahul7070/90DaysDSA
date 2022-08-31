import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// code for arranging 3 boys on 3 seats
// public class Backtraking {
//     public static void printPermutation(String str, int idx, String perm){
//         if(str.length()==0){
//             System.out.println(perm);
//             return;
//         }
//         for(int i=0; i<str.length(); i++){
//             char currChar = str.charAt(i);
//             String newstr = str.substring(0, i)+ str.substring(i+1);
//             printPermutation(newstr, idx+1, perm+currChar);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "ABC";
//         printPermutation(str, 0, "");
//     }
// }



// class backtracking{
//     public static void subset(String str, int idx, String ans){
//         if(idx == str.length()){
//             System.out.println(ans);
//             return;
//         }
//         subset(str, idx+1, ans+str.charAt(idx));
//         subset(str, idx+1, ans);
//     }
//     public static void main(String[] args) {
//         String str = "ABCD";
//         subset(str, 0, "");
//     }
// }




// code for rat maze runner 
// class backtracking{
//     public static void printPath(int sr, int sc, int dr, int dc, String path){
//         if(sr>dr || sc>dc){
//             return;
//         }
//         if(sr==dr && sc==dc){
//             System.out.print(path+" ");
//             return;
//         }
//         printPath(sr, sc+1, dr, dc, path+"h");
//         printPath(sr+1, sc, dr, dc, path+"v");
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int m = sc.nextInt();
//         int n = sc.nextInt();
//         printPath(1, 1, m, n, "");
//     }
// }




// code for printing all posible answer of N queen problem
// class backtracking{
//     public static void NQueenplace(int[][] chess, int row, String ans){
//         if(row == chess.length){
//             System.out.println(ans);
//             return;
//         }
//         for(int col=0; col<chess.length; col++){
//             chess[row][col] = 1;
//             NQueenplace(chess, row+1, ans+" "+row+col); 
//             chess[row][col] = 0; 
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[][] chess = new int[n][n];
//         NQueenplace(chess, 0, "");
//     }
// }




// code for N Queen Problem
// class backtracking{
//     public static void printNqueen(int[][] chess, int row, String ans){
//         if(row==chess.length){
//             System.out.println(ans);
//             return;
//         }
//         for(int col=0; col<chess.length; col++){
//             if(isQueenSafe(chess, row, col)==true){
//                 chess[row][col] = 1;
//                 printNqueen(chess, row+1, ans+" "+row+col);
//                 chess[row][col] = 0;
//             }
//         } 
//     }
//     public static boolean isQueenSafe(int[][] chess, int row, int col){
//         for(int i=row-1, j=col; i>=0; i--){
//             if(chess[i][j]==1){
//                 return false;
//             }
//         }
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
//             if(chess[i][j]==1){
//                 return false;
//             }
//         }
//         for(int i=row-1, j=col+1; i>=0 && j<chess.length; i--, j++){
//             if(chess[i][j]==1){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[][] chess = new int[n][n];
//         printNqueen(chess, 0, "");
//     }
// }




// code for printing subset for target sum
// class recursion{
//     public static void printcomb(int[] arr, int idx, int t, String str, int ans){
//         if(idx == arr.length){
//             if(ans == t){
//                 System.out.println(str);
//             }
//             return;
//         }
//         printcomb(arr, idx+1, t, str+" "+arr[idx], ans+arr[idx]);
//         printcomb(arr, idx+1, t, str, ans);
//     }
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 40, 50};
//         printcomb(arr, 0, 70, "", 0);
//     }
// }



// code for all rat maze paths with jumps.
// class backtracking{
//     public static void printPath(int sr, int sc, int dr, int dc, String ans){
//         if(sr==dr && sc==dc){
//             System.out.println(ans);
//             return;
//         }
//         for(int ms=1; ms<=dc-sc; ms++){
//             printPath(sr, sc+ms, dr, dc, ans+"h"+ms);
//         }
//         for(int ms=1; ms<=dr-sr; ms++){
//             printPath(sr+ms, sc, dr, dc, ans+"v"+ms);
//         }
//         for(int ms=1; ms<=dr-sr && ms<=dc-sc; ms++){
//             printPath(sr+ms, sc+ms, dr, dc, ans+"d"+ms);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         printPath(1, 1, n, m, "");
//     }
// }



// // code for making words by entering keypad nos.
// class recursion{
//     static String[] keypad = {".;","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//     public static ArrayList<String> printKeyWord(String str){
//         if(str.length()==0){
//             ArrayList<String> baseRes = new ArrayList<>();
//             baseRes.add("");
//             return baseRes;
//         }
//         char ch = str.charAt(0);
//         String ros = str.substring(1);
//         ArrayList<String> res = printKeyWord(ros);
//         ArrayList<String> mainRes = new ArrayList<>();
//         String strofKey = keypad[ch - '0'];
//         for(int i =0; i<strofKey.length(); i++){
//             char keyNoStrChar = strofKey.charAt(i);
//             for(String val : res){
//                 mainRes.add(keyNoStrChar + val); 
//             }
//         }
//         return mainRes;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         ArrayList<String> finRes = printKeyWord(str);
//         System.out.println(finRes);
//     }
// }




// code for downstairs jump path with cond. only 1stage , 2stage and 3stage jumps allowed.
// class backtraking{
//     public static ArrayList<String> getStairsPath(int n){
//         if(n == 0){
//             ArrayList<String> bres1 = new ArrayList<>();
//             bres1.add("");
//             return bres1;
//         }else if(n< 0){
//             ArrayList<String> bres2 = new ArrayList<>();
//             return bres2;
//         }
//         ArrayList<String> paths1 = getStairsPath(n-1);
//         ArrayList<String> paths2 = getStairsPath(n-2);
//         ArrayList<String> paths3 = getStairsPath(n-3);

//         ArrayList<String> paths = new ArrayList<>();
//         for(String val:paths1){
//             paths.add(1+val);
//         }
//         for(String val:paths2){
//             paths.add(2+val);
//         }
//         for(String val:paths3){
//             paths.add(3+val);
//         }
//         return paths;
//     } 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<String> paths = getStairsPath(n);
//         System.out.println(paths);
//     }
// }




// code for flood fill
// class backtracking{
//     public static void floodfill(int[][] maze, int row, int col, String path, boolean[][] visited){
//         if(row<0 || col<0 || row==maze.length || col==maze[0].length || 
//                         maze[row][col]==1 || visited[row][col] == true){
//             return;
//         }
//         if(row == maze.length-1 && col==maze[0].length-1){
//             System.out.println(path);
//             return;
//         }
//         visited[row][col] = true;      // if true is not idicated then can be travelled twice after return
//         floodfill(maze, row-1, col, path+"t", visited);       // 1 step in top dir.
//         floodfill(maze, row, col-1, path+"l", visited);       // 1 step in left
//         floodfill(maze, row+1, col, path+"d", visited);       // 1 step in down
//         floodfill(maze, row, col+1, path+"r", visited);       // 1 step in right
//         visited[row][col] = false;          /* if path was wrong and returned then true must be converted to false 
//                                                to travell again  */
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         int[][] maze= new int[n][m];
//         for(int i=0; i<maze.length; i++){
//             for(int j=0; j<maze[0].length; j++){
//                 maze[i][j] = sc.nextInt();             /* filling of maze by 0 or 1 (0 means available for
//                                                         path and 1 means its a blocked box)  */
//             }
//         }
//         boolean[][] visited = new boolean[n][m];      // to mark visited box as true make an array which is marked as false first
//         floodfill(maze, 0, 0, "", visited);
//     }
// }




// code for josephus problem
// class backtracking{
//     public static int printans(int n , int k){
//         if(n==1){
//             return 0;
//         }
//         int x = printans(n-1, k);
//         int y = (x+k)%n;
//         return y;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         int k= sc.nextInt();
//         System.out.println(printans(n, k));
//     }
// }




// code for print lexicographical order for all nos. upto 1000 , just like dictniory type
// class backtracking{
//     public static void printresult(int i , int n){
//         if(i>n){
//             return ;    
//         }
//         System.out.println(i);
//         for(int j=0; j<10; j++){
//             printresult(10 * i + j, n);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0; i<=9; i++){
//             printresult(i, n);
//         }
//     }
// }




// code for sudoku solver 9x9 matrix
// class backtracking{
//     public static void display(int[][] board){
//         for(int i =0; i<board.length; i++){
//             for(int j =0; j<board.length; j++){
//                 System.out.print(board[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void sudokuSolver(int[][] board, int i, int j){
//         if(i==board.length){
//             display(board);
//             return;
//         }
//         int nexti = 0;
//         int nextj = 0;
//         if(j==board.length-1){
//             nexti = i+1;
//             nextj = 0;
//         }else{
//             nexti = i;
//             nextj = j+1;
//         }
//         if(board[i][j] != 0){
//             sudokuSolver(board, nexti, nextj);
//         }else{
//             for(int po=1; po<=9; po++){
//                 if(isValid(board, i, j, po)==true){
//                     board[i][j] = po;
//                     sudokuSolver(board, nexti, nextj);
//                     board[i][j] = 0;
//                 }
//             }
//         }
//     }
//     public static boolean isValid(int[][] board, int x, int y, int val){
//         for(int j =0; j<board.length; j++){
//             if(board[x][j]==val){
//                 return false;
//             }
//         }
//         for(int i =0; i<board.length; i++){
//             if(board[i][y] == val){
//                 return false;
//             }
//         }
//         int smi = x/3 *3;
//         int smj = y/3 *3;
//         for(int i =0; i<3; i++){
//             for(int j=0; j<3; j++){
//                 if(board[smi+i][smj+j]==val){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[][] board = new int[n][n];
//         for(int i=0; i<n; i++){
//             for(int j =0; j<n; j++){
//                 board[i][j] = sc.nextInt();
//             }
//         }
//         sudokuSolver(board, 0, 0);
//     }
// }





