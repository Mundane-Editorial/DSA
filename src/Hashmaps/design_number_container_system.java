package Hashmaps;

import java.util.HashMap;
import java.util.TreeSet;

public class design_number_container_system {
    private HashMap<Integer, Integer> indexmap ;
    private HashMap<Integer, TreeSet<Integer>> numbermap;

    public design_number_container_system(){
        indexmap = new HashMap<>();
        numbermap = new HashMap<>();
    }

    public void change(int index, int number){
        if(indexmap.containsKey(index)){
            int old = indexmap.get(index);
            if(numbermap.containsKey(old)){
                numbermap.get(old).remove(index);
                if(numbermap.get(old).isEmpty()){
                    numbermap.remove(old);
                }
            }
        }

        indexmap.put(index, number);
        numbermap.putIfAbsent(index, new TreeSet<>());
        numbermap.get(number).add(index);
    }

    public int find(int number){
        if (numbermap.containsKey(number) && !numbermap.get(number).isEmpty()) {
            return numbermap.get(number).first();
        }
        return -1;
    }

    public static void main(String[] args) {
        design_number_container_system obj = new design_number_container_system();

        System.out.println(obj.find(10)); // Output: -1 (No index contains 10)
        obj.change(2, 10);
        obj.change(1, 10);
        obj.change(3, 10);
        obj.change(5, 10);
        System.out.println(obj.find(10)); // Output: 1 (smallest index with 10)

        obj.change(1, 20);
        System.out.println(obj.find(10));
    }
}
