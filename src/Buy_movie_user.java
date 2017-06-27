/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Buy_movie_user.java
 *
 * Created on Dec 18, 2014, 4:48:35 PM
 */
/**
 *
 * @author sd
 */

import javax.swing.DefaultListModel;
import java.sql.*;
import javax.swing.JOptionPane;
public class Buy_movie_user extends javax.swing.JFrame {

    /** Creates new form Buy_movie_user */
    public Buy_movie_user() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buy a movie!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 10, 160, 39);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<none>", "Action", "Love Story", "Adventure", "Horror", "Animated", "Comedy" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(180, 360, 150, 20);

        jList1.setModel(new DefaultListModel());
        jList1.setEnabled(false);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 410, 258, 130);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Movie Type:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 360, 134, 20);

        jButton1.setText("Calculate Price");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 80, 120, 23);

        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(560, 80, 110, 20);

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(340, 160, 70, 23);

        jButton3.setText("Generate Bill");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 200, 110, 23);

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(570, 250, 70, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-280, -10, 1020, 750);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-737)/2, (screenSize.height-594)/2, 737, 594);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
       
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        DefaultListModel L=(DefaultListModel)jList1.getModel();
        String type=(String)jComboBox1.getSelectedItem();
        
       if(jComboBox1.getSelectedIndex()==0)
       {     L.clear();
        }
        if(jComboBox1.getSelectedIndex()==1)
       {     L.clear();
        try
            { Class.forName("java.sql.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theatre_management_system","root","");
              Statement stmt=con.createStatement();
              String q="select Name from movie where Movie_Code like 'AC%';";
             ResultSet rs=stmt.executeQuery(q);
             while(rs.next()){L.addElement(rs.getString("Name"));}
               }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }}
        if(jComboBox1.getSelectedIndex()==2)
       {     L.clear();
        try
            { Class.forName("java.sql.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theatre_management_system","root","");
              Statement stmt=con.createStatement();
              
               String q="select Name from movie where Movie_Code like 'LS%';";
             ResultSet rs=stmt.executeQuery(q);
             while(rs.next()){L.addElement(rs.getString("Name"));}
               }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }}
        if(jComboBox1.getSelectedIndex()==3)
       {     L.clear();
        try
            { Class.forName("java.sql.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theatre_management_system","root","");
              Statement stmt=con.createStatement();
               String q="select Name from movie where Movie_Code like 'AD%';";
             ResultSet rs=stmt.executeQuery(q);
             while(rs.next()){L.addElement(rs.getString("Name"));}
               }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }}
        if(jComboBox1.getSelectedIndex()==4)
       {     L.clear();
        try
            { Class.forName("java.sql.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theatre_management_system","root","");
              Statement stmt=con.createStatement();
             String q="select Name from movie where Movie_Code like 'H%';";
             ResultSet rs=stmt.executeQuery(q);
             while(rs.next()){L.addElement(rs.getString("Name"));}
               }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }}
        if(jComboBox1.getSelectedIndex()==5)
       {     L.clear();
        try
            { Class.forName("java.sql.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theatre_management_system","root","");
              Statement stmt=con.createStatement();
              String q="select Name from movie where Movie_Code like 'AN%';";
             ResultSet rs=stmt.executeQuery(q);
             while(rs.next()){L.addElement(rs.getString("Name"));}
               }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }}
        if(jComboBox1.getSelectedIndex()==6)
       {     L.clear();
        try
            { Class.forName("java.sql.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost/theatre_management_system","root","");
              Statement stmt=con.createStatement();
              String q="select Name from movie where Movie_code like 'c%';";
             ResultSet rs=stmt.executeQuery(q);
             while(rs.next()){L.addElement(rs.getString("Name"));}
               }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }}
       jList1.setEnabled(true);

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(jComboBox1.getSelectedIndex()==0)
       {JOptionPane.showMessageDialog(this, "select a type");}
    if(jList1.isSelectionEmpty())
        {JOptionPane.showMessageDialog(this, "select a movie");}
        int m=jList1.getSelectedIndex();
        int costm=200;
        int c=costm;
        jTextField1.setText(String.valueOf(c));
        jList1.setEnabled(false);
                jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String type=(String)jComboBox1.getSelectedItem();
        String movie=(String)jList1.getSelectedValue();
        String cost=jTextField1.getText();
        new Bill_Report().setVisible(true);
        String user=Login_user.jTextField1.getText();
        Bill_Report.jTextField1.setText(user);
        Bill_Report.jTextField2.setText(movie);
        Bill_Report.jTextField3.setText(type);
        Bill_Report.jTextField4.setText(cost);

        this.setVisible(false);

            try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection
                    ("jdbc:mysql://localhost/theatre_management_system","root","");
            Statement stmt= con.createStatement();
            String q1="insert into movie_purchases values('"+(user)+"','"+(movie)+"','"+(type)+"','"+(cost)+"');";
            stmt.executeUpdate(q1);
         }
        catch(Exception e)
        {

        JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        jTextField1.setText("");
        jComboBox1.setSelectedIndex(0);
     DefaultListModel L=(DefaultListModel)jList1.getModel();
        L.clear();
        jButton1.setEnabled(false);
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

   jButton1.setEnabled(true);

    }//GEN-LAST:event_jList1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            new Movie_list().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Buy_movie_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
