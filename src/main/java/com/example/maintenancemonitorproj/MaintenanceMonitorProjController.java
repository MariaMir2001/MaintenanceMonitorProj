package com.example.maintenancemonitorproj;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin
public class MaintenanceMonitorProjController {
    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
    MaintenanceMonitorProj a = new MaintenanceMonitorProj();

    @RequestMapping("/set")
    public String setMessage(@RequestParam String input) {
        return a.setMessage(input);
    }

    @RequestMapping("/reset")
    public String resetMessage() {
        return a.resetMessage();
    }

    @RequestMapping("/deliver")
    public String deliverMessage() {
        return a.deliverMessage();
    }




}
