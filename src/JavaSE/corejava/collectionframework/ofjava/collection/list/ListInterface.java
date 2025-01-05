package JavaSE.corejava.collectionframework.ofjava.collection.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListInterface {
    public static void main(String[] args) {

        List<Object> items = new ArrayList<>();
        items.add("1, Raghava");
        items.add(2);
        items.add("Raghava");
        System.out.println(items);


        Map <Integer, String> iteamsmap = new HashMap<>();

        iteamsmap.put(1, "Raghava");
        iteamsmap.put(2, "Jaggu");

        System.out.println(iteamsmap);
    }
}
