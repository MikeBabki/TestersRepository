import java.util.ArrayList;
class Fruit {
}

class Apple extends Fruit {
}

class Orange extends Fruit {
}

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        }
        float weight = 0;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }

        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }

        for (T fruit : fruits) {
            anotherBox.addFruit(fruit);
        }
        fruits.clear();
    }
}
public class LESSON_10 {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox1.compare(orangeBox));

        appleBox1.transferFruits(appleBox2);

        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());
    }
}