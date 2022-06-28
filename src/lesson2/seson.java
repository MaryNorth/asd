package lesson2;

import java.util.Scanner;
import java.util.Arrays;

public class seson {
    public static void main(String[] args) {

        System.out.print("January, February, March, April, May, June, July, August, September, " +
                "October, November, December\nInput mounth: ");
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        byte a=0;
        System.out.print(m);
        String[] winter = {"January", "December", "February"};
        String[] spring = {"March", "April", "May"};
        String[] summer = {"June", "July", "August"};
        String[] fall = {"September", "October", "November"};

        if (Arrays.asList(winter).contains(m))
        {System.out.print(" -  winter");
            a++;}

        if (Arrays.asList(spring).contains(m))
        {System.out.print(" -  spring");
            a++;}

        if (Arrays.asList(summer).contains(m))
        {System.out.print(" -  summer");
            a++;}

        if (Arrays.asList(fall).contains(m))
        {System.out.print(" -  fall");
            a++;}

        if (a==0)
        {System.out.print(" - Input incorrect");}
    }


}

