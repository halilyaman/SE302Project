package pages;

import res.Values;
import utils.GuiUtils;
import utils.Navigator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListSyllabusPage extends JPanel {
    final private JPanel bottomPanel;
    final private JPanel topPanel;
    final private JPanel listPanel;
    final private JTextField searchField;

    public ListSyllabusPage(){
        bottomPanel = new JPanel();
        topPanel = new JPanel();
        listPanel = new JPanel();
        searchField = GuiUtils.buildTextFieldWithBorder();

        this.setLayout(new BorderLayout());
        this.setBackground(Values.AppColors.backgroundColor);

        setTopPanel();
        this.add(topPanel,BorderLayout.NORTH);

        setBottomPanel();
        this.add(bottomPanel,BorderLayout.SOUTH);

        setListPanel();
        this.add(listPanel,BorderLayout.CENTER);
    }

    private void setTopPanel(){
        topPanel.setBackground(Values.AppColors.borderColor);
        topPanel.setPreferredSize(new Dimension(Values.formWidth-200,80));
        topPanel.setLayout(new GridLayout(2,3));

        JLabel searchFieldLabel = new JLabel("Please type a course information for search");
        topPanel.add(searchFieldLabel);
        topPanel.add(searchField);


        JButton searchButton = new JButton("SEARCH");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }});
    }

    private void setBottomPanel(){
        bottomPanel.setBackground(Values.AppColors.backgroundColor);
        bottomPanel.setPreferredSize(new Dimension(Values.formWidth-200,40));
        bottomPanel.setLayout(new GridLayout(1,2));

        JButton backButton = new JButton("BACK");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Navigator.pop();
            }});

        JButton openButton = new JButton("OPEN");
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }});
        bottomPanel.add(backButton);
        bottomPanel.add(openButton);
    }

    private void setListPanel(){
        listPanel.setBackground(Values.AppColors.grey);
        listPanel.setPreferredSize(new Dimension(Values.formWidth-200,Values.formHeightSmall));
        listPanel.setLayout(new GridLayout(3,3));
    }
}
