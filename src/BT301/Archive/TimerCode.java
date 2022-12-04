package Archive;
// Program: Timer - By Sir Marjon
import java.util.*;
public class TimerCode {

  Timer timer;
  TimerTask timertask;
  int flag = 0;
  public static void main(String[] args) {
    TimerCode s = new TimerCode();
    s.settimer();
  }
  
  public void settimer(){
    timer = new Timer();
    timertask = new TimerTask() {

      @Override
      public void run() {
        flag++;
        System.out.println(flag);

        //System.out.println("Print sa Class run o class rimer");

        if(flag == 10){
          timer.cancel();
          timertask.cancel();
        }

      }
    };
    timer.schedule(timertask, 1, 1000);
  }
  
}