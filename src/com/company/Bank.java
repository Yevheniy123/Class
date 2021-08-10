package com.company;

public class Bank {
    private int money;
    private String info;

    public Bank (int money) {
        this.setMoney(money);
        this.info=info;
    }



    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        if (money > 700) {
            this.money = money-700;
            this.info ="Переплата в размере: ";
        }
        else if (money == 700)
        {
            this.money = 0;
            this.info ="Отсутстиве долга! ";
        }
        else if (money < 700)
        {
            this.money=Math.abs(700-money);
            this.info ="Долг в размере: ";
        }
    }

    public String toString() {
        return  this.info  + this.money+" грн.";
    }
}
