package com.example.maintenancemonitorproj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaintenanceMonitorProjTest {
    MaintenanceMonitorProj tester=new MaintenanceMonitorProj();


    //Edge Cases:
    // 1)Numerische Werte;
    // 2)Leerzeichen;
    // 3)nicht lateinische Schrift-> Bsp:kyrillisch
    @Test
    void setTest1(){
        String expectedResult="123";
        String result=tester.setMessage("123");
        assertEquals(expectedResult,result);
    }

    @Test
    void setTest2(){
        String expectedResult="   ";
        String result=tester.setMessage("   ");
        assertEquals(expectedResult,result);
    }

    @Test
    void setTest3(){
        String expectedResult="ћирилица";
        String result=tester.setMessage("ћирилица");
        assertEquals(expectedResult,result);


    }

}
