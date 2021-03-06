package model;

public class CartItem implements Comparable<CartItem>{

    private Product product;
    private double currentPrice;

    public CartItem(Product product){
        this.product = product;
        this.currentPrice = product.getPrice();
    }

    public Product getProduct(){
        return product;
    }

    public void setProduct(Product product){
        this.product = product;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    @Override
    public int compareTo(CartItem o) {
        return 0;
    }
}
