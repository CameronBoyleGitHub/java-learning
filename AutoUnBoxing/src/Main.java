public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        bank.addBranch("Boston");

        bank.addCustomer("Boston", "Jane", 10.10);
        bank.addCustomer("Boston", "John", 55.55);
        bank.addCustomer("Boston", "Kat", 6.66);

        bank.addBranch("Worcester");

        bank.addCustomer("Worcester", "Lemmy", 14.01);

        bank.addCustomerTransaction("Boston", "Jane", 12.12);
        bank.addCustomerTransaction("Boston", "Jane",  11.11);
        bank.addCustomerTransaction("Boston", "Kat", 6.66);

        bank.listCustomers("Worcester", false);

    }
}