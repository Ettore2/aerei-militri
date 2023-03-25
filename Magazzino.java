import java.util.ArrayList;

public class Magazzino {
    private ArrayList<Aereo> aerei;
    int maxAerei;


    //costruttore
    public Magazzino(int maxAerei){
        aerei=new ArrayList<>();
        this.maxAerei=maxAerei;
    }


    //setters


    //getters
    public synchronized ArrayList<Aereo> getAerei(){
        return aerei;

    }


    //altri metodi
    public synchronized void addAereo(Aereo a){
        if(aerei.size()<maxAerei&&a!=null){
            aerei.add(a);
        }


    }
    public synchronized Aereo takeAereo(int indice){
        if(!isEmpty()){
            Aereo aTmp=aerei.get(indice);
            aerei.remove(indice);
            return aTmp;
        }
        return null;
    }
    public synchronized boolean isEmpty(){
        return aerei.size()==0;

    }
    public synchronized boolean isFull(){
        return aerei.size()==maxAerei;

    }



}
