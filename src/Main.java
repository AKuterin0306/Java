import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        String str = "Семь раз отмерь, 1 раз отрежь!";
        String[] words = str.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
        Map<Object,Long> map = Arrays.stream(words).collect(
                Collectors.groupingBy(s -> s, Collectors.counting())
        );

        List<Object> list = map.entrySet().
                stream().
                sorted(Map.Entry.<Object, Long>comparingByValue().reversed()).
                map(Map.Entry::getKey).
                toList();

        list.forEach(System.out::println);
    }
}
