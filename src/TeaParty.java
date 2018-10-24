
public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
		
		
		if (isKnighted) {
			if (isWoman) {
				name = "Lady " + name;
			}
			
			else {
				name = "Sir " + name;
			}
		} 
		
		else {
			if (isWoman) {
				name = "Ms. " + name;
			}
			
			else {
				name = "Mr. " + name;
			}
		}
		return "Hello " + name;
    }
}
