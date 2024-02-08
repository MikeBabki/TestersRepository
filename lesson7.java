import java.util.*;
public class lesson7 {
    public static void main(String[] args) {
        String[] words = {"one", "two", "two", "three", "five", "five", "six", "seven", "four", "nine"};

        // Find unique words and count occurrences
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальных:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word) + " раз");
        }

        // Телефонная книжка
        Phonebook phonebook = new Phonebook();
        phonebook.add("Смирнов", "79996665588");
        phonebook.add("Алёшин", "89554123652");
        phonebook.add("Иванов", "7998521542");
        phonebook.add("Смирнов", "88552221453");

        System.out.println("\nНомера Смирнова:");
        List<String> phoneNumbers = phonebook.get("Смирнов");
        for (String number : phoneNumbers) {
            System.out.println(number);
        }
    }

    static class Phonebook {
        private Map<String, List<String>> contacts;

        public Phonebook() {
            contacts = new HashMap<>();
        }

        public void add(String name, String phoneNumber) {
            if (contacts.containsKey(name)) {
                contacts.get(name).add(phoneNumber);
            } else {
                List<String> numbers = new ArrayList<>();
                numbers.add(phoneNumber);
                contacts.put(name, numbers);
            }
        }

        public List<String> get(String name) {
            return contacts.getOrDefault(name, new ArrayList<>());
        }
    }
}