package abstraction.task3;

public abstract class BankAccount {
    private String owner;
    private Integer balance;

    public abstract void deposit();
    public abstract void withdraw();
}
