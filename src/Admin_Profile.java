/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Admin_Profile.java
 *
 * Created on Jul 11, 2014, 1:55:24 PM
 */

/**
 *
 * @author harsh
 */
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
public class Admin_Profile extends javax.swing.JFrame {

    /** Creates new form Admin_Profile */
    public Admin_Profile() {
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

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 110, 50, 20);

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 110, 90, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Profile");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 70, 80, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesEL8DZX3C.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 280, 60, 70);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Edit Profile");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 90, 110, 23);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Submit");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(240, 300, 90, 30);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/untitled.png"))); // NOI18N
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(360, 300, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("DOB             :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 200, 82, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Contact No. :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 170, 81, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Password     :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(230, 230, 83, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Email ID       :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 140, 90, 15);

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(330, 140, 120, 20);

        jTextField6.setEditable(false);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(330, 230, 120, 20);

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(330, 170, 120, 20);

        jTextField5.setEditable(false);
        jTextField5.setToolTipText("YYYY-MM-DD");
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(330, 200, 120, 20);

        jLabel9.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        jLabel9.setText("Welcome Administrator !");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(120, 10, 290, 39);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "    ", "Male", "Female" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(330, 260, 120, 20);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Show Profile");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(40, 140, 120, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Gender         :  ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(230, 260, 100, 15);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film-tree1.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-100, 0, 710, 420);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-602)/2, (screenSize.height-412)/2, 602, 412);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Admin_resources().setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton3.setEnabled(false);
        jTextField2.setEditable(true);
        jTextField3.setEditable(true);
        jTextField5.setEditable(true);
        jTextField6.setEditable(true);
        jComboBox1.setEditable(false);
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String email=jTextField2.getText();
String contact=jTextField3.getText();
String dob=jTextField5.getText();
String password=jTextField5.getText();

if(email.isEmpty()||contact.isEmpty()||dob.isEmpty()||password.isEmpty())
{
    JOptionPane.showMessageDialog(null,"please enter required information");
    
}
else
{
        try
        {
            jButton3.setEnabled(true);
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection
                    ("jdbc:mysql://localhost/theatre_management_system","root","");
            Statement stmt=con.createStatement();
            String name=jTextField1.getText();
            String Email=jTextField2.getText();
            String Contact=jTextField3.getText();
            String DOB=jTextField5.getText();
            String Password=jTextField6.getText();
            String q1="update admin_info set email_id='"+(email)+
              "',phone_no='"+(contact)+"',dob='"+(dob)+"',password='"+(password)+"' where admin_name='"+(name)+"';";
            stmt.executeUpdate(q1);
          JOptionPane.showMessageDialog(this, "Account successfully Updated!");
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(this, e.getMessage());
        }

}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String Name=jTextField1.getText();
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/theatre_management_system","root","");
            Statement stmt=(Statement)con.createStatement();
            String q1="Select password,phone_no,gender,email_id,dob from admin_info where Admin_name='"+Name+"';";
            ResultSet rs=stmt.executeQuery(q1);
            if(rs.next()){
                String password=rs.getString("password");
                String phone_no=rs.getString("phone_no");
                String gender=rs.getString("gender");
                String email_id=rs.getString("email_id");
                String dob=rs.getString("dob");
                jTextField3.setText(phone_no);
                jTextField2.setText(email_id);
                jTextField5.setText(dob);
                jTextField6.setText(password);
                jTextField1.setEditable(false);
                jButton6.setEnabled(false);
                jButton3.setEnabled(true);
                if(gender.matches("Male")){
                    jComboBox1.setSelectedIndex(1);} else{jComboBox1.setSelectedIndex(2);}}} catch (Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
                    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jComboBox1.setSelectedIndex(0);
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField6.setText("");   
        jComboBox1.setEditable(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
char kc=evt.getKeyChar();
     if(!((kc>='0' && kc<='9') || kc==KeyEvent.VK_BACK_SPACE || kc==KeyEvent.VK_DELETE))
     {
         JOptionPane.showMessageDialog(this, "Only Numeric Values Are Allowed!");
         evt.consume();
     }          
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
char kc=evt.getKeyChar();
     if(!((kc>='0' && kc<='9') || kc==KeyEvent.VK_BACK_SPACE || kc==KeyEvent.VK_DELETE))
     {
         JOptionPane.showMessageDialog(this, "Only Numeric Values Are Allowed!");
         evt.consume();
     }
     String st=jTextField3.getText();
     int b  = st.length();
     if(b>9)
     {
         JOptionPane.showMessageDialog(this, "You are exceeding the limit!");
         evt.consume();
     }            
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
     char kc=evt.getKeyChar();
     if(!((kc>='0' && kc<='9') || kc==KeyEvent.VK_BACK_SPACE || kc==KeyEvent.VK_DELETE||kc==KeyEvent.VK_MINUS))
     {
         JOptionPane.showMessageDialog(this, "Enter duration in the form hh:mm(e.g.02:35)!");
         evt.consume();
         jTextField5.setText("");
     }
    }//GEN-LAST:event_jTextField5KeyPressed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
