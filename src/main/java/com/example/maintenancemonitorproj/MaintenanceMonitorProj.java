package com.example.maintenancemonitorproj;

public class MaintenanceMonitorProj {
    String input;


    public String setMessage( String input) {
        return this.input = input;
    }

    public String resetMessage() {
        input = null;
        return input;
    }

    public String deliverMessage() {
        return input;
    }


}
