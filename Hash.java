import java.util.HashMap;


public class Hash {
    public static void main(String[] args) {
        HashMap<Integer, String> list = new HashMap<>();
        HashMap<Integer, String> list1 = new HashMap<>();
        list.put(1, "varadha");
        list.put(2, "rajan");
        list.put(3, "v ");

        System.out.println(list.get(1) + list.get(2) + " " +  list.get(3));
        list.remove(3);

        list.put(3, "banana");

        System.out.println(list.containsKey(5));
        System.out.println(list.size());


        list1.put(4, "fruits");
        list1.put(5, "apple");
        list1.put(6, "grapes");
        list1.put(7, "pineapple");

        list.putAll(list1);
        System.out.println(list);

    }
}
