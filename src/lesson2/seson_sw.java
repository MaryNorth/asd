package lesson2;

import java.util.Scanner;

public class seson_sw {
    public static void main(String[] args) {

        System.out.print("January, February, March, April, May, June, July, August, September, " +
                "October, November, December\nInput mounth: ");
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        System.out.print(m);
        switch (m){
            case "January", "February","December" -> System.out.print(" -  winter");
            case "March", "April","May" -> System.out.print(" -  spring");
            case "June", "July","August" -> System.out.print(" -  summer");
            case "September", "October","November" ->   System.out.print (" -  fall");
            default -> System.out.print (" - Input incorrect");
        }
    }
}
