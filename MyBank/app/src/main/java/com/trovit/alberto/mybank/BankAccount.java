package com.trovit.alberto.mybank;

/**
 * Created by alberto on 06/01/15.
 */
public class BankAccount {
    private double mBalance;
    public static final double OVERDRAFT_FEE = 30;

    public void withdraw(double amount){
        mBalance -= amount;
        if(mBalance < 0){
            mBalance -= OVERDRAFT_FEE;
        }
    }
    public void deposit(double amount){
        mBalance += amount;
    }

    public double getBalance(){
        return mBalance;
    }
}
