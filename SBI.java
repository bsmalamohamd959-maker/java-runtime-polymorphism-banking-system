package lec_7_Polymorphism.assignment_1_BankingSystem_RunTimePoly;

public class SBI extends Bank {
    public String type;

    public SBI() {
        super("SBI");
        this.type = "SBI";
    }

    @Override
    public double getRateOfInterest() {
        return 8.4;
    }
}
