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
public class SearchTrainEmployee extends javax.swing.JPanel {

    /**
     * Creates new form SearchTrainEmployee
     */
    public SearchTrainEmployee() {
        initComponents();
        jPanelWrongIDTrain.setVisible(false);
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSuccessOrFail = new javax.swing.JLabel();
        jComboBoxLine = new javax.swing.JComboBox<>();
        jTextFieldID = new javax.swing.JTextField();
        jComboBoxOrigin = new javax.swing.JComboBox<>();
        jTextFieldSearchID = new javax.swing.JTextField();
        jComboBoxEnd = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxHour = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxday = new javax.swing.JComboBox<>();
        jComboBoxminute = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxyear = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxmonth = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelWrongIDTrain = new javax.swing.JPanel();
        jLabel55454 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelReset = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelSearch = new javax.swing.JLabel();

        setBackground(java.awt.SystemColor.controlDkShadow);

        jLabelSuccessOrFail.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabelSuccessOrFail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSuccessOrFail.setText("Search For Train ... !");

        jComboBoxLine.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxLine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLineActionPerformed(evt);
            }
        });

        jTextFieldID.setEditable(false);
        jTextFieldID.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jTextFieldID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldID.setBorder(null);

        jComboBoxOrigin.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxOrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOriginActionPerformed(evt);
            }
        });

        jTextFieldSearchID.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jTextFieldSearchID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSearchID.setBorder(null);
        jTextFieldSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchIDActionPerformed(evt);
            }
        });

        jComboBoxEnd.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

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

        jLabel5.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Search");

        jComboBoxHour.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel7.setFont(new java.awt.Font("Monotype Corsiva", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date");

        jComboBoxday.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jComboBoxminute.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxminute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Year");

        jLabel8.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Month");

        jLabel9.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Day");

        jLabel10.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hour");

        jComboBoxyear.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxyearActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Minute");

        jComboBoxmonth.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jComboBoxmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jPanelWrongIDTrain.setBackground(java.awt.SystemColor.controlDkShadow);

        jLabel55454.setFont(new java.awt.Font("Monotype Corsiva", 0, 18)); // NOI18N
        jLabel55454.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Cancel_20px.png"))); // NOI18N
        jLabel55454.setText("Wrong Search Key");

        javax.swing.GroupLayout jPanelWrongIDTrainLayout = new javax.swing.GroupLayout(jPanelWrongIDTrain);
        jPanelWrongIDTrain.setLayout(jPanelWrongIDTrainLayout);
        jPanelWrongIDTrainLayout.setHorizontalGroup(
            jPanelWrongIDTrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelWrongIDTrainLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel55454, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelWrongIDTrainLayout.setVerticalGroup(
            jPanelWrongIDTrainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWrongIDTrainLayout.createSequentialGroup()
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxLine, 0, 242, Short.MAX_VALUE)
                            .addComponent(jTextFieldID)
                            .addComponent(jComboBoxEnd, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxOrigin, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jTextFieldSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxday, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxHour, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabelSuccessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelWrongIDTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBoxminute, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSuccessOrFail)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanelWrongIDTrain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxOrigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxHour, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxminute, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxday, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void setPanel(Train x)
    {
        
        jTextFieldID.setText(""+x.GetID_Train());
        jComboBoxLine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { x.getLine() }));
        jComboBoxOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { x.getOriginPoint()}));
        jComboBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { x.getEndPoint() }));
        String Sepreted [] = x.getDate().split("#");
        jComboBoxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {   Sepreted[0]  }));
        jComboBoxmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {   Sepreted[1]  }));
        jComboBoxday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {   Sepreted[2]  }));
        jComboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {   Sepreted[3]  }));
        jComboBoxminute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {   Sepreted[4]  }));
        
    }
    private void jComboBoxLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLineActionPerformed
    private void ResetPanel()
    {
        jComboBoxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBoxmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxminute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        jTextFieldID.setText("");
        jTextFieldSearchID.setText("");
        jComboBoxLine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxOrigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jComboBoxEnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jPanelWrongIDTrain.setVisible(false);

    }
    private void jTextFieldSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchIDActionPerformed

    private void jComboBoxOriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOriginActionPerformed

    private void jComboBoxyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxyearActionPerformed

    private void jLabelResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseClicked
        // TODO add your handling code here:
        jLabelSuccessOrFail.setText("Search For Train ... !");
        ResetPanel();

    }//GEN-LAST:event_jLabelResetMouseClicked
    private void setColor(JPanel p)
    {
        p.setBackground(new java.awt.Color(0,64,128));
    }
    private void getColor(JPanel p)
    {
        p.setBackground(new java.awt.Color(105,105,105));
    }
    private void jLabelResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseEntered
        // TODO add your handling code here:
        setColor(jPanel2);
    }//GEN-LAST:event_jLabelResetMouseEntered

    private void jLabelResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelResetMouseExited
        // TODO add your handling code here:
        getColor(jPanel2);
    }//GEN-LAST:event_jLabelResetMouseExited

    private void jLabelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSearchMouseClicked
        // TODO add your handling code here:
        jPanelWrongIDTrain.setVisible(false);
        if(!jTextFieldSearchID.getText().equals(""))
        {
            if(new Validation().checkID(jTextFieldSearchID.getText())){
                Train t = new Train();
                Train x = t.getTrain(Integer.parseInt(jTextFieldSearchID.getText()));
                if(x!=null&&x.GetID_Train()>0){
                    setPanel(x);
                    jLabelSuccessOrFail.setText("Founded ...! :)");
                }
                else{
                        jLabelSuccessOrFail.setText("Not Found ...! :(");
                        JOptionPane.showMessageDialog(null, "Not Found ID Search ...!\n Try Again :(");
                        ResetPanel();
                    }
            }
            else{
                jLabelSuccessOrFail.setText("Not valid ID Search for Train :( ");
                JOptionPane.showMessageDialog(null, "Not valid ID Search Try Again :(\nHint: ID Search Length should more than 4 .. ;)");
                jPanelWrongIDTrain.setVisible(true);
            }
        }
        else{
        jLabelSuccessOrFail.setText("Missing Required ID Train ... !  Please, complete it before submit ...! :(");
        ResetPanel();
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxEnd;
    private javax.swing.JComboBox<String> jComboBoxHour;
    private javax.swing.JComboBox<String> jComboBoxLine;
    private javax.swing.JComboBox<String> jComboBoxOrigin;
    private javax.swing.JComboBox<String> jComboBoxday;
    private javax.swing.JComboBox<String> jComboBoxminute;
    private javax.swing.JComboBox<String> jComboBoxmonth;
    private javax.swing.JComboBox<String> jComboBoxyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanelWrongIDTrain;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldSearchID;
    // End of variables declaration//GEN-END:variables
}
