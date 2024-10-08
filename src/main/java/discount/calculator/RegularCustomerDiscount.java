package discount.calculator;

public class RegularCustomerDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.1;
    }
}
