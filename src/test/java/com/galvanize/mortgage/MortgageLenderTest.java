
package com.galvanize.mortgage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
    @ExtendWith(MockitoExtension.class)
    class MortgageLenderTest {
        @Test
        void lenderApprovesCreditWorthyApplicants_Manual() throws Exception {
            // Create new MortgageLender instance
            MortgageLender mortgageLender = new MortgageLender(new CreditAnalyzer() {
                @Override
                public int getCreditScore(int socialSecurityNumber) throws InterruptedException {
                    return 602;
                }
            });
            LoanApplicant applicant = new LoanApplicant( BigDecimal.valueOf(1000),  BigDecimal.valueOf(2000),  BigDecimal.valueOf(5000),  BigDecimal.valueOf(2500),  123456789);
            assertEquals(true, mortgageLender.doesApplicantQualify(applicant));
        }
        @Test
        void lenderApprovesCreditWorthApplicants_Mockito() throws Exception {
            MortgageLender mockLender = mock(MortgageLender.class);
            LoanApplicant applicant = new LoanApplicant( BigDecimal.valueOf(1000),  BigDecimal.valueOf(2000),  BigDecimal.valueOf(5000),  BigDecimal.valueOf(2500),  123456789);
            when(mockLender.doesApplicantQualify(applicant)).thenReturn(true);
            assertEquals(true, mockLender.doesApplicantQualify(applicant));
        }
    }
