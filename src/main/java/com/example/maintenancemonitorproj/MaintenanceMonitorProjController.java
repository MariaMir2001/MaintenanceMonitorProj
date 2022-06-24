package com.example.maintenancemonitorproj;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorProjController {
    MaintenanceMonitorProj a = new MaintenanceMonitorProj();

    @RequestMapping("/set")
    public String setMessage(@RequestParam String input) {
        return a.setMessage(input);
    }

    @RequestMapping("/reset")
    public String resetMessage() {
        return a.resetMessage();
    }

}
