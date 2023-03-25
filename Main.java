public class Main {
    public static void main(String[] args){
        //clock centralizzato nel main
        Timer t=new Timer(0.01f,true);//1 intero=50 giorni
        while(true){
            System.out.println(t.getTime());
        }
    }


}














