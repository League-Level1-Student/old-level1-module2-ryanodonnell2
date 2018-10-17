
public class Minion {

	private String name; 
		private int eyes; 
		private String color; 
		private String master;
		
	public Minion(String name, int eyes, String color, String master) {
	this.name = name;
	this.eyes = eyes;
	this.color = color;
	this.master = master;
	
	}
	
	public String getName() {
		return name;
	}
	public int geteyes() {
		return eyes;
	}
	public String getcolor() {
		return color;
	}
	public String getmaster() {
		return master;
	}
	
	public void setName(String names) {
		name = names;
	}
	public void setcolor(String colors) {
		color = colors;
	}
	public void setmaster(String masters) {
		name = masters;
	}
	public void seteyes(int eyeAmount) {
		if (eyeAmount >= 0) {
			eyes = eyeAmount;
		}
	}
	
	
	
	
}
