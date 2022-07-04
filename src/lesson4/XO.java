
//Написать игру крестики нолики

package lesson4;
import java.util.Scanner;



public class XO {

    public static void main(String[] args) {

      char [][] mas  = {{'1','2','3'}, {'4','5','6'}, {'7','8','9'}};
      int game=0;
    int hod;
    System.out.print("\nPlaying field:\n");
    pechat(mas);

    for(hod=0; hod<5;hod++){

            hod=proverka(mas,hod);
            igrokX(1, mas);
            pechat(mas);
            hod=proverka(mas,hod);
            game=game+1;
            if(game==9) break;
            if(hod==6) break;
            igrokX(2, mas);
            pechat(mas);
            hod=proverka(mas,hod);
            game=game+1;

} if(hod==4) System.out.print("Game over. Not winner (");
    }


    private  static void pechat (char [][] mas) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void igrokX (int N, char [][] mas){

        Scanner in = new Scanner(System.in);
        int c=0,r=0;
        boolean empty=true;
        if (N==1) {System.out.println("Igrok X:"); } else {System.out.println("Igrok 0:");}
        while(empty) {
            System.out.print("Input index:");
            int index = in.nextInt();

            switch (index) {
                case 1:
                    r = 0;
                    c = 0;
                    break;
                case 2:
                    r = 0;
                    c = 1;
                    break;
                case 3:
                    r = 0;
                    c = 2;
                    break;
                case 4:
                    r = 1;
                    c = 0;
                    break;
                case 5:
                    r = 1;
                    c = 1;
                    break;
                case 6:
                    r = 1;
                    c = 2;
                    break;
                case 7:
                    r = 2;
                    c = 0;
                    break;
                case 8:
                    r = 2;
                    c = 1;
                    break;
                case 9:
                    r = 2;
                    c = 2;
                    break;
            }
            if (mas[r][c] == 'x' || mas[r][c] == '0')
            {System.out.println("Not empty! Try again!"); empty=true;}
            else empty=false;
        }
       if (N==1) mas[r][c]='x';
        if(N==2) mas[r][c]='0';

    }


    private  static  int proverka (char [][] mas, int hod) {
        if(mas[0][0]=='x' && mas[0][1]=='x' && mas[0][2]=='x'||
                mas[0][0]=='x' && mas[1][0]=='x' && mas[2][0]=='x'||
                mas[0][1]=='x' && mas[1][1]=='x' && mas[2][1]=='x'||
                mas[0][2]=='x' && mas[1][2]=='x' && mas[2][2]=='x'||
                mas[1][0]=='x' && mas[1][1]=='x' && mas[1][2]=='x'||
                mas[2][0]=='x' && mas[2][1]=='x' && mas[2][2]=='x'||
                mas[0][0]=='x' && mas[1][1]=='x' && mas[2][2]=='x'||
                mas[0][2]=='x' && mas[1][1]=='x' && mas[2][0]=='x'||
                mas[0][0]=='0' && mas[1][0]=='0' && mas[2][0]=='0'||
                mas[0][1]=='0' && mas[1][1]=='0' && mas[2][1]=='0'||
                mas[0][2]=='0' && mas[1][2]=='0' && mas[2][2]=='0'||
                mas[1][0]=='0' && mas[1][1]=='0' && mas[1][2]=='0'||
                mas[2][0]=='0' && mas[2][1]=='0' && mas[2][2]=='0'||
                mas[0][0]=='0' && mas[1][1]=='0' && mas[2][2]=='0'||
                mas[0][2]=='0' && mas[1][1]=='0' && mas[2][0]=='0'
        )
        { System.out.println("WIN!!!"); hod=6; return hod; }
else return hod;

    }

        }


