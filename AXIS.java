package lec_7_Polymorphism.assignment_1_BankingSystem_RunTimePoly;

public class AXIS extends Bank {
    public String type;

    public AXIS() {
        super("AXIS");
        this.type = "AXIS";
    }

    @Override
    public double getRateOfInterest() {
        return 9.7;
    }
}
