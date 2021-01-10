package pages;
import javax.swing.*;
import java.awt.*;
import res.Values;
import utils.GuiUtils;
import utils.Navigator;

public class FetchSyllabusPage extends JPanel {
    private JPanel topPanel;
    private JPanel URLPanel;
    private JTextField courseURL;

    public FetchSyllabusPage() {
        topPanel = new JPanel();
        courseURL = new JTextField();

        this.setLayout(new BorderLayout());
        this.setBackground(Values.AppColors.backgroundColor);

        settopPanel();
        this.add(topPanel, BorderLayout.NORTH);

        setURLPanel();
        this.add(URLPanel, BorderLayout.CENTER);

    }

    private void settopPanel() {
        JPanel childTopPanel = new JPanel();
        childTopPanel.setBackground(Values.AppColors.textColor);
        childTopPanel.setPreferredSize(new Dimension(Values.formWidth - 200, Values.formHeightSmall));
        childTopPanel.setLayout(new GridLayout(1, 3));

        JButton backButton = new JButton("BACK");
        JButton saveButton = new JButton("IMPORT");
    }
    private JPanel setURLPanel() {
        JPanel URLPanel = new JPanel(new GridLayout(1, 2));
        URLPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        URLPanel.setBackground(Values.AppColors.backgroundColor);
        URLPanel.setPreferredSize(new Dimension(Values.formWidth, Values.formHeightMedium));
        URLPanel.setBorder(GuiUtils.emptyBorder);

        JLabel courseNameLabel = GuiUtils.buildLabelWithBorder("Please type URL :");
        URLPanel.add(courseNameLabel);
        URLPanel.add(courseURL);

        return URLPanel;
    }
}

