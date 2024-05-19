package edu.badpals.galleygrub.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

import edu.badpals.galleygrub.items.Item;
import edu.badpals.galleygrub.items.ItemFactory;

public class Order implements Comanda {
    private Double total = 0d;
    private List<Item> items = new ArrayList<>();
    public Order() {
    }

    @Override
    public void addItem(String name, double price) {
        Item item = ItemFactory.getItem(name, price);
        this.items.add(item);
    }

    @Override
    public void addItem(String name, double price, String extra) {
        Item item = ItemFactory.getItem(name, price, extra);
        this.items.add(item);
    }

    @Override
    public int size() {
        return  this.items.size();
    }

    @Override
    public List<Item> itemList() {
        return Collections.unmodifiableList(this.items);
    }

    @Override
    public Double getTotal() {
        return this.total;

    }

    @Override
    public void updateTotal(Double price) {
        this.total+= total;
    }

    private void itemDisplay(Item item) {
        System.out.print("\t" + item.toString() + "\n");
    } 
    
    @Override
    public void display() {
        System.out.print("\n\t --- ORDER --- \n");
        itemList().stream().forEach(this::itemDisplay);
    }

}
