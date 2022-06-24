package com.example.maintenancemonitorproj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaintenanceMonitorProjTest {
    MaintenanceMonitorProj tester = new MaintenanceMonitorProj();


    //Edge Cases:
    // 1)Numerische Werte;
    // 2)Leerzeichen;
    // 3)nicht lateinische Schrift-> Bsp:kyrillisch
    @Test
    void setTest1() {
        String expectedResult = "123";
        String result = tester.setMessage("123");
        assertEquals(expectedResult, result);
    }

    @Test
    void setTest2() {
        String expectedResult = "   ";
        String result = tester.setMessage("   ");
        assertEquals(expectedResult, result);
    }

    @Test
    void setTest3() {
        String expectedResult = "ћирилица";
        String result = tester.setMessage("ћирилица");
        assertEquals(expectedResult, result);


    }

    @Test
    void resetTest1() {
        String expectedResult = null;
        String result = tester.resetMessage();
        assertEquals(expectedResult, result);

    }

    @Test
    void deliverTest1() {
        String a = "hallo";
        tester.setMessage(a);
        String expectedResult = tester.resetMessage();

        String result = null;
        assertEquals(expectedResult, result);
    }

    @Test
    void deliverTest2() {
        String a = "hallo";
        tester.setMessage(a);
        tester.resetMessage();
        String b = "neue message";
        tester.setMessage(b);
        String expectedResult = tester.setMessage(b);

        String result = "neue message";
        assertEquals(expectedResult, result);
    }


}
