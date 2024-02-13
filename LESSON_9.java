import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class LESSON_9 {

    public static void main(String[] args) {
        // Задание 1
        List<Integer> numbers = Arrays.asList(3, 6, 8, 9, 12);
        long countEven = numbers.stream().filter(num -> num % 2 == 0).count();
        System.out.println("Количество чётных чисел: " + countEven);

        // Задание 2
        List<String> strings = Arrays.asList("Highload", "High", "Load", "Highload");
        long countHigh = strings.stream().filter(str -> str.equals("High")).count();
        System.out.println("Количество слов 'High': " + countHigh);

        String firstElement = strings.isEmpty() ? "0" : strings.get(0);
        System.out.println("Первый элемент: " + firstElement);

        String lastElement = strings.isEmpty() ? "0" : strings.get(strings.size() - 1);
        System.out.println("Последний элемент: " + lastElement);

        // Задание 3
        List<String> collection = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        String[] sortedArray = collection.stream().sorted().toArray(String[]::new);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedArray));

        }
}