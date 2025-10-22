import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        wrapper();
    }

    public static void wrapper(){
        while (true){
            System.out.print("Выберите задание 2-10: ");
            String a = sc.nextLine();
            switch(a){
                case "0":
                    System.exit(0);
                    break;
                case "2":
                    task2();
                    break;
                case "3":
                    task3();
                    break;
                case "4":
                    task4();
                    break;
                case "5":
                    task5();
                    break;
                case "6":
                    task6();
                    break;
                case "7":
                    task7();
                    break;
                case "8":
                    task8();
                    break;
                case "9":
                    task9();
                    break;
                case "10":
                    task10();
                    break;
//                default:
//                    System.out.println("Вы ввели неправильное значение");
            }
        }
    }

    public static void task2(){
        System.out.println("Задача #2");
        System.out.print("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.print("Введите второе число: ");
        double b = sc.nextDouble();
        double sum = a + b;
        double minus = a - b;
        double proizvedenie = a * b;
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + minus);
        System.out.println("Произведение: " + proizvedenie);
    }

    public static void task3(){
        System.out.println("Задача #3");
        System.out.println("Температура по цельсию?");
        double tc = sc.nextDouble();
        double tF = 9.0 / 5 * tc + 32;
        double tK = tc + 273;
        System.out.println("Температура по Фаренгейту:" + tF);
        System.out.println("Температура по Кельвину:" + tK);
    }

    public static void task4(){
        System.out.println("Задача #4");
        System.out.println("Радиус шара? = ");
        double r = sc.nextDouble();
        final double PI = 3.14159;
        double V = 4.0/3 * PI * Math.pow(r,3);
        System.out.println("Объём шара = " + V);
    }

    public static void task5(){
        System.out.println("Задание #5");
        System.out.println("Площадь круга?");
        double r = sc.nextDouble();
        double s = sc.nextDouble();
        r = s / r / Math.PI;
        double c = 2 * Math.PI * r;
        System.out.println("Радиус = " + r);
        System.out.println("Длина окружности = " + c);
    }

    public static void task6() {
        System.out.println("Задание #6");
        System.out.println("Радиус цилиндра: ");
        double r = sc.nextDouble();
        System.out.println("Высота цилиндра: ");
        double h = sc.nextDouble();
        double v = h * Math.PI * Math.pow(r, 2);
        double s = 2 * Math.PI * r * (h + r);
        System.out.println("Объём цилиндра = " + v);
        System.out.println("Площадь поверхности цилиндра = " + s);
    }

    public static void task7() {
        System.out.println("Задание #7");
        System.out.println("Первое число: ");
        int A = sc.nextInt();
        System.out.println("Второе число: ");
        int B = sc.nextInt();
        int lastTwoDigits = A + B % 100;
        System.out.println("Последние 2 цифры в сумме: " + lastTwoDigits);
    }

    public static void task8(){
        System.out.println("Задание #8");
        System.out.println("Число = ");
        int number = sc.nextInt();
        int lastDigit = number % 10;
        int firstDigit = number / 10;
        System.out.println("Первое число = " + firstDigit);
        System.out.println("Последнее число = " + lastDigit);
    }
    public static void task9() {
        System.out.println("Задание #9");
        System.out.println("Прошло секунд: ");
        int sec = sc.nextInt();
        int hours = sec / 3600;
        int minutes = sec / 60;
        int seconds = sec % 60;
        System.out.println("Прошло времени в часах:" + hours);
        System.out.println("Прошло времени в минутах:" + minutes);
        System.out.println("Прошло времени в секундах:" + seconds);
    }
    public static void task10() {
        System.out.println("Ребро a = ");
        double a = sc.nextDouble();
        System.out.println("Ребро b = ");
        double b = sc.nextDouble();
        System.out.println("Ребро c = ");
        double c = sc.nextDouble();
        double v = a * b * c;
        double s = 2 * (a * b + b * c + a * c);
        System.out.println("Объём параллелепипеда = " + v);
        System.out.println("Площадь поверхности параллелепипеда = " + s);
    }
}
