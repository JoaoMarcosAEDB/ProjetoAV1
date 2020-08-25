import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class projecal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projecal frame = new projecal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public projecal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 213, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button7 = new JButton("7");
		button7.setBounds(10, 55, 42, 23);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		button8.setBounds(69, 55, 42, 23);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		button9.setBounds(128, 55, 42, 23);
		contentPane.add(button9);
		
		JButton buttonDivisao = new JButton("/");
		buttonDivisao.setBounds(181, 55, 42, 23);
		contentPane.add(buttonDivisao);
		
		JButton button4 = new JButton("4");
		button4.setBounds(10, 89, 42, 23);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.setBounds(69, 89, 42, 23);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBounds(128, 89, 42, 23);
		contentPane.add(button6);
		
		JButton buttonMulti = new JButton("*");
		buttonMulti.setBounds(181, 89, 42, 23);
		contentPane.add(buttonMulti);
		
		JButton button1 = new JButton("1");
		button1.setBounds(10, 123, 42, 23);
		contentPane.add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBounds(69, 123, 42, 23);
		contentPane.add(button2);
		
		JButton button3 = new JButton("2");
		button3.setBounds(128, 123, 42, 23);
		contentPane.add(button3);
		
		JButton buttonSubtracao = new JButton("-");
		buttonSubtracao.setBounds(181, 123, 42, 23);
		contentPane.add(buttonSubtracao);
		
		JButton button0 = new JButton("0");
		button0.setBounds(10, 157, 42, 23);
		contentPane.add(button0);
		
		JButton buttonPonto = new JButton(".");
		buttonPonto.setBounds(69, 157, 42, 23);
		contentPane.add(buttonPonto);
		
		JButton buttonIgual = new JButton("=");
		buttonIgual.setBounds(128, 157, 42, 23);
		contentPane.add(buttonIgual);
		
		JButton buttonSoma = new JButton("+");
		buttonSoma.setBounds(181, 157, 42, 23);
		contentPane.add(buttonSoma);
		
		JButton buttonCE = new JButton("CE");
		buttonCE.setBounds(10, 205, 121, 45);
		contentPane.add(buttonCE);
		
		JButton buttonPorcentagem = new JButton("%");
		buttonPorcentagem.setBounds(144, 205, 79, 45);
		contentPane.add(buttonPorcentagem);
	}
}
