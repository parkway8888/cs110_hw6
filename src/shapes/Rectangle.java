package shapes;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int l, int h){
		this.width = l;
		this.height = h;
	}
	
	public int getArea(){
		return this.width*this.height;
	}
}
