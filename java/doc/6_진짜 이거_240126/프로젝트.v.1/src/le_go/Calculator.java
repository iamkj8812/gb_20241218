package le_go;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private String func = "ADD";
	private double firstNumber; // 계산기 첫 정수 데이터 안 날아가게

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
		
	}

	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 357, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		

		
		JLabel answer = new JLabel("0");
		answer.setHorizontalAlignment(SwingConstants.RIGHT);
		answer.setFont(new Font("맑은 고딕", Font.BOLD, 50));
		answer.setBounds(12, 32, 316, 75);
		frame.getContentPane().add(answer);
		
		
		JButton btnDot = new JButton(".");			// 정수 실수로 바꿔야돼 Integer.parseint -> double.parsedouble
		btnDot.setBackground(new Color(255, 255, 255));
		btnDot.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btnDot.setBounds(12, 366, 70, 66);
		frame.getContentPane().add(btnDot);
		
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 255, 255));
		btn0.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btn0.setBounds(94, 366, 70, 66);
		frame.getContentPane().add(btn0);
		
		JButton btnResult = new JButton("=");
		btnResult.setForeground(new Color(255, 255, 255));
		btnResult.setBackground(new Color(0, 64, 128));
		btnResult.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        double result = 0;
		        double currValue = Double.parseDouble(answer.getText());
		        switch(func) {											// 사칙연산 버튼에 따른 기능
		            case "ADD" : {
		                result = firstNumber + currValue;
		                break;
		            }
		            case "Sub" : {
		                result = firstNumber - currValue;
		                break;
		            }
		            case "Mult" : {
		                result = firstNumber * currValue;
		                break;
		            }
		            case "Div" : {
		                result = firstNumber / currValue;
		                break;
		            }
		        }

		        // Math.floor 함수로 정수 실수 구분하기
		        if (result == Math.floor(result)) {
		            // 결과가 정수면 int로 형변환
		            answer.setText(Integer.toString((int) result));
		        } else {
		            answer.setText(Double.toString(result));
		        }
		    }
		});
		answer.setText("0");// 계산 끝나고도 다시 0 으로 돌아와
		btnResult.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btnResult.setBounds(176, 366, 70, 66);
		frame.getContentPane().add(btnResult);
		
		
		// 사칙연산 버튼들
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(new Color(255, 255, 255));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "Div";
			}
		});
		btnDiv.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btnDiv.setBounds(258, 366, 70, 66);
		frame.getContentPane().add(btnDiv);
		
		JButton btnMul = new JButton("*");
		btnMul.setVerticalAlignment(SwingConstants.BOTTOM);
		btnMul.setBackground(new Color(255, 255, 255));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "Mult";
			}
		});
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(new Color(255, 255, 255));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "Sub";
			}
		});
		
		JButton btnPlus = new JButton("+");
		btnPlus.setBackground(new Color(255, 255, 255));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0"); 
				func = "ADD";
			}
		});
		
		btnMul.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btnMul.setBounds(258, 290, 70, 66);
		frame.getContentPane().add(btnMul);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 255, 255));
		btn3.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btn3.setBounds(176, 290, 70, 66);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 255, 255));
		btn2.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btn2.setBounds(94, 290, 70, 66);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btn1.setBounds(12, 290, 70, 66);
		frame.getContentPane().add(btn1);
		

		btnSub.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btnSub.setBounds(258, 214, 70, 66);
		frame.getContentPane().add(btnSub);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 255, 255));
		btn6.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btn6.setBounds(176, 214, 70, 66);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 255, 255));
		btn5.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btn5.setBounds(94, 214, 70, 66);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 255, 255));
		btn4.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btn4.setBounds(12, 214, 70, 66);
		frame.getContentPane().add(btn4);
		

		btnPlus.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btnPlus.setBounds(258, 138, 70, 66);
		frame.getContentPane().add(btnPlus);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btn9.setBounds(176, 138, 70, 66);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 255, 255));
		btn8.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btn8.setBounds(94, 138, 70, 66);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 255, 255));
		btn7.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btn7.setBounds(12, 138, 70, 66);
		frame.getContentPane().add(btn7);
		
		btn0.addActionListener(new NumberActionListener(answer,"0"));
		btn1.addActionListener(new NumberActionListener(answer,"1"));
		btn2.addActionListener(new NumberActionListener(answer,"2"));
		btn3.addActionListener(new NumberActionListener(answer,"3"));
		btn4.addActionListener(new NumberActionListener(answer,"4"));
		btn5.addActionListener(new NumberActionListener(answer,"5"));
		btn6.addActionListener(new NumberActionListener(answer,"6"));
		btn7.addActionListener(new NumberActionListener(answer,"7"));
		btn8.addActionListener(new NumberActionListener(answer,"8"));
		btn9.addActionListener(new NumberActionListener(answer,"9"));
		btnDot.addActionListener(new NumberActionListener(answer,"."));
		
		
		// AC로 초기화
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 answer.setText("0");
			        firstNumber = 0;
			        func = "ADD";
			}
		});
		btnAC.setBackground(new Color(255, 255, 255));
		btnAC.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		btnAC.setBounds(12, 442, 317, 66);
		frame.getContentPane().add(btnAC);
		
	}
}



class NumberActionListener implements ActionListener{
// 버튼 누르면 작동되게
	private JLabel label;
	private String text;
	
	
	public NumberActionListener(JLabel l, String s) {
		label = l;
		text = s;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String curr = label.getText();
		if(curr.equals("0")) {
			label.setText(text);
		}else {
			label.setText(label.getText()+text);
		}
	}
	
}

