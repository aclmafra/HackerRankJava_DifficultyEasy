package HackerRankExercises_Easy;

import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if (N % 2 == 1) {
            System.out.println("Weird");
        }if (N % 2 == 0 && N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        }if (N % 2 == 0 && N >= 6 && N <= 20) {
            System.out.println("Weird");
        }if (N % 2 == 0 && N > 20) {
            System.out.println("Not Weird");
        }
            scanner.close();
        }
}

//Link to the respective question: https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
