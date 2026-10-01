package lec_7_Polymorphism.assignment_1_BankingSystem_RunTimePoly;

public class Bank {
    private String bankName;
    public String type;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.type = "Parent Bank";
    }

    public double getRateOfInterest() {
        return 0.0;
    }

    public String getBankName() {
        return bankName;
    }
}
