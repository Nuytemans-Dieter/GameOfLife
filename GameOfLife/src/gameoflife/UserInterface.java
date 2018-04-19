/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dieter
 */
public class UserInterface extends javax.swing.JFrame {

    /**
     * Creates new form UserInterface
     */
    public UserInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        dialogNewFile = new javax.swing.JDialog();
        textHoogte = new javax.swing.JTextField();
        textBreedte = new javax.swing.JTextField();
        textKans = new javax.swing.JTextField();
        labelHoogte = new javax.swing.JLabel();
        lebelBreedte = new javax.swing.JLabel();
        labelKans = new javax.swing.JLabel();
        labelKans1 = new javax.swing.JLabel();
        dialogLaadFile = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        dialogSaveFile = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        veldContainer = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        speedSlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuNewVeld = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuLaadVeld = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuKleurAchtergrond = new javax.swing.JMenuItem();
        menuKleurLevend = new javax.swing.JMenuItem();
        menuKleurDood = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        dialogNewFile.setMinimumSize(new java.awt.Dimension(200, 160));

        textHoogte.setMaximumSize(new java.awt.Dimension(6, 22));

        textBreedte.setMaximumSize(new java.awt.Dimension(6, 22));
        textBreedte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBreedteActionPerformed(evt);
            }
        });

        textKans.setMaximumSize(new java.awt.Dimension(6, 22));
        textKans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textKansActionPerformed(evt);
            }
        });

        labelHoogte.setText("Hoogte");

        lebelBreedte.setText("Breedte");

        labelKans.setText("Levend/dood");

        labelKans1.setText("%");

        javax.swing.GroupLayout dialogNewFileLayout = new javax.swing.GroupLayout(dialogNewFile.getContentPane());
        dialogNewFile.getContentPane().setLayout(dialogNewFileLayout);
        dialogNewFileLayout.setHorizontalGroup(
            dialogNewFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogNewFileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogNewFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelHoogte)
                    .addComponent(lebelBreedte)
                    .addComponent(labelKans))
                .addGap(38, 38, 38)
                .addGroup(dialogNewFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textHoogte, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textBreedte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textKans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelKans1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogNewFileLayout.setVerticalGroup(
            dialogNewFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogNewFileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogNewFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textHoogte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHoogte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogNewFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBreedte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lebelBreedte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogNewFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textKans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKans)
                    .addComponent(labelKans1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        dialogLaadFile.setMinimumSize(new java.awt.Dimension(800, 500));

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogLaadFileLayout = new javax.swing.GroupLayout(dialogLaadFile.getContentPane());
        dialogLaadFile.getContentPane().setLayout(dialogLaadFileLayout);
        dialogLaadFileLayout.setHorizontalGroup(
            dialogLaadFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLaadFileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogLaadFileLayout.setVerticalGroup(
            dialogLaadFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogLaadFileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dialogSaveFile.setMinimumSize(new java.awt.Dimension(800, 500));

        jFileChooser2.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogSaveFileLayout = new javax.swing.GroupLayout(dialogSaveFile.getContentPane());
        dialogSaveFile.getContentPane().setLayout(dialogSaveFileLayout);
        dialogSaveFileLayout.setHorizontalGroup(
            dialogSaveFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogSaveFileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogSaveFileLayout.setVerticalGroup(
            dialogSaveFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogSaveFileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Game Of Life");
        setSize(new java.awt.Dimension(1400, 1200));

        veldContainer.setBackground(new java.awt.Color(90, 120, 240));

        javax.swing.GroupLayout veldContainerLayout = new javax.swing.GroupLayout(veldContainer);
        veldContainer.setLayout(veldContainerLayout);
        veldContainerLayout.setHorizontalGroup(
            veldContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 934, Short.MAX_VALUE)
        );
        veldContainerLayout.setVerticalGroup(
            veldContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );

        playButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playButton.setText("Play");
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        nextButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nextButton.setText("Next");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Speed");

        jMenu1.setText("File");

        menuNewVeld.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNewVeld.setText(" nieuw veld");
        menuNewVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewVeldActionPerformed(evt);
            }
        });
        jMenu1.add(menuNewVeld);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("save veld");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuLaadVeld.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuLaadVeld.setText("laad veld");
        menuLaadVeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLaadVeldActionPerformed(evt);
            }
        });
        jMenu1.add(menuLaadVeld);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Personalisering");

        menuKleurAchtergrond.setText("Kleur achtergrond");
        jMenu2.add(menuKleurAchtergrond);

        menuKleurLevend.setText("Kleur levende velden");
        jMenu2.add(menuKleurLevend);

        menuKleurDood.setText("Kleur dode velden");
        menuKleurDood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKleurDoodActionPerformed(evt);
            }
        });
        jMenu2.add(menuKleurDood);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(veldContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(playButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 659, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(veldContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playButton)
                    .addComponent(nextButton))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuKleurDoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKleurDoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuKleurDoodActionPerformed

    private void menuNewVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNewVeldActionPerformed
        // TODO add your handling code here:
        dialogNewFile.setVisible(true);
    }//GEN-LAST:event_menuNewVeldActionPerformed

    private void textBreedteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBreedteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBreedteActionPerformed

    private void textKansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textKansActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textKansActionPerformed

    private void menuLaadVeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLaadVeldActionPerformed
        // TODO add your handling code here:
        dialogLaadFile.setVisible(true);
    }//GEN-LAST:event_menuLaadVeldActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
        String sr = jFileChooser1.getSelectedFile().getPath();
        System.out.println(sr);
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        dialogSaveFile.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playButtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInterface().setVisible(true);
            }
        });
    }
    
    public void refreshVeld(Veld veld)
    {
        int gridSizeX = veld.getBreedte();
        int gridSizeY = veld.getHoogte();
        
        JPanel cont = new JPanel();
        Dimension dim = new Dimension(1000,1000);
        cont.setMinimumSize(dim);
        cont.setMaximumSize(dim);
        cont.setPreferredSize(dim);
        cont.setBackground(Color.red);
        
        JPanel p = new JPanel();
        p.setBackground(Color.green);
        p.setLayout(new GridLayout(gridSizeX, gridSizeY));        
        p.setMaximumSize(dim);
        p.setMinimumSize(dim);
        p.setPreferredSize(dim);
        
        //Individuele JPanel's voor elke cel
        JPanel a;
        for (int i = 0; i < gridSizeX; i++)
        {
            for (int j = 0; j < gridSizeY; j++)
            {
                a = new JPanel();

                a.setBackground((i+j) % 2 == 0 ? Color.yellow : Color.red);
                
                p.add(a);
            }
        }

        cont.add(p);
        veldContainer.add(cont);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog dialogLaadFile;
    private javax.swing.JDialog dialogNewFile;
    private javax.swing.JDialog dialogSaveFile;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelHoogte;
    private javax.swing.JLabel labelKans;
    private javax.swing.JLabel labelKans1;
    private javax.swing.JLabel lebelBreedte;
    private javax.swing.JMenuItem menuKleurAchtergrond;
    private javax.swing.JMenuItem menuKleurDood;
    private javax.swing.JMenuItem menuKleurLevend;
    private javax.swing.JMenuItem menuLaadVeld;
    private javax.swing.JMenuItem menuNewVeld;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton playButton;
    private javax.swing.JSlider speedSlider;
    private javax.swing.JTextField textBreedte;
    private javax.swing.JTextField textHoogte;
    private javax.swing.JTextField textKans;
    private javax.swing.JPanel veldContainer;
    // End of variables declaration//GEN-END:variables
}
