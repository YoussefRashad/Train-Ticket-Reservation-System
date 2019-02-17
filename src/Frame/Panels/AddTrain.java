/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.Panels;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import train.ticket.reservation.system.Train;
import train.ticket.reservation.system.Validation;

/**
 *
 * @author DELL
 */
public class AddTrain extends javax.swing.JPanel {

    /**
     * Creates new form AddTrain
     */
    public AddTrain() {
        initComponents();
        jPanelWrongID.setVisible(false);
        jPanelNotAllowed.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendarDemo1 = new com.toedter.calendar.demo.JCalendarDemo();
        jCalendarTheme1 = new com.toedter.plaf.JCalendarTheme();
        jCalendarTheme2 = new com.toedter.plaf.JCalendarTheme();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        yearMonthDay1 = new org.joda.time.YearMonthDay();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jComboBoxSelectLine = new javax.swing.JComboBox<>();
        jComboBoxOrigin = new javax.swing.JComboBox<>();
        jComboBoxEnd = new javax.swing.JComboBox<>();
        jLabelSuccessOrFail = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxyear = new javax.swing.JComboBox<>();
        jComboBoxmonth = new javax.swing.JComboBox<>();
        jComboBoxHour = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxday = new javax.swing.JComboBox<>();
        jComboBoxminute = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelWrongID = new javax.swing.JPanel();
        jLabel12121 = new javax.swing.JLabel();
        jPanelNotAllowed = new javax.swing.JPanel();
        jLabelNotAllawed = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanelProcess = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanelReset = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        javax.swing.GroupLayout jCalendarDemo1Layout = new javax.swing.GroupLayout(jCalendarDemo1.getContentPane());
        jCalendarDemo1.getContentPane().setLayout(jCalendarDemo1Layout);
        jCalendarDemo1Layout.setHorizontalGroup(
            jCalendarDemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jCalendarDemo1Layout.setVerticalGroup(
            jCalendarDemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(java.awt.SystemColor.controlDkShadow);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Train");

        jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Line");

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Origin Point");

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("End Point");

        jTextFieldID.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jTextFieldID.setBorder(null);

        jComboBoxSelectLine.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxSelectLine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Line 1", "Line 2", "Line 3" }));
        jComboBoxSelectLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectLineActionPerformed(evt);
            }
        });

        if(jComboBoxSelectLine.getSelectedItem().equals("Line 1"))
        jComboBoxOrigin.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{}));
        jComboBoxOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOriginActionPerformed(evt);
            }
        });

        jComboBoxEnd.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBoxEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEndActionPerformed(evt);
            }
        });

        jLabelSuccessOrFail.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabelSuccessOrFail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuccessOrFail.setText("Add New Train .. !");

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date");

        jComboBoxyear.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18" , "19" , "21" , "22" }));
        jComboBoxyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxyearActionPerformed(evt);
            }
        });

        jComboBoxmonth.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10","11","12" }));

        jComboBoxHour.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","00" }));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Year");

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Month");

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Day");

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hour");

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Minute");

        jComboBoxday.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31" }));

        jComboBoxminute.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxminute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60" }));

        jPanelWrongID.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabel12121.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel12121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_20px.png"))); // NOI18N
        jLabel12121.setText("Wrong ID");

        javax.swing.GroupLayout jPanelWrongIDLayout = new javax.swing.GroupLayout(jPanelWrongID);
        jPanelWrongID.setLayout(jPanelWrongIDLayout);
        jPanelWrongIDLayout.setHorizontalGroup(
            jPanelWrongIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWrongIDLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel12121, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelWrongIDLayout.setVerticalGroup(
            jPanelWrongIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWrongIDLayout.createSequentialGroup()
                .addComponent(jLabel12121)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelNotAllowed.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabelNotAllawed.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabelNotAllawed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_20px.png"))); // NOI18N
        jLabelNotAllawed.setText("Not Allowed");

        javax.swing.GroupLayout jPanelNotAllowedLayout = new javax.swing.GroupLayout(jPanelNotAllowed);
        jPanelNotAllowed.setLayout(jPanelNotAllowedLayout);
        jPanelNotAllowedLayout.setHorizontalGroup(
            jPanelNotAllowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNotAllowedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNotAllawed, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelNotAllowedLayout.setVerticalGroup(
            jPanelNotAllowedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNotAllowedLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelNotAllawed))
        );

        jLabel21.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Reset");

        jLabel20.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("ADD");

        jPanelProcess.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Process_96px.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelProcessLayout = new javax.swing.GroupLayout(jPanelProcess);
        jPanelProcess.setLayout(jPanelProcessLayout);
        jPanelProcessLayout.setHorizontalGroup(
            jPanelProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcessLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelProcessLayout.setVerticalGroup(
            jPanelProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelReset.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Reset_96px.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelResetLayout = new javax.swing.GroupLayout(jPanelReset);
        jPanelReset.setLayout(jPanelResetLayout);
        jPanelResetLayout.setHorizontalGroup(
            jPanelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResetLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel13)
                .addGap(0, 0, 0))
        );
        jPanelResetLayout.setVerticalGroup(
            jPanelResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSuccessOrFail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxday, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxminute, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(217, 217, 217))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxOrigin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(362, 362, 362))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxSelectLine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldID)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jPanelWrongID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelNotAllowed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanelProcess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSuccessOrFail)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelWrongID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNotAllowed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxSelectLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jComboBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxHour, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxminute, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxday, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelProcess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSelectLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectLineActionPerformed
        // TODO add your handling code here:
         if(jComboBoxSelectLine.getSelectedItem().equals("Line 1")){
                jComboBoxOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"El Shohadaa","Ahmed Orabi","Naser","Saddat","Saad Zaghlol","El Sayeda Zeinb","El Malk El Saled","Mari Gargis","El Zahraa","Dar El Salam","Haddayk El Maadi","El Maadi","Thakant El Maadi","Tora El Balad","Kozzika","Tora Al-Asmant","El Maasara","Hadayaa Helwan","Wadi Hoof","Helwan University","Ain Helwan","Helwan"}));
                jComboBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"El Shohadaa","Ahmed Orabi","Naser","Saddat","Saad Zaghlol","El Sayeda Zeinb","El Malk El Saled","Mari Gargis","El Zahraa","Dar El Salam","Haddayk El Maadi","El Maadi","Thakant El Maadi","Tora El Balad","Kozzika","Tora Al-Asmant","El Maasara","Hadayaa Helwan","Wadi Hoof","Helwan University","Ain Helwan","Helwan"}));
         }
        else if(jComboBoxSelectLine.getSelectedItem().equals("Line 2")){
                jComboBoxOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Shubra","Koleyet El Zeraat","El Mazallat","El Khalafawi","St. Teresa","Rod El Farag","Massara","El Shohadaa","Atatba","M.Naguib","Saddat","Dokki","El Bohoos","Cairo University","Faysal","Giza","Omm El Misryeen","Sakiat Mekki","El Monib"}));
                jComboBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Shubra","Koleyet El Zeraat","El Mazallat","El Khalafawi","St. Teresa","Rod El Farag","Massara","El Shohadaa","Atatba","M.Naguib","Saddat","Dokki","El Bohoos","Cairo University","Faysal","Giza","Omm El Misryeen","Sakiat Mekki","El Monib"}));
        }
         else if(jComboBoxSelectLine.getSelectedItem().equals("Line 3")){
                jComboBoxOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Al Ahram","Koleyet El Banat","Cairo Stadium","Cairo Fairgrounds","Abbassiya","Abdou Pasha","El Geish","Bab El Shaaria","Atatba"}));
                jComboBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Al Ahram","Koleyet El Banat","Cairo Stadium","Cairo Fairgrounds","Abbassiya","Abdou Pasha","El Geish","Bab El Shaaria","Atatba"}));
         }
    }//GEN-LAST:event_jComboBoxSelectLineActionPerformed

    private void jComboBoxEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxEndActionPerformed

    private void jComboBoxOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOriginActionPerformed

    private void jComboBoxyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxyearActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
       
        jPanelWrongID.setVisible(false);
        jPanelNotAllowed.setVisible(false);
        
        if(!jTextFieldID.getText().equals("")){
            Validation v = new Validation();
            if(v.checkID(jTextFieldID.getText())){
                Train t = new Train();
                if(!t.Dublicate(Integer.parseInt(jTextFieldID.getText()))){
                    t.SetID_Train(Integer.parseInt(jTextFieldID.getText()));
                    t.SetLine(jComboBoxSelectLine.getSelectedItem().toString() );
                    t.setOriginPoint(jComboBoxOrigin.getSelectedItem().toString());
                    t.setEndPoint(jComboBoxEnd.getSelectedItem().toString());
                    String date = jComboBoxyear.getSelectedItem().toString()+"#"+jComboBoxmonth.getSelectedItem().toString()+"#"+jComboBoxday.getSelectedItem().toString()
                            +"#"+jComboBoxHour.getSelectedItem().toString()+"#"+jComboBoxminute.getSelectedItem().toString()+"#";
                    t.SetDate(date);

                        if(t.AddTrain()){
                            ResetPanel();
                            jLabelSuccessOrFail.setText("Added Successufully ... ! :)");
                        }
                        else 
                            jLabelSuccessOrFail.setText("Failed Insert ... ! :(");
                    }
                else{
                    jLabelSuccessOrFail.setText("Not Allowed New ID Train :(");
                    jPanelNotAllowed.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Not Allowed ID Train , ID Train is Reserved...!\n Try Again :(");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Not valid ID Try Again :(\nHint: ID Length should more than 4 .. ;)");
                jPanelWrongID.setVisible(true);
            }
        }
        else
            jLabelSuccessOrFail.setText("Missing Required Fields ... !  Please, complete them before submit ...! :(");
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        // TODO add your handling code here:
        setColor(jPanelProcess);
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        // TODO add your handling code here:
        getColor(jPanelProcess);
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        ResetPanel();
        jLabelSuccessOrFail.setText("Add New Train .. !");
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        setColor(jPanelReset);
    }//GEN-LAST:event_jLabel13MouseEntered
    private void setColor(JPanel p)
    {
        p.setBackground(new java.awt.Color(0,64,128));
    }
    private void getColor(JPanel p)
    {
        p.setBackground(new java.awt.Color(105,105,105));
    }
    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        getColor(jPanelReset);
    }//GEN-LAST:event_jLabel13MouseExited

    private void ResetPanel()
    {
        jTextFieldID.setText("");
        jComboBoxSelectLine.setSelectedIndex(0);
        jComboBoxEnd.setSelectedIndex(0);
        jComboBoxOrigin.setSelectedIndex(0);
        jComboBoxHour.setSelectedIndex(0);
        jComboBoxday.setSelectedIndex(0);
        jComboBoxyear.setSelectedIndex(0);
        jComboBoxmonth.setSelectedIndex(0);
        jComboBoxminute.setSelectedIndex(0);
        jPanelWrongID.setVisible(false);
        jPanelNotAllowed.setVisible(false);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.demo.JCalendarDemo jCalendarDemo1;
    private com.toedter.plaf.JCalendarTheme jCalendarTheme1;
    private com.toedter.plaf.JCalendarTheme jCalendarTheme2;
    private javax.swing.JComboBox<String> jComboBoxEnd;
    private javax.swing.JComboBox<String> jComboBoxHour;
    private javax.swing.JComboBox<String> jComboBoxOrigin;
    private javax.swing.JComboBox<String> jComboBoxSelectLine;
    private javax.swing.JComboBox<String> jComboBoxday;
    private javax.swing.JComboBox<String> jComboBoxminute;
    private javax.swing.JComboBox<String> jComboBoxmonth;
    private javax.swing.JComboBox<String> jComboBoxyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12121;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNotAllawed;
    private javax.swing.JLabel jLabelSuccessOrFail;
    private javax.swing.JPanel jPanelNotAllowed;
    private javax.swing.JPanel jPanelProcess;
    private javax.swing.JPanel jPanelReset;
    private javax.swing.JPanel jPanelWrongID;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldID;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private org.joda.time.YearMonthDay yearMonthDay1;
    // End of variables declaration//GEN-END:variables
}