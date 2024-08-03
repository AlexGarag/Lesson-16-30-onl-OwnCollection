package by.tms.c30onl;

import by.tms.c30onl.lesson16.OwnArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

public class Executor {
    public static void main(String[] args) {
        OwnArrayList<String> array = new OwnArrayList(1);

        System.out.println(array.size());
        System.out.println(array.add("String0"));
        System.out.println(array.get(0));
        System.out.println(array.size());
        System.out.println(array.add("String1"));
        System.out.println(array.set(1, "String2"));
        System.out.println(array);
        int i = 0;

//        Iterator<String> iterator = array.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//                List<Integer> array1 = new ArrayList<>();
//        array1.add(1);
//        array1.add(2);
//        array1.add(3);
//        array1.add(4);

//        Iterator<Integer> iterator = array1.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        array.remove(2);


//        int i = 0;
    }
}