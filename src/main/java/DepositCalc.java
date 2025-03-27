import java.util.Scanner;

public class DepositCalc {

    public static void main(String[] args) {

        int period;
        float depositSum;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        while (!sc.hasNextInt()){
            System.out.println("Некорректный ввод! Введите сумму вклада: ");
            sc.next();
        }
        depositSum = sc.nextInt();

        System.out.println("Введите срок вклада в месяцах: ");
        while (!sc.hasNextInt()){
            System.out.println("Некорректный ввод! Введите срок вклада в месяцах: ");
            sc.next();
        }
        period = sc.nextInt();

        for (int i = 1; i <= period; i++){
            depositSum = depositSum * 1.07f;
        }

        System.out.println("После " + period + " месяцев сумма вклада составит " + depositSum);

        sc.close();
    }
}
