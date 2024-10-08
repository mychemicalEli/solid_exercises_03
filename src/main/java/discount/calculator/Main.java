package discount.calculator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000);
        Map<CustomerType, DiscountStrategy> discountStrategies = new HashMap<>();
        discountStrategies.put(CustomerType.REGULAR, new RegularCustomerDiscount());
        discountStrategies.put(CustomerType.PREMIUM, new PremiumCustomerDiscount());
        discountStrategies.put(CustomerType.VIP, new VipCustomerDiscount());

        DiscountCalculator discountCalculator = new DiscountCalculator(discountStrategies);

        System.out.println("Regular discount: " + discountCalculator.calculateDiscount(product, CustomerType.REGULAR));
        System.out.println("Premium discount: " + discountCalculator.calculateDiscount(product, CustomerType.PREMIUM));
        System.out.println("VIP discount: " + discountCalculator.calculateDiscount(product, CustomerType.VIP));
    }
}