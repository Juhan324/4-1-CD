package com.sjh.fma.controller;

import java.util.List;

import com.sjh.fma.model.Hardware;
import com.sjh.fma.service.HardwareService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HardwareController {
    private HardwareService hardwareService;

    public HardwareController(HardwareService hardwareService) {
        this.hardwareService = hardwareService;
    }

    @GetMapping("/hardware")
    public String AllHardware(Model model) {
        List<Hardware> allHardware = hardwareService.getAllHardwares();
        model.addAttribute("hardwarelist", allHardware);
        return "hardware";
    }
    
    @PostMapping(value="/hardware/data")
    public String insertHardware(@RequestParam("speed") int speed, @RequestParam("error") int error, @RequestParam("output") int output,Model model) {
        hardwareService.insertHardware(speed, error, output);
        System.out.println(speed +" "+ error +" "+ output);
    	return "hardware";
    }
}