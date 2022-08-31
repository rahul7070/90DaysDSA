
// import java.util.*;


// public class test3{
//     public static void main(String[] args) {

//         // code to print hello world
//         System.out.println("Hello world");
//         System.out.println("hello world \n my name is rahul raman");


        // code to print * in order as mentioned
        // System.out.println("*\n**\n***\n****\n*****");

        // code to calculate something
        // String name = "Tony stark";
        // int a=25;
        // int b= 35;
        // double c = 10.5;
        // System.out.println(2*(a+b-c));
        // System.out.println(name);


// code for printing by some defined format by printf
// import java.util.*;
// public class test3{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int i = 35;
//         System.out.printf("rahul marks is : %d\n",i);
//         System.out.printf("the value of pi is : %f\n",Math.PI);
//         System.out.printf("the value of pi is : %.3f\n", Math.PI);
//         float c = 25463.2546456F;
//         System.out.printf("the segment is : %20.4f\n",c);
//         System.out.printf("the segment is : %30.4f\n",c);
//         System.out.printf("the segment is : %40.4f\n",c);
//         System.out.printf("the segment is : %41.4f\n",c);
//     }
// }


        // code to calculate by taking input for string, int and float
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // String c = sc.nextLine();
        // int a= sc.nextInt();
        // int b= sc.nextInt();
        // double d = sc.nextFloat();
        // System.out.println(name);
        // System.out.println(c); 
        // System.out.println(a+b-d);


// code for scanning and printing
// import java.util.*;
// public class test3 {
//         public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         Double pi = sc.nextDouble();
//         sc.nextLine();      // important line 
//         String b = sc.nextLine();
//         System.out.println("String: "+b);
//         System.out.println("Double: "+pi);
//         System.out.println("Int: "+a);
//     }
// }


// code to print by printf in a format
// import java.io.*;
// import java.text.*;
// import java.util.*;
// public class test3 {
//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc = new Scanner(System.in);
//         System.out.println("================================");
//         for(int i=0; i<3; i++){
//             String name = sc.next();
//             int x = sc.nextInt();
//             System.out.printf("%-15s%03d\n",name, x);
//         }
//         System.out.println("================================");
//     }
// }


// code for printing series
// import java.io.*;
// import java.util.*;
// public class test3{
//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc = new Scanner(System.in);
//         int t= sc.nextInt();
//         for(int i=0; i<t; i++){    
//             int a= sc.nextInt();
//             int b= sc.nextInt();
//             int n= sc.nextInt();
//             for(int j=0; j<n; j++){    
//                 a= a + ((int)Math.pow(2,j)*b);
//                 System.out.print(a + " ");
//             }
//             System.out.println();
//         } 
//         sc.close();
//     }
// }


        // code for if else statements
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // if(age > 18){
        //     System.out.println("adult");
        // }else{
        //     System.out.println("not adult");
        // }

        
        // code for if else if statement
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a==b){
        //     System.out.println("equal");
        // }else if(a<b){
        //     System.out.println("a is smaller");
        // }else{
        //     System.out.println("a is greater");
        // }

        
        // code to use switch command instead of if else 
        // Scanner sc = new Scanner(System.in);
        // int buttom = sc.nextInt();
        // switch(buttom){
        //     case 1 : System.out.println("hello");
        //     break;
        //     case 2 : System.out.println("namaste");
        //     break; 
        //     case 3 : System.out.println("bonjour");
        //     break;
        //     default : System.out.println("invalid input");
        // }
        // int n = sc.nextInt();
        // switch(n) {
        //     case 1 : System.out.println("Monday");
        //     break;
        //     case 2 : System.out.println("Tuesday");
        //     break;
        //     case 3 : System.out.println("Wednesday");
        //     break;
        //     case 4 : System.out.println("thrushday");
        //     break;
        //     case 5 : System.out.println("Friday");
        //     break;
        //     case 6 : System.out.println("saturday");
        //     break; 
        //     default : System.out.println("sunday");
        // }


        // coding of "for loop" statements => for(initialisation; condition, updation){
        // for(int i = 0; i <= 9; i = i + 2){   // i + 1 can be written as counter++
        //     System.out.println("hello world \n\nbye world");
        //     System.out.println(i);    
        // }  
        

        // coding of while loop statements
        // int i = 0;
        // while(i<11){
        //     System.out.println(i);
        //     i = i+1;   // i+1 can be written as i++
        // }

        
        // coding of "do while" loop statements
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i= i+1 ;
        // } while(i<11);


        // coding of comparison between "while" and "do while"
        // while loop problem
        // int i = 12;
        // while(i<11){
        //     System.out.println("apna college");
        // }
         
        // problem of do while 
        // int  i = 12;
        // do{
        //     System.out.println("apna college");
        // }while(i<11);


// code for using for-each loop 
// import java.util.*;
// public class book{
//     public static void main(String[] args) {
//         int[] num = {1,2,3,4,15,6,7,8,9,10};
//         int sum = 0;
//         for(int i : num){     // for-each statement used to read
//                               // read all the no. in array as i var.
//                               // for running the loop
//             System.out.println("the no is "+i);
//             sum = sum + i;
//         }
//         System.out.println(sum);
//     }
// }


        // coding of => print the sum of first n natural nos.
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i=0; i<=n; i++ ){
        //     sum = sum + i;
        // }
        // System.out.println(sum);// 


        // coding of table of any no. taken by user
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=1; i<11; i++){
        //     System.out.println(n*i);
        // }


        // coding of pattern
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    

        // Scanner sc = new Scanner(System.in);
        // int m = sc.nextInt();
        // int n = sc.nextInt();
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=n; j++){                 // inner loop
        //         if(i==1 || j==1 || i==m || j==n){   //cell --> (i,j)
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Scanner sc = new Scanner(System.in);
        // int m = sc.nextInt();
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=n; i>=1; i--){     //outer loop is inverted
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Scanner sc = new Scanner(System.in);
        // int m= sc.nextInt();
        // for(int i=1; i<=m; i++) {
        //     for(int j=1; j<=m-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Scanner sc = new Scanner(System.in);
        // int m= sc.nextInt();
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=1 ; i<=n; i++){
        //     for(int j=1; j<=n-i+1 ; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // } 
        
        // code for floyd triangle
        // Scanner sc = new Scanner(System.in);
        // int number= 1;
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(number+" ");
        //         number++;  //number++ => number+1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
        //     }
        //     System.out.println();
        // }

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         if((i+j)%2==0 ){
        //             System.out.print("1 ");
        //         }else {
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }                

        
        // code for butterfly pattern
        // int n = 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" "); 
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" "); 
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        
        // code of rhombus shape star
        // for(int i=1; i<=5; i++){
        //     for(int j= 1; j<= 5-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=5-i+1; j<=9-i+1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }  


        // code of nos. in pyramid
        // int n= 5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j=1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }


        // coding of palindromic pattern
        // int n = 5;
        // for(int i =1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // coding of diamond pattern
        // int n= 5;
        // for(int i=1; i<=n; i++){
        //     for (int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        //     for (int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
     
    // }
// }


// code for function
// import java.util.*;
// public class test3{
//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         printMyName(name);
//     }
// }


// coding of making a function to add two nos. and return sum
// import java.util.*;
// public class test3 {
//     public static int calculateSum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("the sum od 2 nos. is " + sum);
//     }
// }


// coding of multipliying 2 nos.
// import java.util.*;
// public class test3{
//     public static int calculateProduct(int a, int b){
//         return a*b;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("the product is "+calculateProduct(a , b));
//     }
// }


// coding for calculating factorials
// import java.util.*;
// public class test3{
    // public static void printFactorial(int n){
    //     //loop
    //     if(n<0){
    //         System.out.println("invalid no.");
    //         return;
    //     }
    //     int factorial = 1;
    //     for(int i = n; i >=1; i--){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    //         factorial = factorial * i;
    //     }
    //     System.out.println(factorial);
    //     return;
    // }        
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     printFactorial(n); 
    // }
// }    


// coding of arrays

// import java.util.*;
// public class test3{
//     public static void main(String[] args){
        // int[] marks = new int[3];
        // int marks[] = new int[3];
        // marks[0] = 95;
        // marks[1] = 97;
        // marks[2] = 96;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for(int i=0; i<3; i++){       // use of loop command to print all marks at a same time without using print st.
            // System.out.println(marks[i]); 
        // }


        // coding of array in other way
        // int marks[] = {97,98,99};
        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // } 

        // coding by taking nos by user
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // for(int i=0; i<size; i++){       // for input
        //     numbers[i] = sc.nextInt();
        // }
        // for(int i=0; i<size; i++){       // for output
        //     System.out.println(numbers[i]);
        // }


        // coding of array of names taken by user
        // Scanner sc = new Scanner (System.in);
        // int size = sc.nextInt();
        // String names[] = new String[size];
        // for(int i=0; i<size; i++){
        //     names[i] = sc.next();
        // }
        // for(int i=0; i<size; i++){
        //     System.out.println(names[i]);
        // }
            
        

        // code to search a no. in array linear search
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];   // defining array name
        // for(int i=0; i<size; i++){       // filling array by taking values by user
        //     numbers[i] = sc.nextInt();    
        // }
        // int x = sc.nextInt();                 // defining integer which have to be searched
        // for(int i=0; i<numbers.length; i++){        // loop for searching
        //     if(x==numbers[i]){                     // matching 
        //         System.out.println(i);            // printing address of matched value
        //     }    
        // }

 
        // coding to find max and min integer from array
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for(int i=0; i<size; i++){
        //     if(numbers[i]<min){
        //         min =numbers[i];
        //     }
        //     if(numbers[i]>max){
        //         max=numbers[i];
        //     }
        // }
        // System.out.println("the max and min. no. will be "+ max + "," + min);
        // System.out.println("the min no. will be "+ min);

    

        // coding for verifying array is ascending or descending
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }
        // boolean isAscending = true;
        // for(int i=0; i<numbers.length-1; i++){
        //     if (numbers[i] > numbers[i+1]){
        //         isAscending = false;
        //     }
        // }
        // if(isAscending){
        //     System.out.println("the array is sorted is in ascending order");
        // }else{
        //     System.out.println("the array is not sorted in ascending order");
        // }


        // coding for 2D arrays
        // Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        // int numbers[][]= new int[rows][cols];
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         numbers[i][j]= sc.nextInt();
        //     }
        // }
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         System.out.print(numbers[i][j]+ " ");
        //     }
        //     System.out.println();
        // } 


        // coding to find a no. in 2D array
        // Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        // int numbers[][] = new int[rows][cols];
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }
        // int x = sc.nextInt();
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         if(x==numbers[i][j]){
        //             System.out.println("x found at location (" + i + ","+ j + ")");
        //         }
        //     }
        // }


        // coding for printing string value 
        // Scanner sc = new Scanner(System.in);
        // String firstname = sc.next();
        // String lastname = sc.next();
        // String fullname = firstname + "@" + lastname;
        // System.out.println(fullname.length());   // calling .length function to count the length of the string.
        // for(int i=0; i<fullname.length(); i++){
        //     System.out.println(fullname.charAt(i));  // printing characters one by one 
        // }


        // coding to compare two strings
        // String name1 = "tony";
        // String name2 = "tony2";
        // if(name1.compareTo(name2) == 0) {
        //     // we wont use == syntax will not be used to compare two strings its only applicable for integers.
        //     System.out.println("strings are equal"); 
        // }else {
        //     System.out.println("strings are not equal");
        // }


        // coding to print substring 
        // String sentence = "my name is tony ";
        // String name = sentence.substring(11,sentence.length());
        // System.out.println(name); 

        // coding to print substring
        // String sentence = "tony stark";
        // String name = sentence.substring(0,5);
        // System.out.println(name);

        // coding to print substring
        // String sentence = "tony stark";
        // String name = sentence.substring(5);   // end index if not mentioned that means upto last letter 
        // System.out.println(name);

        // strings are immutable

        // coding for stringbuilder
        // StringBuilder sb = new StringBuilder("tony");
        // System.out.println(sb);
        // System.out.println(sb.charAt(0));     // command to print character at 0th place
        // sb.setCharAt(0, 'P');           // command to replace T at 0th position with character P
        // System.out.println(sb);
        // sb.insert(2, 'n');              // command to insert a new character n at 2th place
        // System.out.println(sb);     
        // sb.delete(3,4);
        // System.out.println(sb);               // command to delete a character from 3rd position


        // StringBuilder sb = new StringBuilder("h");
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o"); 
        // System.out.println(sb);
        // System.out.println(sb.length());
        // System.out.println(sb.length());
        // StringBuilder sb = new StringBuilder("h");


        // code to reverse a string 
        // StringBuilder sb = new StringBuilder("hello");
        // for(int i=0; i<sb.length()/2; i++){
        //     int front = i;
        //     int back = sb.length() - 1 - i;
        //     char frontChar = sb.charAt(front);
        //     char backChar = sb.charAt(back);
        //     sb.setCharAt(front, backChar);
        //     sb.setCharAt(back, frontChar);
        // }
        // System.out.println(sb);


        // code for GET bit manipulation-- bitmask  , AND operator
        // int n = 5;  // binary code of 5= 0101
        // int pos = 3;        
        // int bitMask = 1<<pos;
        // if ((bitMask & n) == 0) { 
        //     System.out.println("bit was zero");
        // }else{
        //     System.out.println("bit was one");
        // }


        // code of SET bitmask , OR operator
        // int n = 5; 
        // int pos = 1;
        // int bitMask = 1<<pos;
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);
        
               
        // code if CLEAR bitmask, AND with NOT operator
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;
        // int notBitMask = ~(bitMask);
        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);


        // code to UPDATE the 2nd bit (position= 2) of a number n to 0 (n=0101)
        // Scanner sc = new Scanner(System.in);
        // int oper = sc.nextInt();   // update bit to 1 else update bit to 0
        // int n = 5;
        // int pos = 1;
        // int bitMask = 1<<pos;
        // if(oper == 1){        // oper==1 means SET operation.
        //     int newNumber = bitMask | n;
        //     System.out.println(newNumber);
        // }else{                // oper==0 means CLEAR operation
        //     int notBitMask = ~(bitMask);
        //     int newNumber = notBitMask & n;
        //     System.out.println(newNumber);
        // }    
    // }
// }


// coding for bubble sorting
// import java.util.*; 
// class test3 {
//    public static void printArray(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    } 
//    public static void main(String args[]) {
//        int arr[] = {7, 8, 1, 3, 2};
//        // time complexity = O(n^2)
//        // bubble sort
//        for(int i=0; i<arr.length-1; i++) {           // n-1
//            for(int j=0; j<arr.length-i-1; j++) {
//                if(arr[j] > arr[j+1]){
//                    //swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        printArray(arr);
//    }
// }


// code for selection sorting 
// import java.util.*;
// class test3 {
//    public static void printArray(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    } 
//    public static void main(String args[]) {
//        int arr[] = {7, 8, 1, 3, 2};
//        // time complexity = O(n^2) 
//        // selection sort
//        for(int i=0; i<arr.length-1; i++) {
//            int smallest = i;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[j] < arr[smallest]){
//                    smallest = j;
//                }
//            }
//            //swap
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }
//        printArray(arr);
//    }
// }   



// coding for insertion sorting
// import java.util.*;
// public class test3{
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int[] arr = {7, 58, 45, 23, 5};
//         for(int i=1; i<arr.length; i++){
//             int current = arr[i];
//             int j = i-1;
//             while( j>= 0 && current < arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             // placement 
//             arr[j+1] = current;
//         }
//         printArray(arr);
//     }
// }



// code to run the program of OOPS Statement
// class Pen {
//     String colour;
//     String type; 
//     public void write(){
//         System.out.println("writing something");
//     }
//     public void printColour(){
//         System.out.println(this.colour);
//     }
// }
// public class test3{
//     public static void main(String[] args){                                                             
//         Pen pen1 = new Pen();
//         pen1.colour = "blue";
//         pen1.type = "gel";
//         Pen pen2 = new Pen();
//         pen2.colour = "black";
//         pen2.type = "gel";                              
//         pen1.printColour();                            
//         pen2.printColour();                     
//         pen1.write(); 
//     }
// }


// code of OOPS concept
// class Employ{
//     int id ;
//     String name;
//     public void printDetails(){
//         System.out.println("my id is "+ id);
//         System.out.println("and my name is "+ name );
//     }
// } 
// public class test3 {
//     public static void main(String[] args) {
//         System.out.println("this is our custom class");
//         Employ harry = new Employ();  // initiating a new employ object
//         // setting Attributes
//         harry.id = 12;
//         harry.name = "code with harry";
//         // printitng the attributes
//         harry.printDetails();
//         // System.out.println(harry.id);
//         // System.out.println(harry.name);
//     }   
// }

// code for oops statement
// class phone{
    //     int series, ram;
    //     String colour, Android_version;
    //     public void printDetails(){
    //         System.out.println("phone series and ram is "+ series + " "+ ram);
    //         System.out.println("phone colour and Android version is " + colour+ " "+ Android_version);
    //     }
    // }
    // public class test3 {
    //     public static void main(String[] args) {
    //         System.out.println("this is my custom class");
    //         phone samsung = new phone();
    //         samsung.series = 23;
    //         samsung.ram = 4 ;
    //         samsung.colour = "mat black";
    //         samsung.Android_version = "marsmello";
    //         samsung.printDetails();
    //     }
    // }   
    

// code of oops for cellphone to call, ring and vibrate  
// class Cellphone{
//     public void ring(){
//         System.out.println("Ringing.....");
//     }
//     public void vibrate(){
//         System.out.println("Vibrating.....");
//     }
//     public void callFriend(){
//         System.out.println("calling muskan...");
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Cellphone realme = new Cellphone();
//         realme.callFriend();
//         realme.ring();
//         realme.vibrate();
//     }
// }


// code to create a class rectangle & initialize its side,calculating area, perimeter etc.
// class Rectangle{
//     int length;
//     int breadth;
//     public void Area(){
//         System.out.println(length *breadth); 
//         return;
//     }
//     public void Perimeter(){
//         System.out.println(2*(length +breadth));
//         return;
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Rectangle quad = new Rectangle();
//         quad.length = 10;
//         quad.breadth = 12;
//         quad.Area();
//         quad.Perimeter();
//     }
// }


// code to create a class of game with methods of hiting, running, firing
// class Vicecity{
//     public void hit(){
//         System.out.println("hiting the enemy");
//     }
//     public void run(){
//         System.out.println("runing from enemy");
//     }
//     public void fire(){
//         System.out.println("firing from enemy");
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Vicecity player1 = new Vicecity();
//         player1.hit();
//         player1.fire();
//         player1.run();
//     }
// }


// code for area and perimeter of the circle by OOPS statement
// class Circle{
//     int radius;
//     public void Area(){
//         System.out.println(3.14*radius*radius);
//         return;
//     }
//     public void Perimeter(){
//         System.out.println(2*3.14*radius);
//         return;
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Circle geo = new Circle();
//         geo.radius = 10;
//         geo.Area();
//         geo.Perimeter();
//     }
// }


// access modifiers and constructors
// code to make with private class
// class Employee{
//     private int id;
//     private String name;
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         name = n;
//         return;
//     }
//     public int getId(){
//         return id;
//     }
//     public void setId(int i){
//         id = i;
//         return;
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Employee harry = new Employee();
//         harry.setName("code with harry");
//         System.out.println(harry.getName());
//         harry.setId(14);
//         System.out.println(harry.getId());
//     }
// }


// code to make a game rock paper scissors 
// import java.util.Random;
// import java.util.Scanner;

// public class test3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter 0 for rock, 1 for paper, 2 for scissors");
//         int userinput = sc.nextInt();
//         Random random = new Random();
//         int computerInput = random.nextInt(3);
//         if(userinput == computerInput){
//             System.out.println("draw");
//         }
//         else if(userinput == 0 && computerInput == 2 || userinput ==1 && computerInput == 0 || userinput ==2 && computerInput ==1 ){
//             System.out.println("you win");
//         }else{
//             System.out.println("computer win");
//         }
//         System.out.println("computer choise "+ computerInput);
//     }
// }

// coding with constructor in java
// class Employee{
//     private int id;
//     private String name;
//     public Employee(){
//         id = 45;
//         name = "code with harry";
//     }
//     public void setName(String n){
//         name = n;
//         return;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setId(int i){
//         id = i;
//         return;
//     }
//     public int getId(){
//         return id;
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Employee harry = new Employee();
//         System.out.println(harry.getId());
//         System.out.println(harry.getName());
//     }
// }


// coding for constructer overloading
// class MyMainEmployee{
//     private int id;
//     private String name;
//     public MyMainEmployee(){
//         id = 45;
//         name = "code with harry";
//     }
//     public MyMainEmployee(String myName, int myId){
//         id = myId;
//         name = myName;
//     }
//     public MyMainEmployee(String myName){
//         id = 12;
//         name = myName;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         this.name = n;
//     }
//     public void setId(int i){
//         this.id = i;
//     }
//     public int getId(){
//         return id;
//     }
// }
// public class test3 {
//     public static void main(String[] args) {
//         //MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
//         MyMainEmployee harry = new MyMainEmployee("rahul coding");
//         //harry.setName("CodeWithHarry");
//         //harry.setId(34);
//         System.out.println(harry.getId());
//         System.out.println(harry.getName());
//     }
// }


// code for making game guessing the no.
// import java.util.Scanner;
// import java.util.Random;
// public class test3 {
// 	// Function that implements the
// 	// number guessing game
// 	public static void guessingNumberGame(){
// 		// Scanner Class
// 		Scanner sc = new Scanner(System.in);
// 		Random random =new Random();
// 		// Generate the numbers
// 		int number = random.nextInt(101);
// 		// Given K trials
// 		int K = 6;
// 		int i, guess;
// 		System.out.println("A number is chosen between 1 to 100. Guess the number within 6 trials.");		
// 		// Iterate over K Trials
// 		for (i = 0; i < K; i++) {
// 			System.out.println("Guess the number:");
// 			// Take input for guessing
// 		    guess = sc.nextInt();
// 			// If the number is guessed
// 			if (number == guess) {
// 				System.out.println(	"Congratulations! You guessed the number.");
// 				break;
// 			}
// 			else if (number > guess && i != K - 1) {
// 				System.out.println("The number is greater than " + guess);
// 			}
// 			else if (number < guess && i != K - 1) {
// 				System.out.println("The number is less than " + guess);
// 			}
// 		}
// 		if (i == K) {
// 			System.out.println("The number was " + number);
// 		}
// 	}
// 	// Driver Code
// 	public static void main(String arg[]){
// 		// Function Call
// 		guessingNumberGame();
// 	}
// }


// coding for INHERITENCE
// class Base{
//     public int x;
//     public void setX(int i){
//         System.out.println("I am in base and setting x now ");
//         x= i;
//         return;
//     }
//     public int getX(){
//         return x;
//     }
//     public void printMe(){
//         System.out.println("i am a constuctor");
//         return;
//     }
// }
// class Derived extends Base{
//     public int y;
//     public void setY(int j){
//         y = j;
//         return;
//     }
//     public int getY(){
//         return y;
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Base b = new Base();
//         b.setX(25);
//         System.out.println(b.getX());

//         Derived d = new Derived();
//         d.setY(35);
//         System.out.println(d.getY());

//         d.setX(65);
//         System.out.println(d.getX());
//     }
// }


// code for inheritance for an animal
// class Animal{
//     public String type;
//     public String colour;
//     public String getColour() {
//         return colour;
//     }
//     public void setColour(String colour) {
//         this.colour = colour;
//     }
//     public String getType() {
//         return type;
//     }
//     public void setType(String type) {
//         this.type = type;
//     }
//     public void Walk(){
//         System.out.println("I am walking");
//         return;
//     }    
// }
// class Derived extends Animal{
//     public String name;

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }
//     public void Bark(){
//         System.out.println("it will bark");
//         return;
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Animal a = new Animal();
//         a.setColour("black");
//         System.out.println(a.getColour());
//         a.setType("carnivorous");
//         System.out.println(a.getType());
//         a.Walk();
//         Derived d = new Derived();
//         d.setColour("black");
//         System.out.println(d.getColour());
//         d.setType("carnivorous");
//         System.out.println(d.getType());
//         d.Walk();
//         d.setName("dog");
//         System.out.println(d.getName());
//         d.Bark();
//     }
// }

// coding for constructor Inheritance 
// class Base{
//     public Base(){
//         System.out.println("i m a constructor");
//     }
// }
// class Derived extends Base{
//     public Derived(){
//         System.out.println("i m constructor of derived class");
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Derived d = new Derived();
//     }
// }


// coding of overloading constructor inheritance
// class Base{
//     public Base(){
//         System.out.println(" i am a constructor");
//     }
//     public Base(int a){
//         System.out.println("i m a constructor ovrloaded "+ a);
//     }
// }
// class Derived extends Base{
//     public Derived(){
//         super(4);
//         System.out.println("i m a constructor of derived");
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Derived d = new Derived();
//     }
// }


// coding of overloading constructor inheritance
// class Base{
//     public Base(){
//         System.out.println("i am constructor");
//     }
//     public Base(int x){
//         System.out.println("i am an overloaded contructor of derived class : "+ x);
//     }
// }
// class Derived extends Base{
//     public Derived(){
//         // super(4);
//         System.out.println("i am a derived constructor");
//     }
//     public Derived(int x, int y){
//         super(x);
//         System.out.println(" i am a derived overloaded constructorwith : "+ y);
//     }
// }
// class childOfDerived extends Derived{
//     public childOfDerived(){
//         System.out.println("i m child of derived class");
//     }
//     public childOfDerived(int x, int y, int z){
//         super(x,  y);
//         System.out.println(" i am an overloaded constructor of derived with value : " +z);
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         childOfDerived cd = new childOfDerived(12, 14, 25);
//     }
// }  


// coding for method Override
// class A{
//     public int a;
//     public int harry(){
//         return 4;
//     }
//     public void meth2(){
//         System.out.println("I am method 2 of class A");
//     }
// }    
// class B extends A{
//     @Override
//     public void meth2(){
//         System.out.println("I am method 2 of class B");
//     }
//     public void meth3(){
//         System.out.println("I am method 3 of class B");
//     }
// }
// public class test3 {
//     public static void main(String[] args) {
//         A a = new A();
//         a.meth2();

//         B b = new B();
//         b.meth2();
//     }
// }


// coding for dynamic method dispatch (runtime polyporphism)
// class Phone{
//     public void showTime(){
//         System.out.println("the time is 8 AM");
//     }
//     public void on(){
//         System.out.println(" the phone is switched on");
//     }
// }
// class Smartphone extends Phone{
//     public void on(){
//         System.out.println("the smartphone is switched on");
//     }
//     public void music(){
//         System.out.println("playing music");
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Phone obj = new Smartphone();
//         // Smartphone obj = new Phone();    // not allowed as Smartphone is the subclass of Phone vice versa is false.
//         obj.on();                           /* ON method of Smartphone class is called because actually 
//                                                Smartphone is the object which is opening */
//         obj.showTime();
//         // obj.music();                     // not allowed as method is of Smartphone we cant call it by Phone as object
//         Smartphone obj2 = new Smartphone();        // normal inheritance with normal class
//         obj2.showTime();
//         obj2.on();
//         obj2.music();
//     }
// }


// code to create a class circle and use inheritance to create another class cylinder from it
// class Circle{
//     public int radius;
//     Circle(){
//         System.out.println("i am non param of circle");
//     }
//     Circle(int r){
//         System.out.println(" i am a circle parametric constructor");
//         this.radius = radius;
//     }
//     public double Area(){
//         return Math.PI*this.radius*this.radius;
//     }
// }
// class Cylinder extends Circle{
//     public int height;
//     int volume;
//     Cylinder(int r, int h){
//         super(r);
//         System.out.println("i am a cylinder parametric constructor");
//         this.height = h;
//     }
//     public double Volume(){
//         return Math.PI* this.radius*this.radius*this.height;
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Cylinder obj = new Cylinder(12,4);
//         System.out.println(obj.Volume());
//         System.out.println(obj.Area());
//     }
// }


// coding for abstract class with constructor and abstract method with inheritence
// abstract class Base{
//     public int x, y, z;    
//     Base(){
//         System.out.println("i am constructor");
//     }
//     Base(int x, int y, int z){
//         System.out.println("i am a constructor of base class with argument");
//         this.x = x;
//         this.y = y;
//         this.z = z;
//     }
//     abstract void fun();
// }
// class Derived extends Base{
//     Derived(){
//         super(10, 20, 30);
//         System.out.println("i m a contructor of derived class");
//     }
//     void fun(){
//         System.out.println("derived fun called");
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Derived d = new Derived();
//         d.fun();
//     }
// }



// code for abstrct class without any abstract mrthod
// abstract class Base{
//     void fun(){
//         System.out.println("method of base class of fun");
//     }
//     public void meth2(){
//         System.out.println("i am a method 2 for base class");
//     }
// }
// class Derived extends Base{
// }
// public class test3{
//     public static void main(String[] args){
//         Derived d = new Derived();
//         d.fun();
//         d.meth2();
//     }
// }
      


// code of abstrct class with final methods
// abstract class Base{
//     final void meth1(){
//         System.out.println("i m a method");
//     }
// }
// class Derived extends Base{

// }
// public class test3{
//     public static void main(String[] args) {
//         Base b = new Derived();
//         b.meth1();
//     }
// }



/*   code  If the Child class is unable to provide implementation to all abstract methods of
  the Parent class then we should declare that Child class as abstract */
// import java.io.*;
// abstract class Demo {
// 	abstract void m1();
// 	abstract void m2();
// 	abstract void m3();
// }
// abstract class FirstChild extends Demo {
// 	public void m1() {
// 	System.out.println("Inside m1");
// 	}
// }
// class SecondChild extends FirstChild {
// 	public void m2() {
// 	System.out.println("Inside m2");
// 	}
// 	public void m3() {
// 	System.out.println("Inside m3");
// 	}
// }
// public class test3 {
// 	public static void main(String[] args)
// 	{
// 		// if we remove the abstract keyword from FirstChild
// 		// Class and uncommented below obj creation for
// 		// FirstChild then it will throw
// 		// compile time error as did't override all the
// 		// abstract methods

// 		// FirstChild f=new FirstChild();
// 		// f.m1();
// 		SecondChild s = new SecondChild();
// 		s.m1();
// 		s.m2();
// 		s.m3();
// 	}
// }



/* code to Child class is unable to provide implementation to all abstract 
methods of the Parent class then we should declare that Child class as abstract */
// import java.io.*;
// abstract class Demo {
// 	abstract void m1();
// 	abstract void m2();
// 	abstract void m3();
// }
// abstract class FirstChild extends Demo {
// 	public void m1() {
// 	System.out.println("Inside m1");
// 	}
// }
// class SecondChild extends FirstChild {
// 	public void m2() {
// 	System.out.println("Inside m2");
// 	}
// 	public void m3() {
// 	System.out.println("Inside m3");
// 	}
// }
// public class test3 {
// 	public static void main(String[] args)
// 	{
// 		// if we remove the abstract keyword from FirstChild
// 		// Class and uncommented below obj creation for
// 		// FirstChild then it will throw
// 		// compile time error as did't override all the
// 		// abstract methods
// 		// FirstChild f=new FirstChild();
// 		// f.m1();
// 		SecondChild s = new SecondChild();
// 		s.m1();
// 		s.m2();  
// 		s.m3();
// 	}
// }


// coding for interface and implementation
// interface Vehicle{
//     void Speedup(int a);
//     void ApplyBrake(int a);
// }
// class Bicycle implements Vehicle{
//     int speed = 100;
//     public void Speedup(int increment){
//         System.out.println(speed+increment);
//     }
//     public void ApplyBrake(int decrement){
//         System.out.println(speed-decrement);
//     }
// }
// class Bike implements Vehicle{
//     int speed = 100;
//     public void Speedup(int increment){
//         System.out.println(speed+increment);
//     }
//     public void ApplyBrake(int decrement){
//         System.out.println(speed-decrement);
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Bicycle b = new Bicycle();
//         b.Speedup(10);
//         b.ApplyBrake(20);
//         Bike mb = new Bike();
//         mb.Speedup(5);
//         mb.ApplyBrake(15);
//     }
// }



// code for implementing multiple interfaces and extending classes with default method
// interface MyCamera{
//     void takeSnap();
//     void recordVideo();
//     private void greet(){
//         System.out.println("good morning");
//     }
//     default void recork4kVideo(){
//         System.out.println("recording in 4K");
//     }
// }
// interface MyWifi{
//     String[] getNetworks();
//     void connectToNetwoks(String network);
// }
// class MyCellPhone{
//     void callNumber(int phoneNumber){
//         System.out.println("calling"+ phoneNumber);
//     }
//     void pickCall(){
//         System.out.println("connecting......");
//     }
// }
// class SmartPhone extends MyCellPhone implements MyWifi, MyCamera{
//     public void takeSnap(){
//         System.out.println("taking snap");
//     }
//     public void recordVideo(){
//         System.out.println("taking video");
//     }
//     public void record4kVideo(){
//         System.out.println("taking video in 4k");
//     }
//     public String[] getNetworks(){
//         System.out.println("getting list of networks");
//         String[] networkList = {"Harry", "Rahul", "Pooja"};
//         return networkList;
//     }
//     public void ConnectToNetwork(String network){
//         System.out.println("connecting to "+ network);
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         SmartPhone sp = new SmartPhone();
//         sp.takeSnap();
//         sp.recordVideo();
//         sp.record4kVideo();
//         String[] arr = sp.getNetworks();
//         for(String item: arr){
//             System.out.println(item);
//         }
//         sp.ConnectToNetwork("pooja");
//     }
// }



// code for inheritance in interface
// interface sampleInterface{
//     void meth1();
//     void meth2();
// }
// interface childInterface extends sampleInterface{
//     void main3();
//     void main4();
// }
// class mySampleClass implements childInterface{
//     public void meth1(){
//         System.out.println("method 1");
//     }
//     public void meth2(){
//         System.out.println("method 2");
//     }
//     public void meth3(){
//         System.out.println("method 3");
//     }
//     public void meth4(){
//         System.out.println("method 4");
//     }
// }
// public class test3{
//     public static void main(String[] args){
//         mySampleClass sc = new mySampleClass();
//         sc.meth1();
//         sc.meth2();
//         sc.meth3();
//         sc.meth4();       
//     }
// }


// code for interface polymorphism
// interface MyCamera2{
//     void takeSnap();
//     void recordVideo();
//     private void greet(){
//         System.out.println("Good Morning");
//     }
//     default void record4KVideo(){
//         greet();
//         System.out.println("Recording in 4k...");
//     }
// }
// interface MyWifi2{
//     String[] getNetworks();
//     void connectToNetwork(String network);
// }
// class MyCellPhone2{
//     void callNumber(int phoneNumber){
//         System.out.println("Calling "+ phoneNumber);
//     }
//     void pickCall(){
//         System.out.println("Connecting... ");
//     }
// }
// class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
//     public void takeSnap(){
//         System.out.println("Taking snap");
//     }
//     public void recordVideo(){
//         System.out.println("Taking snap");
//     }
//     //    public void record4KVideo(){
// //        System.out.println("Taking snap and recoding in 4k");
// //    }
//     public String[] getNetworks(){ 
//         System.out.println("Getting List of Networks");
//         String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
//         return networkList; 
//     }
//     public void connectToNetwork(String network){
//         System.out.println("Connecting to " + network);
//     }
//     public void sampleMeth(){
//         System.out.println("meth");
//     }
// }
// public class test3 {
//     public static void main(String[] args) {
//         MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
//         // cam1.getNetworks(); --> Not allowed
//         // cam1.sampleMeth(); --> Not allowed
//         cam1.record4KVideo();
//         cam1.recordVideo();
//         cam1.takeSnap();
//         MySmartPhone2 s = new MySmartPhone2();
//         s.sampleMeth();
//         s.recordVideo();                                                                                                                                                                                                                                                                                                                                                 
//         s.getNetworks();
//         s.callNumber(7979);
//         s.record4KVideo();
//     }
// }


// coding with runnable thread 
// package p1;
// class myThreadRunnable1 implements Runnable{
//     public void run(){
//         int i = 0;
//         while(i<500){
//         System.out.println("the morning dream");
//         i++;
//         }
//     }
// }
// class myThreadRunnable2 implements Runnable{
//     public void run(){
//         int i = 0;
//         while(i<500){
//         System.out.println("deccan charges");
//         i++;
//         }
//     } 
// }
// public class practice5{
//     public static void main(String[] args) {
//         myThreadRunnable1 bullet1 = new myThreadRunnable1();
//         Thread gun1 = new Thread(bullet1);
//         myThreadRunnable2 bullet2 = new myThreadRunnable2();
//         Thread gun2 = new Thread(bullet2);
//         gun1.start();
//         gun2.start();
//     }
// }



// code for thread with constructor
// package codewithrahul;
// class MyThr extends Thread{
//     public MyThr(String name){
//         super(name);
//     }
//     public void run(){
//         int i = 34;
//         System.out.println("thank you");
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         MyThr t1 =new MyThr("harry");
//         MyThr t2 =new MyThr("ram");
//         t1.start();
//         t2.start();
//         System.out.println("The id of the thread t is " + t1.getId());
//         System.out.println("the name of the thread t is " + t1.getName());
//         System.out.println("the id of the thread t is "+ t2.getId());
//         System.out.println("the name of the thread t is " + t2.getName());
//     }
// }


// code for thread with constructor
// package codewithrahul;
// class MyThr extends Thread{
//     public MyThr(String name) {
//         super(name);
//     }
//     public void run(){  
//             System.out.println("i am a thread");
//     }
// }
// public class practice7{
//     public static void main(String[] args) {
//         MyThr t1 = new MyThr("rahul");
//         t1.start();
//         System.out.println("the id of the thread is " + t1.getId());
//         System.out.println("the name of the thread is "+ t1.getPriority() );
//         System.out.println("the name of the thread is "+ t1.getClass() );
//         System.out.println("the name of the thread is "+ t1.getContextClassLoader());
//         System.out.println("the name of the thread is "+ t1.getStackTrace());
//         System.out.println("the name of the thread is "+ t1.getState());
//         System.out.println("the name of the thread is "+ t1.getThreadGroup());
//         System.out.println("the name of the thread is "+ t1.getAllStackTraces());   
//     }
// }


// code of threading with delay in printing
// class problem extends Thread{
//     public void run(){
//         while (true){
//             // try{
//             //     Thread.sleep(150);
//             // }
//             // catch(Exception e){
//             //     System.out.println(e);
//             // }
//             System.out.println("welcome");
//         }
//     }
// }
// class problem2 extends Thread{
//     public void run(){
//         while(true){
//             try{                                    // for delaying in printing good morning sleep commmand is used
//                 Thread.sleep(200);          // delay of 200 milisecond.
//             }
//             catch(Exception e){                     // for catching the excaption thrown by terminal
//                 System.out.println(e);
//             }
//             System.out.println("good morning");
//         }
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         problem p = new problem();
//         problem2 p2 = new problem2();
//         p.start();
//         p2.start();
//     }
// }



// coding for thread with set and get priority
// class problem extends Thread{
//     public void run(){
//             // try{
//             //     Thread.sleep(150);
//             // }
//             // catch(Exception e){
//             //     System.out.println(e);
//             // }
//             System.out.println("welcome");
//     }
// }
// class problem2 extends Thread{
//     public void run(){
//             try{                                    // for delaying in printing good morning sleep commmand is used
//                 Thread.sleep(200);          // delay of 200 milisecond.
//             }
//             catch(Exception e){                     // for catching the excaption thrown by terminal
//                 System.out.println(e);
//             }
//             System.out.println("good morning");
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         problem p = new problem();
//         problem2 p2 = new problem2();
//         // p.setPriority(8);                        // setting priority for p
//         // p2.setPriority(5);                       // setting priority for p2
//         System.out.println(p.getPriority());            // command for printing priority
//         System.out.println(p2.getPriority());           // command for printing priority
//         p.start();
//         p2.start();
//     }
// }



// coding for thread with set and get priority
// class problem extends Thread{
//     public void run(){
//             // try{
//             //     Thread.sleep(150);
//             // }
//             // catch(Exception e){
//             //     System.out.println(e);
//             // }
//             System.out.println("welcome");
//     }
// }
// class problem2 extends Thread{
//     public void run(){
//             try{                                    // for delaying in printing good morning sleep commmand is used
//                 Thread.sleep(200);          // delay of 200 milisecond.
//             }
//             catch(Exception e){                     // for catching the excaption thrown by terminal
//                 System.out.println(e);
//             }
//             System.out.println("good morning");
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         problem p = new problem();
//         problem2 p2 = new problem2();
//         // p.setPriority(8);                        // setting priority for p
//         // p2.setPriority(5);                       // setting priority for p2
//         System.out.println(p.getPriority());            // command for printing priority
//         System.out.println(p2.getPriority());           // command for printing priority
//         p.start();
//         p2.start();
//         System.out.println(p2.getState());                           // command for getting state
//         System.out.println(Thread.currentThread().getState());       // command for getting current thread state
//     }
// }


// code for thread using join() keyword
// class MyThr extends Thread{
//     public void run(){     
//         for(int i=0; i<10; i++){
//             System.out.println("sita thread");
//             try{
//                 Thread.sleep(2000);
//             }
//             catch(InterruptedException e){
//             }
//         }      
//     }
// }
// class practice6{
//     public static void main(String[] args)throws InterruptedException{
//         MyThr t = new MyThr();
//         t.start();
//         t.join();
//         for(int i=0; i<10; i++){
//             System.out.println("ram thread");
//         }
//     }
// }


// code for thread with join() , waiting for few milisecods only
// class MyThr extends Thread{
//     public void run(){       
//         for(int i=0; i<10; i++){
//             System.out.println("sita thread");
//             try{
//                 Thread.sleep(2000);
//             }
//             catch(InterruptedException e){
//             }
//         }       
//     }
// }
// class practice6{
//     public static void main(String[] args)throws InterruptedException{
//         MyThr t = new MyThr();
//         t.start();
//         t.join(10000);
//         for(int i=0; i<10; i++){
//             System.out.println("ram thread");
//         }
//     }
// }


// code for interrupt while waiting and sleeping
// class MyThr extends Thread{
//     public void run(){
//         try{
//             for(int i=0; i<10; i++){
//                 System.out.println("i am lazy thread");
//                 Thread.sleep(2000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println("i am intruppted");
//         }
//     }
// }
// class practice6{
//     public static void main(String[] args) {
//         MyThr t = new MyThr();
//         t.start();
//         t.interrupt();
//         System.out.println("end of main thread");
//     }
// }


// code for interrupt in if thread is neither sleeping nor waiting
// class MyThr extends Thread{
//     public void run(){
//         for(int i=0; i<1000; i++){
//             System.out.println("i am lazy thread");
//         }
//         System.out.println("i am entering into sleeping state");
//         try{
//             Thread.sleep(2000);
//         }
//         catch(InterruptedException e){
//             System.out.println("i am interrupted");
//         }
//     }
// }
// class practice6{
//     public static void main(String[] args) {
//         MyThr t = new MyThr();
//         t.start();
//         t.interrupt();
//         System.out.println("end of main class");
//     }
// }


// code of synchronization in multithreading
// class Display{
//     public synchronized void wish(String name){
//         for(int i =0; i<10; i++){
//             System.out.println("good morning :");
//             try{
//                 Thread.sleep(1000);
//             }
//             catch(InterruptedException e){}
//             System.out.println(name);
//         }
//     }
// }
// class MyThr extends Thread{
//     Display d; 
//     String name ;
//     MyThr(Display d, String name){
//         this.d = d;
//         this.name = name;
//     }
//     public void run(){
//         d.wish(name);
//     }
// }
// class SnchronizedDemo{
//     public static void main(String[] args){
//         Display d= new Display();
//         MyThr t1 = new MyThr(d,"Dhoni");
//         MyThr t2 = new MyThr(d,"yuvraj");
//         MyThr t3 = new MyThr(d,"rohit");
//         MyThr t4 = new MyThr(d,"sachin");
//         t1.start();
//         t2.start();
//         t3.start();
//         t4.start();
//     }
// }




// code to handle arithematic exception
// public class test3{
//     public static void main(String[] args) {
//         int a = 6000;
//         int b= 0;
//         try{                                              // trying to  calculate but its Arithematic exception
//             int c= a/b;
//             System.out.println(c);
//         }
//         catch(Exception e){                              // catch the exception and print it as the problem
//             System.out.println("we filed to devide. Reason :"+ e);       // printing the exception e 
//         }
//         System.out.println("end of program");         //now it will not show any error and execute further sout command
//     }
// }


// code for arithmatic exception and array out of bounf exception
// import java.util.Scanner;
// public class test3{
//     public static void main(String[] args) {
//         double[] marks = new double[3];
//         marks[0] = 7.5;
//         marks[1] = 15;
//         marks[2] = 14;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the array index");
//         int ind = sc.nextInt();
//         System.out.println("enter the no. you want to devide with");
//         int number = sc.nextInt();
//         try{
//             System.out.println("the value at array index entered is: "+ marks[ind]);
//             System.out.println("the value of array value/number is" + marks[ind]/number);
//         }
//         catch(ArithmeticException e){
//             System.out.println("arithmatic exception occur ");
//             System.out.println(e);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("arrayindex out of bound occur "+ e);
//         }
//         catch(Exception e){
//             System.out.println("some other exception occur "+e);
//         }
//         System.out.println("end of program");
//     }
// }



// code with boolean of exception with nested try catch 
// import java.util.*;
// public class test3{
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         marks[0] = 15;
//         marks[1] = 25;
//         marks[2] = 18;
//         Scanner sc = new Scanner(System.in);
//         boolean flag = true;
//         while(flag){
//             System.out.println("enter the index ");
//             int ind = sc.nextInt();
//             try{
//                 try{
//                     System.out.println(marks[ind]);
//                     flag = false;
//                 }
//                 catch(ArrayIndexOutOfBoundsException e){
//                     System.out.println("sorry this index does not exist "+ e);
//                     System.out.println("exception in level 2");
//                 }
//             }
//             catch(Exception e){
//                 System.out.println("exception in level 1");
//             }    
//         }
//         System.out.println("welcome to video no 23");
//         System.out.println("end of program");
//     }
// } 



// code to make a custom exception by ourself
// import java.util.*;
// class MyException extends Exception{
//     @Override
//     public String toString() {
//         return  "i am toString";
//     }
//     @Override
//     public String getMessage() {
//         return "i am get message ";
//     }
// }
// public class test3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a no.");
//         int a = sc.nextInt();
//         if (a<9){
//             try{
//                 throw new MyException();
//             }
//             catch(Exception e){
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//                 e.printStackTrace();
//                 System.out.println("finish of programmimg");
//             }
//         }
//     }
// }



// code for custom exception with methods 
// class NegativeRadiusException extends Exception{            // MAKING EXCEPTION CLASS
//     @Override
//     public String toString() {
//         return "radius cannot be negative";
//     }
//     @Override
//     public String getMessage() {
//         return "radius cannot be negative";
//     }
// }
// public class test3{
//     public static double area(int r) throws NegativeRadiusException{    // making area method throwing exception warning
//         if(r<0){                                             // if condition statement to avoid further area calculation
//             throw new NegativeRadiusException();          //  putput for if statement as true
//         }
//         double result = Math.PI*r*r;                    // if r!= -ve then it will calculate area.
//         return result;
//     }
//     public static int divide(int a , int b) throws ArithmeticException{      // making divide method
//         int result = a/b;                                                   // calculating divide
//         return result;
//     }
//     public static void main(String[] args){
//         // use divide function 
//             int c = divide(6,0);
//             System.out.println(c);
//         }
//         catch(Exception e){
//             System.out.println("exception");
//         }
//         try{
//             double ar = area(-1);
//             System.out.println(ar);
//         }
//         catch(NegativeRadiusException e){
//             System.out.println("negative radius exception");
//         }    
//     }
// }



// code of finally statement during try and catch
// public class test3{
//     public static int greet(){
//         try{
//             int a= 4;
//             int b= 2;
//             int c = a/b;
//             // System.out.println(a/b);
//             return c;
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         finally{
//             System.out.println("i am a final statement");
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         System.out.println(greet());
//     }
// }


// code of finally statement during try and catch which break command
// public class test3{
//     public static void main(String[] args) {
//         int a = 50;
//         int b = 5;
//         while(true){
//             try{
//                 System.out.println(a/b);
//             }
//             catch(Exception e){
//                 System.out.println(e);
//                 break;
//             }
//             finally{
//                 System.out.println("i m final statement for division");
//             }
//             b--;       
//         }        
//     }
// }



// code for using try and finally statement without catch
// public class test3{
//     public static void main(String[] args) {
//         try{
//             System.out.println(5/0);
//         }
//         finally{
//             System.out.println("yes this is finally");
//         }
//     }
// }


// code for import java.util arraylist 
// import java.util.*;
// public class test3{
//     public static void main(String[] args) {
//         ArrayList<Integer> l1 = new ArrayList<>();
//         ArrayList<Integer> l2 = new ArrayList<>(5);
//         l1.add(2);
//         l1.add(4);
//         l1.add(5);
//         l1.add(7);
//         l1.add(4);
//         l2.add(11);
//         l2.add(12);
//         l2.add(13);
//         l2.add(14);
//         l2.add(18);
//         // l1.addAll(l2);
//         // for(int i=0; i<l1.size(); i++){
//         //     System.out.println(l1.get(i));
//         // }
//         System.out.println(l1.contains(4));
//         System.out.println( l1.indexOf(159));
//         System.out.println( l1.indexOf(4));
//         System.out.println( l1.lastIndexOf(4));
//         System.out.println(l1.indexOf(5));
//         for (int i=0; i<l1.size(); i++){
//             System.out.print(l1.get(i)+ ", ");
//         }
//     }
// }



// code for linked list
// import java.util.*;
// public class test3{
//     public static void main(String[] args) {
//         LinkedList<Integer> l1 = new LinkedList<>();
//         LinkedList<Integer> l2 = new LinkedList<>();
//         l1.add(1);
//         l1.add(4);
//         l1.add(7);
//         l1.add(4);
//         l2.add(11);
//         l2.add(12);
//         l2.add(15);
//         l1.addAll(l2);
//         System.out.println(l1.contains(4));
//         System.out.println(l1.contains(125));
//         System.out.println(l1.indexOf(4));
//         System.out.println(l1.lastIndexOf(4));
//         l1.remove(2);
//         for(int i=0; i<l1.size(); i++){
//             System.out.println(l1.get(i));
//         }
//     }
// }



// coding wiht array dequeue
// import java.util.*;
// public class test3{
//     public static void main(String[] args) {
//         ArrayDeque<Integer> ad1 = new ArrayDeque<>();
//         ad1.add(6);
//         ad1.add(9);
//         ad1.add(3);
//         ad1.addFirst(5);
//         System.out.println(ad1.getFirst());
//         System.out.println(ad1.getLast());
//     }
// }


// code for hashset
// import java.util.*;
// public class test3{
//     public static void main(String[] args) {
//         HashSet<Integer> hs = new HashSet<>(18,0.5f);
//         hs.add(5);
//         hs.add(1);
//         hs.add(8);
//         hs.add(4);
//         System.out.println(hs);
//     }
// }


// code for date and time
// import java.util.*;
// public class test3{
//     public static void main(String[] args) {
//         HashSet<Integer> hs = new HashSet<>(18,0.5f);
//         hs.add(5);
//         hs.add(1);
//         hs.add(8);
//         hs.add(4);
//         System.out.println(hs);
//     }
// }


// code amd date and time
// public class test3{
//     public static void main(String[] args) {
//         System.out.println(Long.MAX_VALUE);
//         System.out.println(System.currentTimeMillis());
//         System.out.println(System.currentTimeMillis()
//         /1000/3600/365/24);
//     }
// }


// code for date class
// import java.util.Date;
// public class test3{
//     public static void main(String[] args) {
//         Date d = new Date();
//         System.out.println(d);
//         System.out.println(d.getTime());
//         System.out.println(d.getDate());
//         System.out.println(d.getDay());
//         System.out.println(d.getSeconds());
//         System.out.println(d.getHours());
//     }
// }


// code
// import java.util.*;
// public class practice6{
//     public static void main(String[] args) {
//         // Calendar c = Calendar.getInstance();
//         // System.out.println(c.getCalendarType());
//         // System.out.println(c.getTimeZone());
//         // System.out.println(c.getTimeZone().getID());
//         Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//         System.out.println(c.getCalendarType());
//         System.out.println(c.getTimeZone());
//         System.out.println(c.getTimeZone().getID());    
//     }
// }





















