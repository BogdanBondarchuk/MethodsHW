package app;

import java.text.DecimalFormat;

public class DiscountCalculator {

    private int discountBelow5000 = 5;
    private int discount5000To10000 = 10;
    private int discountAbove10000 = 15;

    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();
        double purchaseAmount = 1000;
        calculator.calculateAndPrint(purchaseAmount);
    }

    public void calculateAndPrint(double purchaseAmount) {
        double discount = calculateDiscount(purchaseAmount);
        double amountToPay = purchaseAmount - discount;

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Total purchase amount: " + df.format(purchaseAmount));
        System.out.println("Discount amount: " + df.format(discount));
        System.out.println("Amount due: " + df.format(amountToPay));
    }

    public double calculateDiscount(double purchaseAmount) {
        if (purchaseAmount <= 5000) {
            return purchaseAmount * (discountBelow5000 / 100.0);
        } else if (purchaseAmount > 5000 && purchaseAmount <= 10000) {
            return purchaseAmount * (discount5000To10000 / 100.0);
        } else {
            return purchaseAmount * (discountAbove10000 / 100.0);
        }
    }
}
