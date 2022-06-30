//Ќаписать игру в которой нужно угадать случайно выбранную букву (именно букву).
// ѕри каждом вводе пользователем программа долна говорить "warmly, hot" или "chilly, cold"
// в зависимости от того, как далеко буква пользовател€ от загаданной

package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HotLetter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String myLeter;
        System.out.print("a b c d e f g h i j k l m n o p q r s t u v w x y z");
        System.out.print("\nI guessed a letter.\nEnter your letter:");
        char [] alfavit  = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random r = new Random();
        char c = (char) (r.nextInt(26) + 'a');
        int i= new String(alfavit).indexOf(c);
        //System.out.print(c+" "+i);
do {
    myLeter = in.next();
    String c1 = Character.toString(c);
    if (myLeter.equals(c1)) {
        System.out.print("Bingo!");
        break;
    } else {
        int j= new String(alfavit).indexOf(myLeter);
        if (Math.abs(i-j)<=3)
            System.out.print("Hot\n");
        if (Math.abs(i-j)>3&Math.abs(i-j)<=10)
            System.out.print("Warmly\n");
        if (Math.abs(i-j)>10)
            System.out.print("Cold\n");
        System.out.print("No, try again or Press 0 for exti\n");

    }
} while (!myLeter.equals("0")); //не знаю, как прервать ввод с консоли. —делала криво, но работает.

    }


}