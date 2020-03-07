package com.galvanize.mortgage;

class MortgageLender {
    /**
     * Checks for applicant credit score over 600 and monthly income greater than montly debt
     * @param applicant
     * @return
     */
    public boolean doesApplicantQualify(LoanApplicant applicant) throws Exception {
        CreditAnalyzer creditAnalyzer = new CreditAnalyzer();
        int creditScore = creditAnalyzer.getCreditScore(applicant.getSocialSecurityNumber());

        return creditScore > 600 && (applicant.getMonthlyGrossIncome().compareTo(applicant.getMonthlyDebtLoad()) == 1);

    }
}
