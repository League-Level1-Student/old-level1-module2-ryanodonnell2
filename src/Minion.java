
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
	public int getEyes() {
		return eyes;
	}
	public String getColor() {
		return color;
	}
	public String getMaster() {
		return master;
	}
	
	public void setName(String names) {
		name = names;
	}
	public void setColor(String colors) {
		color = colors;
	}
	public void setMaster(String masters) {
		master = masters;
	}
	public void setEyes(int eyeAmount) {
		if (eyeAmount >= 0) {
			eyes = eyeAmount;
		}
	}
	
	
	
	
}
