/**
 * Created by ayushyadav on 9/25/15.
 */
import java.util.regex.*;

public class NinteenEx {
    public static void main(String args[]){
        String longString="Ayush Yadav  Mandi 175001 HP (98169)23909  ayushyadav@outlook.com 123-345-234 -432- 543-654";
//        String strangeString=" 1Z aaa ******* *** {{{{{{ {{ { ";

        //Word 2 to 20 char in length
        //[A-Za-z]{2,20} //w{2,20}
        regexChecker("\\s[A-Za-z]{2,20}\\s",longString);
        //d --Digits
        //D  --Not Digit
        //{x} --x times
        regexChecker("\\s\\d{6}\\s",longString);
        //2 char that start with C or A
        //A[KLRZ]|C[AOT]
        //{n,} --fro a min but no max
        //+ --whatever proceeds must be there atleast one or more times
        regexChecker("[A-Za-z0-9._%-]+@+[A-Za-z0-9._%-]+\\.[A-Za-z]{2,4}",longString);
        regexReplace(longString);
    }
    public static void regexChecker(String theR, String str2Check){
        Pattern checkRegx=Pattern.compile(theR);
        Matcher regexMatcher =checkRegx.matcher(str2Check);
        while(regexMatcher.find()){
            if(regexMatcher.group().length() !=0){
                System.out.println(regexMatcher.group().trim());

            }
            System.out.println("Starting Index : "+regexMatcher.start());
            System.out.println("Ending Index : "+regexMatcher.end());
            System.out.println();

        }

    }
    public static void regexReplace(String strToReplace){
        Pattern replace=Pattern.compile("\\s+");
        Matcher regexMatcher=replace.matcher(strToReplace.trim());
        System.out.println(regexMatcher.replaceAll(", "));
    }

}
