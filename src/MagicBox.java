import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    protected int capacity;
    protected T[] items;

    public MagicBox(int capacity) {
        this.capacity = capacity;
        this.items = (T[]) new Object[capacity];
    }

    public void showItems() {
        System.out.print("This box contains: ");
        for (int i = 0; i < items.length; i++) {
            if (i + 1 != items.length) {
                System.out.print(items[i] + ", ");
            } else {
                System.out.println(items[i] + ".");
            }
        }
    }

    boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("\t" + (i + 1) + ") " + item + " in a box now");
                return true;
            }
        }
        System.out.println("Box is full! There is no place for " + item);
        return false;
    }

    public int pick() throws RuntimeException {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Box isn't full yet! " + (items.length - i) + " place(-s) left.");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        System.out.println("Случайный выбор: " + items[randomInt]);
        return random.nextInt(items.length);
    }
}