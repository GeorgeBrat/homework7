public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задание №1");
        int summary = 0;
        int salary = 15000;
        int i = 0;
        while (summary <= 2459000) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + summary + " рублей");
            i++;
            summary = summary + summary / 100;
            summary = summary + salary;
        }
        // Task 2
        System.out.println("Задание №2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start++;
        }
        System.out.println();
        for (int newStart = 10; newStart >= 1; newStart--) {
            ;
            System.out.print(newStart + " ");
        }
        System.out.println();
        // Task 3
        System.out.println("Задание №3");
        int people = 12_000_000;
        int diffPeople = people / 1000;
        int birthRate = 17;
        int dead = 8;
        for (int year = 0; year <= 10; year++) {
            System.out.println(" год " + year + " численность начеления составляет " + people);
            people = people + (diffPeople * (birthRate - dead));
        }
        // Task 4
        System.out.println("Задание №4");
        int summaryVasya = 15000;
        double precent = 0.07;
        int mounth = 0;
        while (summaryVasya <= 12_000_000) {
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + summaryVasya + " рублей");
            mounth++;
            summaryVasya += summaryVasya * precent;
        }
        // Task 5
        System.out.println("Задание №5");
        int summaryVasa = 15000;
        int mounths = 0;
        while (summaryVasa <= 12_000_000) {
            if (mounths % 6 == 0) {
                System.out.println("Месяц " + mounths + ", сумма накоплений равна " + summaryVasa + " рублей");
            }
            summaryVasa += summaryVasa * precent;
            mounths++;
        }
        // Task 6
        System.out.println("Задание №6");
        int sum = 15000;
        int time = 9 * 12; // находим число месяцев за 9 лет
        for (int m = 1; m <= time; m++) {
            sum += sum * precent;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + ", сумма накоплений: " + sum);
            }
        }
        // Task 7
        System.out.println("Задание №7");
        for (int dayNumber = 1; dayNumber <= 31; dayNumber += 7) {
                System.out.println("Сегодня пятница, " + dayNumber + "-e число. Необходимо подготовить отчет");
        }
        /// что знчит += ?????????????????????????????????????????????????????????????????????????????????????????????
        // Task 8
        System.out.println("Задание №8");
        int currenYear = 2024;
        int startYear = currenYear - 200;
        int finishYear = currenYear + 100;

        for (int year = startYear; year <= finishYear; ++year) { /// что значат ++ перед year??????????????????????????????????????????
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}