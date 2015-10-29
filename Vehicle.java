/**
 * Created by ayushyadav on 9/20/15.
 */
public class Vehicle extends Crashable implements Drivable , Cloneable {

    int numOfWheels=2;
    double theSpeed=0.0;
    int carStrength=0;

    public int getWheel(){
        return this.numOfWheels;
    }
    public void setWheel(int numWheels){
        this.numOfWheels=numWheels;
    }
    public double getSpeed(){
        return this.theSpeed;
    }
    public void setSpeed(double speed){
        this.theSpeed=speed;
    }

    public void setCarStrength(int strength){
        this.carStrength=strength;
    }
    public int getCarStrength(){
        return this.carStrength;
    }
    public Vehicle(int wheels, double speed){
        this.numOfWheels=wheels;
        this.theSpeed=speed;
    }
    public Object Clone(){
        Vehicle car;
        try{
            car=(Vehicle) super.clone();

        }
        catch (CloneNotSupportedException e){
            return null;
        }
        return car;
    }
}
