public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 55;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 59;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 44;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int childAge = 12;
        boolean hasAdult = false;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        } else if (childAge >= 5 && childAge < 14 && hasAdult) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то можно кататься на аттракционе в сопровождении взрослого.");
        } else if (childAge >= 5 && childAge < 14 && !hasAdult) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то нельзя кататься на аттракционе без сопровождения взрослого.");
        } else {
            System.out.println("Ребенок может кататься на аттракционе.");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int trainPlaces = 102;
        int seatPlace = 60;
        int standPlace = trainPlaces - seatPlace; // 42 места
        int soldSeatPlaces = 55;
        int soldStandPlaces = 42;
        if (soldSeatPlaces < seatPlace) {
            System.out.println("Свободных сидячих мест осталось " + (seatPlace - soldSeatPlaces) + " шт.");
        } else if (soldSeatPlaces == seatPlace) {
            System.out.println("Свободных сидячих мест не осталось.");
        }
        if (soldStandPlaces < standPlace) {
            System.out.println("Свободных стоячих мест осталось " + (standPlace - soldStandPlaces) + " шт.");
        } else if (soldStandPlaces == standPlace) {
            System.out.println("Свободных стоячих мест не осталось.");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 55;
        int two = 455;
        int three = 9999;
        if (one >= two) {
            if (one > three) {
                System.out.println("Бо́льшее число - это " + one);
            } else {
                System.out.println("Бо́льшее число - это " + three);
                }
        } else if (two > one) {
            if (two > three) {
                System.out.println("Бо́льшее число - это " + two);
            } else {
                System.out.println("Бо́льшее число - это " + three);
            }
        }
    }
    }