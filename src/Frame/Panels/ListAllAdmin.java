/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame.Panels;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import train.ticket.reservation.system.Admin;

/**
 *
 * @author DELL
 */
public class ListAllAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ListAllAdmin
     */
    public ListAllAdmin() {
        initComponents();
        //AddRowsToJTable();
    }
    
    public void AddRowsToJTable()
    {
        resetTable();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object RowData[] = new Object[10];
        Admin ad = new Admin();
        ArrayList<Admin>admins=new ArrayList<Admin>();
        admins = ad.ListAdmins();
        for(Admin a : admins)
        {
            RowData[0]=a.GetID();
            RowData[1]=a.GetName();
            RowData[2]=a.GetUsername();
            RowData[3]=a.GetPassword();
            RowData[4]=a.GetEmail();
            RowData[5]=a.GetAge();
            RowData[6]=a.GetGender();
            RowData[7]=a.GetPhoneNo();
            RowData[8]=a.GetSalary();
            RowData[9]=a.GetQualification();
            model.addRow(RowData);
        }
        
    }
    private void resetTable()
     {
         try{
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            while(jTable1.getRowCount()>0){
                for(int i=0;i<jTable1.getRowCount();i++)
                    model.removeRow(i);
            }
            model.removeRow(0);
        }
        catch(Exception e)
        {
            ;
        }
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBackground(java.awt.SystemColor.controlDkShadow);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Monotype Corsiva", 0, 16)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "User Name", "Password", "E-Mail", "Age", "Gender", "Phone No.", "Salary", "Qualification"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
