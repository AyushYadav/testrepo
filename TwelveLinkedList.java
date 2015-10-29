/**
 * Created by ayushyadav on 9/20/15.
 */

import java.util.Arrays;

public class TwelveLinkedList {
    public static void main(String args[]){
        String ex1="BIG";
        String ex2="big";
        if(ex1.equalsIgnoreCase(ex2))
            System.out.println("Both the strings are equal except the case");
        String letters="abcdef";
        String moreLetters="ghijkl";
        System.out.println(letters.compareTo(moreLetters));
        System.out.println(letters.contains("cde"));
        System.out.println("Lenght: "+letters.length());
        System.out.println(letters.replace("bcd","Ayush"));
        System.out.println(letters);
        String[] letterArray=letters.split("");
        System.out.println(Arrays.toString(letterArray));
        char[] charArray=letters.toCharArray();
        System.out.println(Arrays.toString(charArray));
        StringBuilder randSB=new StringBuilder("Just some random value");
        System.out.println(randSB);
        System.out.println(randSB.append(" appended"));
        System.out.println(randSB);
        System.out.println(randSB.capacity());
        randSB.ensureCapacity(50);
        System.out.println(randSB.capacity());
        System.out.println(randSB.length());
        randSB.trimToSize();
        System.out.println(randSB.length());
        System.out.println(randSB.capacity());
    }
}

