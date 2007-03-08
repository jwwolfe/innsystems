/*
 * Client.java
 *
 * Created on February 26, 2007, 10:38 AM
 */

package gui;

import networking.*;

/**
 *
 * @author  Alex Filby
 * 
 */
public class Client extends javax.swing.JFrame {
    private clientComm cComm;
    
    
    /** Creates new form Client */
    public Client() {
        initComponents();
        setup();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        statusL = new javax.swing.JLabel();
        statusText = new javax.swing.JLabel();
        setsL = new javax.swing.JLabel();
        setsCounter = new javax.swing.JLabel();
        last = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        epochS = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        errorS = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        stopNote = new javax.swing.JLabel();
        connectB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("innsystems Client Alpha");
        statusL.setFont(new java.awt.Font("Arial", 0, 12));
        statusL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        statusL.setText("Status:");

        statusText.setFont(new java.awt.Font("Arial", 0, 12));
        statusText.setText("Status");

        setsL.setFont(new java.awt.Font("Arial", 0, 12));
        setsL.setText("Sets Completed:");

        setsCounter.setFont(new java.awt.Font("Arial", 0, 12));
        setsCounter.setText("00");

        last.setFont(new java.awt.Font("Arial", 0, 12));
        last.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        last.setText("Last");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Epochs:");

        epochS.setFont(new java.awt.Font("Arial", 0, 12));
        epochS.setText("00");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Error:");

        errorS.setFont(new java.awt.Font("Arial", 0, 12));
        errorS.setText("00");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("%");

        jButton1.setText("Stop");

        stopNote.setFont(new java.awt.Font("Arial", 0, 12));

        connectB.setText("Connect");
        connectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectServer(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .add(connectB)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .add(60, 60, 60))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap(57, Short.MAX_VALUE)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(42, 42, 42)
                        .add(statusL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(setsL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(setsCounter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(errorS)
                        .add(20, 20, 20)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(epochS, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .add(statusText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .add(stopNote, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 227, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(last, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .add(321, 321, 321))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(statusL, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .add(statusText))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(setsL, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(setsCounter, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(23, 23, 23)
                .add(last, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .add(epochS))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .add(errorS, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(connectB))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(stopNote, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectServer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectServer

    }//GEN-LAST:event_connectServer
    
    private void setup() {
        cComm = new clientComm();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connectB;
    private javax.swing.JLabel epochS;
    private javax.swing.JLabel errorS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel last;
    private javax.swing.JLabel setsCounter;
    private javax.swing.JLabel setsL;
    private javax.swing.JLabel statusL;
    private javax.swing.JLabel statusText;
    private javax.swing.JLabel stopNote;
    // End of variables declaration//GEN-END:variables
    
}
