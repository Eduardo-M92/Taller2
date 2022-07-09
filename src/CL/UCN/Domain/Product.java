package CL.UCN.Domain;

public class Product
{
	private String name;
	private String category;
	private String date;
	//private String photo;
	private String code;
	private User owner;
	private int price;
	public Product(String name, String category, String date, String photo, User owner, int price)
	{
		this.name = name;
		this.category = category;
		this.date = date;
		//this.photo = photo;
		this.owner = owner;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDate() {
		return date;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
