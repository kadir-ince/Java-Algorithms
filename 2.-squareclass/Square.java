
public class Square {
	private int edge;
	
	public Square() {
		
	}
	
    public Square(int edge) {
		
	}
	
	public int getEdge() {
		return edge;
	}
	
	public void setEdge(int edge) {
		this.edge = edge;
	}
	
	public int area() {
		return this.edge * this.edge;
	}
	
	public int primeter() {
		return 4 * this.edge;
	}
	
	@Override
	public String toString() {
		return "" + this.edge;
	}
}