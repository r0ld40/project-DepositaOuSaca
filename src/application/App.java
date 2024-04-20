package application;

import info.Account;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double value = 0;

        System.out.print("NAME: ");
        String name = sc.nextLine();
        System.out.print("ACCOUNT: ");
        int account = sc.nextInt();

        Account acc = new Account(name, value, account);

        boolean bool = true;

        while(bool == true){

            System.out.print("DEPOSIT(1) OR WITHDRAW(2) [FOR NOTHING INPUT 0]? [ 1 / 2 ] ");
            int status = sc.nextInt();

            if(status == 1){
                System.out.print("DEPOSIT VALUE: R$ ");
                value = sc.nextDouble();
                acc.addValue(value);

                System.out.print(acc);
            } else if(status == 2){
                System.out.print("WITHDRAW VALUE: R$ ");
                value = sc.nextDouble();
                acc.removeValue(value);

                System.out.print(acc);
            } else if(status == 0){
                System.out.println("OPERATION CANCELED");
                System.out.println(acc);
            } else {
                System.out.println("[ERRO] VALUE ERROR");
            };

            System.out.print("\nREPEAT? [ YES(1)/NO(2) ] ");
            int loop = sc.nextInt();
            
            if(loop == 2){
                bool = false;
            } else if(loop == 1){
                bool = true;
            } else {
                System.out.println("[ERROR] VALUE ERROR");
            }
        }
    
        sc.close();
    }
}
