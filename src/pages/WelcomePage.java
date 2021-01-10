package pages;

import res.Values;
import utils.Navigator;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class WelcomePage extends JPanel{
	private JPanel topPanel;
	private JLabel welcomeTextLabel;
	private JLabel logoLabel;
	private JPanel buttonPanel;
	private JButton createSyllabusButton;
	private JButton fetchSyllabusButton;
	private JButton listSyllabusButton;
	private JButton exitButton;

	/**
	 * Create the application.
	 */
	public WelcomePage() {
		this.setLayout(null);

		topPanel = new JPanel();
		createTopPanel();
		
		buttonPanel = new JPanel();
		createMenuPanel();
	}

	public void openCreateSyllabusPage()
	{
		Navigator.push(new CreateSyllabusPage());
	}
	
	public void fetchSyllabusPage()
	{
		//FetchSyllabusPage fetchPage= new FetchSyllabusPage();
	}
	
	public void syllabusListPage()
	{
		//SyllabusListPage listPage= new SyllabusListPage();
	}
	
	public void exitProgram()
	{
		System.exit(0);
	}

	public void changeColor(JButton button, Color color)
	{
		button.setBackground(color);
	}

	public void createTopPanel()
	{
		topPanel.setBackground(Values.AppColors.indigo);
		topPanel.setBounds(0, 0, Values.screenWidth, 132);
		this.add(topPanel);
		topPanel.setLayout(null);
		
		welcomeTextLabel = new JLabel("WELCOME TO SYLLABUS EDITOR APP");
		welcomeTextLabel.setForeground(Values.AppColors.greyLight);
		welcomeTextLabel.setFont(new Font("Monospaced", Font.BOLD, 35));
		welcomeTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeTextLabel.setBounds(344, 52, 666, 41);
		topPanel.add(welcomeTextLabel);
		
		logoLabel = new JLabel();
		logoLabel.setBounds(50, 5, 120, 120);
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("assets/ieuLogo2.png"));
			Image scaledImage = img.getScaledInstance(
					logoLabel.getWidth(),
					logoLabel.getHeight(),
					Image.SCALE_SMOOTH);
			ImageIcon ieuLogo = new ImageIcon(scaledImage);
			logoLabel.setIcon(ieuLogo);
			topPanel.add(logoLabel);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void createMenuPanel()
	{
		buttonPanel.setBackground(Values.AppColors.primaryColor);
		buttonPanel.setBounds(0, 132, 239, Values.screenHeight - 132);
		this.add(buttonPanel);
		buttonPanel.setLayout(null);
		
		createSyllabusButton = new JButton("CREATE \r\n\r\r\nSYLLABUS");
		createSyllabusButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(createSyllabusButton, Values.AppColors.grey);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(createSyllabusButton, Values.AppColors.greyLight);
			}
			@Override
			public void mouseClicked(MouseEvent e) {

				openCreateSyllabusPage();
				
			}
		});
		createSyllabusButton.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		createSyllabusButton.setBackground(Values.AppColors.greyLight);
		createSyllabusButton.setBounds(31, 60, 171, 48);
		buttonPanel.add(createSyllabusButton);
		
		fetchSyllabusButton = new JButton("IMPORT SYLLABUS");
		fetchSyllabusButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(fetchSyllabusButton, Values.AppColors.grey);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(fetchSyllabusButton, Values.AppColors.greyLight);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				fetchSyllabusPage();
			}
		});
		fetchSyllabusButton.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		fetchSyllabusButton.setBackground(Values.AppColors.greyLight);
		fetchSyllabusButton.setBounds(31, 168, 171, 48);
		buttonPanel.add(fetchSyllabusButton);
		
		listSyllabusButton = new JButton("LIST ALL SYLLABI");
		listSyllabusButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(listSyllabusButton, Values.AppColors.grey);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(listSyllabusButton, Values.AppColors.greyLight);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				syllabusListPage();
				
			}
		});
		listSyllabusButton.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		listSyllabusButton.setBackground(Values.AppColors.greyLight);
		listSyllabusButton.setBounds(31, 276, 171, 48);
		buttonPanel.add(listSyllabusButton);
		
		exitButton = new JButton("EXIT");
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(exitButton, Values.AppColors.grey);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(exitButton, Values.AppColors.greyLight);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				exitProgram();
			}
		});
		exitButton.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		exitButton.setBackground(Values.AppColors.greyLight);
		exitButton.setBounds(31, 384, 171, 48);
		buttonPanel.add(exitButton);
	}
}
