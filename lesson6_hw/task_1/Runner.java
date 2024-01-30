package com.teachmeskills.lesson6_hw.task_1;

import com.teachmeskills.lesson6_hw.task_1.CreditCard;

public class Runner {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard( "2222",998);
        CreditCard card2 = new CreditCard( "3333",9);
        CreditCard card3 = new CreditCard( "1111",98);

        card1.cardInformation();
        card2.cardInformation();
        card3.cardInformation();

        card1.addMoney(10);
        card2.addMoney(1);
        card3.withdrawalMoney(100);

        card1.cardInformation();
        card2.cardInformation();
        card3.cardInformation();
    }
}
