package pages;

import res.Values;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
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

	public void createSyllabusPage()
	{
		//CreateSyllabusPage createPage= new CreateSyllabusPage();
		
		//displayPanel.add(createPage);
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
		topPanel.setBackground(new Color(50, 80, 130));
		topPanel.setBounds(0, 0, Values.screenWidth, 132);
		this.add(topPanel);
		topPanel.setLayout(null);
		
		welcomeTextLabel = new JLabel("WELCOME TO SYLLABUS EDITOR APP");
		welcomeTextLabel.setForeground(new Color(224, 255, 255));
		welcomeTextLabel.setFont(new Font("Monospaced", Font.BOLD, 35));
		welcomeTextLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeTextLabel.setBounds(344, 52, 666, 41);
		topPanel.add(welcomeTextLabel);
		
		logoLabel = new JLabel();
		logoLabel.setBounds(50, 5, 120, 120);
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("assets/ic_logo.png"));
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
		buttonPanel.setBackground(new Color(205, 133, 63));
		buttonPanel.setBounds(0, 132, 239, Values.screenHeight - 132);
		this.add(buttonPanel);
		buttonPanel.setLayout(null);
		
		createSyllabusButton = new JButton("CREATE \r\n\r\r\nSYLLABUS");
		createSyllabusButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(createSyllabusButton,new Color(128, 128, 128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(createSyllabusButton,new Color(211, 211, 211));
			}
			@Override
			public void mouseClicked(MouseEvent e) {

				createSyllabusPage();
				
			}
		});
		createSyllabusButton.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		createSyllabusButton.setBackground(new Color(211, 211, 211));
		createSyllabusButton.setBounds(31, 60, 171, 48);
		buttonPanel.add(createSyllabusButton);
		
		fetchSyllabusButton = new JButton("IMPORT SYLLABUS");
		fetchSyllabusButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(fetchSyllabusButton,new Color(128, 128, 128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(fetchSyllabusButton,new Color(211, 211, 211));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				fetchSyllabusPage();
			}
		});
		fetchSyllabusButton.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		fetchSyllabusButton.setBackground(new Color(211, 211, 211));
		fetchSyllabusButton.setBounds(31, 168, 171, 48);
		buttonPanel.add(fetchSyllabusButton);
		
		listSyllabusButton = new JButton("LIST ALL SYLLABI");
		listSyllabusButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(listSyllabusButton,new Color(128, 128, 128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(listSyllabusButton,new Color(211, 211, 211));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				syllabusListPage();
				
			}
		});
		listSyllabusButton.setFont(new Font("Palatino Linotype", Font.BOLD, 15));
		listSyllabusButton.setBackground(new Color(211, 211, 211));
		listSyllabusButton.setBounds(31, 276, 171, 48);
		buttonPanel.add(listSyllabusButton);
		
		exitButton = new JButton("EXIT");
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				changeColor(exitButton,new Color(128, 128, 128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				changeColor(exitButton,new Color(211, 211, 211));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				exitProgram();
			}
		});
		exitButton.setFont(new Font("Palatino Linotype", Font.BOLD, 17));
		exitButton.setBackground(new Color(211, 211, 211));
		exitButton.setBounds(31, 384, 171, 48);
		buttonPanel.add(exitButton);
	}
}
