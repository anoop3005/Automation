package com.Utils;

import java.util.Base64;

public class EncryptingDecrypting {
	
	public String encode(String credential) {
		byte[] encoded=Base64.getEncoder().encode(credential.getBytes());
		return encoded.toString();
	}

	public String decode(String str) {
		byte[] decoded=Base64.getDecoder().decode(str.getBytes());
		return decoded.toString();
	}
}
