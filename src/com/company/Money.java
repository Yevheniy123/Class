package com.company;
public class Money {
    private int valuts;
    private int curs;
    public int result;
          public Money (int valuts, int curs) {
              this.result=valuts*curs;
    }
    public String toString() {
        return "\nВы получите: "+this.result+" грн";
    }
}
