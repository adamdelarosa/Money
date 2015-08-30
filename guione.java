package money;

import java.awt.EventQueue;


public class guione {

	private JFrame frmMoneycounter;
	private JTextField textFieldnum2;
	private JTextField textFieldans2;
	private JTextField textFieldans5;
	private JTextField textFieldnum5;
	private JTextField textFieldans10;
	private JTextField textFieldans20;
	private JTextField textFieldans50;
	private JTextField textFieldans100;
	private JTextField textFieldans200;
	private JTextField textFieldnum200;
	private JTextField textFieldnum01;
	private JTextField textFieldnum05;
	private JTextField textFieldans01;
	private JTextField textFieldans05;
	private JTextField textFieldnum10;
	private JTextField textFieldnum20;
	private JTextField textFieldnum50;
	private JTextField textFieldnum100;
	private JTextField textFieldanstotal;
	private JLabel lblTotal;
	private JTextField textFieldnum1;
	private JLabel lblX_2;
	private JTextField textFieldans1;
	private JLabel lblNewLabel200shek;
	private JLabel label100;
	private JLabel label2000;
	private JLabel label10;
	private JLabel label5;
	private JLabel logo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guione window = new guione();
					window.frmMoneycounter.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guione() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmMoneycounter = new JFrame();
		frmMoneycounter.setResizable(false);
		frmMoneycounter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMoneycounter.setTitle("MoneyCounter");
		frmMoneycounter.setBounds(100, 100, 320, 570);
		frmMoneycounter.getContentPane().setLayout(null);
		
		textFieldnum2 = new JTextField();
		textFieldnum2.setBounds(89, 173, 58, 28);
		textFieldnum2.setText("0");
		frmMoneycounter.getContentPane().add(textFieldnum2);
		textFieldnum2.setColumns(10);
		
		JButton btnNewButton2 = new JButton("Cash In!");
		btnNewButton2.setBounds(19, 451, 128, 29);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num01,num05,ans05,ans01,anstotal,userinput01,userinput05;
				int ans1,ans2,ans5,ans10,ans20,ans50,ans100,ans200,num1,num2,num5,num10,num20,num50,num100,num200,userinput1,userinput2,userinput5,userinput10,userinput20,userinput50,userinput100,userinput200;
						
				try {
					//coin one Shekel
					
					num01 = 0.10;
					num05 = 0.5;
					num1 = 1;
					num2 = 2;
					num5 = 5;
					num10 = 10;
					num20 = 20;
					num50 = 50;
					num100 = 100;
					num200 = 200;
					
					
					
					userinput01 = Integer.parseInt(textFieldnum01.getText());
					userinput05 = Integer.parseInt(textFieldnum05.getText());
					userinput1 = Integer.parseInt(textFieldnum1.getText());
					userinput2 = Integer.parseInt(textFieldnum2.getText());
					userinput5 = Integer.parseInt(textFieldnum5.getText());
					userinput10 = Integer.parseInt(textFieldnum10.getText());
					userinput20 = Integer.parseInt(textFieldnum20.getText());
					userinput50 = Integer.parseInt(textFieldnum50.getText());
					userinput100 = Integer.parseInt(textFieldnum100.getText());
					userinput200 = Integer.parseInt(textFieldnum200.getText());
					
					
					
					ans01=userinput01*num01;
					ans05=userinput05*num05;
					ans1=userinput1*num1;
					ans2=userinput2*num2;
					ans2=userinput2*num2;
					ans5=userinput5*num5;
					ans10=userinput10*num10;
					ans20=userinput20*num20;
					ans50=userinput50*num50;
					ans100=userinput100*num100;
					ans200=userinput200*num200;
					
					anstotal = ans01+ans05+ans1+ans2+ans5+ans10+ans20+ans50+ans100+ans200;
					
					textFieldans01.setText(Double.toString(ans01));
					textFieldans05.setText(Double.toString(ans05));
					textFieldans1.setText(Integer.toString(ans1));
					textFieldans2.setText(Integer.toString(ans2));
					textFieldans5.setText(Integer.toString(ans5));
					textFieldans10.setText(Integer.toString(ans10));
					textFieldans20.setText(Integer.toString(ans20));
					textFieldans50.setText(Integer.toString(ans50));
					textFieldans100.setText(Integer.toString(ans100));
					textFieldans200.setText(Integer.toString(ans200));
					
					textFieldanstotal.setText(Double.toString(anstotal));
			
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please ENTER NUMBERS Only!");
				}
			}
		});
		frmMoneycounter.getContentPane().add(btnNewButton2);
		
		textFieldans2 = new JTextField("0");
		textFieldans2.setBounds(244, 173, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldans2);
		textFieldans2.setColumns(10);
		
		textFieldans5 = new JTextField("0");
		textFieldans5.setBounds(244, 213, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldans5);
		textFieldans5.setColumns(10);
		
		textFieldnum5 = new JTextField("0");
		textFieldnum5.setBounds(89, 213, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldnum5);
		textFieldnum5.setColumns(10);
		
		textFieldans10 = new JTextField("0");
		textFieldans10.setBounds(244, 251, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldans10);
		textFieldans10.setColumns(10);
		
		textFieldans20 = new JTextField("0");
		textFieldans20.setBounds(244, 291, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldans20);
		textFieldans20.setColumns(10);
		
		textFieldans50 = new JTextField("0");
		textFieldans50.setBounds(244, 331, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldans50);
		textFieldans50.setColumns(10);
		
		textFieldans100 = new JTextField("0");
		textFieldans100.setBounds(244, 371, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldans100);
		textFieldans100.setColumns(10);
		
		textFieldans200 = new JTextField("0");
		textFieldans200.setBounds(244, 411, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldans200);
		textFieldans200.setColumns(10);
		
		textFieldnum200 = new JTextField("0");
		textFieldnum200.setBounds(89, 411, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldnum200);
		textFieldnum200.setColumns(10);
		
		JLabel label200 = new JLabel("2");
		label200.setBounds(19, 291, 58, 28);
		frmMoneycounter.getContentPane().add(label200);
		
		JLabel lblX_4 = new JLabel("x      5      =");
		lblX_4.setBounds(159, 213, 133, 28);
		frmMoneycounter.getContentPane().add(lblX_4);
		
		textFieldnum01 = new JTextField("0");
		textFieldnum01.setBounds(89, 53, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldnum01);
		textFieldnum01.setColumns(10);
		
		textFieldnum05 = new JTextField("0");
		textFieldnum05.setBounds(89, 93, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldnum05);
		textFieldnum05.setColumns(10);
		
		textFieldans01 = new JTextField("0");
		textFieldans01.setBounds(244, 53, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldans01);
		textFieldans01.setColumns(10);
		
		textFieldans05 = new JTextField("0");
		textFieldans05.setBounds(244, 93, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldans05);
		textFieldans05.setColumns(10);
		
		JLabel lblX = new JLabel("x    0.1     =");
		lblX.setBounds(159, 53, 143, 28);
		frmMoneycounter.getContentPane().add(lblX);
		
		JLabel lblX_1 = new JLabel("x    0.5     =");
		lblX_1.setBounds(159, 93, 143, 28);
		frmMoneycounter.getContentPane().add(lblX_1);
		
		textFieldnum10 = new JTextField("0");
		textFieldnum10.setBounds(89, 251, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldnum10);
		textFieldnum10.setColumns(10);
		
		JLabel lblX_5 = new JLabel("x     10     =");
		lblX_5.setBounds(159, 251, 133, 28);
		frmMoneycounter.getContentPane().add(lblX_5);
		
		textFieldnum20 = new JTextField("0");
		textFieldnum20.setBounds(89, 291, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldnum20);
		textFieldnum20.setColumns(10);
		
		JLabel lblX_6 = new JLabel("x     20     =");
		lblX_6.setBounds(159, 291, 133, 28);
		frmMoneycounter.getContentPane().add(lblX_6);
		
		textFieldnum50 = new JTextField("0");
		textFieldnum50.setBounds(89, 331, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldnum50);
		textFieldnum50.setColumns(10);
		
		JLabel lblX_7 = new JLabel("x     50     =");
		lblX_7.setBounds(159, 331, 133, 28);
		frmMoneycounter.getContentPane().add(lblX_7);
		
		JLabel lblX_8 = new JLabel("x    100    =");
		lblX_8.setBounds(159, 371, 133, 28);
		frmMoneycounter.getContentPane().add(lblX_8);
		
		textFieldnum100 = new JTextField("0");
		textFieldnum100.setBounds(89, 371, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldnum100);
		textFieldnum100.setColumns(10);
		
		JLabel lblX_9 = new JLabel("x    200    =");
		lblX_9.setBounds(159, 411, 133, 28);
		frmMoneycounter.getContentPane().add(lblX_9);
		
		textFieldanstotal = new JTextField("0");
		textFieldanstotal.setBounds(244, 450, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldanstotal);
		textFieldanstotal.setColumns(10);
		
		lblTotal = new JLabel("Total =");
		lblTotal.setBounds(179, 450, 58, 28);
		frmMoneycounter.getContentPane().add(lblTotal);
		
		textFieldnum1 = new JTextField("0");
		textFieldnum1.setBounds(89, 133, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldnum1);
		textFieldnum1.setColumns(10);
		
		lblX_2 = new JLabel("x      1      =");
		lblX_2.setBounds(159, 133, 146, 28);
		frmMoneycounter.getContentPane().add(lblX_2);
		
		textFieldans1 = new JTextField("0");
		textFieldans1.setBounds(244, 133, 58, 28);
		frmMoneycounter.getContentPane().add(textFieldans1);
		textFieldans1.setColumns(10);	
		JButton resetButton = new JButton("Clear");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			try {				
				textFieldans01.setText("0");
				textFieldans05.setText("0");
				textFieldans1.setText("0");
				textFieldans2.setText("0");
				textFieldans5.setText("0");
				textFieldans10.setText("0");
				textFieldans20.setText("0");
				textFieldans50.setText("0");
				textFieldans100.setText("0");
				textFieldans200.setText("0");
				textFieldanstotal.setText("0");
				textFieldnum01.setText("0");
				textFieldnum05.setText("0");
				textFieldnum1.setText("0");
				textFieldnum2.setText("0");
				textFieldnum5.setText("0");
				textFieldnum10.setText("0");
				textFieldnum20.setText("0");
				textFieldnum50.setText("0");
				textFieldnum200.setText("0");
				textFieldnum100.setText("0");
				
				     
				
				
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please ENTER NUMBERS Only!");
			}
			}
			
			
		});
		resetButton.setBounds(226, 501, 76, 28);
		frmMoneycounter.getContentPane().add(resetButton);
		
		JLabel label_50 = new JLabel("");
		Image img50 = new  ImageIcon(this.getClass().getResource("/50.png")).getImage();
		label_50.setIcon(new ImageIcon(img50));
		label_50.setBounds(19, 331, 58, 28);
		frmMoneycounter.getContentPane().add(label_50);
		
		JLabel lblX_3 = new JLabel("x      2      =");
		lblX_3.setBounds(159, 179, 136, 16);
		frmMoneycounter.getContentPane().add(lblX_3);
		
		lblNewLabel200shek = new JLabel("");
		Image img200 = new  ImageIcon(this.getClass().getResource("/200.png")).getImage();
		label200.setIcon(new ImageIcon(img200));
		lblNewLabel200shek.setBounds(12, 405, 61, 16);
		frmMoneycounter.getContentPane().add(label200);
		
		label100 = new JLabel("");
		Image img100 = new  ImageIcon(this.getClass().getResource("/100.png")).getImage();
		label100.setIcon(new ImageIcon(img100));
		label100.setBounds(19, 371, 58, 28);
		frmMoneycounter.getContentPane().add(label100);
		
		label2000 = new JLabel("");
		Image img2000 = new  ImageIcon(this.getClass().getResource("/2000.png")).getImage();
		label2000.setIcon(new ImageIcon(img2000));
		label2000.setBounds(19, 411, 58, 28);
		frmMoneycounter.getContentPane().add(label2000);
		
		label10 = new JLabel("");
		Image img10 = new  ImageIcon(this.getClass().getResource("/10.png")).getImage();
		label10.setIcon(new ImageIcon(img10));
		label10.setBounds(27, 247, 40, 40);
		frmMoneycounter.getContentPane().add(label10);
		
		label5 = new JLabel("");
		Image img5 = new  ImageIcon(this.getClass().getResource("/5.png")).getImage();
		label5.setIcon(new ImageIcon(img5));
		label5.setBounds(27, 207, 40, 40);
		frmMoneycounter.getContentPane().add(label5);
		
		JLabel label2shek = new JLabel("New label");
		Image img2 = new  ImageIcon(this.getClass().getResource("/2.png")).getImage();
		label2shek.setIcon(new ImageIcon(img2));
		label2shek.setBounds(27, 167, 40, 40);
		frmMoneycounter.getContentPane().add(label2shek);
		
		JLabel label1shek = new JLabel("New label");
		Image img1 = new  ImageIcon(this.getClass().getResource("/1.png")).getImage();
		label1shek.setIcon(new ImageIcon(img1));
		label1shek.setBounds(27, 127, 40, 40);
		frmMoneycounter.getContentPane().add(label1shek);
		
		JLabel label05 = new JLabel("New label");
		Image img05 = new  ImageIcon(this.getClass().getResource("/05.png")).getImage();
		label05.setIcon(new ImageIcon(img05));
		label05.setBounds(27, 87, 40, 40);
		frmMoneycounter.getContentPane().add(label05);
		
		JLabel label011 = new JLabel("New label");
		Image img01 = new  ImageIcon(this.getClass().getResource("/01.png")).getImage();
		label011.setIcon(new ImageIcon(img01));
		label011.setBounds(27, 47, 40, 40);
		frmMoneycounter.getContentPane().add(label011);
		
		JLabel lblNewLabel = new JLabel("CashIn - Auto Count Your Stash!");
		lblNewLabel.setFont(new Font("Arial Unicode MS", Font.PLAIN, 15));
		lblNewLabel.setBounds(55, 18, 214, 16);
		frmMoneycounter.getContentPane().add(lblNewLabel);
		
		logo = new JLabel("1");
		Image imglogo = new  ImageIcon(this.getClass().getResource("/logo.png")).getImage();
		logo.setIcon(new ImageIcon(imglogo));
		logo.setBounds(18, 487, 172, 55);
		frmMoneycounter.getContentPane().add(logo);
	        
	    }
}
