import java.awt.desktop.SystemSleepEvent;

public class Fabbrica implements Runnable{
    private static final float COSTANTE_VELOCITA=0.1f;

    private String nome;
    private float distanzaMagazzino;
    private float tProduzione,timerXProduzione;
    private Thread t;
    private Magazzino mag;
    private Timer clock;
    private int aereiProdotti;
    private Aereo aTmp;

    //costruttore
    public Fabbrica(String nome,Magazzino mag,float distanzaMagazzino,float tProd,Timer clock){
        this.nome=nome;
        this.distanzaMagazzino=distanzaMagazzino;
        this.tProduzione=tProd;
        this.clock=clock;
        this.mag=mag;
        this.aereiProdotti=0;
        this.timerXProduzione=0;

        t=new Thread(this);
        t.start();
    }//contiene avvio Thread

    //setters


    //getters


    //altri metodi
    private void producoAereo(){
        aereiProdotti++;
        aTmp=new Aereo(this.nome+aereiProdotti,distanzaMagazzino*COSTANTE_VELOCITA,mag,clock);
        System.out.println("FABBRICA: "+nome+" produce: "+aTmp.getNome()+" al tempo:"+clock.getTime());
    }



    //run
    public void run() {
        float oldTime=clock.getTime(),newTime;
        //funzionamento thread
        while (clock!=null&&clock.getTime()<Main.durata){
            //aumento timerXProduzione
            newTime=clock.getTime();
            if(!mag.isFull()){
                timerXProduzione+=newTime-oldTime;
            }//se il magazzino non e pieno procedo con la produzione
            //(non previene produzioni simultanee che riempiono il magazzino, aerei extra vengono scartati)
            oldTime=newTime;

            //eventuale produzione
            if(timerXProduzione>=tProduzione){
                producoAereo();
                timerXProduzione-=tProduzione;
            }
        }
    }
}













