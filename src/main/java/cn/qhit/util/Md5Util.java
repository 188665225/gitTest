package cn.qhit.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

public class Md5Util {
	@SuppressWarnings("restriction")
	public String encryption(String value) {
		try {
			MessageDigest digest = MessageDigest.getInstance("md5");
			byte[] b = digest.digest(value.getBytes());
			BASE64Encoder encoder = new BASE64Encoder();
		
			return encoder.encode(b);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
