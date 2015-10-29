/**
 * Created by ayushyadav on 9/23/15.
 */
public class GetTheMail implements Runnable {

    private int StartTime;

    public GetTheMail(int startTime){
        this.StartTime=startTime;
    }
    public void run(){
        try{
            Thread.sleep(StartTime * 1000);
        }
        catch(InterruptedException e){

        }
        System.out.println("Checking Mail");

    }
}
