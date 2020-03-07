package com.galvanize.orm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class OrmTest {

    @Test
    public void blackBoxTestSaveAndLoad() {
        // Setup
        Orm orm = new Orm(new SuperComplexDriver());
        Object expected = "test";
        int id = expected.hashCode();

        // Setup & exercise
        orm.save(expected);
        Object actual = orm.get(id);

        // Assert
        assertEquals(expected, actual);
    }
}
