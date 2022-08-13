package loop;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of test cases: ");
        int t = sc.nextInt();
        while(t > 0){
            System.out.println("Please enter the number to find whether it is prime or not: ");
            int n = sc.nextInt();
            if(n > 0){
                int i = 2;
                boolean isPrime = true;
                while( i<n ){
                    if(n%i == 0){
                        isPrime = false;
                        break;
                    }
                    i++;
                }
                if(isPrime)
                    System.out.println("This number is a prime number.");
                else
                    System.out.println("This number is not a prime number.");
            }else
                System.out.println("Invalid Input.");
            t--;
        }
    }
}
