/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bloomu.codeglosser.View;

import com.google.common.eventbus.EventBus;
import edu.bloomu.codeglosser.Controller.NotePadController;
import java.util.logging.Logger;
import javax.swing.text.Document;

/**
 *
 * @author Louis
 */
public class MarkupView extends javax.swing.JPanel {

    private static final Logger LOG = Logger.getLogger(MarkupView.class.getName());
    
    
    private final NotePadController npController;
    
    /**
     * Creates new form MarkupView
     */
    public MarkupView() {
        initComponents();
        npController = new NotePadController(notePadView1);
    }
    
    public void setNotePadText(String str) {
        notePadView1.setText(str);
    }
    
    public void setEventBus(EventBus bus) {
        notePropertiesView1.setEventBus(bus);
        bus.register(notePropertiesView1);
        npController.setEventBus(bus);
        bus.register(npController);
    }
    
    public void setDocument(Document doc) {
        npController.setModelDocument(doc);
        LOG.info(npController.getText());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notePadView1 = new edu.bloomu.codeglosser.View.NotePadView();
        notePropertiesView1 = new edu.bloomu.codeglosser.View.NotePropertiesView();

        notePropertiesView1.setEventBus(null);
        notePropertiesView1.setMaximumSize(new java.awt.Dimension(500, 37));
        notePropertiesView1.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(notePadView1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(notePropertiesView1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notePadView1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
            .addComponent(notePropertiesView1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.bloomu.codeglosser.View.NotePadView notePadView1;
    private edu.bloomu.codeglosser.View.NotePropertiesView notePropertiesView1;
    // End of variables declaration//GEN-END:variables
}
