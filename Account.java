package BankApp;

public class Account {
    private int accno;
    private static int saccno=001;
    private String name;
    private int bal;


    public Account(String name, int bal) {
        this.accno=saccno++;
        this.name = name;
        this.bal = bal;
    }
    public int getAccno() {
        return accno;
    }
    public void setAccno(int accno) {
        this.accno = accno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBal() {
        return bal;
    }
    public void setBal(int bal) {
        this.bal = bal;
    }
    @Override
    public String toString() {
        return "[Account_Number= ACC00" + accno + " |  Name=" + name + " |  Balance=" + bal + "]";
    }

}
