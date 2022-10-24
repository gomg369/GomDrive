package P03;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
	private MyPanel panel1 = new MyPanel(); 
	private JPanel panel2 = new JPanel();
	private JButton b1 = new JButton("저장");
	private JButton b2 = new JButton("불러오기");
	private JFileChooser fc = new JFileChooser();
	public MyFrame() {
		this.setSize(300, 300);
		this.setTitle("마우스로 사각형 그리기");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(panel1,BorderLayout.CENTER);
		panel2.add(b1);
		b1.addActionListener(this);
		panel2.add(b2);
		panel2.setLayout(new GridLayout(0,1,2,2));
		b2.addActionListener(this);
		this.add(panel2,BorderLayout.SOUTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			int returnVal = fc.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
			}
			else {}
	
		}
		
		if(e.getSource() == b2) {
			int returnVal = fc.showOpenDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				repaint();
			}
			else {}
	
		}
		
		
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
