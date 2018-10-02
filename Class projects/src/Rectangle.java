/*Clayton Fete
 * August 2nd 2017
 * Week six Assignment
 */
public class Rectangle {
	//instance variables set all to 1
	private double width = 1;
	private double length = 1;
	private double area = 1;
	private double perimeter = 1;
	
	//constructor
	public Rectangle (double width, double length) {
		
		//make sure value is over 1 **still need to figure out how to not go over 20
		if(length<0.0 || length>20) {
			this.length=1;
		}
		else {
			this.length=length;
		}
		if(width<0.0 || width>20) {
			this.width=1;
		}
		else {
			this.width=width;
		}
	}

	//method for perimeter
	public double perimeter() {
		this.perimeter = this.length*2 + this.width*2;
		return this.perimeter;
		}
	
	//method for area
	public double area(){
		this.area = this.length*this.width;
		return this.area;
	}
	
	//sets
	public void setWidth(double width) {
		if(width<0.0 || width>20) {
			this.width=1;
			}
		else {
			this.width=width;
			}
	}
	public void setLength(double length) {
		if(length<0.0 || length >20) {
			this.length=1;
			}
		else {
			this.length=length;
		}
	}
		
		//gets
		public double getLength() {
			return this.length;
		}
		public double getWidth() {
			return this.width;
		}
		public double getArea() {
			return this.area;
		}
		public double getPerimeter() {
			return this.perimeter;
		}
	}
	

