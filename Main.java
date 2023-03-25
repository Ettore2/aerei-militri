public class Main {
    static float durata=99999999;
    public static void main(String[] args) {
        //clock centralizzato nel main
        Timer t = new Timer(0.5f, true);//1 intero=1 giorno
        Magazzino m = new Magazzino();

        new Fabbrica("f1",m,800,500,t);

        //while (true) {
        //    System.out.println(t.getTime());
        //}

    }
    /*
    public static void CheckTermination(Timer t){
        if(t.getTime()>=1000){
            Thread.currentThread().stop();
        }
    }
     */
}














