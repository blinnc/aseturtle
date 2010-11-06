/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TurtleFrame2.java
 *
 * Created on Oct 30, 2010, 8:43:55 PM
 */

package turtleturtleup;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author blinnc
 */
public class TurtleFrame extends javax.swing.JFrame {

    /** Creates new form TurtleFrame */
    public TurtleFrame() {
        initComponents();
        customize();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel() {
            protected void paintComponent(Graphics g) {
                g.drawImage((new ImageIcon("TurtleTurtleUp-app-client\\src\\java\\turtleturtleup\\ttu.png")).getImage(), 0, 0, null);
                super.paintComponents(g);
            }
        };
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spectateButton = new javax.swing.JButton();
        joinButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        statButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        thumbButton = new javax.swing.JButton();
        indexButton = new javax.swing.JButton();
        middleButton = new javax.swing.JButton();
        ringButton = new javax.swing.JButton();
        pinkyButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoLabel = new javax.swing.JLabel();
        actionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(240, 240, 240));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Turtle, Turtle,");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 28));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Up!");

        spectateButton.setText("Spectate");

        joinButton.setText("Play");

        exitButton.setText("Exit");

        statButton.setText("Statistics");

        adminButton.setText("Admin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spectateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(joinButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(statButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminButton, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(spectateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(joinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        thumbButton.setText("<html>T<br>&nbsp;&nbsp;&nbsp;h<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;u<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;m<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b</html>");
        thumbButton.setActionCommand("<html>T<br>&nbsp;&nbsp;h<br>&nbsp;&nbsp;&nbsp;&nbsp;u<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;m<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;b</html>");
        thumbButton.setBorder(null);
        thumbButton.setContentAreaFilled(false);

        indexButton.setText("<html>I<br>n<br>d<br>e<br>x</html>");
        indexButton.setBorder(null);
        indexButton.setContentAreaFilled(false);

        middleButton.setText("<html>M<br>i<br>d<br>d<br>l<br>e</html>");
        middleButton.setBorder(null);
        middleButton.setContentAreaFilled(false);

        ringButton.setText("<html>R<br>i<br>n<br>g</html>");
        ringButton.setBorder(null);
        ringButton.setContentAreaFilled(false);

        pinkyButton.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;P<br>&nbsp;&nbsp;&nbsp;i<br>&nbsp;&nbsp;n<br>&nbsp;k<br>y</html>");
        pinkyButton.setBorder(null);
        pinkyButton.setContentAreaFilled(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setOpaque(false);

        infoLabel.setText("<html>\n<tr> <td><b>Player&nbsp&nbsp&nbsp</b></td> <td><b>Thumb</td> <td><b>Index</td><td><b>Middle</td><td><b>Ring</td><td><b>Pinky</td></tr>\n<tr> <td>TEST</td> <td><CENTER>x</CENTER></td> </tr>\n</html>");
        infoLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(infoLabel);

        actionLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        actionLabel.setText("<html> You lost!<br>\nBetter luck next time\n</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(thumbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(actionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indexButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(middleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ringButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(pinkyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(actionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(thumbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(middleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(indexButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ringButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                        .addGap(123, 123, 123))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(398, Short.MAX_VALUE)
                .addComponent(pinkyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Change the UI in ways limited
     */
    private void customize() {
       jScrollPane1.getViewport().setOpaque(false);
       infoLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel actionLabel;
    javax.swing.JButton adminButton;
    javax.swing.JButton exitButton;
    javax.swing.JButton indexButton;
    javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JButton joinButton;
    javax.swing.JButton middleButton;
    javax.swing.JButton pinkyButton;
    javax.swing.JButton ringButton;
    javax.swing.JButton spectateButton;
    javax.swing.JButton statButton;
    javax.swing.JButton thumbButton;
    // End of variables declaration//GEN-END:variables

}
