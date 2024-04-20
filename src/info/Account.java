package info;

public class Account {
    private String name;
    private double value;
    private int account;
    
    public Account(String name, double value, int account) {
        this.name = name;
        this.value = value;
        this.account = account;
    }

    public double addValue(double value){
        return this.value += value;
    }

    public double removeValue(double value){
        return this.value -= value;
    }

    public String toString(){
        return "NEW DATA: \nNAME: "
        + name + " | ACCOUNT:"
        + account + " | VALUE: R$ "
        + value;
    }
}
