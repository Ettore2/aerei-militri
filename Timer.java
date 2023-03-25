import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class Timer extends Thread{
    private float time;
    private float timeMultiplier;
    private boolean active;

    Timer(float startingMilliseconds, float timeMultiplier,boolean active){
        time=startingMilliseconds;
        this.active=active;
        this.timeMultiplier=timeMultiplier;

        this.start();
    }

    Timer(float timeMultiplier,boolean active){
        time=0;
        this.active=active;
        this.timeMultiplier=timeMultiplier;

        this.start();
    }
    Timer(boolean active){
        time=0;
        this.active=active;
        timeMultiplier=0.001f;

        this.start();
    }

    //getter
    public synchronized float getTime(){
        return time;

    }


    //setter
    public synchronized void setTime(float milliseconds){
        this.time=milliseconds;

    }

    public synchronized void setActive(boolean active){
        this.active=active;

    }

    //altri metodi
    private synchronized void aumentaTime(float incremento){
        time+=incremento*timeMultiplier;

    }
    public synchronized boolean isActive() {
        return active;

    }

    //run
    public void run() {
        Date oldDate=new Date();
        Date newDate;

        while(true){
            newDate=new Date();

            //aggiorno tempo
            if(active){
                aumentaTime(newDate.getTime()-oldDate.getTime());
            }

            oldDate=newDate;
        }

    }

}













