//package com.galvanize.calculator;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.*;
//
//
//import org.mockito.junit.jupiter.MockitoExtension;
//
//@ExtendWith(MockitoExtension.class)
//class CalculatorTest {
//    Calculator calculator = null;
//
//    // Set up calculator object
//    @BeforeEach
//    public void setUp() {
//        calculator = new Calculator();
//    }
//
//    @Test
//    public void testAdd() throws Exception {
//
//        assertEquals(10, calculator.perform(2, 3));
//    }
//}




package com.galvanize.calculator;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import org.junit.jupiter.api.extension.ExtendWith;
        import static org.junit.jupiter.api.Assertions.*;
        import static org.mockito.Mockito.*;
        import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class CalculatorTest {
    Calculator calculator = null;
    // Manual
    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator(new CloudService() {
            // Manual Mock of the Cloud Service so we can focus on implementation of service rather than service itself.
            @Override
            public int add(int i, int j) throws Exception {
                return i + j;
            }
        });
        assertEquals(calculator.perform(1,2),3);
    }
    @Test
    public void testAddWithMockito() throws Exception {
        calculator = mock(Calculator.class);
        when(calculator.perform(1,2)).thenReturn(3);
        assertEquals(3, calculator.perform(1, 2));
    }
}
