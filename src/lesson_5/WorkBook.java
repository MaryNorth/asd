package lesson_5;

import java.text.ParseException;
import java.util.Scanner;

public class WorkBook {

    public static void main(String[] args) throws ParseException{

        Scanner in = new Scanner(System.in);
        Page stroka = new Page(5);

        stroka.addMemo(0,"21.05.2022","Wash car, wash cat, wash dog");
        stroka.addMemo(1,"14.09.2022", "Buy milk, buy ticket");
        stroka.addMemo(2,"15.12.2022", "Happy birthday, my dog");
       stroka.addMemo(3,"05.06.2021", "Go to the cinema");


       stroka.print();
        System.out.println("\n---Now sort by date---");
       stroka.sortData();
        stroka.print();
        System.out.println("\nInput word for search in your plan:");
        stroka.findDelo();

    }

}
