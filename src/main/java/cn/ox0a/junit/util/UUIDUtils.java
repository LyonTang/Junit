/**
 * 
 */
package cn.ox0a.junit.util;

import java.security.MessageDigest;
import java.util.Date;

/**
 * @author tangliang
 *
 */
public class UUIDUtils {
	private static String time(){
		return new Date().toString();
	}
	
	private static String UUID(){
		return java.util.UUID.randomUUID().toString();
	}
	
	private static String hash(String uuid){
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
			messageDigest.update(uuid.getBytes());
			return byte2hex(messageDigest.digest());
		} catch (Exception e) {
			return null;
		}
	}
	
	private static String byte2hex(byte[] bytes){
		if(bytes == null || bytes.length < 1){
			return null;
		}
		StringBuilder builder = new StringBuilder();
		String hexValue;
		for(byte iByte: bytes){
			hexValue = Integer.toHexString(iByte & 0xFF);
			if(hexValue.length() == 1){
				builder.append("0");
			}
			builder.append(hexValue);
		}
		return builder.toString();
	}
	
	public static String generate() {
		String rand = time() + UUID();
		return hash(rand);
	}
}
