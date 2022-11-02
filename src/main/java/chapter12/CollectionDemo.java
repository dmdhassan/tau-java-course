package chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
//        setDemo();
        mapDemo();
    }


    public static void setDemo() {
        Set<String> fruits = new HashSet();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");


//        System.out.println(fruits);
//        System.out.println(fruits.size());

        var i = fruits.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for (String item:fruits) {
            System.out.println(item);
        }

        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();

        fruitCalories.put("apple", 10);
        fruitCalories.put("lemon", 210);
        fruitCalories.put("banana", 40);
        fruitCalories.put("orange", 37);

        for (var entry: fruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }

        fruitCalories.forEach(
                (k, v) -> System.out.println("Fruit: " + k + ", Calories: " + v)
        );

    }
}
