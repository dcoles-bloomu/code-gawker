package edu.bloomu.codeglosser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Exceptions;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@TopComponent.Description(
        preferredID = "CommentEditorTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "commentEditor", openAtStartup = false)
@ActionID(category = "Window", id = "edu.bloomu.gloss.CommentEditorTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)

@Messages({
    "CTL_CommentEditorAction=CommentEditor",
    "CTL_CommentEditorTopComponent=CommentEditor Window",
    "HINT_CommentEditorTopComponent=This is a CommentEditor window"
})
public final class CommentEditorTopComponent extends TopComponent {

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(CommentEditorTopComponent.class.getName());
    private final GlossedDocument glossedDocument;
    private final static String FILENAME = "name.gl";

    public CommentEditorTopComponent(GlossedDocument glossedDocument) {
        this.glossedDocument = glossedDocument;
        initComponents();
    }

    public void saveGlossedDocument() {

        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(FILENAME));
            out.writeObject(glossedDocument);
        } catch (IOException ex) { JOptionPane.showMessageDialog(null, ex.toString());
            Exceptions.printStackTrace(ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editorPanel1 = new edu.bloomu.codeglosser.EditorPanel();

        setLayout(new java.awt.GridLayout(1, 0));
        add(editorPanel1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.bloomu.codeglosser.EditorPanel editorPanel1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
