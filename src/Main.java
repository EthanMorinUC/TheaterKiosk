import jdk.dynalink.StandardNamespace;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What age are you?");
        int age = input.nextInt();
        if (age >= 21)
            System.out.println("You get a paper wrist band");
        else
            System.out.println("You don't get a paper wrist band");
    }
}