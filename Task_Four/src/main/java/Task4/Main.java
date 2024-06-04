package Task4;

public class Main {
    public static void main(String[] args) {
        User user1 = new User (1L,"Elvis", "Presley");
        User user2 = new User (2L,"Britney", "Spears");
        User user3 = new User (3L,"Mick", "Jagger");
        User user4 = new User (4L,"Bob", "Marley");
        User user5 = new User (3L,"Celine", "Dion");

        Account account1 = new Account(1L,12000L,user1);
        Account account2 = new Account(2L,25000L,user2);
        Account account3 = new Account(3L,32000L,user3);
        Account account4 = new Account(4L,52000L,user4);
        Account account5 = new Account(5L,70000L,user5);
        Account account6 = new Account(6L,92000L,user4);

        Account[] accounts = { account1, account2, account3, account4, account5, account6 };
        AccountService service = new AccountServiceImpl(accounts);

        Account foundAccount = service.findAccountByOwnerId(4L);
        if (foundAccount != null) {
            System.out.println("Account found for owner id 4 with balance: " + foundAccount.getBalance());
        } else {
            System.out.println("No account found for owner id 4");
        }

        long counter = service.countAccountsWithBalanceGreaterThan(65000L);
        System.out.println("Number of accounts with balance greater than 65000: " + counter);
    }



}
