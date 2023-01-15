
import java.sql.*;
import javax.swing.JOptionPane;
public class Payment extends javax.swing.JFrame {
    public static int priceAmount;
    public Payment() {
        initComponents();
        movie.setText(Booking.movieSelected);
        time.setText(Booking.timeSelected);
        theater.setText(Booking.theaterSelected);
        if(Booking.theaterSelected.equals("APR Cinemas")){
            priceAmount = 150;
            price.setText("Rs. "+priceAmount);
        }
        else{
            priceAmount = 100;
            price.setText("Rs. "+priceAmount);
        }
        balance.setText("Rs. "+Integer.toString(DashBoard.user_bal));
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
        jLabel1 = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        movie = new javax.swing.JLabel();
        theater = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        totalAmount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        ticket = new javax.swing.JTextField();
        bookBtn = new javax.swing.JButton();

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
        welcome.setText("Payment");
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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Price/Ticket:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        price.setBackground(new java.awt.Color(0, 0, 0));
        price.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("Price");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 140, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Movie name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Theater:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Time:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        movie.setBackground(new java.awt.Color(0, 0, 0));
        movie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        movie.setForeground(new java.awt.Color(255, 255, 255));
        movie.setText("MovieName");
        jPanel1.add(movie, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 140, -1));

        theater.setBackground(new java.awt.Color(0, 0, 0));
        theater.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        theater.setForeground(new java.awt.Color(255, 255, 255));
        theater.setText("Theater");
        jPanel1.add(theater, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 140, -1));

        time.setBackground(new java.awt.Color(0, 0, 0));
        time.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("time");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 300));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
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
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 41, 26));

        totalAmount.setBackground(new java.awt.Color(0, 0, 0));
        totalAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalAmount.setForeground(new java.awt.Color(255, 255, 255));
        totalAmount.setText("Rs. 0");
        jPanel2.add(totalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 140, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Account Balance:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total amount:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Number of tickets:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, -1));

        balance.setBackground(new java.awt.Color(0, 0, 0));
        balance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        balance.setForeground(new java.awt.Color(255, 255, 255));
        balance.setText("0000");
        jPanel2.add(balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 140, -1));

        ticket.setBackground(new java.awt.Color(0, 0, 0));
        ticket.setForeground(new java.awt.Color(255, 255, 255));
        ticket.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ticket.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        ticket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketActionPerformed(evt);
            }
        });
        jPanel2.add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 40, -1));

        bookBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bookBtn.setText("BOOK TICKETS");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });
        jPanel2.add(bookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 230, 250, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 0, 340, 300));

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

    private void ticketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketActionPerformed
        int total = priceAmount * Integer.valueOf(ticket.getText());
        totalAmount.setText("Rs. "+Integer.toString(total));
    }//GEN-LAST:event_ticketActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        int total = priceAmount * Integer.valueOf(ticket.getText());
        totalAmount.setText("Rs. "+Integer.toString(total));
        if(DashBoard.user_bal>=total){
            try{
                Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
                PreparedStatement st = (PreparedStatement)conn.prepareStatement("UPDATE movie SET balance = ? where email = ?");
                st.setString(2,DashBoard.user_email);
                st.setInt(1, DashBoard.user_bal-total);
                int rs = st.executeUpdate();
                PreparedStatement st1 = (PreparedStatement)conn.prepareStatement("INSERT INTO tickets(name,email,moviename,showtime,theater,ticket,balance) values(?,?,?,?,?,?,?)");
                st1.setString(1, DashBoard.user_name);
                st1.setString(2, DashBoard.user_email);
                st1.setString(3, Booking.movieSelected);
                st1.setString(4, Booking.timeSelected);
                st1.setString(5, Booking.theaterSelected);
                st1.setInt(6,Integer.valueOf(ticket.getText()));
                st1.setInt(7,DashBoard.user_bal-total );
                int rs1 = st1.executeUpdate();
                if(rs==1){
                    JOptionPane.showMessageDialog(bookBtn,"Your tickets are booked.");
                    new DashBoard().setVisible(true);
                    super.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(bookBtn,"Server error");
                }
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(bookBtn,"Insufficient Balance");
        }
    }//GEN-LAST:event_bookBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance;
    private javax.swing.JButton bookBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel movie;
    private javax.swing.JLabel price;
    private javax.swing.JLabel theater;
    private javax.swing.JTextField ticket;
    private javax.swing.JLabel time;
    private javax.swing.JLabel totalAmount;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
