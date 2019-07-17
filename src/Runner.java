import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import by.gsu.epamlab.beans.ExtraTrial;
import by.gsu.epamlab.beans.LightTrial;
import by.gsu.epamlab.beans.StrongTrial;
import by.gsu.epamlab.beans.Trial;

public class Runner {
    private static int startIndex = 0;

    private static int indexOf(int[] arr, int val) {
        int index = IntStream.range(startIndex, arr.length).filter(i -> arr[i] == val).findFirst().orElse(-1);
        startIndex++;
        return index;
    }

    public static void main(String[] args) {
        // 1
        List<Trial> listTrials = new ArrayList<Trial>();
        List<Trial> listSortTrials = new ArrayList<Trial>();
        listTrials.add(new Trial("person1", 20, 73));
        listTrials.add(new Trial("person2", 86, 89));
        listTrials.add(new Trial("person3", 99, 34));
        listTrials.add(new LightTrial("person4", 39, 69));
        listTrials.add(new LightTrial("person5", 84, 69));
        listTrials.add(new StrongTrial("person6", 84, 69));
        listTrials.add(new StrongTrial("person7", 84, 69));
        listTrials.add(new ExtraTrial("person8", 84, 69, 48));
        listTrials.add(new ExtraTrial("person9", 60, 50, 77));
        // 2
        listTrials.stream().forEach(System.out::println);
        // 3
        int kol = (int) listTrials.stream().filter(s -> s.isPassed()).count();
        System.out.println("Number of passed trials - " + kol);
        // 4
        listSortTrials = listTrials.stream()
                .sorted(Comparator.comparing(Trial::calculateSum))
                .collect(Collectors.toList());
        // 5
        listSortTrials.stream().forEach(
                (t) -> System.out.println(t.calculateSum()));
        // 6
        // /

        List<Trial> listUnpassTrials = new ArrayList<Trial>();
        listUnpassTrials = listTrials.stream().filter(s->s.isPassed()==false).collect(Collectors.toList());
        //listUnpassTrials.stream().filter(s->)
        listUnpassTrials.stream().forEach(
                (t) -> System.out.println(t));
        // 7
        int[] arraySum = listSortTrials.stream()
                .mapToInt((f) -> f.calculateSum()).toArray();
        int index = arraySum.length-1;
        Arrays.stream(arraySum).limit(index)
                .forEachOrdered((f) -> System.out.printf("%d[%d], ", f, indexOf(arraySum,f)));
        Arrays.stream(arraySum).skip(index)
               .forEachOrdered((f) -> System.out.printf("%d[%d] ", f, index));
    }

}
