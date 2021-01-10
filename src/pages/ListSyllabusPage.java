package pages;

import res.Values;
import utils.GuiUtils;
import utils.Navigator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListSyllabusPage extends JPanel {
    private JPanel bottomPanel;
    private JPanel topPanel;
    private JPanel listPanel;
    private JTextField searchField;

    public void ListSyllabusPage(){
        bottomPanel = new JPanel();
        topPanel = new JPanel();
        listPanel =new JPanel();
        searchField = GuiUtils.buildTextFieldWithBorder();

        this.setLayout(new BorderLayout());
        this.setBackground(Values.AppColors.backgroundColor);

        settopPanel();
        this.add(topPanel,BorderLayout.NORTH);

        setbottomPanel();
        this.add(bottomPanel,BorderLayout.SOUTH);

        setlistPanel();
        this.add(listPanel,BorderLayout.CENTER);

    }

    private void settopPanel(){
        JPanel childTopPanel = new JPanel();
        childTopPanel.setBackground(Values.AppColors.textColor);
        childTopPanel.setPreferredSize(new Dimension(Values.formWidth-200,Values.formHeightSmall));
        childTopPanel.setLayout(new GridLayout(1,3));

        JLabel searchFieldLabel = new JLabel("Please type a course information for search");
        topPanel.add(searchFieldLabel);
        topPanel.add(searchField);


        JButton searchButton = new JButton("SEARCH");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }});
    }

    private void setbottomPanel(){
        JPanel childBottomPanel = new JPanel();
        childBottomPanel.setBackground(Values.AppColors.backgroundColor);
        childBottomPanel.setPreferredSize(new Dimension(Values.formWidth-200,Values.formHeightSmall));
        childBottomPanel.setLayout(new GridLayout(5,3));

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

    }

    private void setlistPanel(){
        JPanel childListPanel = new JPanel();
        childListPanel.setBackground(Values.AppColors.backgroundColor);
        childListPanel.setPreferredSize(new Dimension(Values.formWidth-200,Values.formHeightSmall));
        childListPanel.setLayout(new GridLayout(3,3));

    }
}
