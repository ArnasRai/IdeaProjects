package lt.sdacademy.fundamentals.manouzsiemimai;


class Account {
    public static void main(String[] args) {

    }

    String accountNumber;
    static int numberOfAccounts;

    {
        Account acct1 = new Account();
        acct1.accountNumber = "A";
        Account.numberOfAccounts = Account.numberOfAccounts + 1;

        Account acct2 = new Account();
        acct2.accountNumber = "A2";
         Account.numberOfAccounts = Account.numberOfAccounts + 1;




    }


}