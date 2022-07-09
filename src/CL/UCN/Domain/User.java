package CL.UCN.Domain;

public class User
{
	private String userName;
	private String name;
	private String lastName;
	private String eMail;
	private String phone;
	private String password;
	private int cantSold;
	public User(String userName, String fName, String eMail, String phone, String password)
	{
		super();
                String[] full = fName.split(" ");
		this.userName = userName;
		this.name = full[0];
		this.lastName = full[1];
		this.eMail = eMail;
		this.phone = phone;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCantSold() {
		return cantSold;
	}
	public void setCantSold(int cantSold) {
		this.cantSold = cantSold;
	}
	
	
}
