package com.tws.refactoring.test;

import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {

    @Test
    void should_check_driver_adult(){
        assertTrue(new Police().checkDriverIsAdult(new Driver(18)));
        assertFalse(new Police().checkDriverIsAdult(new Driver(17)));
    }

}