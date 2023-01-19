package FoodPack.FoodApp.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Food
{
	@Id
	private Long Id ;
	private int Price;
	private String Name, Brand, Description;
	private Date Manufacture_Date, Expire_Date;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getManufacture_Date() {
		return Manufacture_Date;
	}
	public void setManufacture_Date(Date manufacture_Date) {
		Manufacture_Date = manufacture_Date;
	}
	public Date getExpire_Date() {
		return Expire_Date;
	}
	public void setExpire_Date(Date expire_Date) {
		Expire_Date = expire_Date;
	}
	public Food() {
		super();
		
	}
	
	
	public Food(Long id, int price, String name, String brand, String description, Date manufacture_Date,
			Date expire_Date) {
		super();
		Id = id;
		Price = price;
		Name = name;
		Brand = brand;
		Description = description;
		Manufacture_Date = manufacture_Date;
		Expire_Date = expire_Date;
	}
	@Override
	public String toString() {
		return "Food [Id=" + Id + ", Price=" + Price + ", Name=" + Name + ", Brand=" + Brand + ", Description="
				+ Description + ", Manufacture_Date=" + Manufacture_Date + ", Expire_Date=" + Expire_Date + "]";
	}
	
	
	
	
}
