/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.Panels;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import train.ticket.reservation.system.Ticket;
import train.ticket.reservation.system.Validation;

/**
 *
 * @author DELL
 */
public class Search_DeleteTicket extends javax.swing.JPanel {

    /**
     * Creates new form SearchTicket
     */
    public Search_DeleteTicket() {
        initComponents();
        jPanelWrongIDTicket.setVisible(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldIDTicket = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldIDSearch = new javax.swing.JTextField();
        jLabelSuccessOrFail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxLine = new javax.swing.JComboBox<>();
        jComboBoxSource = new javax.swing.JComboBox<>();
        jComboBoxDistination = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSalary = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelWrongIDTicket = new javax.swing.JPanel();
        jLabel55454 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelReset = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelSearch = new javax.swing.JLabel();
        jPanelNo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanelYes = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.controlDkShadow);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name Of Passenger");

        jTextFieldName.setEditable(false);
        jTextFieldName.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldName.setBorder(null);
        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone No.");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Ticket");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Source");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("E-Mail");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Distination");

        jTextFieldEmail.setEditable(false);
        jTextFieldEmail.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jTextFieldPhone.setEditable(false);
        jTextFieldPhone.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPhone.setBorder(null);

        jTextFieldIDTicket.setEditable(false);
        jTextFieldIDTicket.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldIDTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIDTicket.setBorder(null);

        jTextFieldIDSearch.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jTextFieldIDSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIDSearch.setBorder(null);

        jLabelSuccessOrFail.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSuccessOrFail.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabelSuccessOrFail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuccessOrFail.setText("Search Info of Ticket ... !");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Ticket");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Are you sure To Cancel This Ticket ?!");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Line");

        jComboBoxLine.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxLine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLineActionPerformed(evt);
            }
        });

        jComboBoxSource.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxSource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jComboBoxDistination.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxDistination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salary");

        jTextFieldSalary.setEditable(false);
        jTextFieldSalary.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldSalary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSalary.setBorder(null);
        jTextFieldSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalaryActionPerformed(evt);
            }
        });

        jPanelWrongIDTicket.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabel55454.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55454.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel55454.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_20px.png"))); // NOI18N
        jLabel55454.setText("Wrong Search Key");

        javax.swing.GroupLayout jPanelWrongIDTicketLayout = new javax.swing.GroupLayout(jPanelWrongIDTicket);
        jPanelWrongIDTicket.setLayout(jPanelWrongIDTicketLayout);
        jPanelWrongIDTicketLayout.setHorizontalGroup(
            jPanelWrongIDTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWrongIDTicketLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55454)
                .addContainerGap())
        );
        jPanelWrongIDTicketLayout.setVerticalGroup(
            jPanelWrongIDTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWrongIDTicketLayout.createSequentialGroup()
                .addComponent(jLabel55454)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Reset");

        jLabel19.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Search");

        jPanel2.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabelReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Reset_96px.png"))); // NOI18N
        jLabelReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelResetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelResetMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelReset, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );

        jPanel1.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabelSearch.setBackground(java.awt.SystemColor.controlDkShadow);
        jLabelSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Search_96px.png"))); // NOI18N
        jLabelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSearchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
        );

        jPanelNo.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_96px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelNoLayout = new javax.swing.GroupLayout(jPanelNo);
        jPanelNo.setLayout(jPanelNoLayout);
        jPanelNoLayout.setHorizontalGroup(
            jPanelNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(0, 0, 0))
        );
        jPanelNoLayout.setVerticalGroup(
            jPanelNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelYes.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ok_96px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelYesLayout = new javax.swing.GroupLayout(jPanelYes);
        jPanelYes.setLayout(jPanelYesLayout);
        jPanelYesLayout.setHorizontalGroup(
            jPanelYesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelYesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(0, 0, 0))
        );
        jPanelYesLayout.setVerticalGroup(
            jPanelYesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelYesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelSuccessOrFail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextFieldIDTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBoxSource, javax.swing.GroupLayout.Alignment.TRAILING, 0, 250, Short.MAX_VALUE)
                                        .addComponent(jComboBoxDistination, javax.swing.GroupLayout.Alignment.TRAILING, 0, 250, Short.MAX_VALUE)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(jTextFieldSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                    .addComponent(jComboBoxLine, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanelWrongIDTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                        .addComponent(jTextFieldIDSearch))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jPanelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanelYes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelSuccessOrFail)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldIDSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanelWrongIDTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIDTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDistination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelYes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void setPanel(Ticket x)
    {
        jTextFieldName.setText(""+x.GetName());
        jTextFieldEmail.setText(""+x.GetEmail());
        jTextFieldIDTicket.setText(""+x.GetIDTicket());
        jTextFieldPhone.setText(""+x.GetPhoneNo());
        jTextFieldSalary.setText(""+x.PriceOFTicket(x.getLine(),x.GetSource(),x.GetDistantion()));
        jComboBoxLine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { x.getLine() }));
        jComboBoxSource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { x.GetSource()}));
        jComboBoxDistination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { x.GetDistantion()}));
        
    }
    private void jTextFieldSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalaryActionPerformed

    private void jComboBoxLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLineActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jComboBoxLineActionPerformed

    private void jLabelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseClicked
        // TODO add your handling code here:
        jLabelSuccessOrFail.setText("Search Info of Ticket ... !");
        resetPanel();

    }//GEN-LAST:event_jLabelResetMouseClicked

    private void jLabelResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseEntered
        // TODO add your handling code here:
        setColor(jPanel2);
    }//GEN-LAST:event_jLabelResetMouseEntered
    private void setColor(JPanel p)
    {
        p.setBackground(new java.awt.Color(0,64,128));
    }
    private void getColor(JPanel p)
    {
        p.setBackground(new java.awt.Color(105,105,105));
    }
    private void jLabelResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseExited
        // TODO add your handling code here:
        getColor(jPanel2);
    }//GEN-LAST:event_jLabelResetMouseExited

    private void jLabelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseClicked
        // TODO add your handling code here:
                
        
        jPanelWrongIDTicket.setVisible(false);
        
        if(!jTextFieldIDSearch.getText().equals("")){
            if(new Validation().checkID(jTextFieldIDSearch.getText())){
                Ticket t = new Ticket();
                Ticket x = t.getTicket(Integer.parseInt(jTextFieldIDSearch.getText()));
                if(x!=null&&x.GetIDTicket()>0){
                    setPanel(x);
                    jLabelSuccessOrFail.setText("Founded ...! :)");
                }
                else{
                            jLabelSuccessOrFail.setText("Not Found ...! :(");
                            JOptionPane.showMessageDialog(null, "Not Found ID Ticket ...!\n Try Again :(");
                            resetPanel();
                        }
            }
            else{
                JOptionPane.showMessageDialog(null, "Not valid ID Ticket Try Again :(\nHint: ID Ticket Length should more than 4 .. ;)");
                jPanelWrongIDTicket.setVisible(true);
            }
        }
        else{
            jLabelSuccessOrFail.setText("Missing Required Fields ... ! Please Fill All Fields :(");
            resetPanel();
        }

    }//GEN-LAST:event_jLabelSearchMouseClicked

    private void jLabelSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseEntered
        // TODO add your handling code here:
        setColor(jPanel1);
    }//GEN-LAST:event_jLabelSearchMouseEntered

    private void jLabelSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseExited
        // TODO add your handling code here:
        getColor(jPanel1);
    }//GEN-LAST:event_jLabelSearchMouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
                
        
        jPanelWrongIDTicket.setVisible(false);
        
        if(!jTextFieldEmail.getText().equals("") && !jTextFieldIDSearch.getText().equals("") && !jTextFieldIDTicket.getText().equals("") && !jTextFieldName.getText().equals("") && !jTextFieldPhone.getText().equals("") && !jTextFieldSalary.getText().equals(""))
        {
            Validation v = new Validation();
            if(v.checkID(jTextFieldIDSearch.getText())){
                Ticket t = new Ticket();
                if(t.CancelTicket(Integer.parseInt(jTextFieldIDSearch.getText()))){
                    jLabelSuccessOrFail.setText("Deleted Successfully ...! :)");
                    resetPanel();
                }
                else{
                        jLabelSuccessOrFail.setText("Not Found ...! :(");
                        JOptionPane.showMessageDialog(null, "Not Found ID Ticket ...!\n Try Again :(");
                        resetPanel();
                    } // Start Elses
            }
            else{
                JOptionPane.showMessageDialog(null, "Not valid ID Ticket Try Again :(\nHint: ID Ticket Length should more than 4 .. ;)");
                jPanelWrongIDTicket.setVisible(true);
            }           
        }
        else
            jLabelSuccessOrFail.setText("Missing required ID Ticket ... !  Please, complete it before submit ...! :(");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        if(!jTextFieldIDSearch.getText().equals("")){
            jLabelSuccessOrFail.setText("you are cancelling The Operation of deleted Ticket :)");
            resetPanel();
        }
        else
            jLabelSuccessOrFail.setText("Missing required ID Ticket ... !");
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
        // TODO add your handling code here:
        jPanelYes.setBackground(Color.green);
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        getColor(jPanelYes);
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
        jPanelNo.setBackground(Color.red);
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        // TODO add your handling code here:
        getColor(jPanelNo);
    }//GEN-LAST:event_jLabel12MouseExited
    private void resetPanel()
    {
        jTextFieldName.setText("");
        jTextFieldEmail.setText("");
        jTextFieldIDSearch.setText("");
        jTextFieldIDTicket.setText("");
        jTextFieldPhone.setText("");
        jTextFieldSalary.setText("");
        jComboBoxLine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxDistination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxSource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        
        jPanelWrongIDTicket.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxDistination;
    private javax.swing.JComboBox<String> jComboBoxLine;
    private javax.swing.JComboBox<String> jComboBoxSource;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55454;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelReset;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelSuccessOrFail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelNo;
    private javax.swing.JPanel jPanelWrongIDTicket;
    private javax.swing.JPanel jPanelYes;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIDSearch;
    private javax.swing.JTextField jTextFieldIDTicket;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSalary;
    // End of variables declaration//GEN-END:variables
}
