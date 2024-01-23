import java.util.Arrays;

public class Lesson_2 {
    public static void main(String[] args) {
        //Первое задание
        System.out.println(firstTasker(1, 10));

        //Второе задание
        secondTasker(-5);

        //Третье задание
        thirdTasker(2);

        //Четвертое задание
        fourthTasker("Hello", 2);

        //Пятое задание
        fivthTasker(2004);

        //Шестое задание
        int[] array = {1, 0, 1, 0, 1, 1, 1, 0};
        sixthTasker(array);
        System.out.println(Arrays.toString(array));

        //Седьмое задание
        int[] arr = new int[100];
        sevenTasker(arr);
        System.out.println(Arrays.toString(arr));

        //Восьмое задание

        int[] arrayEight = {1,5,3,2,11,4,5,2,4,8,9,1};
        eightTasker(arrayEight);
        System.out.println(Arrays.toString(arrayEight));

        // Девятое задание
        //Не получилось его сделать

        //Десятое задание

        int[] arrayNine = tenTasker(2,5);
        System.out.println(Arrays.toString(arrayNine));
    }

    public static boolean firstTasker(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void secondTasker(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean thirdTasker(int b) {
        if (b < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void fourthTasker(String a, int b) {
        for (int c = 0; c < b; c++) {
            System.out.println(a);
        }
    }

    public static boolean fivthTasker(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год високосный");
            return true;
        } else {
            System.out.println("Год не високосный");
            return false;
        }
    }

    public static void sixthTasker(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
    }

    public static void sevenTasker(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    public  static void  eightTasker(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }
    public  static int[] tenTasker (int len, int initialValue) {
int[] array = new int[len];
Arrays.fill(array, initialValue);
return array;
    }
}