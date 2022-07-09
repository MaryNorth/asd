package lesson5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class WorkBook {
    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);
Book [] b = new Book[4];
b[0]=new Book(1,"21.05.2022","Wash car, wash cat, wash dog");
b[1]=new Book(2,"14.09.2022", "Buy milk, buy ticket");
b[2]=new Book(3,"15.12.2022", "Happy birthday, my dog");
b[3]=new Book(4,"05.06.2021", "Go to the cimena");

        System.out.println("---Our book with notes---");
for (int i=0; i<4; i++) System.out.print(b[i]);

            System.out.println("Input number of line in which you want to count the words:");
        int n= in.nextInt();
        switch (n)
        {
            case 1 -> Book.Count(1, b[0].plan);
            case 2 -> Book.Count(2, b[1].plan);
            case 3 -> Book.Count(3, b[2].plan);
            case 4 -> Book.Count(4, b[3].plan);
        }

       SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        boolean sort=true;
        while (sort)
        {
            sort=false;
            for (int i=1;i<4;i++)
            {
                if(format.parse(b[i].data).compareTo(format.parse(b[i-1].data))<0)
                {
                    Book tmp=b[i];
                    b[i]=b[i-1];
                    b[i-1]=tmp;
                    sort=true;
                }
            }
        }
        System.out.println("---Now sort by date---");
        for (int i=0; i<4; i++) System.out.print(b[i]);


    }
}
