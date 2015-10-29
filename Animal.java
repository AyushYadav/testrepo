/**
 * Created by ayushyadav on 9/15/15.
 */
import java.util.*;
public class Animal {
    public static final double FAVVAR=3.1416;
    private String name;
    private int weight;
    private byte age;
    private boolean hasOwner=false;
    private long UniqId;
    private double height;

    protected static int numberOfAnimals=0;
    Scanner userInput=new Scanner(System.in);


    public Animal() {
//        super();
        numberOfAnimals++;
        int sumofNumbers = 5+4;
        System.out.println("5 + 4 = "+sumofNumbers);
        int diffofNumbers = 5-4;
        System.out.println("5 - 4 = " +diffofNumbers);
        int proOfNumbers = 5*4;
        System.out.println("5 * 4 = "+proOfNumbers);
        System.out.print("Enter name: \n");
//        if(userInput.hasNextLine()){
//            this.setName(userInput.nextLine());

        }


    public static void main(String[] args) {

        Animal theAnimal=new Animal();
    }

}
