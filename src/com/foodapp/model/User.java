
package com.foodapp.model;

import com.foodapp.validator.UserValidatorTest;

public class User {
	private int id;
	private String name;
	private String email;
	private String contactNumber;
	private String createPassword;
	private String conformPassword;
	public  int getId() {
		return id;
	}
	public  void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		/*if(name.isEmpty()|| name.isBlank()) {
			System.err.println("Invalid Name");
		}*/
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) throws Exception {
		/*if(email==null || !email.contains("@gmail.com")) {
			System.err.println("Invalid Email");
			UserValidatorTest.userRegister();
		}*/
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		/*if(contactNumber.length()!=10) {
			System.err.println("Invalid Contact number: pls..declare the 10 digit");
		}*/
		this.contactNumber = contactNumber;
	}
	public String getCreatePassword() {
		return createPassword;
	}
	public void setCreatePassword(String createPassword) {
	/*if(createPassword==null||createPassword.length()<8) {
			System.err.println("invalid Password...Password must be minimum 8 digit");
		}*/
		this.createPassword = createPassword;
	}
	public String getConformPassword() {
		return conformPassword;
	}
	public void setConformPassword(String conformPassword) {
		/*if(!conformPassword.equals(getCreatePassword()) ) {
			System.out.println(getCreatePassword());
			System.out.println(conformPassword);
			System.err.println("Invalid Password...Password not match");
		}*/
		this.conformPassword = conformPassword;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", createPassword=" + createPassword + ", conformPassword=" + conformPassword + "]";
	}
	

}
