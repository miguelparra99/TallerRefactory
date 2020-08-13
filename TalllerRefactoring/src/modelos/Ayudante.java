package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    private ArrayList<Paralelo> paralelos;     

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }
    
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
