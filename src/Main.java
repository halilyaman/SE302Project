import pages.CreateSyllabusPage;
import res.Values;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(ClassNotFoundException |
                        InstantiationException |
                        IllegalAccessException |
                        UnsupportedLookAndFeelException ex)
        {
            ex.printStackTrace();
        }

        JFrame frame = new JFrame("Syllabus Application");
        frame.setSize(Values.screenWidth, Values.screenHeight);

        // center window
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(
                (dimension.width / 2) - (frame.getWidth() / 2),
                (dimension.height / 2) - (frame.getHeight() / 2));

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO: CreateSyllabusPage will be changed with WelcomePage
        frame.add(new CreateSyllabusPage(), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
