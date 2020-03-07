package com.galvanize.mortgage;

import java.util.concurrent.TimeUnit;

class Experian implements CreditAnalyzer {
    public int getCreditScore (int socialSecurityNumber) throws InterruptedException {
        TimeUnit.SECONDS.sleep(5L);
        return socialSecurityNumber + 500;
    }
}
