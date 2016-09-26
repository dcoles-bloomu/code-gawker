/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bloomu.codeglosser.View;

import edu.bloomu.codeglosser.Controller.NoteManager;
import edu.bloomu.codeglosser.Controller.NoteView;
import edu.bloomu.codeglosser.Model.Note;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author Louis
 */
public class NoteDescriptorPane extends javax.swing.JPanel implements NoteView {
    
    private NoteManager controller;
    private Note note;
    
    /**
     * Creates new form NoteDescriptorPane
     */
    public NoteDescriptorPane() {
        initComponents();
        clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelHighlightColor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelTextColor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        noteMsg = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        textSize = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        textFont = new javax.swing.JTextField();
        buttonSubmit = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        noteName = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelHighlightColor, org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.labelHighlightColor.text")); // NOI18N
        labelHighlightColor.setToolTipText(org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.labelHighlightColor.toolTipText")); // NOI18N
        labelHighlightColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHighlightColorMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.jLabel6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(labelTextColor, org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.labelTextColor.text")); // NOI18N
        labelTextColor.setToolTipText(org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.labelTextColor.toolTipText")); // NOI18N
        labelTextColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelTextColorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHighlightColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(545, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelHighlightColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        tabs.addTab(org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.jLabel2.text")); // NOI18N

        noteMsg.setColumns(20);
        noteMsg.setLineWrap(true);
        noteMsg.setRows(5);
        noteMsg.setText(org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.noteMsg.text")); // NOI18N
        noteMsg.setToolTipText(org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.noteMsg.toolTipText")); // NOI18N
        noteMsg.setWrapStyleWord(true);
        jScrollPane1.setViewportView(noteMsg);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.jLabel1.text")); // NOI18N

        textSize.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textSize.setText(org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.textSize.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.jLabel3.text")); // NOI18N

        textFont.setText(org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.textFont.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(buttonSubmit, org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.buttonSubmit.text")); // NOI18N
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(buttonReset, org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.buttonReset.text")); // NOI18N
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSize, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFont)))
                        .addGap(403, 403, 403)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonReset))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSubmit)
                    .addComponent(buttonReset))
                .addContainerGap())
        );

        tabs.addTab(org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        noteName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        noteName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        org.openide.awt.Mnemonics.setLocalizedText(noteName, org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.noteName.text")); // NOI18N
        noteName.setToolTipText(org.openide.util.NbBundle.getMessage(NoteDescriptorPane.class, "NoteDescriptorPane.noteName.toolTipText")); // NOI18N

        jLayeredPane1.setLayer(tabs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(noteName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(noteName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addComponent(noteName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        note.setMsg(noteMsg.getText());
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        display(note);
    }//GEN-LAST:event_buttonResetActionPerformed

    private void labelHighlightColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHighlightColorMouseClicked
        Color c = JColorChooser.showDialog(null, "Highlighter Color...", note.getHighlightColor());
        if (c != null) {
            note.setHighlightColor(c);
            controller.setHighlightColor(c);
            display(note);
        }
    }//GEN-LAST:event_labelHighlightColorMouseClicked

    private void labelTextColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelTextColorMouseClicked
        Color c = JColorChooser.showDialog(null, "Text Color...", note.getTextColor());
        if (c != null) {
            note.setTextColor(c);
            display(note);
        }
    }//GEN-LAST:event_labelTextColorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelHighlightColor;
    private javax.swing.JLabel labelTextColor;
    private javax.swing.JTextArea noteMsg;
    private javax.swing.JLabel noteName;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTextField textFont;
    private javax.swing.JTextField textSize;
    // End of variables declaration//GEN-END:variables

    @Override
    public void display(Note note) {
        this.note = note;
        this.tabs.setVisible(true);
        this.noteName.setText(note.getId());
        this.noteMsg.setText(note.getMsg());
        Color c = note.getHighlightColor();
        this.labelHighlightColor.setText("(" + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ")");
        c = note.getTextColor();
        this.labelTextColor.setText("(" + c.getRed() + "," + c.getGreen() + "," + c.getBlue() + ")");
    }

    @Override
    public void clear() {
        this.note = null;
        this.noteName.setText("None Selected");
        this.tabs.setVisible(false);
    }
    
    public void setController(NoteManager controller) {
        this.controller = controller;
    }
    
    public NoteManager getController() {
        return this.controller;
    }
}
