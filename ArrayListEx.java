/**
 * Created by ayushyadav on 9/19/15.
 */
import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Arrays;
//import java.util.LinkedList;

public class ArrayListEx {

    public static void main(String args[]) {
        ArrayList arrayListOne = new ArrayList();
        ArrayList arrayListTwo = new ArrayList();
        ArrayList<String> names = new ArrayList<String>();
        names.add("James Smith");
        names.add("John Doe");
        names.add("Robert Wheeler");
        names.add("William Bentick");
        for (int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }

        names.set(0, "John Doe");
        for (int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }


    }
}
