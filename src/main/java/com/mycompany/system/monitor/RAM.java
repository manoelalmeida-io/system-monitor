package com.mycompany.system.monitor;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;

public class RAM {

    GlobalMemory ram;
    
    public RAM() {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        this.ram = hal.getMemory();
    }
    
    public Double getUsedMemory() {
        return (ram.getTotal() - ram.getAvailable()) / Math.pow(10, 9);
    }
    
    public Double getAvailableMemory() {
        return ram.getAvailable() / Math.pow(10, 9);
    }
    
    public Double getCurrentPercent() {
        Long total = ram.getTotal();
        Long used = total - ram.getAvailable();
        
        return (used * 100.0) / total;
    }
}
