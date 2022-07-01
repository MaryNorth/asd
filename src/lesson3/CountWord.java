//Написать частотный словарь - посчитать сколько раз каждое слово
// встречается в предложении и вывести результат в консоль

package lesson3;


import java.util.Scanner;

public class CountWord {

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        //System.out.print("Input sentence: ");
        // String sentence = in.nextLine();
        String sentence = "cat dog cat cat puppy kitten kitten dog";
        System.out.print("Your sentence:\n"+sentence);

        String[] stroka = sentence.split(" "); //на заглавные буквы, запятые, тире не проверяла

        int count, i, j;

        System.out.print("\nCount:\n");

        for (i = 0; i < stroka.length; i++) {
            if(stroka[i]!=null) {
                count = 1;
                for (j = i + 1; j < stroka.length; j++) {

                    if (stroka[i].equals(stroka[j]) && j != i) {
                        count++;
                        stroka[j] = null;

                    }
                }
                System.out.print(stroka[i] + " - " + count + "\n");

            }
        }

               }}







