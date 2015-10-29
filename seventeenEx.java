/**
 * Created by ayushyadav on 9/23/15.
 */
public class seventeenEx {
    public static void main(String args[]){
        Thread getTime=new GetTime20();
        Runnable getMail=new GetTheMail(10);
        Runnable getMailAgain=new GetTheMail(5);
        getTime.start();
        new Thread(getMail).start();
        new Thread(getMailAgain).start();
    }
}
