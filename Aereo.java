public class Aereo implements Runnable{
    String nome;
    float tViaggio;
    Magazzino mag;
    Thread t;

    Aereo(String nome,float tViaggio,Magazzino mag){
        this.nome=nome;
        this.tViaggio=tViaggio;
        this.mag=mag;

        t=new Thread(this);
        t.start();
    }//contiene avvio Thread





    public void run() {

    }
}
