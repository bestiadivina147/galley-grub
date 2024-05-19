package edu.badpals.galleygrub.items;

public class Item implements Product {
    String name="";
    Double price=0d;
    String extra="";

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name + " w/" + extra ;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public String extra() {
        return this.extra;
    }

    @Override
    public Boolean isRegular() {
        return this.extra().isBlank();
    }
    @Override
    public String toString(){
        return this.name + "...." + String.format("%.2f", this.price) +"$" ;
    }
    public boolean equals(Object obj){
        if(obj instanceof Item){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

}
