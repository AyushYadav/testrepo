/**
 * Created by ayushyadav on 9/20/15.
 */
public class SixteenEx {
    public static void main(String args[]){
        Object superCar=new Vehicle(4,100.0);
        System.out.println(((Vehicle)superCar).getSpeed());
        Vehicle superTruck=new Vehicle(4,100.0);
        System.out.println(superCar.equals(superTruck));
        System.out.println(superCar.hashCode());
        System.out.println(superCar.getClass());
        System.out.println(superCar.getClass().getName());
        System.out.println(superCar.getClass().getSuperclass().getName());
        superTruck.setWheel(6);
//        Vehicle superTruck2=(Vehicle)superTruck.clone();
//        System.out.println(superTruck.getWheel());
//        System.out.println(superTruck2.getWheel());

    }
}
