package edu.upc.eetac.dsa.oo.figures;

public class Quadrat extends Rectangle{
    public Quadrat (double l){
        super(l, l);
    }

    @Override
    public String toString() {
        return "Quadrat l: " + this.getL1() + " area: "+super.area();
    }
}
