package com.mycompany.system.monitor;

import java.util.ArrayList;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.CentralProcessor.TickType;
import oshi.hardware.HardwareAbstractionLayer;

public class CPU {

    private CentralProcessor cpu;
    private long oldTicks[];
    
    public CPU() {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        this.cpu = hal.getProcessor();
        
        oldTicks = new long[TickType.values().length];
    }
    
    public List<Double> getCurrentFrequency() {
        ArrayList<Double> freqList = new ArrayList<>();
        
        for (Long freq : cpu.getCurrentFreq()) {
            freqList.add(freq / Math.pow(10, 9));
        }
        
        return freqList;
    }
    
    public Double getCurrentPercent() {
        double d = cpu.getSystemCpuLoadBetweenTicks(oldTicks);
        oldTicks = cpu.getSystemCpuLoadTicks();
        return d * 100.0;
    }
}
