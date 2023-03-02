public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1(){
        System.out.println("Task1");
        int salary = 15000;
        int money = 0;
        int month = 1;
        while(money<=2459000){
            money += salary;
            System.out.println("Месяц "+month + ", сумма накоплений равна  "+money+" рублей.");
            month += 1;
        }
    }

    public static void task2(){
        System.out.println("Task2");
        int number = 1;
        while(number<=10){
            System.out.print(number+" ");
            number += 1;
        }
        System.out.println();
        for(number=10;number>=1;number--){
            System.out.print(number+" ");
        }
        System.out.println();
    }

    public static void task3(){
        System.out.println("Task3");
        float population = 12_000_000;
        float birth = 0.017f;
        float death = 0.008f;
        int year = 1;
        float birthDeath = 1+birth-death;
        while(year<=10){
            population = population*birthDeath;
            year += 1;
            System.out.println("Год "+year+" численность населения составляет "+population);
        }
    }

    public static void task4(){
        System.out.println("Task4");
        double procent = 1.07;
        double total = 15_000;
        int month = 1;
        while(total<=12_000_000){
            total = total*procent;
            System.out.println("Месяц "+month+", сумма накоплений равна  "+total+" рублей.");
            month += 1;
            total += 15_000;
        }


    }

    public static void task5(){
        System.out.println("Task5");
        double procent = 1.07;
        double total = 15_000;
        int month = 1;
        while(total<=12_000_000){
            total = total*procent;
            if(month%6==0){
                System.out.println("Месяц "+month+", сумма накоплений равна  "+total+" рублей.");
            }
            total += 15_000;
            month += 1;
        }

    }

    public static void task6(){
        System.out.println("Task6");
        double total = 15_000;
        double procent = 1.07;
        int month = 1;
        while(month<=(9*12)){
            total = total*procent;
            if(month%6==0){
                System.out.println("Месяц "+month+", сумма накоплений равна  "+total+" рублей.");
            }
            month += 1;
            total += 15_000;
        }
    }

    public static void task7(){
        System.out.println("Task7");
        int friday = 5;
        while(friday<=31){
            System.out.println("Сегодня пятница, "+friday+"-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
    }

    public static void task8(){
        System.out.println("Task8");
        int before = 2023-200;
        int after = 2023+100;
        int current = 0;
        while(current<=after){
            current += 79;
            if(current>=before){
                System.out.println(current);
            }
        }
    }
}