class Point{
class Point{
	public double x;
	public double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	public double  turnX(){
		double x,y,fi;
		fi = 90*(Math.PI/180);
		x = this.x * (Math.cos(fi) - Math.sin(fi));
	
return x;}

	public double  turnY(){
		double x,y,fi;
		fi = 90*(Math.PI/180);
		y = this.y * (Math.sin(fi) + Math.cos(fi));
	
return y;}
}