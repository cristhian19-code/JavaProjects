/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pcca1
 */
public class FrmGamarra extends javax.swing.JFrame {

    /**
     * Creates new form FrmGamarra
     */
    public FrmGamarra() {
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panel1 = new java.awt.Panel();
        bnt2 = new javax.swing.JButton();
        bnt4 = new javax.swing.JButton();
        bnt3 = new javax.swing.JButton();
        bnt1 = new javax.swing.JButton();
        bnt25 = new javax.swing.JButton();
        bnt26 = new javax.swing.JButton();
        bnt27 = new javax.swing.JButton();
        bnt28 = new javax.swing.JButton();
        bnt29 = new javax.swing.JButton();
        bnt30 = new javax.swing.JButton();
        bnt31 = new javax.swing.JButton();
        bnt32 = new javax.swing.JButton();
        bnt34 = new javax.swing.JButton();
        bnt35 = new javax.swing.JButton();
        bnt36 = new javax.swing.JButton();
        bnt37 = new javax.swing.JButton();
        bnt38 = new javax.swing.JButton();
        bnt39 = new javax.swing.JButton();
        bnt40 = new javax.swing.JButton();
        bnt41 = new javax.swing.JButton();
        bnt42 = new javax.swing.JButton();
        bnt43 = new javax.swing.JButton();
        bnt44 = new javax.swing.JButton();
        bnt33 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gamarra");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bnt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt2.setText("Stand #02");
        bnt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt2ActionPerformed(evt);
            }
        });

        bnt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt4.setText("Stand #03");
        bnt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt4ActionPerformed(evt);
            }
        });

        bnt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt3.setText("Stand #04");
        bnt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt3ActionPerformed(evt);
            }
        });

        bnt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt1.setText("Stand #01");
        bnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt1ActionPerformed(evt);
            }
        });

        bnt25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt25.setText("Stand #05");
        bnt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt25ActionPerformed(evt);
            }
        });

        bnt26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt26.setText("Stand #06");
        bnt26.setToolTipText("");
        bnt26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt26ActionPerformed(evt);
            }
        });

        bnt27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt27.setText("Stand #07");
        bnt27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt27ActionPerformed(evt);
            }
        });

        bnt28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt28.setText("Stand #08");
        bnt28.setToolTipText("");
        bnt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt28ActionPerformed(evt);
            }
        });

        bnt29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt29.setText("Stand #09");
        bnt29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt29ActionPerformed(evt);
            }
        });

        bnt30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt30.setText("Stand #10");
        bnt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt30ActionPerformed(evt);
            }
        });

        bnt31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt31.setText("Stand #11");
        bnt31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt31ActionPerformed(evt);
            }
        });

        bnt32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt32.setText("Stand #12");
        bnt32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt32ActionPerformed(evt);
            }
        });

        bnt34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt34.setText("Stand #14");
        bnt34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt34ActionPerformed(evt);
            }
        });

        bnt35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt35.setText("Stand #15");
        bnt35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt35ActionPerformed(evt);
            }
        });

        bnt36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt36.setText("Stand #16");
        bnt36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt36ActionPerformed(evt);
            }
        });

        bnt37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt37.setText("Stand #17");
        bnt37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt37ActionPerformed(evt);
            }
        });

        bnt38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt38.setText("Stand #18");
        bnt38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt38ActionPerformed(evt);
            }
        });

        bnt39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt39.setText("Stand #19");
        bnt39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt39ActionPerformed(evt);
            }
        });

        bnt40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt40.setText("Stand #20");
        bnt40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt40ActionPerformed(evt);
            }
        });

        bnt41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt41.setText("Stand #21");
        bnt41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt41ActionPerformed(evt);
            }
        });

        bnt42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt42.setText("Stand #22");
        bnt42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt42ActionPerformed(evt);
            }
        });

        bnt43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt43.setText("Stand #23");
        bnt43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt43ActionPerformed(evt);
            }
        });

        bnt44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt44.setText("Stand #24");
        bnt44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt44ActionPerformed(evt);
            }
        });

        bnt33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Market.png"))); // NOI18N
        bnt33.setText("Stand #13");
        bnt33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(bnt41)
                        .addGap(0, 0, 0)
                        .addComponent(bnt42)
                        .addGap(0, 0, 0)
                        .addComponent(bnt43)
                        .addGap(0, 0, 0)
                        .addComponent(bnt44))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(bnt29)
                                .addGap(0, 0, 0)
                                .addComponent(bnt30)
                                .addGap(0, 0, 0)
                                .addComponent(bnt31)
                                .addGap(0, 0, 0)
                                .addComponent(bnt32))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                    .addComponent(bnt25)
                                    .addGap(0, 0, 0)
                                    .addComponent(bnt26)
                                    .addGap(0, 0, 0)
                                    .addComponent(bnt27)
                                    .addGap(0, 0, 0)
                                    .addComponent(bnt28))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(bnt1)
                                    .addGap(0, 0, 0)
                                    .addComponent(bnt2)
                                    .addGap(0, 0, 0)
                                    .addComponent(bnt4)
                                    .addGap(0, 0, 0)
                                    .addComponent(bnt3))))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(bnt33)
                            .addGap(0, 0, 0)
                            .addComponent(bnt34)
                            .addGap(0, 0, 0)
                            .addComponent(bnt35)
                            .addGap(0, 0, 0)
                            .addComponent(bnt36))
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(bnt37)
                            .addGap(0, 0, 0)
                            .addComponent(bnt38)
                            .addGap(0, 0, 0)
                            .addComponent(bnt39)
                            .addGap(0, 0, 0)
                            .addComponent(bnt40))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt39, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Logo Gamarra_1.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt1ActionPerformed
        try {
            FrmStand1 frm1 = new FrmStand1();
            frm1.setLocationRelativeTo(null);
            frm1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt1ActionPerformed

    private void bnt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt2ActionPerformed
        try {
            FrmStand2 frm2 = new FrmStand2();
            frm2.setLocationRelativeTo(null);
            frm2.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt2ActionPerformed

    private void bnt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt3ActionPerformed
        try {
            FrmStand4 frm4 = new FrmStand4();
            frm4.setLocationRelativeTo(null);
            frm4.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt3ActionPerformed

    private void bnt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt4ActionPerformed
        try {
            FrmStand3 frm3 = new FrmStand3();
            frm3.setLocationRelativeTo(null);
            frm3.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt4ActionPerformed

    private void bnt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt25ActionPerformed
        try {
            FrmStand5 frm5 = new FrmStand5();
            frm5.setLocationRelativeTo(null);
            frm5.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt25ActionPerformed

    private void bnt26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt26ActionPerformed
        try {
            FrmStand6 frm6 = new FrmStand6();
            frm6.setLocationRelativeTo(null);
            frm6.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt26ActionPerformed

    private void bnt27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt27ActionPerformed
        try {
            FrmStand7 frm7 = new FrmStand7();
            frm7.setLocationRelativeTo(null);
            frm7.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt27ActionPerformed

    private void bnt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt28ActionPerformed
        try {
            FrmStand8 frm8 = new FrmStand8();
            frm8.setLocationRelativeTo(null);
            frm8.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_bnt28ActionPerformed

    private void bnt29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt29ActionPerformed
        try {
            FrmStand9 frm9 = new FrmStand9();
            frm9.setLocationRelativeTo(null);
            frm9.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt29ActionPerformed

    private void bnt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt30ActionPerformed
        try {
            FrmStand10 frm10 = new FrmStand10();
            frm10.setLocationRelativeTo(null);
            frm10.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt30ActionPerformed

    private void bnt31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt31ActionPerformed
        try {
            FrmStand11 frm11 = new FrmStand11();
            frm11.setLocationRelativeTo(null);
            frm11.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt31ActionPerformed

    private void bnt32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt32ActionPerformed
        try {
            FrmStand12 frm12 = new FrmStand12();
            frm12.setLocationRelativeTo(null);
            frm12.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt32ActionPerformed

    private void bnt33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt33ActionPerformed
        try {
            FrmStand13 frm13 = new FrmStand13();
            frm13.setLocationRelativeTo(null);
            frm13.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt33ActionPerformed

    private void bnt34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt34ActionPerformed
        try {
            FrmStand14 frm14 = new FrmStand14();
            frm14.setLocationRelativeTo(null);
            frm14.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt34ActionPerformed

    private void bnt35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt35ActionPerformed
        try {
            FrmStand15 frm15 = new FrmStand15();
            frm15.setLocationRelativeTo(null);
            frm15.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt35ActionPerformed

    private void bnt36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt36ActionPerformed
        try {
            FrmStand16 frm16 = new FrmStand16();
            frm16.setLocationRelativeTo(null);
            frm16.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt36ActionPerformed

    private void bnt37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt37ActionPerformed
        try {
            FrmStand17 frm17 = new FrmStand17();
            frm17.setLocationRelativeTo(null);
            frm17.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt37ActionPerformed

    private void bnt38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt38ActionPerformed
        try {
            FrmStand18 frm18 = new FrmStand18();
            frm18.setLocationRelativeTo(null);
            frm18.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt38ActionPerformed

    private void bnt39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt39ActionPerformed
        try {
            FrmStand19 frm19 = new FrmStand19();
            frm19.setLocationRelativeTo(null);
            frm19.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt39ActionPerformed

    private void bnt40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt40ActionPerformed
        try {
            FrmStand20 frm20 = new FrmStand20();
            frm20.setLocationRelativeTo(null);
            frm20.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt40ActionPerformed

    private void bnt41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt41ActionPerformed
        try {
            FrmStand21 frm21 = new FrmStand21();
            frm21.setLocationRelativeTo(null);
            frm21.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt41ActionPerformed

    private void bnt42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt42ActionPerformed
        try {
            FrmStand22 frm22 = new FrmStand22();
            frm22.setLocationRelativeTo(null);
            frm22.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt42ActionPerformed

    private void bnt43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt43ActionPerformed
        try {
            FrmStand23 frm23 = new FrmStand23();
            frm23.setLocationRelativeTo(null);
            frm23.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt43ActionPerformed

    private void bnt44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt44ActionPerformed
        try {
            FrmStand24 frm24 = new FrmStand24();
            frm24.setLocationRelativeTo(null);
            frm24.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmGamarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bnt44ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGamarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGamarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGamarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGamarra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGamarra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt1;
    private javax.swing.JButton bnt2;
    private javax.swing.JButton bnt25;
    private javax.swing.JButton bnt26;
    private javax.swing.JButton bnt27;
    private javax.swing.JButton bnt28;
    private javax.swing.JButton bnt29;
    private javax.swing.JButton bnt3;
    private javax.swing.JButton bnt30;
    private javax.swing.JButton bnt31;
    private javax.swing.JButton bnt32;
    private javax.swing.JButton bnt33;
    private javax.swing.JButton bnt34;
    private javax.swing.JButton bnt35;
    private javax.swing.JButton bnt36;
    private javax.swing.JButton bnt37;
    private javax.swing.JButton bnt38;
    private javax.swing.JButton bnt39;
    private javax.swing.JButton bnt4;
    private javax.swing.JButton bnt40;
    private javax.swing.JButton bnt41;
    private javax.swing.JButton bnt42;
    private javax.swing.JButton bnt43;
    private javax.swing.JButton bnt44;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}