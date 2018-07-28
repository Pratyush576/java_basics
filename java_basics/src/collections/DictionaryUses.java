package collections;

import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryUses {
    public static void main(String[] args) {
        Dictionary dictionary= new Hashtable();
        dictionary.put(1,"test1");
        System.out.println(dictionary.isEmpty());
        System.out.println(dictionary.elements().nextElement());
        System.out.println(dictionary.get(1));
    }
}
