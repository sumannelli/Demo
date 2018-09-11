package com.qezy;


	import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

	public class PasswordEncoderGenerator {

	  public static void main(String[] args) {

	
	
			String password = "suman";
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(password);

			System.out.println(hashedPassword);
		//	$2a$10$nvSygYGePVizfIKp/COtO.XUSP4MRS2HdtodQhy5QY.wCaDLtED7K
			
	  }
}
