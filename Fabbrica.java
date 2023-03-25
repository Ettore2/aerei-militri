public class Fabbrica implements Runnable{
    private static final float COSTANTE_VELOCITA=0.1f;

    private String nome;
    private float distanzaMagazzino;
    private float tProduzione;
    private Thread t;
    private Magazzino mag;
    private float timerProduzione;
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
        //funzionamento thread
        while (clock!=null&&clock.getTime()<Main.durata){

            if((aereiProdotti+1)*tProduzione<clock.getTime()){
                producoAereo();
            }
        }
    }
}













