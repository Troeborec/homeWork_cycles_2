public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача №1");
        int salary = 0;
        int summa = 0;
        while (summa < 2_459_000) {
            summa += 15_000;
            salary++;
            System.out.println("Месяц " + salary + ", сумма накоплений равна " + summa + " рублей");
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
        int totalNumber = 12_000_000;
        int birth = 17 * totalNumber / 1000;
        int mortality = 8 * totalNumber / 1000;
        for (int i = 1; i <= 10; i++) {
            totalNumber += birth;
            totalNumber -= mortality;
            System.out.println("Год " + i + " ,численность населения составляет " + totalNumber);
        }
        //task 4
        System.out.println("Задача №4");
        int salaryy = 15_000;
        int totall = 0;
        double totallWithPercent = 0;
        double percent = 0.07D;
        for (int i = 1; totall < 12_000_000; i++) {
            totall = totall + salaryy;
            totallWithPercent = (totallWithPercent + totall) * (1 + percent);
            System.out.println("Месяц " + i + " Итого " + totallWithPercent);
        }
        //task 5
        System.out.println("Задача №5");
        int salary_2 = 15_000;
        int totall_2 = 0;
        double totallWithPercent_2 = 0;
        double percent_2 = 0.07D;
        for (int i = 1; totall_2 < 12_000_000; i++) {
            totall_2 = totall_2 + salary_2;
            totallWithPercent_2 = (totallWithPercent_2 + totall_2) * (1 + percent_2);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + totallWithPercent_2);
            }
        }
        //task 6
        System.out.println("Задача №6");
        int salary_3 = 15_000;
        int totall_3 = 0;
        double totallWithPercent_3 = 0;
        double percent_3 = 0.07;
        for (int i = 1; i <= 108; i++) {
            totall_3 = totall_3 + salary_3;
            totallWithPercent_3 = (totallWithPercent_3 + totall_3) * (1 + percent_3);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + totallWithPercent_2);
            }
        }
        //task 7
        System.out.println("Задача №7");
        int firstFriday = 5;
        for (int secondFriday = firstFriday; secondFriday <= 31; secondFriday += 7) {
            System.out.println("Сегодня пятница," + secondFriday + " -е число. Необходимо подготовить отчет");
        }
        //task 8
        System.out.println("Задача №8");
        int firstYear = 2022;
        int nextComet = firstYear - 200;
        int nextComet_2_0 = firstYear + 100;
        for (int i = nextComet; i < nextComet_2_0; i++) {
            if (i % 79 ==0){
                System.out.println(i);
            }
        }
        }
    }