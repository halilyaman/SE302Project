package pages;

import pages.elements.HintTextField;
import res.Values;
import utils.GuiUtils;

import javax.swing.*;
import java.awt.*;

public class CreateSyllabusPage extends JPanel {
    final private JPanel topPanel;
    final private JPanel formPanel;
    final private HintTextField courseNameField;
    final private HintTextField codeField;
    final private HintTextField semesterField;
    final private HintTextField theoryField;
    final private HintTextField appLabField;
    final private HintTextField localCreditsField;
    final private HintTextField ectsField;

    public CreateSyllabusPage() {
        // initializations
        topPanel = new JPanel();
        formPanel = new JPanel();
        courseNameField = GuiUtils.buildTextFieldWithBorder();
        codeField = GuiUtils.buildTextFieldWithBorder();
        semesterField = GuiUtils.buildTextFieldWithBorder();
        theoryField = GuiUtils.buildTextFieldWithBorder();
        appLabField = GuiUtils.buildTextFieldWithBorder();
        localCreditsField = GuiUtils.buildTextFieldWithBorder();
        ectsField = GuiUtils.buildTextFieldWithBorder();

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
        firstPanel.add(courseNameLabel);
        firstPanel.add(courseNameField);

        return firstPanel;
    }

    private JPanel buildSecondPanel() {
        // create second panel
        JPanel secondPanel = new JPanel(new GridLayout(2, 6));
        secondPanel.setBackground(Values.AppColors.backgroundColor);
        secondPanel.setPreferredSize(new Dimension(Values.formWidth, 90));
        secondPanel.setBorder(GuiUtils.emptyBorder);

        JLabel codeLabel = GuiUtils.buildLabelWithBorder("Code");
        JLabel semesterLabel = GuiUtils.buildLabelWithBorder("Semester");
        JLabel theoryLabel = GuiUtils.buildLabelWithBorder("<html>Theory<br/>(hour/week)</html>");
        JLabel appLabLabel = GuiUtils.buildLabelWithBorder("<html>Application/Lab<br/>(hour/week)</html>");
        appLabLabel.setVerticalAlignment(JLabel.CENTER);
        JLabel localCreditsLabel = GuiUtils.buildLabelWithBorder("Local Credits");
        JLabel ectsLabel = GuiUtils.buildLabelWithBorder("ECTS");

        secondPanel.add(codeLabel);
        secondPanel.add(semesterLabel);
        secondPanel.add(theoryLabel);
        secondPanel.add(appLabLabel);
        secondPanel.add(localCreditsLabel);
        secondPanel.add(ectsLabel);
        secondPanel.add(codeField);
        secondPanel.add(semesterField);
        secondPanel.add(theoryField);
        secondPanel.add(appLabField);
        secondPanel.add(localCreditsField);
        secondPanel.add(ectsField);

        return secondPanel;
    }
}
