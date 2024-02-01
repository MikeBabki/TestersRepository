public class Animal_lesson5 {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected static int count;

    public Animal_lesson5(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может столько бежать");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может столько плыть");
        }
    }

    public static int getCount() {
        return count;
    }
}

class Dog extends Animal_lesson5 {

    public Dog(String name) {
        super(name, 500, 10);
    }
}

class Cat extends Animal_lesson5 {
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        isFull = false;
    }

    public void eat(int foodAmount) {
        if (foodAmount > 0) {
            System.out.println(name + " кушает...");
            isFull = true;
        } else {
            System.out.println("Миска пуста!");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}

class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
        } else {
            System.out.println("В миске нет еды");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Dog dog2 = new Dog("Черныш");
        Cat cat1 = new Cat("Муська");
        Cat cat2 = new Cat("Барсик");

        Bowl bowl = new Bowl(20);

        Animal_lesson5[] animals = {dog, cat1, cat2};

        for (Animal_lesson5 animal : animals) {
            animal.run(300);
            animal.swim(5);
        }

        System.out.println("Количество животных: " + Animal_lesson5.getCount());
        System.out.println();

        cat1.eat(10);
        cat2.eat(15);
        bowl.decreaseFood(12);

        System.out.println("Количество сытых котов: ");
        int countFullCats = 0;
        for (Cat cat : new Cat[]{cat1, cat2}) {
            if (cat.isFull()) {
                countFullCats++;
                System.out.println(cat.name);
            }
        }

        System.out.println("Количество сытых котов: " + countFullCats);

        bowl.addFood(10);
        bowl.decreaseFood(15);
    }
}
