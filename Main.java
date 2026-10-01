package lec_7_Polymorphism.assignment_1_BankingSystem_RunTimePoly;

public class Main {
    public static void main(String[] args) {
        Bank[] banks = new Bank[3];

        banks[0] = new SBI();
        banks[1] = new ICICI();
        banks[2] = new AXIS();

        for (int i = 0; i < banks.length; i++) {
            // Runtime polymorphism is achieved through method overriding.
            System.out.println("Bank name: " + banks[i].getBankName());
            System.out.println("Rate of interest: " + banks[i].getRateOfInterest());

            // Fields are not overridden. The parent class field is used.
            System.out.println("Type: " + banks[i].type);
            System.out.println("________________________________________");
        }

        Bank ref = new Bank("Bank");
        System.out.println("ref.type: " + ref.type);
    }
}
