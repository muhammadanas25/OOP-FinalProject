package GUIPackage;

import java.util.ArrayList;

public class cloth {



    private double price;
    private int qty;
    private String name;

    public cloth( String name,double price, int qty) {
        this.price = price;
        this.qty = qty;
        this.name = name;
    }

    private ArrayList <cloth> cart=new ArrayList<cloth>();

    public void addToCart(cloth c){
        cart.add(c);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<cloth> getCart() {
        return cart;
    }

    public void setCart(ArrayList<cloth> cart) {
        this.cart = cart;
    }




    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


}
