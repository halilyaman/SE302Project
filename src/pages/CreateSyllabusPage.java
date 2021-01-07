package pages;

import res.Values;

import javax.swing.*;
import java.awt.*;

public class CreateSyllabusPage extends JPanel {
    final private JPanel topPanel;
    final private JPanel formPanel;
    final private JTextField courseNameField;

    public CreateSyllabusPage() {
        // initializations
        topPanel = new JPanel();
        formPanel = new JPanel();
        courseNameField = new JTextField();

        // set layout
        this.setLayout(new BorderLayout());

        // set background color
        this.setBackground(Values.AppColors.backgroundColor);

        buildTopPanel();
        this.add(topPanel, BorderLayout.NORTH);

        buildFormPanel();
        this.add(formPanel, BorderLayout.CENTER);
    }

    private void buildTopPanel() {
        JPanel childTopPanel = new JPanel();
        childTopPanel.setBackground(Values.AppColors.textColor);
        childTopPanel.setPreferredSize(new Dimension(Values.formWidth - 200, Values.formHeightSmall));
        childTopPanel.setLayout(new GridLayout(1, 3));

        JButton backButton = new JButton("BACK");
        JButton saveButton = new JButton("SAVE");
        JButton exportButton = new JButton("EXPORT");

        childTopPanel.add(backButton);
        childTopPanel.add(saveButton);
        childTopPanel.add(exportButton);

        topPanel.add(childTopPanel);
    }

    private void buildFormPanel() {
        formPanel.setBackground(Values.AppColors.backgroundColor);
        formPanel.add(buildFirstPanel());
    }

    private JPanel buildFirstPanel() {
        // create first panel
        JPanel firstPanel = new JPanel(new GridLayout(1, 2));
        firstPanel.setBackground(Values.AppColors.backgroundColor);
        firstPanel.setPreferredSize(new Dimension(Values.formWidth, Values.formHeightMedium));
        firstPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEtchedBorder(Values.AppColors.borderColor, Values.AppColors.backgroundColor),
                BorderFactory.createEmptyBorder(
                        Values.paddingSmall, // top
                        Values.paddingSmall, // left
                        Values.paddingSmall, // bottom
                        Values.paddingSmall  // right
                )
        ));

        // set first panel content
        JLabel courseNameLabel = new JLabel("Course Name");
        courseNameLabel.setForeground(Values.AppColors.textColor);
        firstPanel.add(courseNameLabel);
        firstPanel.add(courseNameField);

        return firstPanel;
    }
}
