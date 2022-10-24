package P03;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;



public class MyPanel extends JPanel {
	private Point str, end;
	private Rectangle[] array = new Rectangle[1000];
	private int index = 0;
	public MyPanel() {
		this.addMouseListener(new MouseAdapter() {
//			public void mousePressed(MouseEvent e) {
//				if(index >= 100)
//					return;
//				array[index] = new Rectangle();
//				array[index].setX(e.getX());
//				array[index].setY(e.getY());
//				array[index].setW(50);
//				array[index].setH(50);
//				index++;
//				repaint();
//			}
			public void mouseReleased(MouseEvent e) {
				Rectangle r = new Rectangle();
				r.setEnd(e.getPoint());
				end = r.getEnd();
				Graphics g = getGraphics();
				g.drawRect(str.x, str.y, Math.abs(str.x - end.x), Math.abs(str.y - end.y));
				
			}
			
			public void mousePressed(MouseEvent e) {
				Rectangle r = new Rectangle();
				r.setStart(e.getPoint());
				str = r.getStart();
				}
		});
		
		
	}
	
//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
////		for(Rectangle r : array)
////			if(r != null)
////				g.drawRect(r.getX(), r.getY(), r.getW(), r.getH());
//		g.drawRect(str.x, str.y, Math.abs(str.x - end.x), Math.abs(str.y - end.y));
//	}
//	
	
	
}
