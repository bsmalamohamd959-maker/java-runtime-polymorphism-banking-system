package lec_7_Polymorphism.assignment_1_BankingSystem_RunTimePoly;

public class ICICI extends Bank {
    public String type;

    public ICICI() {
        super("ICICI");
        this.type = "ICICI";
    }

    @Override
    public double getRateOfInterest() {
        return 7.3;
    }
}
