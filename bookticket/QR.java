/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookticket;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author soundarraj
 */
public class QR extends javax.swing.JFrame {

    /**
     * Creates new form QR
     */
    Booking bk;
    public QR(Booking bk) {
        this.bk=bk;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Downloads\\Feem\\QR.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Proceed Payment  to Complete Booking Process");

        jButton1.setBackground(new java.awt.Color(0, 255, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(65, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(100, 100, 100)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(132, 132, 132)
                                                .addComponent(jButton1)
                                                .addGap(65, 65, 65)
                                                .addComponent(jButton2)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        setVisible(false);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        Random randint=new Random();
        int PNR=randint.nextInt(9999999);
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tigerfirejet", "root", "2077");
            PreparedStatement stmt=null;
            stmt=con.prepareStatement("INSERT INTO `tigerfirejet`.`booking_details` (`email`, `from`, `to`, `start_time`, `reach_time`, `round_trip`, `return_time`, `adult`, `children`, `currency`, `person_type`,`pnr`,`flight_name`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)");
            //ResultSet rs=stmt.executeQuery("select EmpName from Employee where EmpId<12");
            //stmt=con.prepareStatement("INSERT INTO booking_details(email,from,to,start_time,reach_time,round_trip,return_time,adult,children,currency,person_type,pnr)"+" VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
//            String smpl;
//            if(bk.trip.equalsIgnoreCase("Round Trip")){
//                smpl="yes";
//            }
//            else{
//                smpl="no";
//            }
            String str5=bk.jTextField2.getText(),str6=String.valueOf(PNR);
//           stmt=con.prepareStatement("INSERT INTO `Tiger_Fire`.`booking_details` (`email`, `from`, `to`, `start_time`, `reach_time`, `round_trip`, `return_time`, `adult`, `children`, `currency`, `person_type`, `pnr`) VALUES ('str5', 'bk.fromp', 'bk.top', 'bk.from', 'bk.to', 'smpl','sureyt' , 'bk.nadult','bk.nchildren' , 'bk.currency', 'bk.other','str6')");
            stmt.setString(1,bk.jTextField2.getText());
            System.out.println(str5);
            stmt.setString(2,bk.fromp);
            stmt.setString(3,bk.top);
            stmt.setString(4,bk.fdate);
            stmt.setString(5,bk.tdate);
            String smpl="no";
            if(bk.trip.equalsIgnoreCase("Round Trip")){
                smpl="yes";
            }
            else{
                smpl="no";
            }
            stmt.setString(6,smpl);
            stmt.setString(7,bk.rdate);
            stmt.setInt(8,bk.nadult);
            stmt.setInt(9,bk.nchildren);
            stmt.setString(10,bk.currency);
            stmt.setString(11,bk.other);
            stmt.setString(12,Integer.toString(PNR));
            stmt.setString(13,bk.flightname);
            int status=stmt.executeUpdate();
            System.out.println(status);
            con.close();
        }
        catch(Exception ex){
            System.out.println("error in sql");
            ex.printStackTrace();
        }

        JOptionPane.showMessageDialog(this,"Your Flight Ticket Booked with PNR : "+PNR);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new QR().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration
}
