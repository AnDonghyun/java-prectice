import java.util.*;

public class Example {
    public static void main(String[] args) {
        Set set = new TreeSet();
        // Set set = new HashSet();
        // Set set = new SortedSet();
        // List set = new SortedList();
        // Set set = new LinkedHashSet();
        set.add(new Integer(2));
        set.add(new Integer(1));
        System.out.println(set);
    }
}
