package utils;

import pages.elements.HintTextField;
import res.Values;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GuiUtils {
    final public static Border lineBorder = BorderFactory.createLineBorder(Values.AppColors.borderColor);
    final public static Border emptyBorder = BorderFactory.createEmptyBorder(
        Values.paddingSmall, // top
        Values.paddingSmall, // left
        Values.paddingSmall, // bottom
        Values.paddingSmall  // right
    );

    public static JLabel buildLabelWithBorder(String text) {
        JLabel courseNameLabel = new JLabel(text);
        courseNameLabel.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
        courseNameLabel.setForeground(Values.AppColors.textColor);
        return courseNameLabel;
    }

    public static JLabel buildLabelWithBorder(String text, Color color) {
        JLabel courseNameLabel = new JLabel(text);
        courseNameLabel.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
        courseNameLabel.setForeground(color);
        return courseNameLabel;
    }

    public static HintTextField buildTextFieldWithBorder() {
        HintTextField hintTextField = new HintTextField("...");
        hintTextField.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
        return hintTextField;
    }
}
