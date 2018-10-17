
public class TeaCreater {
public static void main(String[] args) {
	TeaBag flavor = new TeaBag(TeaBag.Shamanjo);
	
	Kettle Plate = new Kettle();
	Plate.addWater();
	Plate.boil();

	
	
	Cup fire = new Cup();
	
	fire.makeTea(flavor, Plate.getWater());
}
}
