public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача №1");
        int salary = 15_000;
        int total = 0;
        while (total < 2_459_000) {
            total = total + salary;
            System.out.println(total);
        }
        //task 2
        System.out.println("Задача №2");
        int a = 1;
        int numberOne = 0;
        while (numberOne < 10) {
            numberOne = numberOne + a;
            System.out.print(numberOne + " ");
        }
        System.out.println();
        for (int i = 10; i <= 10 && i != 0; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task 3
        System.out.println("Задача №3");
        int birth = 17;
        int totalNumber = 12_000_000;
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            birth = totalNumber + (totalNumber % 1000 * birth) - (totalNumber % 1000 * mortality);
            System.out.println("Год " + i + " ,численность населения составляет " + birth);
        }
        //task 4
        System.out.println("Задача №4");
        int salaryy = 15_000;
        int totall = 0;
        double totallWithPercent = 0;
        double percent = 0.07D;
        for (int i = 0; totall < 12_000_000; i++) {
            totall = totall + salaryy;
            totallWithPercent = (totallWithPercent + totall) * (1 + percent);
                System.out.println("Месяц " + i + " Итого " + totallWithPercent);
            }
        //task 5
        }
    }
