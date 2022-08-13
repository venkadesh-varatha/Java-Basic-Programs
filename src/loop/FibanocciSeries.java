package loop;

import java.util.Scanner;

public class FibanocciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of test cases: ");
        int t = sc.nextInt();
        while(t > 0){
            System.out.println("Please enter the number to find Fibanocci Series: ");
            int n = sc.nextInt();
            System.out.print("The fibanocci series is: ");
            if(n == 0){
                System.out.println(1);
            } else if(n == 1){
                System.out.println(1 + " , " + 1);
            }
            else{
                System.out.print(1 + " " + 1);
                int a = 1;
                int b = 1;
                for(int i=2; i<=n; i++){
                    int c = a + b;
                    System.out.print(" " + c);
                    a = b;
                    b = c;
                }
            }

            t--;
        }
    }
}
