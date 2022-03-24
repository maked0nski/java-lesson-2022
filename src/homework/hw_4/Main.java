package homework.hw_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Sasha", "Popov", 35);
        User user2 = new User("Viktor", "Kokosov", 52);
        User user3 = new User("Pasha", "Zolov", 12);
        User user4 = new User("Boris", "Morozov", 19);
        User user5 = new User("Jra", "Andriev", 46);
        User user6 = new User("Igor", "Kozakov", 40);
        User user7 = new User("Alex", "Rohova", 31);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);

        System.out.println("Список юзерів:");
        users.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("Відсортований список юзерів за віком зростаючий:");
        users.sort(Comparator.comparingInt(User::getAge));
        users.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("Відсортований список юзерів за віком спадаючий:");
        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        users.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("Відсортований список юзерів за Іменем зростаючий:");
        List<User> sorted
                = users.stream()
                .sorted(Comparator.comparing(User::getName))
                .collect(toList());
        sorted.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("Відсортований список юзерів за Іменем зворотній:");
        List<User> sortedRevers
                = users.stream()
                .sorted(Comparator.comparing(User::getName).reversed())
                .collect(toList());
        sortedRevers.forEach(System.out::println);
        System.out.println("--------------------------------------");


        ArrayList<String> words = new ArrayList<>();
        words.add("користувачі");
        words.add("дедлайн");
        words.add("ніс");
        words.add("активіст");
        words.add("як");
        words.add("автобус");
        words.add("бекон");
        words.add("синхронізація");
        words.add("москаль");
        words.add("ліжко");
        words.add("якір");
        words.add("око");
        words.add("стіл");
        words.add("бекстейдж");

        System.out.println("список слів:");
        words.forEach(System.out::println);
        System.out.println("--------------------------------------");


        System.out.println("список слів відсортований у алфавітному порядку:");
        List<String> sortedWords
                = words.stream()
                .sorted()
                .collect(toList());
        sortedWords.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("список слів Реверсний алфавітний порядок:");
        List<String> sortWordsRevers
                = words.stream()
                .sorted(Comparator.reverseOrder())
                .collect(toList());
        sortWordsRevers.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("відфільтрувати слова довжиною менше 4 символів:");
        List<String> filtredWords
                = words.stream().
                filter(s -> s.length() < 4).
                collect(toList());
        filtredWords.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("Створити масив з 20 числами :");
        List<Integer> numbers = Arrays.asList(1, 3, 5, 2, 15, 25, 35, 65, 21, 75, 85, 95, 56, 4, 55, 45, 58, 18, 70, 91);
        System.out.println(numbers);
        System.out.println("--------------------------------------");


        System.out.println("за допомогою способу sorted відсортувати масив :");
        List<Integer> sortedNumbers
                = numbers.stream()
                .sorted()
                .collect(toList());
        System.out.println(sortedNumbers);
        System.out.println("--------------------------------------");

        System.out.println("за допомогою filter отримати числа кратні 3 :");
        List<Integer> collect1
                = numbers.stream()
                .filter(i -> (i % 3 == 0))
                .collect(toList());
        System.out.println(collect1);
        System.out.println("--------------------------------------");

        System.out.println("за допомогою filter отримати числа кратні 10 :");
        List<Integer> collect2
                = numbers.stream()
                .filter(i -> (i % 10 == 0))
                .collect(toList());
        System.out.println(collect2);
        System.out.println("--------------------------------------");

        System.out.println("перебрати (проітерувати) масив за допомогою foreach() :");
        numbers.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші :");
        System.out.println(numbers);
        List<Integer> collect3
                = numbers.stream()
                .map(integer -> integer * 3)
                .collect(toList());
        System.out.println(collect3);
        System.out.println("--------------------------------------");

    }
}

