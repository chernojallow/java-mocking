package com.galvanize.mortgage;

import java.math.BigDecimal;

public class LoanApplicant {
    private BigDecimal downPayment;
    private BigDecimal requestedAmount;
    private BigDecimal monthlyGrossIncome;
    private BigDecimal monthlyDebtLoad;
    private int socialSecurityNumber;

    public LoanApplicant(BigDecimal downPayment, BigDecimal requestedAmount, BigDecimal monthlyGrossIncome, BigDecimal monthlyDebtLoad, int socialSecurityNumber) {
        this.downPayment = downPayment;
        this.requestedAmount = requestedAmount;
        this.monthlyGrossIncome = monthlyGrossIncome;
        this.monthlyDebtLoad = monthlyDebtLoad;
    }

    public BigDecimal getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(BigDecimal downPayment) {
        this.downPayment = downPayment;
    }

    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(BigDecimal requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public BigDecimal getMonthlyGrossIncome() {
        return monthlyGrossIncome;
    }

    public void setMonthlyGrossIncome(BigDecimal monthlyGrossIncome) {
        this.monthlyGrossIncome = monthlyGrossIncome;
    }

    public BigDecimal getMonthlyDebtLoad() {
        return monthlyDebtLoad;
    }

    public void setMonthlyDebtLoad(BigDecimal monthlyDebtLoad) {
        this.monthlyDebtLoad = monthlyDebtLoad;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(int socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
