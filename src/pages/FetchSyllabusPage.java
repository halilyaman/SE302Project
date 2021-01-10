package pages;
import javax.swing.*;
import java.awt.*;
import res.Values;
import utils.GuiUtils;

public class FetchSyllabusPage extends JPanel {
    private JPanel topPanel;
    private JPanel urlPanel;
    private JTextField courseUrl;

    public FetchSyllabusPage() {
        topPanel = new JPanel();
        courseUrl = new JTextField();

        this.setLayout(new BorderLayout());
        this.setBackground(Values.AppColors.backgroundColor);

        setTopPanel();
        this.add(topPanel, BorderLayout.NORTH);

        setURLPanel();
        this.add(urlPanel, BorderLayout.CENTER);

    }

    private void setTopPanel() {
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
        URLPanel.add(courseUrl);

        return URLPanel;
    }
}

