package by.tms.c30onl;

import by.tms.c30onl.lesson16.OwnArrayList;

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
        int i = 0;
//                List<Integer> array1 = new ArrayList<Integer>();
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        array.add(4);
//        array.remove(2);


//        int i = 0;
    }
}