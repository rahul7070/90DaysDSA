import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import javax.print.event.PrintEvent;

// code for recursion process
// public class practice4{
//     public static void printnumber(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printnumber(n-1);
//     }
//     public static void main(String[] args) {
//         int n= 5;
//         printnumber(n);
//     }
// }



// code to print sum of n natural nos.
// public class recursion{
//     public static void printsum(int i, int n, int sum){
//         if(i==n){
//             sum = sum +i;
//             System.out.println(sum);
//             return ;
//         }
//         sum = sum +i;
//         printsum(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         printsum(1, 5, 0);
//     }
// }


// code to print sum of n natural nos. with i as printed
// public class recursion{
//     public static void printsum(int i, int n, int sum){
//         if(i==n){
//             sum = sum +i;
//             System.out.println(sum);
//             return ;
//         }
//         sum = sum +i;
//         printsum(i+1, n, sum);
//         System.out.println(i);
//     }
//     public static void main(String[] args) {
//         printsum(1, 5, 0);
//     }
// }



// code to calculate factorial by recursion
// public class recursion{
//     public static void printfact(int i, int mul){
//         if(i == 1){
//             mul = mul * i;
//             System.out.println(mul);
//             return;
//         }
//         mul = mul*i;
//         printfact(i-1, mul);
//     }
//     public static void main(String[] args) {
//         printfact(5, 1); 
//     }
// }



// code for fibonacci series
// class recursion{
//     public static void printfib(int n, int a, int b){
//         if(n==10){
//             return;
//         }
//         int c = a+b;
//         System.out.print(c+ " ");
//         printfib(n+1, b, c);
//     }
//     public static void main(String[] args) {
//         int a=0, b=1;
//         System.out.print(a+ " "+b+ " ");
//         int n= 10;
//         printfib(2, a, b);
//     }
// }




// code for print x power n with stack height n
// class recursion{
//     public static int calpower(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }
//         int xpownm1 = calpower(x, n-1);
//         int xpown = x * xpownm1;
//         return xpown;
//     }
//     public static void main(String[] args) {
//         int x=  2, n=5;
//         int ans = calpower(x, n);
//         System.out.println(ans);
//     }
// }


// code for print x power with stack height n
// class recursion{
//     public static void calpow(int x, int n, int pow){
//         if(n==0){
//             System.out.println(pow);
//             return;
//         }
//         pow = pow * x;
//         calpow(x, n-1, pow);
//     }
//     public static void main(String[] args) {
//         calpow(2, 6, 1);
//     }
// }


// code for print x power with stack height logn
// class recursion{
//     public static int callpow(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         if(x==0){
//             return 0;
//         }
//         if(n%2==0){
//             return callpow(x, n/2) * callpow(x, n/2);
//         }else{
//             return callpow(x, n/2) * callpow(x, n/2) * x;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(callpow(2, 5));
//     }
// }



// code for tower of hanoi
// class recursion{
//     public static void towerofhanoi(int n, String src, String helper, String dest){
//         if(n==1){
//             System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//             return;
//         }
//         towerofhanoi(n-1, src, dest, helper);
//         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
//         towerofhanoi(n-1, helper, src, dest);
//     }
//     public static void main(String[] args) {
//         int n=3;
//         towerofhanoi(n, "s", "h", "d");
//     }
// }



// code for printing a word in reverse
// class recursion{
//     public static void printRev(String str, int idx){
//         if(idx ==0){
//             System.out.println(str.charAt(idx));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         printRev(str, idx-1);
//     }
//     public static void main(String[] args) {
//         String str = "abcd";
//         printRev(str, str.length()-1);
//     }
// }



// code for printing the index of a repeatative character
// class recusion{
//     public static void printidx(String str, int idx, char c ){
//         if(idx == -1){
//             return;
//         }
//         if(str.charAt(idx)==c){
//             System.out.print(idx + " ");
//         }
//         printidx(str, idx-1, c);
//     }
//     public static void main(String[] args) {
//         String str = "aajbfuyeaklnuia";
//         char c = 'a';
//         printidx(str, str.length()-1, c);
//     }
// }



// code for printing the first and last index of a repeatative character
// public class recursion{
//     public static int first = -1;
//     public static int last = -1 ;
//     public static void findoccurance(String str, int idx , char element){
//         if(idx == str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if(currchar== element){
//             if(first == -1){
//                 first = idx;
//             }else{
//                 last = idx;
//             }
//         }
//         findoccurance(str, idx+1, element);
//     }
//     public static void main(String[] args){
//         String str = "ajkebaajdab";
//         findoccurance(str, 0, 'a');
//     }
// }


// code for checking if an arr is sorted(strictly increasing)
// class recursion{
//     public static boolean issorted(int arr[], int idx){
//         if(idx == arr.length-1){
//             return true;
//         }
//         if(arr[idx] < arr[idx+1]){
//             return issorted(arr, idx+1);
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int [] arr = {1,3,10,9,11};
//         System.out.println(issorted(arr, 0)) ;
//     }
// }



// code for shifting x character at last in a string
// class recursion{
//     public static void moveAllX(String str, int idx, int count, String newString){
//         if(idx == str.length()){
//             for(int i=0; i<count; i++){
//                 newString = newString + 'x';
//             }
//             System.out.println(newString);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         if(currchar == 'x'){
//             count++;
//             moveAllX(str, idx+1, count, newString);
//         } else{
//             newString = newString + currchar;
//             moveAllX(str, idx+1, count, newString);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "axbcxxd";
//         moveAllX(str, 0, 0, "");
//     }
// }



// code for writing substring possibility of the string given
// class recursion{
//     public static void subsequence(String str, int idx, String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currchar = str.charAt(idx);
//         subsequence(str, idx+1, newString+currchar);
//         subsequence(str, idx+1, newString);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequence(str, 0, "");
//     }
// }



// code for printitng substring of abc in an arraylist
// class recursion{
//     public static ArrayList<String> printsubsequence(String str){
//         if(str.length()==0){
//             ArrayList<String> emp = new ArrayList<>();
//             emp.add("");
//             return emp;
//         }
//         char ch = str.charAt(0);
//         str = str.substring(1);
//         ArrayList<String> res1 = printsubsequence(str);

//         ArrayList<String> mainRes = new ArrayList<>();
//         for(String val : res1){
//             mainRes.add(" "+val);
//             mainRes.add(ch+val);
//         }
//         return mainRes;
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         ArrayList<String> finResult = printsubsequence(str);
//         System.out.println(finResult);
//     }
// }



// code for printing the subsequences of abc
// class recursion{
//     public static void subsequence(String str, int idx, String ans ){
//         if(idx==str.length()){
//             System.out.println(ans);
//             return;
//         }
//         subsequence(str, idx+1, ans+str.charAt(idx));
//         subsequence(str, idx+1, ans+"_");
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         subsequence(str, 0, "");
//     }
// }


// code for printing unique subsequences of a string using hashset
// class recursion{
//     public static void subsequence(String str, int idx, String newString, HashSet<String>set){
//         if(idx == str.length()){
//             if(set.contains(newString)){
//                 return;
//             }else{
//                 System.out.println(newString);
//                 set.add(newString);
//                 return;
//             }
//         }
//         char currchar = str.charAt(idx);
//         subsequence(str, idx+1, newString+ currchar, set);
//         subsequence(str, idx+1, newString, set);
//     }
//     public static void main(String[] args) {
//         String str = "aaa";
//         HashSet<String> set = new HashSet<>();
//         subsequence(str, 0, "", set);
//     }
// }


// code for matrix walking
// class recursion{
//     public static int countpaths(int n , int m ){
//         if(n==1 || m==1){
//             return 1;
//         }
//         return countpaths(n-1, m) + countpaths(n, m-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(countpaths(3, 3));
//     }
// }



// code to find nth term of GP
// class recursion{
//     public static int printnterm(int N, int A, int R, int idx){
//         if(idx == N-1){
//             return A;
//         }
//         return printnterm(N, A*R, R, idx+1);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int A = sc.nextInt();
//         int R = sc.nextInt();
//         int answer = printnterm(N, A, R, 0);
//         System.out.println(answer) ;
//     }
// }



// code for ways of printing spaces in between string
// class recursion{
//     public static void printper(String str, int idx, String newString){
//         if(idx== str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         printper(str, idx+1, newString+" "+currChar);
//         printper(str, idx+1, newString+currChar);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         String newString = "a";
//         printper(str, 1, newString);
//     }
// }



// code for linear search by recursion
// class recursion{
//     public static String linersearch(int[] arr, int i, int element){
//         if(i== arr.length){
//             return "not found";
//         }
//         if(arr[i]==element){
//             return "found at i="+i;
//         }else {
//             return linersearch(arr, i+1, element);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {2, 5, 6, 7, 11};
//         System.out.println(linersearch(arr, 0, 6));
//     }
// }



// code for bubble sorting recursively
// class recursion{
//     public static void bubble_sort(int[] arr, int n){
//         if(n==0){
//             return;
//         }
//         int count = 0; 
//         for(int i =0; i<arr.length-1; i++){
//             if(arr[i]>arr[i+1]){
//                 //swap
//                 int temp = arr[i];
//                 arr[i] = arr[i+1];
//                 arr[i+1] = temp;
//                 count = count +1;
//             }
//         }
//         if(count == 0){       // check if any recursion happened or not
//             return;           // if 0 means already in ascending order
//         }
//         bubble_sort(arr, n-1);
//     }
//     public static void main(String[] args) {
//         int[] arr = {25, 11, 63, 2, 9};
//         bubble_sort(arr, arr.length);
//         System.out.println(Arrays.toString(arr));
//     }
// }



// code for checking palindrome
// class recursion{
//     public static boolean isPlindrome(String str, int l, int r){
//         if(l>=r){
//             return true;
//         }
//         if(str.charAt(l)!=str.charAt(r)){
//             return false;
//         }
//         return isPlindrome(str, l+1, r-1);
//     }
//     public static void main(String[] args) {
//         String str = "mnbvcxzzxcvbnm";
//         int l = 0;
//         int r = str.length()-1;
//         System.out.println(isPlindrome(str,l, r)) ;
//     }
// }



// code to print substring of given the string
// class recursion{
//     public static void powerset(String str, String curr, int i ){
//         if(i==str.length()){
//             System.out.println(curr);
//             return;
//         }
//         powerset(str, curr+str.charAt(i), i+1);
//         powerset(str, curr, i+1);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         powerset(str, "", 0);
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



// code for finding largest element in an array
// class recursion{
//     public static void pritnmax(int[] arr, int idx, int max, int indofmax){
//         if(idx == arr.length){
//             System.out.println(indofmax);
//             return;
//         }
//         if(arr[idx]>max){
//             max = arr[idx];
//             indofmax =idx;
//         }
//         pritnmax(arr, idx+1, max, indofmax);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i=0; i<size; i++){
//             arr[i]= sc.nextInt();
//         }
//         pritnmax(arr, 1, arr[0], 0);
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

