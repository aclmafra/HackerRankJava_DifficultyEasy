package HackerRankExercises_Easy;

import java.util.Scanner;

public class JavaStdinAndStdout_ll {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    scan.close();
    }
}

//Link to the respective question:https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true