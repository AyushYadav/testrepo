/**
 * Created by ayushyadav on 9/19/15.
 */

import java.util.Iterator;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String args[]){
        LinkedList linkedListone=new LinkedList();
        LinkedList<String> names=new LinkedList<String>();
        names.add("Ahmed Karanath");
        names.add("Rajat Valecha");
        names.add("Nikhil Rajan");
        names.add("Shubham Chandel");
        names.addLast("Ayush Yadav");
        names.addFirst("Prateek Rajdev");
        names.set(2, "Karan Mahajan");
        names.remove(2);
        names.remove("Shubham Chandel");
        for (String name: names)
            System.out.println(name);
        LinkedList<String> nameCopy=new LinkedList<String>(names);
        System.out.println(nameCopy);
        System.out.println("Removing first element :"+nameCopy.poll());
        System.out.println(nameCopy);
        System.out.println("Removing last element :"+nameCopy.pollLast());
        System.out.println(nameCopy);
        nameCopy.push("Aman Gupta");
        System.out.println(nameCopy);
        nameCopy.pop();
        System.out.println(nameCopy);
    }
}
