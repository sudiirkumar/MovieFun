import java.sql.*;
import javax.swing.*;
public class Login extends javax.swing.JFrame {
    public static String userEmail;
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        forgot_pswd = new javax.swing.JLabel();
        remember_pswd = new javax.swing.JCheckBox();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/phone.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 300));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 0, 41, 26));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 32, 306, 34));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 310, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("______________________________________________");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Email");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 78, 306, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("______________________________________________");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 104, 280, 34));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        hide.setForeground(new java.awt.Color(255, 255, 255));
        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hide.png"))); // NOI18N
        hide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
        });
        jPanel2.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 20));

        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/show.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, 20));

        forgot_pswd.setForeground(new java.awt.Color(204, 204, 204));
        forgot_pswd.setText("Forgot password?");
        forgot_pswd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_pswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_pswdMouseClicked(evt);
            }
        });
        jPanel2.add(forgot_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        remember_pswd.setBackground(new java.awt.Color(0, 0, 0));
        remember_pswd.setForeground(new java.awt.Color(204, 204, 204));
        remember_pswd.setText("Remember password");
        remember_pswd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(remember_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtuser.setBackground(new java.awt.Color(0, 0, 0));
        txtuser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtuser.setForeground(new java.awt.Color(255, 255, 255));
        txtuser.setBorder(null);
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 104, 280, -1));

        txtpass.setBackground(new java.awt.Color(0, 0, 0));
        txtpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setBorder(null);
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 280, 20));

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Don't have an account?");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 180, -1));

        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("SignUp");
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        jPanel2.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 120, -1));

        login_btn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        login_btn.setText("LOGIN");
        login_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        jPanel2.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 310, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 400, 300));

        setSize(new java.awt.Dimension(600, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        txtpass.requestFocus();
    }//GEN-LAST:event_txtuserActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        txtuser.requestFocus();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        txtpass.requestFocus();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
        txtpass.setEchoChar((char)0);
        hide.setVisible(false);
        hide.setEnabled(false);
        show.setVisible(true);
        show.setEnabled(true);
    }//GEN-LAST:event_hideMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        txtpass.setEchoChar((char)8226);
        show.setVisible(false);
        show.setEnabled(false);
        hide.setVisible(true);
        hide.setEnabled(true);
    }//GEN-LAST:event_showMouseClicked

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        userEmail = txtuser.getText();
        String password = new String(txtpass.getPassword());
        try{
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
            PreparedStatement st=(PreparedStatement)conn.prepareStatement("SELECT email,password from movie where email=? and password=?");
            st.setString(1, userEmail);
            st.setString(2, password);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
		super.dispose();
                JOptionPane.showMessageDialog(login_btn, "You have successfully logged in");
		new DashBoard().setVisible(true);
            }
            else
		JOptionPane.showMessageDialog(login_btn, "Incorrect password or username.");
        }
        catch(Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(login_btn, "Server Error");
        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void forgot_pswdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_pswdMouseClicked
        new Forgot().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_forgot_pswdMouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        new Signup().setVisible(true);
        wait(300);
        super.dispose();
    }//GEN-LAST:event_signupMouseClicked

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        login_btn.doClick();
    }//GEN-LAST:event_txtpassActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgot_pswd;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton login_btn;
    private javax.swing.JCheckBox remember_pswd;
    private javax.swing.JLabel show;
    private javax.swing.JLabel signup;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
