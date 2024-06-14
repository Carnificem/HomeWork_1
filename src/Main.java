import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        Set<Integer> even = new HashSet<Integer>();
        Set<Integer> odd = new HashSet<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            int x = nums.get(i);
            if (x % 2 == 0) {
                even.add(x);
            } else {
                odd.add(x);
            }
        }

        System.out.print("Четные числа " + even + " ");
        System.out.print("\nЗадание 2");
        System.out.print("\nНечетные числа " + odd + " ");

        System.out.print("\nЗадание 3");

        Set<String> words = new HashSet<>();
        words.add("Кино");
        words.add("Ария");
        words.add("Ария");
        words.add("Алиса");
        words.add("Алиса");
        words.add("Сплин");
        words.add("Сплин");
        words.add("Кукрыниксы");
        words.add("Кукрыниксы");
        words.add("Мельница");
        words.add("Мельница");
        words.add("Чайф");
        words.add("Чайф");
        words.add("Кино");

        Set<String> word = new HashSet<>(words);

        System.out.println("\nУникальные слова :" + words + " ");

        System.out.print("Задание 4");

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> counterMap = new HashMap<>();
        for (String string : strings) {
            if (!string.isEmpty()) {
                Integer count = counterMap.get(string);
                if (count == null) {
                    count = 0;
                }
                counterMap.put(string, ++count);
            }
        }
        for (String string : counterMap.keySet()) {
            System.out.print("\nКолличество повторений для слова " + string + "-" + counterMap.get(string));


        }

    }
}
