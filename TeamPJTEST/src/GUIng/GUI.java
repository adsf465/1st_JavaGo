package GUIng;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
	JFrame frame = new JFrame();
	
	JLabel title = new JLabel("");
	
	JPanel Rpanel = new JPanel();
	JPanel subpanel = new JPanel();
	JLabel myInfo = new JLabel("");
	JPanel infopanel = new JPanel();
	JLabel mainImg = new JLabel();
	
	JPanel Lpanel = new JPanel();
	JLabel lectureindex = new JLabel("");
	private JButton ch1 = new JButton("");
	private JButton ch2 = new JButton("");
	private JButton ch3 = new JButton("");
	private JButton exitbt = new JButton("X");
	JLayeredPane bridgepanel = new JLayeredPane();
	
	MainFrame main1;
	
	private Color bgcolor = new Color(204, 204, 204);

	public GUI() {

		frame.setSize(750, 1000);
		frame.setUndecorated(true);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension di = tk.getScreenSize();
		Dimension di1 = frame.getSize();
		frame.setLocation((int) (di.getWidth() / 2 - di1.getWidth() / 2),
				(int) (di.getHeight() / 2 - di1.getHeight() / 2));
		frame.getContentPane().setBackground(bgcolor);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		this.init();
		this.click();
		frame.setVisible(true);

	}

	public void init() {

		
		title.setIcon(new ImageIcon(GUI.class.getResource("/Image/javago1.png")));
		title.setBounds(236, 50, 289, 234);
		frame.getContentPane().add(title);
		
		exitbt.setBounds(665, 10, 55, 62);
		frame.getContentPane().add(exitbt);
		exitbt.addActionListener(this);
		exitbt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()==exitbt){
					System.exit(0);
				}
			}
		});
	
		
		
		
		Rpanel.setBounds(405, 325, 315, 605);
		Rpanel.setBackground(bgcolor);
		frame.getContentPane().add(Rpanel);
		Rpanel.setLayout(null);

		
		myInfo.setHorizontalAlignment(SwingConstants.CENTER);
		myInfo.setBounds(0, 0, 315, 55);
		Rpanel.add(myInfo);
		myInfo.setIcon(new ImageIcon(GUI.class.getResource("/Image/lectureindexSub.png")));

		
		infopanel.setBounds(12, 86, 288, 509);
		Rpanel.add(infopanel);
		infopanel.setLayout(null);

		
		infopanel.add(mainImg);
		mainImg.setIcon(new ImageIcon(GUI.class.getResource("/Image/메인에있을거.png")));
		mainImg.setBounds(80, 162, 136, 156);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 86, 10, 10);
		Rpanel.add(panel);

		
		Lpanel.setBounds(30, 325, 315, 605);
		Lpanel.setBackground(bgcolor);
		frame.getContentPane().add(Lpanel);
		Lpanel.setLayout(null);
		lectureindex.setBounds(0, 0, 315, 55);

		

		Lpanel.add(lectureindex);
		lectureindex.setHorizontalAlignment(SwingConstants.CENTER);
		lectureindex.setIcon(new ImageIcon(GUI.class.getResource("/Image/lectureindexmain.png")));
		
		ch1.setBounds(17, 86, 290, 155);

		ch1.setFocusPainted(false);
		ch1.setContentAreaFilled(false);
		ch1.setBorderPainted(false);
		ch1.setIcon(new ImageIcon(GUI.class.getResource("/Image/CH1.png")));
		
		Lpanel.add(ch1);
		
		ch2.setBounds(17, 263, 290, 155);
		ch2.setBorderPainted(false);
		ch2.setFocusPainted(false);
		ch2.setContentAreaFilled(false);
		ch2.setIcon(new ImageIcon(GUI.class.getResource("/Image/CH2.png")));
		Lpanel.add(ch2);
		
		ch3.setBounds(17, 440, 290, 155);
		ch3.setFocusPainted(false);
		ch3.setContentAreaFilled(false);
		ch3.setBorderPainted(false);
		ch3.setIcon(new ImageIcon(GUI.class.getResource("/Image/CH3.png")));
		Lpanel.add(ch3);
		
		
		subpanel.setBackground(Color.WHITE);
		subpanel.setBounds(405, 325, 315, 605);
		subpanel.setVisible(false);
		frame.getContentPane().add(subpanel);
		//subpanel.setLayout(new CardLayout(0, 0));
		
		bridgepanel.setBackground(Color.WHITE);
		bridgepanel.setBounds(327, 464, 79, 47);
		frame.getContentPane().add(bridgepanel);
		
		
		
		
	}
	public void click(){
		ch1.addActionListener(this);
		ch1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()==ch1){
					ch2.setEnabled(false);
					ch3.setEnabled(false);
					subpanel.setVisible(true);
					Rpanel.setVisible(false);
					bridgepanel.setVisible(true);
				}
				
				
			}
		});ch1.addActionListener(this);
		ch2.addActionListener(this);
		ch3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ch1){
			
		}
		
	}
}
