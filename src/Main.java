import  java.util.*;
import  java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static  void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
         String  str1 = "Семь раз отмерь, 1 раз отрежь!";
         String[]  words1= str1.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");
         Map<Object,Long>  map1 = Arrays.stream(words1).collect(
                 Collectors.groupingBy(s1 -> s1, Collectors.counting())
         );

         List<Object>  list1 = map1.entrySet().
                   stream().
                   sorted(Map.Entry.<Object, Long>comparingByValue().reversed()).
                   map(Map.Entry::getKey).
                   toList();

         list1.forEach(System.out::println);

    }
}
