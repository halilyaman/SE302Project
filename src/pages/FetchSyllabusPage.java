package pages;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import res.Values;
import utils.GuiUtils;
import utils.Navigator;

public class FetchSyllabusPage extends JPanel {
    final private JPanel topPanel;
    final private JPanel urlPanel;
    final private JTextField courseUrl;

    public FetchSyllabusPage() {
        topPanel = new JPanel();
        courseUrl = new JTextField();
        urlPanel = new JPanel(new GridLayout(1, 2));

        this.setLayout(new BorderLayout());
        this.setBackground(Values.AppColors.backgroundColor);

        setTopPanel();
        this.add(topPanel, BorderLayout.NORTH);

        setURLPanel();
        this.add(urlPanel, BorderLayout.CENTER);
    }

    private void setTopPanel() {
        topPanel.setLayout(new GridLayout(1, 3));
        topPanel.setBackground(Values.AppColors.textColor);
        topPanel.setPreferredSize(new Dimension(Values.formWidth - 200, Values.formHeightSmall));

        JButton backButton = new JButton("BACK");
        backButton.addActionListener(e -> Navigator.pop());
        JButton saveButton = new JButton("IMPORT");

        topPanel.add(backButton);
        topPanel.add(saveButton);
    }

    private void setURLPanel() {
        urlPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        urlPanel.setBackground(Values.AppColors.backgroundColor);
        urlPanel.setPreferredSize(new Dimension(Values.formWidth, Values.formHeightMedium));
        urlPanel.setBorder(GuiUtils.emptyBorder);

        JLabel courseNameLabel = GuiUtils.buildLabelWithBorder("Please type URL :");
        urlPanel.add(courseNameLabel);
        urlPanel.add(courseUrl);
    }
}

