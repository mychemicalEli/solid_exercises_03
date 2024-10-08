package discount.calculator;

public class VipCustomerDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.3;
    }
}
