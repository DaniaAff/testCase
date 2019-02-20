package hw3;

public class product {
	private String proname ;
	private int proprice ;
	private int proquantity;
	
	public product() 
	{
		
	}

	public product(String name, int price, int quantity) {
		proname = name;
		proprice = price;
		proquantity = quantity;
		// TODO Auto-generated constructor stub
	}
	public void setproname(String name)
	{
		proname = name;
	}
	public String getproname ()
	{
		return proname;
	}
	public void setpropric(int price)
	{
		proprice = price;
	}
	public int getproprice ()
	{
		return proprice;
	}
	public void setproquantity(int quantity)
	{
		proquantity = quantity;
	}
	public int getproquantity ()
	{
		return proquantity;
	}
}
