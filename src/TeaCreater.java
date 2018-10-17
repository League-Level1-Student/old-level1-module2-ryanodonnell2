
public class TeaCreater {
public static void main(String[] args) {
	TeaBag flavor = new TeaBag(TeaBag.Shamanjo);
	
	Kettle ket = new Kettle();
	ket.boil();

	
	
	Cup fire = new Cup();
	
	fire.makeTea(flavor, ket.getWater());
}
}
