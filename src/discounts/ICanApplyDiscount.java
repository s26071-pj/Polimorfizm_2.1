package discounts;

import model.Cart;

import java.util.List;

public interface ICanApplyDiscount {

    boolean canApplyDiscount(Cart cart);
    void applyDiscount(Cart cart);

}