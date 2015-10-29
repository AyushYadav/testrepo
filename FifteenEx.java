/**
 * Created by ayushyadav on 9/20/15.
 */
public class FifteenEx {
    public static void main(String args[]){
        Vehicle car=new Vehicle(4, 100.0);
        System.out.println("Max speed of the Car : "+car.getSpeed());
        System.out.println("Number of wheels : "+car.getWheel());
        car.setSpeed(75.50);
        car.setWheel(4);
        System.out.println("After changing the values>>");
        System.out.println("Max speed of the Car : " + car.getSpeed());
        System.out.println("Number of wheels : " + car.getWheel());
        car.setCarStrength(15);
        System.out.println("Car Strength :"+car.getCarStrength());
    }
}
