public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        task1();
        System.out.println("Task 2:");
        task2();
        System.out.println("Task 3:");
        task3();
        System.out.println("Task 4:");
        task4();
        System.out.println("Task 5:");
        task5();
        System.out.println("Task 6:");
        task6();
        System.out.println("Task 7:");
        task7();
        System.out.println("Task 8:");
        task8();


    }

    public static void task1() {
        int monthlyPayments = 15000;
        int total = 0;
        int mounth = 0;
        while (total < 2459000) {
            total = total + monthlyPayments;
            mounth = mounth + 1;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        int alpha = 1;
        while (alpha <= 10) {
            System.out.print(alpha);
            alpha = alpha + 1;
        }
        System.out.println();
        for (int beta = 10; beta >= 1; beta = beta - 1) {
            System.out.print(beta);
        }
    }

    public static void task3() {
        int countryPopulation = 12_000_000;
        int year = 0;
        while (year < 10) {
            year++;
            countryPopulation =
                    countryPopulation + ((countryPopulation / 1000) * 17) - ((countryPopulation / 1000) * 8);
            System.out.println("Год " + year + ", численность населения составляет " + countryPopulation);
        }
    }

    public static void task4() {
        double initialDeposit = 15000;
        double targetAmount = 12000000;
        double interestRate = 0.07;
        double currentAmount = initialDeposit;
        int months = 0;

        while (currentAmount < targetAmount) {
            currentAmount = currentAmount + initialDeposit;
            currentAmount += currentAmount * interestRate;
            months++;
            System.out.println("Месяц:" + months + " сумма накоплений = " + currentAmount + " рублей");
        }

        System.out.printf("Нужно будет копить " + months + " месяцев.");
    }

    public static void task5() {
        double initialDeposit = 15000;
        double targetAmount = 12000000;
        double interestRate = 0.07;
        double currentAmount = initialDeposit;
        int months = 0;

        while (currentAmount < targetAmount) {
            currentAmount = currentAmount + initialDeposit;
            currentAmount += currentAmount * interestRate;
            months++;

            if (months % 6 == 0) {
                System.out.println("Месяц:" + months + " сумма накоплений = " + currentAmount + " рублей");
            }
        }

        System.out.printf("Нужно будет копить " + months + " месяцев.");
    }

    public static void task6() {
        double initialDeposit = 15000;
        double interestRate = 0.07;
        double currentAmount = initialDeposit;
        int months = 0;

        while (months <= 108) {
            currentAmount = currentAmount + initialDeposit;
            currentAmount += currentAmount * interestRate;
            months++;

            if (months % 6 == 0) {
                System.out.println("Месяц:" + months + " сумма накоплений = " + currentAmount + " рублей");
            }
        }

    }


    public static void task7() {
        int friday = 2;
        int totalDays = 31;
        for (int day = friday; day <= totalDays; day += 7) {


            System.out.println("Сегодня пятница," + day + "-е число. Необходимо подготовить отчет");
        }
    }


    public static void task8() {
        int previousYear = 1896;
        int lastYear = 2056;
        for (int year = previousYear; year <= lastYear; year += 79) {
            System.out.println("В " + year + "-м году комета пролетит возле земли");
        }
    }
}
