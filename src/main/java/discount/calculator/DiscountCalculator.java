package discount.calculator;

import java.util.Map;

public class DiscountCalculator {
    private final Map<CustomerType, DiscountStrategy> discountStrategies;

    public DiscountCalculator(Map<CustomerType, DiscountStrategy> discountStrategies) {
        this.discountStrategies = discountStrategies;
    }

    public double calculateDiscount(Product product, CustomerType customerType) {
        DiscountStrategy strategy = discountStrategies.get(customerType);
        return strategy.calculateDiscount(product);
    }

}
