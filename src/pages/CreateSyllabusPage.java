package pages;

import pages.elements.HintTextField;
import res.Values;
import utils.GuiUtils;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class CreateSyllabusPage extends JPanel {
    final private JPanel topPanel;
    final private JPanel formPanel;
    final private HintTextField courseNameField;

    public CreateSyllabusPage() {
        // initializations
        topPanel = new JPanel();
        formPanel = new JPanel();
        courseNameField = new HintTextField("Type course name...");

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
        formPanel.add(buildSecondPanel());
    }

    private JPanel buildFirstPanel() {
        // create first panel
        JPanel firstPanel = new JPanel(new GridLayout(1, 2));
        firstPanel.setBackground(Values.AppColors.backgroundColor);
        firstPanel.setPreferredSize(new Dimension(Values.formWidth, Values.formHeightMedium));
        firstPanel.setBorder(GuiUtils.emptyBorder);

        // set first panel content
        JLabel courseNameLabel = GuiUtils.buildLabelWithBorder("Course Name");
        courseNameField.setBorder(BorderFactory.createCompoundBorder(GuiUtils.lineBorder, GuiUtils.emptyBorder));
        courseNameField.setName("");
        firstPanel.add(courseNameLabel);
        firstPanel.add(courseNameField);

        return firstPanel;
    }

    private JPanel buildSecondPanel() {
        // create second panel
        JPanel secondPanel = new JPanel(new GridLayout(2, 6));
        secondPanel.setBackground(Values.AppColors.backgroundColor);
        secondPanel.setPreferredSize(new Dimension(Values.formWidth, Values.formHeightMedium));
        secondPanel.setBorder(GuiUtils.emptyBorder);
        return secondPanel;
    }
}
