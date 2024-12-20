package zad2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        zadanie1();

        System.out.println("\nZadanie 2:");
        zadanie2();

        System.out.println("\nZadanie 3:");
        zadanie3();
    }

    // Zadanie 1: Średnia bez liczb kończących się na 9 lub 7
    public static void zadanie1() {
        List<Integer> numbers = Arrays.asList(45, 39, 17, 25, 10, 4);
        double average = numbers.stream()
                .filter(n -> n % 10 != 9 && n % 10 != 7) 
                .mapToInt(Integer::intValue)
                .average() 
                .orElse(0); 

        System.out.println("Średnia: " + average);
    }

    // Zadanie 2: Kwadrat liczby + 9, pomijając wyniki zawierające cyfrę 9
    public static void zadanie2() {
        List<Integer> numbers = Arrays.asList(3, 10, 9, 4);
        List<Integer> results = numbers.stream()
                .map(n -> n * n + 9) 
                .filter(result -> !String.valueOf(result).contains("9")) 
                .collect(Collectors.toList());

        System.out.println("Wyniki: " + results);
    }

    // Zadanie 3: Dodanie "y" do stringów, pomijając te z "yy"
    public static void zadanie3() {
        List<String> strings = Arrays.asList("aa", "cy", "b", "yycd", "c");
        List<String> results = strings.stream()
                .map(s -> s + "y") 
                .filter(s -> !s.contains("yy")) 
                .collect(Collectors.toList());

        System.out.println("Wyniki: " + results);
    }
}
