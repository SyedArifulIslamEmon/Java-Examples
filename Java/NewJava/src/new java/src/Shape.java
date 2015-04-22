


public class Shape {
		
	private String color = "red";
	private boolean filled = true;
	
	public Shape(){

 }
	public Shape(String color, boolean filled){
		
		this.color=color;
		this.filled=filled;
 }
	public String getColor(){
		return "red";
 }
	public void setColor(String color){
		this.color=color;
 }
	public boolean isFilled(){
		return true;
 }
	public void setFilled(boolean filled){
		this.filled=filled;
 }
	public String toString(){
		return "Shape[color="+color+", filled="+"]";
 }
 }
