
import java.awt.Toolkit;
import javax.tools.Tool;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shrabosty
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
        setIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPanel = new javax.swing.JPanel();
        CreateAnAccount = new javax.swing.JTextField();
        FirstName = new javax.swing.JLabel();
        GetFirstName = new javax.swing.JTextField();
        OkButtonOne = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        GetLastName = new javax.swing.JTextField();
        OkButtonTwo = new javax.swing.JButton();
        Username = new javax.swing.JLabel();
        GetPassword = new javax.swing.JPasswordField();
        OkButtonThree = new javax.swing.JButton();
        GetUsername = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        OkButtonFour = new javax.swing.JButton();
        ConfirmPassword = new javax.swing.JLabel();
        GetConfirmPassword = new javax.swing.JPasswordField();
        OkButtonFive = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackPanel.setBackground(new java.awt.Color(0, 0, 0));

        CreateAnAccount.setEditable(false);
        CreateAnAccount.setBackground(new java.awt.Color(204, 204, 204));
        CreateAnAccount.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        CreateAnAccount.setText("Create An account");

        FirstName.setBackground(new java.awt.Color(0, 102, 102));
        FirstName.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        FirstName.setForeground(new java.awt.Color(0, 153, 153));
        FirstName.setText("First Name:");

        OkButtonOne.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        OkButtonOne.setForeground(new java.awt.Color(0, 153, 153));
        OkButtonOne.setText("OK");

        LastName.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        LastName.setForeground(new java.awt.Color(0, 153, 153));
        LastName.setText("Last Name:");

        OkButtonTwo.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        OkButtonTwo.setForeground(new java.awt.Color(0, 153, 153));
        OkButtonTwo.setText("OK");

        Username.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        Username.setForeground(new java.awt.Color(0, 153, 153));
        Username.setText("Username:");

        OkButtonThree.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        OkButtonThree.setForeground(new java.awt.Color(0, 153, 153));
        OkButtonThree.setText("OK");

        Password.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 153, 153));
        Password.setText("New Password:");

        OkButtonFour.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        OkButtonFour.setForeground(new java.awt.Color(0, 153, 153));
        OkButtonFour.setText("OK");

        ConfirmPassword.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        ConfirmPassword.setForeground(new java.awt.Color(0, 153, 153));
        ConfirmPassword.setText("Confirm New Password:");

        OkButtonFive.setFont(new java.awt.Font("Algerian", 1, 12)); // NOI18N
        OkButtonFive.setForeground(new java.awt.Color(0, 153, 153));
        OkButtonFive.setText("Ok");
        OkButtonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonFiveActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Algerian", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Sign Up");

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(GetPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GetLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreateAnAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(GetFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GetUsername))
                        .addGap(10, 10, 10)
                        .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OkButtonOne)
                            .addComponent(OkButtonTwo)
                            .addComponent(OkButtonThree)
                            .addComponent(OkButtonFour)))
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addComponent(GetConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OkButtonFive))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(426, Short.MAX_VALUE))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CreateAnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkButtonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OkButtonTwo, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(GetLastName))
                .addGap(18, 18, 18)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OkButtonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GetUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OkButtonFour, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(GetPassword))
                .addGap(18, 18, 18)
                .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkButtonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BackPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkButtonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonFiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OkButtonFiveActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackPanel;
    private javax.swing.JLabel ConfirmPassword;
    private javax.swing.JTextField CreateAnAccount;
    private javax.swing.JLabel FirstName;
    private javax.swing.JPasswordField GetConfirmPassword;
    private javax.swing.JTextField GetFirstName;
    private javax.swing.JTextField GetLastName;
    private javax.swing.JPasswordField GetPassword;
    private javax.swing.JTextField GetUsername;
    private javax.swing.JLabel LastName;
    private javax.swing.JButton OkButtonFive;
    private javax.swing.JButton OkButtonFour;
    private javax.swing.JButton OkButtonOne;
    private javax.swing.JButton OkButtonThree;
    private javax.swing.JButton OkButtonTwo;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("assassin.png")));
    }
}