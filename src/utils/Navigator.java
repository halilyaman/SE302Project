package utils;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Navigator {
    final private static JFrame frame = new JFrame();
    final private static ArrayList<JPanel> pages = new ArrayList<>();

    public static JFrame getFrame() {
        return frame;
    }

    public static void push(JPanel page) {
        frame.getContentPane().removeAll();
        pages.add(page);
        frame.add(page, BorderLayout.CENTER);
        page.updateUI();
    }

    public static void pop() {
        if (pages.size() != 0) {
            frame.getContentPane().removeAll();
            pages.remove(pages.size() - 1);
            frame.add(pages.get(pages.size() - 1), BorderLayout.CENTER);
            pages.get(pages.size() - 1).updateUI();
        }
    }
}
