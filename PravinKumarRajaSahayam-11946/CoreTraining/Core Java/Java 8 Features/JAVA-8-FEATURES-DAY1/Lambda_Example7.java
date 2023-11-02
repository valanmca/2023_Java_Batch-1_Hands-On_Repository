//Java - 8 Collectors
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;
class Product 
{
	int id;
	String name;
	float price;
	public Product(int id,String name,float price) 
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class Lambda_Example7 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1 , "Pravins" , 1000.0f));
		productList.add(new Product(2 , "Kumar" , 2000.0f));
		productList.add(new Product(3 , "RajaShayam" , 3330.0f));
		List<Float> productPriceList = productList.stream().map(x -> x.price).collect(Collectors.toList());
		System.out.println(productPriceList);
		
	}

}
