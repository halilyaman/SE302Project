import pages.CreateSyllabusPage;
import res.Values;

import javax.swing.*;
import java.awt.*;

public class Main {
    // private static final String LOOK_AND_FEEL = "Windows";
    private static final String LOOK_AND_FEEL = "Metal";


    private static void initLookAndFeel()
    {
        String lookAndFeel = null;

        if (LOOK_AND_FEEL.equals("Metal")) {
            lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
        }
        else if (LOOK_AND_FEEL.equals("Windows")) {
            lookAndFeel= "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        }

        try {
            UIManager.setLookAndFeel(lookAndFeel);
        } catch (Exception e) {
            System.err.println("Error LookAndFeel!");
            System.err.println("Using the default look and feel.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        initLookAndFeel();

        // create main frame
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
