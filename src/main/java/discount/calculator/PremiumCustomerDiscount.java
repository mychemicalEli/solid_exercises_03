package discount.calculator;

public class PremiumCustomerDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.2;
    }
}
