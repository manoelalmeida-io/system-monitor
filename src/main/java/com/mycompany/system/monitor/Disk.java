package com.mycompany.system.monitor;

import java.util.ArrayList;
import java.util.List;
import oshi.SystemInfo;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HWPartition;
import oshi.hardware.HardwareAbstractionLayer;

public class Disk {
    private HWDiskStore[] disks;

    public Disk() {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        this.disks = hal.getDiskStores();
    }
    
    public List<String> getDiskPaths() {
        List<String> mountPoints = new ArrayList<>();
        
        for (HWDiskStore disk : disks) {
            for (HWPartition partitions : disk.getPartitions()) {
                if (!partitions.getMountPoint().equals(""))
                    mountPoints.add(partitions.getMountPoint());
            }
        }
        
        return mountPoints;
    }
}
