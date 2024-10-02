package javabasicquestion;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n){
    if(n==0){
        return n;
    }else if (n==1) {
        return n;
    }else{
        return fibonacci(n - 1) + fibonacci(n - 2);  // recursive case 
    }
}
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci series");
        System.out.print("Enter the first number: " );
        int n1=sc.nextInt();
        System.out.print("Enter the second number:");
        int n2 = sc.nextInt();

        int s;
        for(int i=1;i<=10;i++){
            s=n1+n2;
            System.out.println(" "+s);
            n1=n2;
            n2=s;
        }
    
        sc.close();
    }
}
   

        

