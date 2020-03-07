package com.galvanize.mortgage;

interface CreditAnalyzer {
    public int getCreditScore (int socialSecurityNumber) throws InterruptedException;
}
