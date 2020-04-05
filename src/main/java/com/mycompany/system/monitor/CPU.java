package com.mycompany.system.monitor;

import java.util.ArrayList;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

public class CPU {

    private CentralProcessor cpu;
    
    public CPU() {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        this.cpu = hal.getProcessor();
    }
    
    public List<Double> getCurrentFrequency() {
        ArrayList<Double> freqList = new ArrayList<>();
        
        for (Long freq : cpu.getCurrentFreq()) {
            freqList.add(freq / Math.pow(10, 9));
        }
        
        return freqList;
    }
    
    public Double getCurrentPercent() {
        Long sum = 0L;
        Long sumMax = 0L;
        
        for (Long freq : cpu.getCurrentFreq()) {
            sum += freq;
            sumMax += cpu.getMaxFreq();
        }
        
        return (sum * 100.0) / sumMax;
    }
}
