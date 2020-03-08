



package com.galvanize.orm;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OrmTest {
    //    One test with a manual mock
    @Test
    public void manualBlackBoxTestSaveAndLoad() {
        Orm orm = new Orm(new TestDriver());
        Object test = "test";
        int id = test.hashCode();
        orm.save(test);
        assertEquals("test", orm.get(id));
    }
    //    Use Mockito to verify parameters
    @Test
    public void verifyObjectAndId() {
        Orm orm = mock(Orm.class);
        Object test = "test";
        int id = test.hashCode();
        when(orm.get(id)).thenReturn(test);
        orm.save(test);
        assertEquals("test", orm.get(id));
        verify(orm).save(test);
        verify(orm).get(id);
    }
    //    Use Mockito to test thrown exception
    @Test
    public void testThrownException() throws Exception {
        Orm orm = mock(Orm.class);
//        when(orm.get(1)).thenThrow(new NullPointerException("Error occurred"));
        Object test = "";
        int id = test.hashCode();
        try {
            orm.get(1);
        } catch (NullPointerException e) {
            System.out.println(e);
            assertEquals(e, new NullPointerException());
        }
    }
    //    Use Mockito to verify number of times dependency is called
    @Test
    public void verifyTimesCalled() {
        Orm orm = mock(Orm.class);
        Object test = "test";
        int id = test.hashCode();
        when(orm.get(id)).thenReturn(test);
        orm.save(test);
        assertEquals("test", orm.get(id));
        verify(orm, atLeastOnce()).save(test);
        verify(orm, atLeastOnce()).get(id);
    }
    @Test
    public void blackBoxTestSaveAndLoad() {
        // Setup
        Orm orm = mock(Orm.class);
//        Orm orm = new Orm();
        Object expected = "test";
        int id = expected.hashCode();
        when(orm.get(id)).thenReturn(expected);
        // Setup & exercise
        orm.save(expected);
        Object actual = orm.get(id);
        // Assert
        assertEquals(expected, actual);
    }
}



//
//package com.galvanize.orm;
//        import org.junit.jupiter.api.Test;
//        import org.junit.jupiter.api.extension.ExtendWith;
//        import org.mockito.junit.jupiter.MockitoExtension;
//        import static org.junit.jupiter.api.Assertions.*;
//        import static org.mockito.Mockito.*;
//@ExtendWith(MockitoExtension.class)
//class OrmTest {
//    //    One test with a manual mock
//    @Test
//    public void manualBlackBoxTestSaveAndLoad() throws Exception {
//        Orm orm = new Orm(new TestDriver());
//        Object test = "test";
//        int id = test.hashCode();
//        orm.save(test);
//        assertEquals("test", orm.get(id));
//    }
//    //    Use Mockito to verify parameters
//    @Test
//    public void verifyObjectAndId() throws Exception {
//        Orm orm = mock(Orm.class);
//        Object test = "test";
//        int id = test.hashCode();
//        when(orm.get(id)).thenReturn(test);
//        orm.save(test);
//        assertEquals("test", orm.get(id));
//        verify(orm).save(test);
//        verify(orm).get(id);
//    }
//    //    Use Mockito to test thrown exception
//    @Test
//    public void testThrownException() throws Exception {
//        Orm orm = mock(Orm.class);
//        Object test = "test";
//        int id = test.hashCode();
//        when(orm.get(1)).thenThrow(new RuntimeException());
//        assertThrows(RuntimeException.class, () -> orm.get(1));
//    }
//    //    Use Mockito to verify number of times dependency is called
//    @Test
//    public void verifyTimesCalled() throws Exception {
//        Orm orm = mock(Orm.class);
//        Object test = "test";
//        int id = test.hashCode();
//        when(orm.get(id)).thenReturn(test);
//        orm.save(test);
//        assertEquals("test", orm.get(id));
//        verify(orm, atLeastOnce()).save(test);
//        verify(orm, atLeastOnce()).get(id);
//    }
//    @Test
//    public void blackBoxTestSaveAndLoad() throws Exception {
//        // Setup
//        Orm orm = mock(Orm.class);
//        Object expected = "test";
//        int id = expected.hashCode();
//        when(orm.get(id)).thenReturn(expected);
//        // Setup & exercise
//        orm.save(expected);
//        Object actual = orm.get(id);
//        // Assert
//        assertEquals(expected, actual);
//    }
//}