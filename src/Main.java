import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName;
        fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника —  " + fullName);
        //Задача 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }

    public static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    public static void task4() {
        System.out.println("Задача 4");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }

    public static void task5() {
        System.out.println("Задача 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру воздуха");
        int t = scanner.nextInt();
        System.out.println("Температура воздуха сегодня: " + t + " градусов.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date");
        int day = scanner.nextInt();
        System.out.println("Enter month number");
        int month = scanner.nextInt();
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println(day + ":" + month + ":" + year);

    }

    public static void task7() {
        System.out.println("Задача 7");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.next();
        System.out.println("Назовите своего помощника");
        String nameBot = scanner.next();
        System.out.println("Количество писем");
        int letter = scanner.nextInt();
        System.out.println("Привет, " + name + "! Это твой помощник " + nameBot + ".\n" + " У тебя " + letter + " новых писем.");
    }
}