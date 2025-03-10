package product;

import java.io.IOException;
import java.util.ArrayList;

public class ProductsManager {
public ArrayList<Product> getlist()throws  IOException{
	
	int id[]= {1,2,3,4,5};
	String name[]= {"冷蔵庫","ソファ","米","小説","Tシャツ"};
	int price[]= {50000,30000, 2000, 1500, 1500};
	int stock[]= {10,5,3,4,5};
	
	ArrayList<Product>  addProduct =new ArrayList<Product>();
	for (int i=0; i<name.length; i++) {
	Product adapter =new Product();
	adapter.setId(id[i]);
	adapter.setName(name[i]);
	adapter.setPrice(price[i]);
	adapter.setStock(stock[i]);
	addProduct.add(adapter);
	}
	return addProduct;
}}