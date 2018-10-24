
public class Vault {
	private int code;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int VaultCode) {
		code = VaultCode;
	}

	public boolean tryCode(int Code) {
		if (Code == code) {
			return true;
		} else {
			return false;
		}
	}
	
	
}

