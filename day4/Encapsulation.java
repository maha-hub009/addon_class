package OOPS_DAY4;
import java.util.Date;
public class Encapsulation {
	
	private String email;
	private String username;
	private long mobile;
	private boolean graduate;
	private Date age;
	private char gender;
	//setter
	public void setEmail(String email) {
		this.email = email ;
	}
	public void setUserName(String username) {
		this.username = username ;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile ;
	}
	public void setAge(Date age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}
//getter
	public String getEmail() {
		return email ;
	}
	public String getUserName() {
		return username;
	}
	public long getMobile(){
		return mobile;
	}
	public Date getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public boolean isGraduate() {
		return graduate;
	}
}
