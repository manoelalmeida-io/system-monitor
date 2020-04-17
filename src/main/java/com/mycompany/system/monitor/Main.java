package com.mycompany.system.monitor;

import com.mycompany.system.monitor.api.CPU;
import com.mycompany.system.monitor.api.Disk;
import com.mycompany.system.monitor.api.RAM;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Main extends javax.swing.JFrame {

    private CPU cpu = new CPU();
    private RAM ram = new RAM();
    private Disk disk = new Disk();
    
    /**
     * Creates new form Tela
     */
    public Main() {
        initComponents();
        
        List<String> mountPoints = disk.getDiskPaths();
        
        
        ActionListener action = (ActionEvent actionEvent) -> {
            lblCPU.setText(String.format("%.2fGhz", cpu.getCurrentFrequency()));
            lblCPU1.setText(String.format("%.2fGhz", cpu.getFrequency()));
            lblCPUPercent.setText(String.format("%.1f%%", cpu.getCurrentPercent()));
            
            lblRAM.setText(String.format("%.2fGB", ram.getUsedMemory()));
            lblRAM1.setText(String.format("%.2fGB", ram.getAvailableMemory()));
            lblRAMPercent.setText(String.format("%.1f%%", ram.getCurrentPercent()));
            
            File file = new File(mountPoints.get(0));
            lblMountPointDisk0.setText(mountPoints.get(0));
            lblTotalSpaceDisk0.setText(String.format("%.2fGB", file.getTotalSpace() / Math.pow(10, 9)));
            lblFreeSpaceDisk0.setText(String.format("%.2fGB", file.getFreeSpace() / Math.pow(10, 9)));

            if (mountPoints.size() > 1) {
                File file1 = new File(mountPoints.get(1));
                lblMountPointDisk1.setText(mountPoints.get(1));
                lblTotalSpaceDisk1.setText(String.format("%.2fGB", file1.getTotalSpace() / Math.pow(10, 9)));
                lblFreeSpaceDisk1.setText(String.format("%.2fGB", file1.getFreeSpace() / Math.pow(10, 9)));
            }
        };
        
        Timer timer = new Timer(1000, action);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCPUPercent = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cpuFreqPanel = new javax.swing.JPanel();
        lblCPU = new javax.swing.JLabel();
        lblCPU1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRAM = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblRAM1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblRAMPercent = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTotalSpaceDisk0 = new javax.swing.JLabel();
        lblFreeSpaceDisk0 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblTotalSpaceDisk1 = new javax.swing.JLabel();
        lblFreeSpaceDisk1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblMountPointDisk1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblMountPointDisk0 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnProcesses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel1.setText("CPU");

        lblCPUPercent.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        lblCPUPercent.setText("100.0%");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblCPU.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblCPU.setText("0,00 GHz");

        lblCPU1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblCPU1.setText("0,00 GHz");

        jLabel10.setText("Average");

        jLabel15.setText("Maximum");

        javax.swing.GroupLayout cpuFreqPanelLayout = new javax.swing.GroupLayout(cpuFreqPanel);
        cpuFreqPanel.setLayout(cpuFreqPanelLayout);
        cpuFreqPanelLayout.setHorizontalGroup(
            cpuFreqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpuFreqPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cpuFreqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblCPU)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cpuFreqPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCPU1)
                .addContainerGap())
        );
        cpuFreqPanelLayout.setVerticalGroup(
            cpuFreqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cpuFreqPanelLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCPU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCPU1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel2.setText("RAM");

        jLabel3.setText("used");

        lblRAM.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblRAM.setText("0.00 GB");

        jLabel5.setText("available");

        lblRAM1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblRAM1.setText("0.00 GB");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblRAMPercent.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        lblRAMPercent.setText("100.0%");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        jLabel4.setText("Disks");

        jLabel6.setText("Disk 0");

        jLabel7.setText("Total space:");

        jLabel8.setText("Free space:");

        lblTotalSpaceDisk0.setText("0");

        lblFreeSpaceDisk0.setText("0");

        jLabel11.setText("Disk 1");

        jLabel12.setText("Total space:");

        jLabel13.setText("Free space:");

        lblTotalSpaceDisk1.setText("0");

        lblFreeSpaceDisk1.setText("0");

        jLabel9.setText("Mount point: ");

        lblMountPointDisk1.setText("\\");

            jLabel14.setText("Mount point:");

            lblMountPointDisk0.setText("\\");

                btnInfo.setText("System Info");
                btnInfo.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnInfoActionPerformed(evt);
                    }
                });

                btnProcesses.setText("Processes");
                btnProcesses.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnProcessesActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpuFreqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(lblRAM)
                                            .addComponent(jLabel5)
                                            .addComponent(lblRAM1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCPUPercent)
                                    .addComponent(lblRAMPercent))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTotalSpaceDisk0))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFreeSpaceDisk0))
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTotalSpaceDisk1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFreeSpaceDisk1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMountPointDisk1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMountPointDisk0))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnInfo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProcesses)))
                        .addContainerGap(106, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCPUPercent)
                                            .addComponent(cpuFreqPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jSeparator1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblRAM)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblRAM1))
                                        .addComponent(jSeparator2))
                                    .addComponent(lblRAMPercent)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(lblTotalSpaceDisk0))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(lblFreeSpaceDisk0))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(lblMountPointDisk0))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(lblTotalSpaceDisk1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(lblFreeSpaceDisk1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(lblMountPointDisk1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInfo)
                            .addComponent(btnProcesses))
                        .addContainerGap())
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JFrame frame = new JFrame();
        frame.setContentPane(new Info());
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnProcessesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessesActionPerformed
        JFrame frame = new JFrame();
        frame.setContentPane(new Processes());
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_btnProcessesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnProcesses;
    private javax.swing.JPanel cpuFreqPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCPU;
    private javax.swing.JLabel lblCPU1;
    private javax.swing.JLabel lblCPUPercent;
    private javax.swing.JLabel lblFreeSpaceDisk0;
    private javax.swing.JLabel lblFreeSpaceDisk1;
    private javax.swing.JLabel lblMountPointDisk0;
    private javax.swing.JLabel lblMountPointDisk1;
    private javax.swing.JLabel lblRAM;
    private javax.swing.JLabel lblRAM1;
    private javax.swing.JLabel lblRAMPercent;
    private javax.swing.JLabel lblTotalSpaceDisk0;
    private javax.swing.JLabel lblTotalSpaceDisk1;
    // End of variables declaration//GEN-END:variables
}
