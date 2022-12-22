import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
         task2();
        task3();
        task4();
       task5();

    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        int clientOS = sc.nextInt();
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке1");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task2() {
        Scanner sc1 = new Scanner(System.in);
        int clientOS = sc1.nextInt();
        int a = sc1.nextInt();
        if (clientOS == 1 && a > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке1");
        }
        if (clientOS == 0 && a > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && a < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && a < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void task3() {
        Scanner sc2 = new Scanner(System.in);
        int c = sc2.nextInt();
        for (int k = 2000; k < 2100; k = k + 4) {
            int sum = k;
            if (c == sum ) {
                System.out.println(c + " високосный год");
                while (c == sum);
            } else if (c!=sum) {
                System.out.println(c + " невисокосный год");
                while (c != sum);
            }
        }
    }
        public static void task4 () {
            Scanner sc3 = new Scanner(System.in);
            int deliveryDistance = sc3.nextInt();
            int a = 1;
            int b = 2;
            int c = 3;
            if (deliveryDistance < 20) {
                System.out.println("Потребуется дней: " + a);
            }
            if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней: " + b);
            }
            if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется дней: " + c);
            } else if (deliveryDistance >= 100) {
                System.out.println("доставки нет");
            }
        }

        public static void task5 () {
            Scanner sc4 = new Scanner(System.in);
            int monthNumber = sc4.nextInt();
            if (monthNumber <= 2 || monthNumber == 12) {
                System.out.println("Если " + monthNumber + " месяц то это зима");
            }
            if (monthNumber > 2 && monthNumber <= 5) {
                System.out.println("Если " + monthNumber + " месяц то это весна");
            }
            if (monthNumber > 5 && monthNumber < 9) {
                System.out.println("Если " + monthNumber + " месяц то это лето");
            }
            if (monthNumber >= 9 && monthNumber <= 11) {
                System.out.println("Если " + monthNumber + " месяц то это осень");
            } else if (monthNumber > 12) {
                System.out.println("нет такого месяца");
            }
        }
    }

