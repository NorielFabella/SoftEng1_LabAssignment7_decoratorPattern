public class UpSave implements BankAccountDecorator {
    private final SavingsAccount account;

    public UpSave(SavingsAccount account) {
        this.account = account;
    }

    @Override
    public String showInfo() {
        return account.showInfo();
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04; 
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.getBalance() + (account.getBalance() * getInterestRate());
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + " + With Insurance";
    }
}