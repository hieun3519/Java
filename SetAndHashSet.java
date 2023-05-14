import java.util.*;

public class SetAndHashSet {
    public static void main(String[] args){
        // TreeSet<> same with HashSet but it is ordered by their
        // natural order (tree)
        // slower than HashMap but it is good if you want order
        Set<String> names = new TreeSet<>();

        // maintain the insertion order
        // almost as fast as a HashMap
        // Set<String> names = new LinkedHashSet<>();


        // not like a list, doesn't maintain the order
        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        names.add("Walter");

        names.remove("Walter");
        // names.clear();

        // different ways to print through the set
        /*
        for(String name : names){
            System.out.println(names);
        }
        names.forEach(System.out::println);
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }
        */

        System.out.println(names.contains("Gus"));
        System.out.println(names.isEmpty());

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>();

        // can hover over it and we don't even need to use addAll method
        // numberSet.addAll(numberList);

        System.out.println(numberSet);


        int [] data = {4,3,6, 5,7,8};
        int target = 5;
        int [] copydata = new int[data.length];
        HashSet<Integer> setInt = new HashSet<>();

        for(int i=0; i< data.length; i++){
            if(!setInt.contains(target)){
                setInt.add(data[i]);
                System.out.println("empty");
            }

                System.out.println("true");

        }


    }
}
