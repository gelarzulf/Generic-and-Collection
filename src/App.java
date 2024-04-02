import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pair<Integer, String> pair = new Pair<Integer, String>(20, "B");
        System.out.println("First elment : " + pair.getFirst());
        System.out.println("Secind elment : " + pair.getSecond());

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        Set<String> stringSet = new HashSet<>(Arrays.asList("A", "B", "C"));

        System.out.println("Print elment of integerList");
        CollectionPrinter.Princollection(integerList);

        System.out.println("Print elment of stringSet");
        CollectionPrinter.Princollection(stringSet);

    }
}
