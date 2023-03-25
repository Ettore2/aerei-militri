public class Main {
    static float durata=20*364;
    public static void main(String[] args) {
        //clock centralizzato nel main
        Timer t = new Timer(0.5f, true);//1 intero=1 giorno
        Magazzino m = new Magazzino(10);

        new Fabbrica("ALFA",m,800,500,t);
        new Fabbrica("BRAVO",m,400,450,t);
        new Fabbrica("CHARLIE",m,300,600,t);
        new Fabbrica("DELTA",m,600,350,t);
        new Fabbrica("ECHO",m,200,720,t);

        new Ente("Marines",2000,3,m,t);
        new Ente("US Navy",2300,5,m,t);
        new Ente("Air Force",1500,7,m,t);

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














