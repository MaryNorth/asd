//Написать программу, которая будет хранить текст по предложениям
// и для каждого предложения составить частотный словарь


package lesson4;

public class TextCount {

    public static void main(String[] args) {

        String t = "Once when a Lion was asleep, a little Mouse began running up and down upon him. "+
                "This soon wakened the Lion, who placed his huge paw upon him and opened his big jaws to swallow him. " +
                "Pardon, O Lion! Cried the little Mouse, Forgive me this time. "+
                "I shall never repeat it and I shall never forget your kindness. And who knows, "+
                "but I may be able to do you a good turn one of these days?";

        String text=t.replace(". ", ".");
        text=text.replace("! ", "!");
        text=text.replace("? ", "!");
        String [] sentence = text.toLowerCase().split("[.!?]");

        String [][]words = new String[sentence.length][];
        for (int i = 0; i < sentence.length; ++i)
        words[i] = sentence[i].split("[\\p{Punct}\\s]+");


int s,i,j,count=0;


        for(i=0;i< words.length;i++){
            System.out.print("N "+i+" - ");
            {
            for (j=0;j<words[i].length;j++) {
                System.out.print(words[i][j] + " ");
            }
            } System.out.println();

    }
        System.out.println("---------------\nResult:\n");


        for(i=0;i< words.length;i++){
            String [] stroki = new String[words[i].length];
            stroki=words[i];
            System.out.print("N "+i+":\n");
                        {

                for (j=0;j< stroki.length;j++) {
                    if (stroki[j]!=null){
                        count=1;
                        for(s=j+1;s< stroki.length;s++)
                            if (stroki[j].equals(stroki[s]) && s != j){
                                count++;
                                stroki[s]=null;
                            }
                    }
        if(stroki[j]!=null)
                    System.out.print(stroki[j] + " - " + count + ", ");

                }
            } System.out.println();

        }

}}
