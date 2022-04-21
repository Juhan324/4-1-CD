package com.sjh.fma.service;

import java.util.List;

import com.sjh.fma.dao.HardwareMapper;
import com.sjh.fma.model.Hardware;

import org.springframework.stereotype.Service;

@Service
public class HardwareService {
    private HardwareMapper hardwareMapper;

    public HardwareService(HardwareMapper hardwareMapper) {
        this.hardwareMapper = hardwareMapper;
    }

    // 멤버 전체 조회
    public List<Hardware> getAllHardwares() {
        final List<Hardware> hardwareList = hardwareMapper.findAll();
        return hardwareList;
    }
}
