package pages;

import pages.elements.HintTextField;
import res.Values;
import utils.GuiUtils;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

public class CreateSyllabusPage extends JPanel {
    final private JPanel topPanel;
    final private JPanel formPanel;
    final private HintTextField courseNameField;
    final private HintTextField codeField;
    final private HintTextField theoryField;
    final private HintTextField appLabField;
    final private JLabel localCreditsLabel;
    final private JLabel ectsLabel;
    final private JComboBox<String> semesterComboBox;


    public CreateSyllabusPage() {
        // initializations
        topPanel = new JPanel();
        formPanel = new JPanel();
        courseNameField = GuiUtils.buildTextFieldWithBorder();
        codeField = GuiUtils.buildTextFieldWithBorder();
        theoryField = GuiUtils.buildTextFieldWithBorder();
        appLabField = GuiUtils.buildTextFieldWithBorder();
        localCreditsLabel = GuiUtils.buildLabelWithBorder("...");
        ectsLabel = GuiUtils.buildLabelWithBorder("...");
        semesterComboBox = new JComboBox<>(Values.SyllabusValues.syllabusValues);

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

        // create second panel content
        JLabel codeLabel = GuiUtils.buildLabelWithBorder("Code");
        JLabel semesterLabel = GuiUtils.buildLabelWithBorder("Semester");
        JLabel theoryLabel = GuiUtils.buildLabelWithBorder("<html>Theory<br/>(hour/week)</html>");
        JLabel appLabLabel = GuiUtils.buildLabelWithBorder("<html>Application/Lab<br/>(hour/week)</html>");
        appLabLabel.setVerticalAlignment(JLabel.CENTER);
        JLabel localCreditsLabel = GuiUtils.buildLabelWithBorder("Local Credits");
        JLabel ectsLabel = GuiUtils.buildLabelWithBorder("ECTS");

        // create combo box for semester field
        semesterComboBox.setSelectedIndex(0);
        semesterComboBox.addActionListener(actionEvent -> {
            JComboBox cb = (JComboBox) actionEvent.getSource();
            String semesterValue = (String) cb.getSelectedItem();
            semesterComboBox.setSelectedItem(semesterValue);
        });

        // set second panel content
        secondPanel.add(codeLabel);
        secondPanel.add(semesterLabel);
        secondPanel.add(theoryLabel);
        secondPanel.add(appLabLabel);
        secondPanel.add(localCreditsLabel);
        secondPanel.add(ectsLabel);
        secondPanel.add(codeField);
        secondPanel.add(semesterComboBox);
        secondPanel.add(theoryField);
        secondPanel.add(appLabField);
        secondPanel.add(this.localCreditsLabel);
        secondPanel.add(this.ectsLabel);

        // set action listeners
        theoryField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLocalCreditAndEcts();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLocalCreditAndEcts();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLocalCreditAndEcts();
            }
        });

        appLabField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLocalCreditAndEcts();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLocalCreditAndEcts();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateLocalCreditAndEcts();
            }
        });

        return secondPanel;
    }

    private void updateLocalCreditAndEcts() {
        try {
            int theory = Integer.parseInt(theoryField.getText());
            int lab = Integer.parseInt(appLabField.getText());
            if (theory >= 0 && lab >= 0) {
                int localCredits = theory + (lab / 2);
                localCreditsLabel.setText(Integer.toString(localCredits));
                localCreditsLabel.updateUI();
            } else {
                localCreditsLabel.setText("...");
                localCreditsLabel.updateUI();
            }
        } catch(Exception e) {
            localCreditsLabel.setText("...");
            localCreditsLabel.updateUI();
        }
    }
}
