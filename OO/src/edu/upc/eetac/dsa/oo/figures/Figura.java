package edu.upc.eetac.dsa.oo.figures;

import java.io.Serializable;

public abstract class Figura implements Comparable<Figura> {
    public abstract double area();

    public int compareTo(Figura f){
        return (int)(f.area()-this.area());
    }
}
