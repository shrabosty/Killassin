/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package To_Team_Killassin;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Shrabosty
 */
public class Fourthpage extends javax.swing.JFrame {

    /**
     * Creates new form Fourthpage
     */
    public Fourthpage() {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        getContentPane().setBackground(Color.blue);
       // PlayKillassin p=new PlayKillassin();
       //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        Timer t;
        t = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
               dispose();
               Fifthpage fp=new Fifthpage();
              fp.setVisible(true);
              //System.exit(0);
             // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
        t.start();
        t.setRepeats(false);
        Toolkit tk=Toolkit.getDefaultToolkit();
        int xsize=(int)tk.getScreenSize().getWidth();
        int ysize= (int)tk.getScreenSize().getHeight();
       this.setSize(1200, 600);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 51, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField1.setText("    POLICE");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 51, 255));
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField2.setText("  PLAYER 2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(0, 51, 255));
        jTextField3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField3.setText("  PLAYER 3");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(0, 51, 255));
        jTextField4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField4.setText("    FRIEND");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
      //  int []a =new int[] {1,2,3,4};
       // Shuffle s= new Shuffle();
       // s.shuffleArray(a);
        //PlayersCardDistribution Player= new PlayersCardDistribution(a);
        
        //PlayersCardDistribution pcd=new PlayersCardDistribution(a);
        //int []a =new int[] {1,2,3,4};
               // Shuffle s= new Shuffle();
                //s.shuffleArray(a);
               // PlayersCardDistribution Player = new PlayersCardDistribution(a);
               // PlayKillassin play = new PlayKillassin();
                //String str=play.showPolice(Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3(), Player.getPlayer4());
                //str will store police
                //if(Player.getPlayer1()=="Police")jTextField1.setText(str);
                //else 
                //if(Player.getPlayer2()=="Police")jTextField2.setText("POLICE!!.");
                //else if(Player.getPlayer3()=="Police") jTextField3.setText(str);
               // else if(Player.getPlayer4()=="Police") jTextField4.setText(str);
        
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        // int []a =new int[] {1,2,3,4};
               // Shuffle s= new Shuffle();
                //s.shuffleArray(a);
               // PlayersCardDistribution Player = new PlayersCardDistribution(a);
                //PlayKillassin play = new PlayKillassin();
                //String str=play.showPolice(Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3(), Player.getPlayer4());
                //str will store police
               // if(Player.getPlayer1()=="Police")jTextField1.setText("POLICE!!");
                //else if(Player.getPlayer2()=="Police")jTextField2.setText(str);
                //else if(Player.getPlayer3()=="Police") jTextField3.setText(str);
                //else if(Player.getPlayer4()=="Police") jTextField4.setText(str);
        
		
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        //int []a =new int[] {1,2,3,4};
               // Shuffle s= new Shuffle();
                //s.shuffleArray(a);
                //PlayersCardDistribution Player = new PlayersCardDistribution(a);
               // PlayKillassin play = new PlayKillassin();
                //String str=play.showPolice(Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3(), Player.getPlayer4());
                //str will store police
                //if(Player.getPlayer1()=="Police")jTextField1.setText(str);
                //else if(Player.getPlayer2()=="Police")jTextField2.setText(str);
                 //if(Player.getPlayer3()=="Police") jTextField3.setText("POLICE!!");
               // else if(Player.getPlayer4()=="Police") jTextField4.setText(str);
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
//int []a =new int[] {1,2,3,4};
                //Shuffle s= new Shuffle();
               // s.shuffleArray(a);
               // PlayersCardDistribution Player = new PlayersCardDistribution(a);
                //PlayKillassin play = new PlayKillassin();
               // String str=play.showPolice(Player.getPlayer1(), Player.getPlayer2(), Player.getPlayer3(), Player.getPlayer4());
                //str will store police
                //if(Player.getPlayer1()=="Police")jTextField1.setText(str);
               // else if(Player.getPlayer2()=="Police")jTextField2.setText(str);
               // else if(Player.getPlayer3()=="Police") jTextField3.setText(str);
                //else
                //if(Player.getPlayer4()=="Police") jTextField4.setText("POLICE!!");
               // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(Fourthpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fourthpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fourthpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fourthpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String st;
                //POLICE(str);
                
                new Fourthpage().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
