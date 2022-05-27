package discounts;

import model.Cart;

import java.util.ArrayList;
import java.util.List;

public class ManyDiscount implements ICanApplyDiscount{
    private List<ICanApplyDiscount> amountOfAllDiscounts;
    private List<ICanApplyDiscount> getAmountOfAllDiscounts;

    public ManyDiscount()
    {
        amountOfAllDiscounts = new ArrayList<>();
        amountOfAllDiscounts.add(new ThreeForThePriceOfTwo());
        amountOfAllDiscounts.add(new FreeCupDiscount());
        amountOfAllDiscounts.add(new PercentDiscount(0.05));

        getAmountOfAllDiscounts = new ArrayList<>();
    }

    public boolean canApplyDiscount(Cart cart)
    {
        for (ICanApplyDiscount i : amountOfAllDiscounts)
        {
            if (i.canApplyDiscount(cart)) getAmountOfAllDiscounts.add(i);
        }
        return !amountOfAllDiscounts.isEmpty();
    }

    public void applyDiscount(Cart cart)
    {
        for (ICanApplyDiscount i : getAmountOfAllDiscounts) i.applyDiscount(cart);
    }


}
