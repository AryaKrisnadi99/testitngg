package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAccountTest {
    @Test
    public void checkDeposit(){
        BankAccount bankAccount = new BankAccount();
        double actual = bankAccount.deposit(10000);
        Assert.assertEquals(actual, 10000);
    }


    @Test
    public void checkWithDrawIF() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.amount = 5000;
        double a = bankAccount.amount;
        double b = bankAccount.withdraw(15000);

        if (a < b) {
            Assert.assertEquals(a<b, "Insufficient Balance");
        }
    }

    @Test
    public void checkWithDrawELSE() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.amount = 15000;
        double a = bankAccount.amount;
        double b = bankAccount.withdraw(5000);
        if (a > b) {
            a-=b;
            Assert.assertEquals(a>b, "You withdrawn "+a+" from your bank account");
        }
    }

}
