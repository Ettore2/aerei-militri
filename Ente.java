public class Ente implements Runnable {

    private String nome;
    private float tRichiesta;
    private int aereiRichiesti;
    private Thread t;
    private Magazzino mag;
    private Timer clock;
    private Aereo aTmp;
    int ordiniFatti;


    //costruttore
    public Ente(String nome, float tRichiesta, int aereiRichiesti, Magazzino mag,Timer clock){
        this.nome=nome;
        this.tRichiesta=tRichiesta;
        this.aereiRichiesti=aereiRichiesti;
        this.mag=mag;
        this.clock=clock;
        ordiniFatti=0;

        t=new Thread(this);
        t.start();
    }


    //setters


    //getters


    //altr imetodi
    public void prendoAerei(){
        ordiniFatti++;
        int aereiPresi=0;

        while(aereiPresi<aereiRichiesti){
            aTmp=mag.takeAereo(0);

            if(aTmp!=null){
                aereiPresi++;
                System.out.println("CONSUMATORE: "+nome+" prende aereo: "+aTmp.getNome()+" ("+aereiPresi+" di "+aereiRichiesti+") al tempo:"+clock.getTime());
            }
            aTmp=null;
        }
    }


    //run
    public void run() {
        //funzionamento thread
        while (clock!=null&&clock.getTime()<Main.durata){

            if((ordiniFatti+1)*tRichiesta<clock.getTime()){
                prendoAerei();
            }
        }
    }
}





