package pages.elements;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class HintTextField extends JTextField implements FocusListener {

    private final String hint;
    private boolean showingHint;
    public static boolean isChanged = false;

    public HintTextField(final String hint) {
        super(hint);
        this.hint = hint;
        this.showingHint = true;
        super.addFocusListener(this);
        this.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!onInitialState()) {
                    isChanged = true;
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!onInitialState()) {
                    isChanged = true;
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (onInitialState()) {
            super.setText("");
            showingHint = false;
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        if (onInitialState()) {
            super.setText(hint);
            showingHint = true;
        }
    }

    @Override
    public String getText() {
        return showingHint ? "" : super.getText();
    }

    private boolean onInitialState() {
        try {
            String content = this.getDocument().getText(0, 1);
            return content.isBlank() || content.equals(".");
        } catch(Exception ex) {
            return true;
        }
    }
}