import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Syllabus Application");
        frame.setSize(1280, 720);
        // center window
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(dimension.width);
        frame.setLocation(
                (dimension.width / 2) - (frame.getWidth() / 2),
                (dimension.height / 2) - (frame.getHeight() / 2));
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
