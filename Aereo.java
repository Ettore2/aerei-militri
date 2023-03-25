public class Aereo implements Runnable{
    private String nome;
    private float tViaggio,tCreazione;
    private Magazzino mag;
    private Thread t;
    private Timer clock;

    //costruttori
    public Aereo(String nome,float tViaggio,Magazzino mag,Timer clock){
        this.nome=nome;
        this.tViaggio=tViaggio;
        this.mag=mag;
        this.clock=clock;
        tCreazione=clock.getTime();

        t=new Thread(this);
        t.start();
    }//contiene avvio Thread


    //setters


    //getters
    public float getTViaggio(){
        return tViaggio;

    }
    public Magazzino getMag(){
        return mag;

    }
    public String getNome(){
        return nome;

    }
    public Timer getClock(){
        return clock;

    }
    public Thread getThread(){
        return t;

    }

    //run
    public void run() {
        while(clock.getTime()-tCreazione<tViaggio){
            //aspetto
        }

        //mi aggiungo a magazzino
        this.mag.addAereo(this);
        System.out.println("AEREO: "+nome+" si aggiungea a magazzino al tempo:"+clock.getTime());

        // *thread termina*
    }
}
