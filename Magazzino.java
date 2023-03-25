import java.util.ArrayList;

public class Magazzino {
    private ArrayList<Aereo> aerei;


    //costruttore
    public Magazzino(){
        aerei=new ArrayList<>();

    }


    //setters


    //getters
    public synchronized ArrayList<Aereo> getAerei(){
        return aerei;

    }


    //altri metodi
    public synchronized void addAereo(Aereo a){
        aerei.add(a);

    }
    public synchronized Aereo takeAereo(int indice){
        Aereo aTmp=aerei.get(indice);
        aerei.remove(indice);
        return aTmp;
    }
    public synchronized boolean isEmpty(){
        return aerei.size()==0;
    }




}
