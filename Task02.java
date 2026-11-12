import java.util.Scanner;

public class Task02{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите х: ");
        double x = scanner.nextDouble();
        System.out.print("Введите y: ");
        double y = scanner.nextDouble();
        System.out.print("Введите z: ");
        double z = scanner.nextDouble();

        boolean flag  = false;

        if (z==0){
            System.out.println("Точка принадлежит плоскости 0xy");
            flag = true;
        }
        if (x==0){
            System.out.println("Точка принадлежит плоскости 0zy");
            flag = true;
        }
        if (y==0){
            System.out.println("Точка принадлежит плоскости 0zx");
            flag = true;
        }

        if (!flag){
            System.out.println("Точка не лежит ни в одной координатной плоскости");
        }
        scanner.close();


    }

}