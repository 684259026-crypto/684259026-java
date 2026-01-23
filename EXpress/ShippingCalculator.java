public class ShippingCalculator {
    
    // Standard shipping rates
    private static final double RATE_0_TO_1_KG = 40.0;
    private static final double RATE_1_TO_3_KG = 60.0;
    private static final double RATE_3_TO_5_KG = 80.0;
    private static final double RATE_OVER_5_KG = 100.0;
    
    // Express shipping rates (alternative tier mentioned in requirements)
    private static final double EXPRESS_RATE_0_TO_1_KG = 60.0;
    private static final double EXPRESS_RATE_1_TO_3_KG = 90.0;
    private static final double EXPRESS_RATE_3_TO_5_KG = 120.0;
    private static final double EXPRESS_RATE_OVER_5_KG = 150.0;
    
    // Additional charges and discounts
    private static final double EXPRESS_SERVICE_FEE = 30.0;
    private static final double VIP_DISCOUNT_RATE = 0.20; // 20% discount
    
    public static void main(String[] args) {
        // Example usage
        System.out.println("=== Shipping Cost Calculator ===");
        
        // Test various scenarios
        calculateAndPrintCost(0.5, false, false);  // Standard, not VIP
        calculateAndPrintCost(2.0, false, false);  // Standard, not VIP
        calculateAndPrintCost(4.0, false, false);  // Standard, not VIP
        calculateAndPrintCost(6.0, false, false);  // Standard, not VIP
        
        System.out.println("\n--- Express Service ---");
        calculateAndPrintCost(0.5, true, false);   // Express, not VIP
        calculateAndPrintCost(2.0, true, false);   // Express, not VIP
        calculateAndPrintCost(4.0, true, false);   // Express, not VIP
        calculateAndPrintCost(6.0, true, false);   // Express, not VIP
        
        System.out.println("\n--- VIP Member (20% discount) ---");
        calculateAndPrintCost(0.5, false, true);   // Standard, VIP
        calculateAndPrintCost(2.0, false, true);   // Standard, VIP
        calculateAndPrintCost(4.0, false, true);   // Standard, VIP
        calculateAndPrintCost(6.0, false, true);   // Standard, VIP
        
        System.out.println("\n--- Express + VIP ---");
        calculateAndPrintCost(0.5, true, true);    // Express, VIP
        calculateAndPrintCost(2.0, true, true);    // Express, VIP
        calculateAndPrintCost(4.0, true, true);    // Express, VIP
        calculateAndPrintCost(6.0, true, true);    // Express, VIP
    }
    
    /**
     * Calculates the shipping cost based on weight, express service, and VIP status
     * @param weight Weight of the package in kilograms
     * @param isExpress Whether express service is selected
     * @param isVip Whether the customer is a VIP member
     * @return The calculated shipping cost
     */
    public static double calculateShippingCost(double weight, boolean isExpress, boolean isVip) {
        double baseRate;
        
        // Determine base rate based on weight and service type
        if (isExpress) {
            baseRate = getExpressRate(weight);
        } else {
            baseRate = getStandardRate(weight);
        }
        
        // Add express service fee if applicable
        if (isExpress) {
            baseRate += EXPRESS_SERVICE_FEE;
        }
        
        // Apply VIP discount if applicable
        if (isVip) {
            baseRate = baseRate * (1 - VIP_DISCOUNT_RATE);
        }
        
        return baseRate;
    }
    
    /**
     * Gets the standard shipping rate based on weight
     * @param weight Weight of the package in kilograms
     * @return The standard shipping rate
     */
    private static double getStandardRate(double weight) {
        if (weight <= 1.0) {
            return RATE_0_TO_1_KG;
        } else if (weight <= 3.0) {
            return RATE_1_TO_3_KG;
        } else if (weight <= 5.0) {
            return RATE_3_TO_5_KG;
        } else {
            return RATE_OVER_5_KG;
        }
    }
    
    /**
     * Gets the express shipping rate based on weight
     * @param weight Weight of the package in kilograms
     * @return The express shipping rate
     */
    private static double getExpressRate(double weight) {
        if (weight <= 1.0) {
            return EXPRESS_RATE_0_TO_1_KG;
        } else if (weight <= 3.0) {
            return EXPRESS_RATE_1_TO_3_KG;
        } else if (weight <= 5.0) {
            return EXPRESS_RATE_3_TO_5_KG;
        } else {
            return EXPRESS_RATE_OVER_5_KG;
        }
    }
    
    /**
     * Helper method to print calculation results
     */
    private static void calculateAndPrintCost(double weight, boolean isExpress, boolean isVip) {
        double cost = calculateShippingCost(weight, isExpress, isVip);
        
        String weightStr = String.format("%.1f kg", weight);
        String serviceType = isExpress ? "Express" : "Standard";
        String vipStatus = isVip ? "VIP" : "Regular";
        
        System.out.printf("Weight: %s | Service: %s | Customer: %s | Cost: %.2f บาท%n", 
                         weightStr, serviceType, vipStatus, cost);
    }
}