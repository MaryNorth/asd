
//������� ����� �������� ������, � ������� �������� ������ ���.
// ������� � ���� ������ �����, ������� ������� ��������� ������� ��� ������������ ������
// (������ ����� ���������� �� ������/�������)
//
// + ��� ���� ������� ��� ��
//
//������������� ������, ���������� � �������� ������ �� ������� �� ����������
// � ������� � ���� ������� � �������

package lesson5;

public class Book {
    public String plan;
    public String data;
    public int num;

    public Book(int num, String data, String plan) {
        this.num=num;
       this.data = data;
       this.plan = plan;
    }


    public static void Count(int num, String plan) {

        plan =plan.replace(", ", " ");
        String[] stroka = plan.toLowerCase().split(" ");
        System.out.println("Count words in: "+plan);
        for (int i = 0; i < stroka.length; i++) {
            if(stroka[i]!=null) {
                int count = 1;
                for (int j = i + 1; j < stroka.length; j++) {

                    if (stroka[i].equals(stroka[j]) && j != i) {
                        count++;
                        stroka[j] = null;
                    }
                }
                System.out.print(stroka[i] + " - " + count + "\n");

            }
        }

    }
    public String toString() {
        return num+") "+ data+" "+plan+"\n";

    }

}