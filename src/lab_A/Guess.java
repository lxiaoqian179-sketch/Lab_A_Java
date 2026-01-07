package lab_A;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Guess extends JFrame implements ActionListener{
	private JButton guess;
	private JTextField input;
	private JTextArea log;
	private String answer;
	
	public Guess() {
		super("猜數字遊戲");
		
		guess = new JButton("猜");
		input = new JTextField();
		log = new JTextArea();
		
		setLayout(new BorderLayout());
		add(log, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new BorderLayout());
		add(top, BorderLayout.NORTH);
		
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		initGame();
		guess.addActionListener(this);
//		guess.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("OK2");
//			}
//		});
	}
	
	private void initGame() {
		answer = createAnswer(3);
		//System.out.println(answer);
	}
	
	private String createAnswer(int d) {
		final int num = 10;
		int[] poker = new int[num];
		for (int i=0; i<num; i++) poker[i] = i;
		
		for (int i = num - 1; i > 0; i--) {
			int r = (int)(Math.random()*(i+1));
			// poker[i] <=> poker[r]
			int temp = poker[i];
			poker[i] = poker[r];
			poker[r] = temp;
		}		
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<d; i++) sb.append(poker[i]);
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		new Guess();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String g = input.getText();
		String result = checkAB(g);
		log.append(String.format("%s => %s\n", g, result));
		
		input.setText("");
	}
	
	private String checkAB(String g) {
		int A, B; A = B = 0;
		
		for (int i=0; i<answer.length() ;i++) {
			if (answer.charAt(i) == g.charAt(i)) {
				A++;
			}else if (answer.indexOf(g.charAt(i)) != -1){
				B++;
			}
		}
		
		return String.format("%dA%dB", A, B);
	}
	
	
}