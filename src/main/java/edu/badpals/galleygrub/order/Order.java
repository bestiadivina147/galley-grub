package edu.badpals.galleygrub.order;

import java.util.ArrayList;
import java.util.List;

import edu.badpals.galleygrub.items.Item;

public class Order implements Comanda {
    private Double total ;
    private List<Item> items = new ArrayList<>();
    public Order() {
    }

    @Override
    public void addItem(String name, double price) {
    }

    @Override
    public void addItem(String name, double price, String extra) {
    }

    @Override
    public int size() {
        return  items.size();
    }

    @Override
    public List<Item> itemList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemList'");
    }

    @Override
    public Double getTotal() {
        return this.total;

    }

    @Override
    public void updateTotal(Double price) {
    }

    @Override
    public void display() {
    }

}
