class ElectricBill {
    int units;
    static double fixedCharge = 50;

    void calculateBill() {
        double rate = 5;
        double energyCharge = units * rate;
        double totalBill = energyCharge + fixedCharge;

        System.out.println("Units: " + units);
        System.out.println("Energy Charge: " + energyCharge);
        System.out.println("Fixed Charge: " + fixedCharge);
        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args) {
        ElectricBill e = new ElectricBill();
        e.units = 100;
        e.calculateBill();
    }
}