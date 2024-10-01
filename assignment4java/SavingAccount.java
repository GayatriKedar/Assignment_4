package assignment30Sep;

public class SavingAccount {
	
	private static double annualInterestRate;
    private double savingsBalance;

   
    public SavingAccount(double balance) {
        this.savingsBalance = balance;
    }

    
    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    
    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static void main(String[] args) {
        
    	SavingAccount savingAccount1 = new SavingAccount(2000.00);
    	SavingAccount savingAccount2 = new SavingAccount(3000.00);

        
    	SavingAccount.modifyInterestRate(0.03);

        
        savingAccount1.calculateMonthlyInterest();
        savingAccount2.calculateMonthlyInterest();
        System.out.printf("1 balance after \n", savingAccount1.getSavingsBalance());
        System.out.printf("2 balance after \n", savingAccount2.getSavingsBalance());

        
        savingAccount1.calculateMonthlyInterest();
        savingAccount2.calculateMonthlyInterest();
        System.out.printf("1 new balance ", savingAccount1.getSavingsBalance());
        System.out.printf("2 new balance \n", savingAccount2.getSavingsBalance();
    
    }


}
