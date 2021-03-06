


import java.sql.*;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Movie_list.java
 *
 * Created on Jul 8, 2014, 7:20:35 PM
 */

/**
 *
 * @author sd
 */
public class Movie_list extends javax.swing.JFrame {

    /** Creates new form Movie_list */
    public Movie_list() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setIconImages(null);
        getContentPane().setLayout(null);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Action", "Love Story", "Adventure", "Horror", "Animated", "Comedy" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(6, 120, 80, 130);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Type");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 40, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No.", "Movie Code", "Name", "Sequel", "Director", "Publisher", "Duration"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 80, 640, 190);

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        jLabel1.setText("All Movies In The Theatre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 10, 283, 39);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(563, 380, 80, 23);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(651, 380, 80, 23);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Click here!");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Decided to buy a movie?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(310, 280, 173, 82);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract-high-tech-background-vector-19785678.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-290, -170, 1050, 600);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-760)/2, (screenSize.height-448)/2, 760, 448);
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        String table=(String)jList1.getSelectedValue();

        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();

        if(jList1.getSelectedIndex()==0) {
            try {
                int rows=model.getRowCount();
                if(rows>0) {
                    for(int i=0;i<rows;i++) {
                        model.removeRow(0);
                    }
                }
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost/Theatre_Management_System","root","");
                Statement stmt=con.createStatement();
                String Tno= (String)jList1.getSelectedValue();
                String q1="select * from movie where movie_code like 'ac%';";
                ResultSet rs=stmt.executeQuery(q1);
                while(rs.next()) {
                    String sno=rs.getString("S_no");
                    String mc=rs.getString("Movie_Code");
                    String name=rs.getString("Name");
                    String sequel=rs.getString("Sequel");
                    String direc=rs.getString("Director");
                    String pub=rs.getString("Publisher");
                    String durat=rs.getString("Duration");
                    model.addRow(new Object[]{sno,mc,name,sequel,direc,pub,durat});
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

        else if(jList1.getSelectedIndex()==1) {
            try {
                int rows=model.getRowCount();
                if(rows>0) {
                    for(int i=0;i<rows;i++) {
                        model.removeRow(0);
                    }
                }
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost/Theatre_Management_System","root","");
                Statement stmt=con.createStatement();
                String Tno= (String)jList1.getSelectedValue();
                String q1="select * from movie where movie_code like 'ls%';";
                ResultSet rs=stmt.executeQuery(q1);
                while(rs.next()) {
                    String sno=rs.getString("S_no");
                    String mc=rs.getString("Movie_Code");
                    String name=rs.getString("Name");
                    String sequel=rs.getString("Sequel");
                    String direc=rs.getString("Director");
                    String pub=rs.getString("Publisher");
                    String durat=rs.getString("Duration");
                    model.addRow(new Object[]{sno,mc,name,sequel,direc,pub,durat});
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

        else if(jList1.getSelectedIndex()==2) {
            try {
                int rows=model.getRowCount();
                if(rows>0) {
                    for(int i=0;i<rows;i++) {
                        model.removeRow(0);
                    }
                }
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost/Theatre_Management_System","root","");
                Statement stmt=con.createStatement();
                String Tno= (String)jList1.getSelectedValue();
                String q1="select * from movie where movie_code like 'ad%';";
                ResultSet rs=stmt.executeQuery(q1);
                while(rs.next()) {
                    String sno=rs.getString("S_no");
                    String mc=rs.getString("Movie_Code");
                    String name=rs.getString("Name");
                    String sequel=rs.getString("Sequel");
                    String direc=rs.getString("Director");
                    String pub=rs.getString("Publisher");
                    String durat=rs.getString("Duration");
                    model.addRow(new Object[]{sno,mc,name,sequel,direc,pub,durat});
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

        else if(jList1.getSelectedIndex()==3) {
            try {
                int rows=model.getRowCount();
                if(rows>0) {
                    for(int i=0;i<rows;i++) {
                        model.removeRow(0);
                    }
                }
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost/Theatre_Management_System","root","");
                Statement stmt=con.createStatement();
                String Tno= (String)jList1.getSelectedValue();
                String q1="select * from movie where movie_code like 'h%';";
                ResultSet rs=stmt.executeQuery(q1);
                while(rs.next()) {
                    String sno=rs.getString("S_no");
                    String mc=rs.getString("Movie_Code");
                    String name=rs.getString("Name");
                    String sequel=rs.getString("Sequel");
                    String direc=rs.getString("Director");
                    String pub=rs.getString("Publisher");
                    String durat=rs.getString("Duration");
                    model.addRow(new Object[]{sno,mc,name,sequel,direc,pub,durat});
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

        else if(jList1.getSelectedIndex()==4) {
            try {
                int rows=model.getRowCount();
                if(rows>0) {
                    for(int i=0;i<rows;i++) {
                        model.removeRow(0);
                    }
                }
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost/Theatre_Management_System","root","");
                Statement stmt=con.createStatement();
                String Tno= (String)jList1.getSelectedValue();
                String q1="select * from movie where movie_code like 'AN%';";
                ResultSet rs=stmt.executeQuery(q1);
                while(rs.next()) {
                    String sno=rs.getString("S_no");
                    String mc=rs.getString("Movie_Code");
                    String name=rs.getString("Name");
                    String sequel=rs.getString("Sequel");
                    String direc=rs.getString("Director");
                    String pub=rs.getString("Publisher");
                    String durat=rs.getString("Duration");
                    model.addRow(new Object[]{sno,mc,name,sequel,direc,pub,durat});
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }

        else if(jList1.getSelectedIndex()==5) {
            try {
                int rows=model.getRowCount();
                if(rows>0) {
                    for(int i=0;i<rows;i++) {
                        model.removeRow(0);
                    }
                }
                Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost/Theatre_Management_System","root","");
                Statement stmt=con.createStatement();
                String Tno= (String)jList1.getSelectedValue();
                String q1="select * from movie where movie_code like 'c%';";
                ResultSet rs=stmt.executeQuery(q1);
                while(rs.next()) {
                    String sno=rs.getString("S_no");
                    String mc=rs.getString("Movie_Code");
                    String name=rs.getString("Name");
                    String sequel=rs.getString("Sequel");
                    String direc=rs.getString("Director");
                    String pub=rs.getString("Publisher");
                    String durat=rs.getString("Duration");
                    model.addRow(new Object[]{sno,mc,name,sequel,direc,pub,durat});
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
}//GEN-LAST:event_jList1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int rows= model.getRowCount();
        if(rows>0) {
            for(int i=0;i<rows;i++) {
                model.removeRow(0);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new User_resources().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
if(jList1.getSelectedIndex()== -1)
{
    JOptionPane.showMessageDialog(this, "Please select the movie type. ");
}
else
{
        new Buy_movie_user().setVisible(true);
        this.setVisible(false);
}
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Movie_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
