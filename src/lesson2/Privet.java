//Ќаписать программу, котора€ приветствует пользовател€ в зависимости от его пола и возраста
// (им€, пол и возраст задаютс€ при старте программы)

package lesson2;

import java.util.Scanner;

public class Privet {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input sex (m/w): ");
        String gender = in.nextLine();
        String g = "m";
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        if (age > 18)
        {
            if (gender.equals(g))
            {
                System.out.print("Nice to meet you, Mr. " + name);}
            else {System.out.print("Nice to meet you, Mrs. " + name);}
        }
        else {
            if (gender.equals(g))
            {
                System.out.print("Hi, bro " + name);}
            else {System.out.print("Hi, little friend " + name);}
        }
    }


}
