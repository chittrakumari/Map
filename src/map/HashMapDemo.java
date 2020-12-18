//Creating a Hash Map to store key-value pair where key is of integer type and value is of String type.


package map;

import java.util.Map;
import java.util.HashMap;

import java.util.Set;
public class HashMapDemo {
    public static void main(String[] args) {

        //Creating a HahMap.
        HashMap<Integer, String> map = new HashMap<>();

        //Adding values in map using using put method.
        map.put(4, "Chittra");
        map.put(9, "Kirti");
        map.put(34, "Ditipriya");
        map.put(23, "Khushi");
        System.out.println("Printing after adding values: " + map);


        //If we add a duplicate key the value of the key gets updated with the new value.
        map.put(9, "anubhuti");
        System.out.println("Printing after adding duplicate key: " + map);


        //Adding duplicate values.
        map.put(1, "Chittra");
        System.out.println("Printing after adding duplicate duplicate values: " + map);


        System.out.println(map.remove(9));      //This returns the value against the key.
        System.out.println("Printing after deletion with the help of key: " + map);


        System.out.println(map.remove(34, "Ditipriya"));    //This returns true or false.It returns true  and deletes the value if its present otherwise it returns false.
        System.out.println("Printing after deletion with the help of key & value pair: " + map);


        //Printing all the keys in a given map using Keyset.
        Set<Integer> keysetRef = map.keySet();
        System.out.println("Printing keys using keyset--->" + keysetRef);

        /*Printing values against keys using for each loop in keyset.
         * In the for each loop we passed the type of Key and a reference.We need to mention the list
         * of key & value pair we want to traverse. */

        System.out.println("Printing values against keys using for each loop in keyset--->");
        for (Integer m : keysetRef) {
            System.out.println(map.get(m));
        }


        //Printing all the keys in a given map using EntrySet().In map.entrySet function each function is of the type map.Entry
        Set<Map.Entry<Integer, String>> entrySetRef = map.entrySet();
        for (Map.Entry<Integer, String> m : entrySetRef) {
            System.out.println("keys-->" + m.getKey() + "  Values-----> " + m.getValue());
        }


        //Printing all the values that are stored against odd keys.

        /*  We can direct get the set view of
        *   the map using map.entryset() function we do not need to make additional set
        *   i.e Set<Map.Entry<Integer,String>> entrySetRef = map.entrySet();
        */
               for (Map.Entry<Integer, String> m : map.entrySet()) {
            if (m.getKey() % 2 != 0) {
                System.out.println(m.getValue());
            }
        }


        //Search for key or Search for value
        System.out.println(map.containsKey(1)); //return true if the key is present in map.
        System.out.println(map.containsValue("sita")); //returns true if the value is  present in map otherwise.

    }

}