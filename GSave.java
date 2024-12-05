public class GSave implements BankAccountDecorator {
    private final SavingsAccount account;

    public GSave(SavingsAccount account) {
        this.account = account;
    }

    @Override
    public String showInfo() {
        return account.showInfo();
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025; 
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.getBalance() + (account.getBalance() * getInterestRate());
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + " + GSave Transfer";
    }
}