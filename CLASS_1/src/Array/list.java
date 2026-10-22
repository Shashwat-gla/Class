package Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class list {
    static void main(String[] args) {
//        ArrayList<Integer> objectname =new ArrayList<>()
        List<Integer> objectname =new ArrayList<>();
        objectname.add(10);
        objectname.add(60);
        objectname.add(50);
        objectname.add(40);
        objectname.add(30);
        objectname.add(20);
        System.out.println(objectname);
        //indexing
        System.out.println(objectname.get(2));
        //length ke lia
        System.out.println(objectname.size());
        //sorting
        Collections.sort(objectname);
        System.out.println(objectname);
        //add in btw
        objectname.add(2,99);
        System.out.println(objectname);
        //remove
        objectname.remove(2);
        System.out.println(objectname);
        // agar value ke jaise treat karna ho toh
        objectname.remove((Integer) 50);
        System.out.println(objectname);
    }
}