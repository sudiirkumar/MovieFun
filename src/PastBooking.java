
import java.sql.*;
public class PastBooking extends javax.swing.JFrame {
    public PastBooking() {
        initComponents();
        try{
            Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
            PreparedStatement st = (PreparedStatement)conn.prepareStatement("SELECT * from tickets where name = ? and email = ? ORDER BY balance");
            st.setString(1, DashBoard.user_name);
            st.setString(2, DashBoard.user_email);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                movie.setText(rs.getString("moviename"));
                theater.setText(rs.getString("theater"));
                time.setText(rs.getString("showtime"));
                ticket.setText(rs.getString("ticket"));
            }
        }
        catch(Exception ex){
            System.out.print(ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        movie = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        theater = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ticket = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setSize(new java.awt.Dimension(600, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setBackground(new java.awt.Color(0, 0, 0));
        welcome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("Past Booking");
        welcome.setOpaque(true);
        jPanel1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 21, 210, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, -1));

        movie.setBackground(new java.awt.Color(0, 0, 0));
        movie.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        movie.setForeground(new java.awt.Color(255, 255, 255));
        movie.setText("--------");
        jPanel1.add(movie, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 260, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Movie Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, -1));

        theater.setBackground(new java.awt.Color(0, 0, 0));
        theater.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        theater.setForeground(new java.awt.Color(255, 255, 255));
        theater.setText("--------");
        jPanel1.add(theater, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 260, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Theater:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, -1));

        time.setBackground(new java.awt.Color(0, 0, 0));
        time.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("--------");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 260, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 260, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Number of tickets:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, -1));

        ticket.setBackground(new java.awt.Color(0, 0, 0));
        ticket.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ticket.setForeground(new java.awt.Color(255, 255, 255));
        ticket.setText("--------");
        jPanel1.add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 260, -1));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 41, 26));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        setSize(new java.awt.Dimension(600, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new DashBoard().setVisible(true);
        super.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel movie;
    private javax.swing.JLabel theater;
    private javax.swing.JLabel ticket;
    private javax.swing.JLabel time;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
