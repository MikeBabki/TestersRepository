public class Lesson_3 {

    public static void main(String[] args) {
        PersonConstruct[] employees = new PersonConstruct[5];
        employees[0] = new PersonConstruct("Алексей", "Детейлер", "alexdetail@mail.ru", "89321235122", 60000, 28);
        employees[1] = new PersonConstruct("Владимир", "Бухгалтер", "valdemat@mail.ru", "89284446374", 40000, 35);
        employees[2] = new PersonConstruct("Олег", "Менеджер", "olegmeneg@mail.ru", "82746599902", 55000, 25);
        employees[3] = new PersonConstruct("Оксана", "smm", "oxa@mail.ru", "89992633311", 40000, 23);
        employees[4] = new PersonConstruct("Владислав", "Директор", "vladislav@mail.ru", "89927412231", 70000, 33);

        for (PersonConstruct employee : employees) {
            employee.fullPersonInfo();
            System.out.println();
        }

        Park park = new Park();
        park.printAttractions();
    }

    public static class PersonConstruct {
        private String fullName;
        private String job;
        private String email;
        private String phoneNumber;
        private int salary;
        private int age;

        public PersonConstruct(String fullName, String job, String email, String phoneNumber, int salary, int age) {
            this.fullName = fullName;
            this.job = job;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;

        }

        public void fullPersonInfo() {
            System.out.println("Фио -" + fullName);
            System.out.println("Должность -" + job);
            System.out.println("Электронная почта -" + email);
            System.out.println("Телефон -" + phoneNumber);
            System.out.println("Зарплата -" + salary);
            System.out.println("Возраст -" + age);
        }
    }

    public static class Park {
        private Attraction[] attractions;
        public Park() {
            attractions = new Attraction[5];
            attractions[0] = new Attraction("Качели огромные", 2, 300);
            attractions[1] = new Attraction("Машинки", 8, 1300);
            attractions[2] = new Attraction("Фортуна", 12, 600);
            attractions[3] = new Attraction("Колесо обозрения", 8, 600);
            attractions[4] = new Attraction("Тир", 17, 300);
        }
        public void printAttractions() {
            for (Attraction attraction : attractions) {
                System.out.println(attraction.getName() + " - " + attraction.getHours() + " часов, " + attraction.getPrice() + " рублей");
            }
        }
        public class Attraction {
            private String name;
            private int hours;
            private int price;

            public Attraction(String name, int hours, int price) {
                this.name = name;
                this.hours = hours;
                this.price = price;
            }
            public String getName() {
                return name;
            }
            public int getHours() {
                return hours;
            }
            public int getPrice() {
                return price;
            }
        }
    }
}