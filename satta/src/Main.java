//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.Math;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("random number guessing game");


        double rand = Math.random();
        rand = rand * 10;
        int rand1 = (int) Math.round(rand);


        System.out.println("the number was " + rand1);

        System.out.println("thankyou for satta");
}
}