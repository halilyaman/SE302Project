package pages.elements;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class HintTextField extends JTextField implements FocusListener {

    private final String hint;
    private boolean showingHint;

    public HintTextField(final String hint) {
        super(hint);
        this.hint = hint;
        this.showingHint = true;
        super.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        try {
            String content = this.getDocument().getText(0, 1);
            if(content.isBlank() || content.equals(".")) {
                super.setText("");
                showingHint = false;
            }
        } catch(Exception ex) {
            super.setText("");
            showingHint = false;
        }
    }
    @Override
    public void focusLost(FocusEvent e) {
        try {
            String content = this.getDocument().getText(0, 1);
            if(content.isBlank()) {
                super.setText(hint);
                showingHint = true;
            }
        } catch(Exception ex) {
            super.setText(hint);
            showingHint = true;
        }
    }

    @Override
    public String getText() {
        return showingHint ? "" : super.getText();
    }
}