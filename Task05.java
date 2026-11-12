import java.util.Scanner;

public class Task05{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту: ");

        int h = scanner.nextInt();

        if (h < 1){
            System.out.println("Ошибка! h должно быть >= 1");
            scanner.close();
            return;
        }


        for (int i = 1;h>=i;i++){
            for (int j = 1; i>=j;j++){
                if ((i+j)%2==0){
                    System.out.print("a");
                }
                else{
                    System.out.print("b");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}