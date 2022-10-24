package P03;

import java.awt.Point;

public class Rectangle {
	private int x, y, w, h; //x좌표, y좌표, 너비(밑변), 높이
	private Point start = null;
	private Point end = null;
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getW() {
		return this.w;
	}	
	public int getH() {
		return this.h;
	}
	
	public Point getStart() {
		return start;
	}
	
	public Point getEnd() {
		return end;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setW(int w) {
		this.w = w;
	}
	public void setH(int h) {
		this.h = h;
	}
	public void setStart(Point start) {
		this.start = start;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	
}
