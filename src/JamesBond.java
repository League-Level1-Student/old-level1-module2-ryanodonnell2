import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

public class JamesBond {
	
		 public static int findCode() {
			Vault safe = new Vault();
			String stringSetCode = JOptionPane.showInputDialog("Code?");
			int setCode = Integer.parseInt(stringSetCode);
			if (setCode > 0 && setCode < 1000001) {
				safe.setCode(setCode);
			} else {
				JOptionPane.showMessageDialog(null, "Your code was either less than 1 or greater that 1 million and 1. So your code is: 11111");
				safe.setCode(11111);
			}
			for (int i = 1; i < 1000000; i++) {
				if(safe.tryCode(i) == true) {
					return i;
				}
				
			}
			return -1;
		}
		 @Test
		 public static void main(String[] args) {
			 int code = findCode();
			 assertNotEquals(-1 ,findCode());
			 JOptionPane.showMessageDialog(null, code);
			}
	}

