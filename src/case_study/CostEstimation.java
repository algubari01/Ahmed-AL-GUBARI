package case_study;

import java.text.NumberFormat;

public class CostEstimation extends ConstructionMaterial {

    public CostEstimation(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void estimateCost() {
        double costPerTon = (materialQuantity >= 5 && materialQuantity <= 15) ? 200000 : 180000;
        double totalCost = materialQuantity * costPerTon;

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Contractor ID: " + contractorId);
        System.out.println("Contractor Name: " + contractorName);
        System.out.println("Quantity Used: " + materialQuantity + " tons");
        System.out.println("Total Cost: " + formatter.format(totalCost));
    }

    @Override
    public void receiveMaterial() {}

    @Override
    public void useMaterial() {}
}

