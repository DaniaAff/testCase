package hw3;

import java.util.ArrayList;


public class cart {
ArrayList<product> prolist = new ArrayList<product>();
    
    public void addpro(String name , int price , int quantity)
    {
    	prolist.add(new product(name,price,quantity));
    	
    }
    public int getsize ()
    {
    	return prolist.size();
    }
    public int toatal()
    {
    	int totalprice=0;
    	for (product  x : prolist)
    	{
    		totalprice += (x.getproquantity()*x.getproprice());
    	}
    	return totalprice;
    }

}
