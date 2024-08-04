package Hashmaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hash_tute_1 {
    public static void main(String args[]){
        //country : population
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 147);
        map.put("Australia", 47);
        map.put("China", 1470);


        System.out.println(map);


        map.put("China", 1370);  // if key exists then the valule id updated

        System.out.println(map);


        //search operation

        if(map.containsKey("Brazil")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


        // print the value of the key too
        System.out.println(map.get("China"));  // retuns null if key doesn't exist
        System.out.println(map.get("Chamgadarh"));  // retuns null if key doesn't exist


        // iterate in hashmap
        /*
        * this type of for loop is used to traverse on a colection :
        *
        * aAs the map we created is an collection so we'll use another kind of for
        * */

        // type 1
        int arr[] = {2,2,6,4,6,4,5,1,5,15,51,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
        System.out.print("\n");
        for(int val : arr){
            System.out.print(val + " ");
        }

        //iteration in hashmaps
        // WE WILL MAKE AN ITERATOR FOR THAT FIRST
        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getValue());
            System.out.println(e.getKey());
        }

        //another way
        Set<String> keys = map.keySet();
        for(String key : keys)
            System.out.println( key + " " + map.get(key));
    }
}
