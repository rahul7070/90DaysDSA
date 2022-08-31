import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.*;

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



// code to set which values lied in which datatypess
// import java.util.*;
// public class Hackerrank{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t= sc.nextInt();
//         for(int i=0; i<t; i++){
//             try{
//                 Long x = sc.nextLong();
//                 System.out.println(x + " can be fitted in: ");
//                 if(x>= Byte.MIN_VALUE && x<=Byte.MAX_VALUE){
//                     System.out.println("* byte");
//                 }if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE){
//                     System.out.println("* short");
//                 }if(x>=Integer.MIN_VALUE & x<=Integer.MAX_VALUE){
//                     System.out.println("* int");
//                 }if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE){
//                     System.out.println("* long");
//                 }
//             }catch(Exception e){
//                 System.out.println(sc.next() +" can't be fitted anywhere");
//             }
//         }
//     }
// }



// code to use scanner to scan skipped line and close scanner object
// import java.util.Scanner;
// public class Hackerrank{
//     public static void main(String[] args) {
//         try{
//             String st = "gfg is best website";
//             Scanner sc = new Scanner(st);   // st as argument scanning skipped string st
//             System.out.println(sc.nextLine());   // printing the scanned line.  
//             sc.close();     // this method use to close scanner object
//             System.out.println(sc.nextLine());  // no output as scanner is closed
//         }catch(Exception e){}
//     }
// }


// code to scan and print
// import java.util.*;
// public class Hackerrank{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i = 1;
//         while(sc.hasNext()){
//             System.out.println(sc.nextLine());
//             i++;
//         }
//         sc.close();
//     }
// }


// code to find an area of rectangle with exception throwed for -ve .
// import java.util.*;
// public class Hackerrank{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//             int H = sc.nextInt();
//             int B = sc.nextInt();
//             if(H<=0 || B<=0){
//                 System.out.println( "java.lang.Exception: Breadth and height must be positive" );
//             }
//             else {
//                 int Area = B*H;
//                 System.out.println(Area);
//             }
//     }
// } 


// code to convert the int to string
// public class practice4 {
//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc= new Scanner(System.in);
//         int n = sc.nextInt();
//         String s = Integer.toString(n);
//         if(n== Integer.parseInt(s)){
//             System.out.println("Good job");
//         }else{
//             System.out.println("Wrong answer");            
//         }    
//     }
// }


// code for printing day of particulate date
// import java.time.DayOfWeek;
// import java.time.LocalDate;
// import java.util.Scanner;
// class Example{
//     public DayOfWeek getDay(int Y, int m, int d){
//         LocalDate lt = LocalDate.of(Y, m, d);
//         return lt.getDayOfWeek();
//     }
// }
// public class Hackerrank{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Example ex = new Example();
//         int m = sc.nextInt();
//         int d = sc.nextInt();
//         int Y = sc.nextInt();
//         sc.close();
//         System.out.println(ex.getDay(Y, m, d));
//     }
// }


// public class Hackerrank{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         double payment = sc.nextDouble();
//         String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//         String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
//         String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
//         String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
//         System.out.println("US: "+ us);
//         System.out.println("India: "+ india);
//         System.out.println("China: "+ china);
//         System.out.println("France: "+ france);
//     }
// }











