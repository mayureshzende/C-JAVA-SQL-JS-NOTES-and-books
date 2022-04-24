
public class Library {
private String Name;
private String Author;
private float Price;

public Library() {}
public Library(String Name,String Atuhor,float Price) {
	this.Name=Name;
	this.Author=Atuhor;
	this.Price=Price;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public float getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
@Override
public String toString() {
	return "Library [Name=" + Name + ", Author=" + Author + ", Price=" + Price + "] \n";
}



}
