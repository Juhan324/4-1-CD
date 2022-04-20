package com.sjh.fma.controller;

import java.util.List;

import com.sjh.fma.model.Hardware;
import com.sjh.fma.service.HardwareService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HardwareController {
    private HardwareService hardwareService;

    public HardwareController(HardwareService hardwareService) {
        this.hardwareService = hardwareService;
    }

    @RequestMapping(value="/hardware")
    public String AllHardware(Model model) {
        List<Hardware> allHardware = hardwareService.getAllHardwares();
        model.addAttribute("hardwarelist", allHardware);
        return "hardware";
    }
}
