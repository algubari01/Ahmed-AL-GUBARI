package case_study;

public class MaterialUsage extends ConstructionMaterial {

    public MaterialUsage(String contractorId, String contractorName, double materialQuantity, double materialBalance) {
        super(contractorId, contractorName, materialQuantity, materialBalance);
    }

    @Override
    public void useMaterial() {
        if (materialBalance - materialQuantity >= 2) {
            materialBalance -= materialQuantity;
            System.out.println("Material used. Remaining balance: " + materialBalance + " tons.");
        } else {
            System.out.println("Not enough material. At least 2 tons must remain after usage.");
        }
    }

    @Override
    public void receiveMaterial() {}

    @Override
    public void estimateCost() {}
}
