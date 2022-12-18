/*
 *@Author Emircan Aktaş - 18.Dec.2022
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Lessons : Mathematics, Physics, Turkish, Chemistry, Music.
        //Passing Grade : 55 point.

        Scanner inp = new Scanner(System.in);

        int math, phys, turk, chemis, music;


        System.out.print("Your mathematics grade :");
        math = inp.nextInt();

        System.out.print("Your physics grade :");
        phys = inp.nextInt();

        System.out.print("Your turkish grade :");
        turk = inp.nextInt();

        System.out.print("Your chemistry grade :");
        chemis = inp.nextInt();

        System.out.print("Your music grade :");
        music = inp.nextInt();

        if (((math >= 0) && (math <= 100)) && ((phys >= 0) && (phys <= 100)) && ((turk >= 0) && (turk <= 100)) && ((chemis >= 0) && (chemis <= 100)) && ((music >= 0) && (music <= 100))) {
            double average = (math + phys + turk + chemis + music) / 5;
            if (average >= 55) {
                System.out.println("You passed the class. Point :" + average);
            } else {
                System.out.println("You didn't pass the class. Point :" + average);
            }
        } else {
            System.out.println("Enter a grade between 0 and 100.");
        }

    }
}