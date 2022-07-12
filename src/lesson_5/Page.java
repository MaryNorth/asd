package lesson_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Page {
    Book [] memo;

    Page (int i)
    {
        this.memo = new Book[i];
    }


    void addMemo (int i, String data, String plan)
    {
        Book b = new Book();
        b.data=data;
        b.plan=plan;
        this.memo[i]=b;

    }

    void print(){
        for (int i = 0; i < memo.length; i++) {
            if (this.memo[i] == null)   continue;
            System.out.println(this.memo[i].data+" - "+ this.memo[i].plan);

        }}

    void sortData() throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        boolean sort=true;
        while (sort)
        {
            sort=false;
            for (int i=1;i< memo.length;i++)
                        { if (this.memo[i] == null)  continue;
                if(format.parse(memo[i].data).compareTo(format.parse(memo[i-1].data))<0)
                {
                    Book tmp=memo[i];
                    memo[i]=memo[i-1];
                    memo[i-1]=tmp;
                    sort=true;
                }
            }
        }

    }
void findDelo() {
    Scanner in = new Scanner(System.in);
    String delo = in.nextLine();

    Pattern pat = Pattern.compile(delo);
    Matcher mat;
    Boolean count = false;
    for (int i = 0; i < memo.length; i++) {
        if (this.memo[i] == null)   continue;
        mat = pat.matcher(memo[i].plan);

        if (mat.find() == true) {
            if(count==false)  System.out.println("Find your notes in:");
            count=true;
            System.out.println(memo[i].data + " - "+memo[i].plan);
        }
    } if (count==false) System.out.println("Not found!");

}

}
