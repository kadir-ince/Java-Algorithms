
public class Shape {
	private int width;
	private int height;
	private int depth;
	private int count;
	
	public Shape() {
		count++;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		return "width : " + this.width + " heigth : " + this.height + " depth : " + this.depth;
	}
}