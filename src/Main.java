public class Main {
    public static void main(String[] args) {

        MagicBox<String> box1 = new MagicBox<>(3);

        box1.add("Shoes");
        box1.add("T-shorts");
        box1.add("Pants");
        box1.add("Hats");

        box1.showItems(); // посмотреть что лежит в коробке
        box1.pick(); // рандомный выбор содержимого коробки

        MagicBox<Integer> box2 = new MagicBox<>(3);

        System.out.println();

        box2.add(5);
        box2.add(123);
        box2.add(23);

        box2.showItems(); // посмотреть что лежит в коробке
        box2.pick(); // рандомный выбор содержимого коробки
    }
}