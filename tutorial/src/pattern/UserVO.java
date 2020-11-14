package pattern;

public class UserVO {

//  NO NUMBER(8) CONSTRAINT PK_USERTBL PRIMARY KEY,
//  USERNAME NCHAR(4) NOT NULL,
//  BIRTHYEAR NUMBER(4) NOT NULL,
//  ADDR NCHAR(4) NOT NULL,
//  MOBILE NVARCHAR2(13));	
	
	
	private int no;
	private String userName;
	private int birthYear;
	private String addr;
	private String mobile;
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "o=" + no + ", userName=" + userName + ", birthYear=" + birthYear + ", addr=" + addr
				+ ", mobile=" + mobile;
	}
	
	
	
	
	
	
	
	
	
	
	
}
