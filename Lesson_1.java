public class Lesson_1 {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
    }
    public  static  void firstTask() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
}
    public static void secondTask() {
        int a = -6;
        int b = 3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }
    public  static  void thirdTask() {
        int value = 210;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public  static  void  fourthTask() {
        int a = 12;
        int b = 10;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
