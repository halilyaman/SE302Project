package utils;

import javax.swing.*;
import java.awt.*;

public class Navigator {
    final private static JFrame frame = new JFrame();

    public static JFrame getFrame() {
        return frame;
    }

    public static void push(JPanel page) {
        frame.getContentPane().removeAll();
        frame.add(page, BorderLayout.CENTER);
        page.updateUI();
    }
}
