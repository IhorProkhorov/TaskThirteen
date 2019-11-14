import org.javatuples.Pair;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Thirteen {

    //First Task
    public static void getAverageByStream(List<Integer> list){
        list.stream().mapToInt( i -> i).average().ifPresent( avg -> System.out.println("Average value = " + avg));
    }

    //Second Task
    public static List<Pair> getListOfPairs(List<String> list){
        List<Pair> pairs = IntStream.range(1, list.size())
                .mapToObj(i -> new Pair(list.get(i - 1).toUpperCase(), list.get(i).toUpperCase()))
                .collect(Collectors.toList());
        return pairs;
    }

    // Third Task
    public static void getElements(List<String> list){
        list.stream().filter( x-> x.length() == 4)
                .filter(x -> Character.isLowerCase(x.charAt(0)))
                .filter(x -> Character.isLowerCase(x.charAt(1)))
                .filter(x -> Character.isLowerCase(x.charAt(2)))
                .filter(x -> Character.isLowerCase(x.charAt(3)))
                .forEach(System.out::println);
    }
}
