public class Fabbrica implements Runnable{
    String nome;
    float distanza;
    float tProd;
    Thread t;
    Magazzino mag;

    float timerProd;

    Fabbrica(String nome,float distanza,float tProd,Magazzino mag){
        this.nome=nome;
        this.distanza=distanza;
        this.tProd=tProd;

        t=new Thread(this);
        t.start();
    }//contiene avvio Thread






    public void run() {
        //produzioni aerei
    }
}
