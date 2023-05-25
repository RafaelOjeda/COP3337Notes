import java.util.ArrayList;

class Main {
    public static void main (String[] args) {
        ArrayList fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add(123);

        System.out.println(fruits);

        ArrayList<String> names = new ArrayList<>();
        names.add("Rafael");
        names.add("Ana");
        names.add("Carlos");
        names.add("Lucky");
        names.add(1, "Stephanie");

        System.out.println(names);

        fruits.addAll(names);
        fruits.set(2, "Kiwi");
        System.out.println(fruits);
        
    }

}