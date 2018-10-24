import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class JamesBond {
	
		 public static int findCode() {
			Vault safe = new Vault();
			for (int i = 0; i < 1000000; i++) {
				if(safe.tryCode(i) == true) {
					return i;
				}
				
			}
			return -1;
		}
		 @Test
		 public static void main(String[] args) {
			 assertNotEquals(-1 ,findCode());
			}
	}

