package shoppingcart;
import java.util.ArrayList;


import java.util.Iterator;

import products.Product;

public class ShoppingCart {
	ArrayList<CartLine> cart = new ArrayList<CartLine>();
	
	public void addProduct(Product product) {
		for (CartLine item : cart) {
			if (item.getProduct().getProductnumber().equals(product.getProductnumber())) {
				item.setQuantity(item.getQuantity()+1);
				return;
			}
		}
		CartLine newItem = new CartLine();
		newItem.setProduct(product);
		newItem.setQuantity(1);
		cart.add(newItem);
	}
	
	public void removeProduct(Product product) {
		Iterator<CartLine> iterator = cart.iterator();
		while (iterator.hasNext()){
			CartLine item = iterator.next();
			if (item.getProduct().getProductnumber().equals(product.getProductnumber())){
				if (item.getQuantity()>1){
					item.setQuantity(item.getQuantity()-1);
				}
				else{
					iterator.remove();
				}
			}
		}
	}
	
	public void display() {
		System.out.println("Content of the shoppingcart:");
		for (CartLine item : cart) {
			System.out.println(item.getQuantity() + " "
					+ item.getProduct().getProductnumber() + " "
					+ item.getProduct().getDescription() + " "
					+ item.getProduct().getPrice());
		}
		System.out.println("Total price ="+getTotal());
	}

	public double getTotal(){
		double totalPrice = 0.0;
		for (CartLine item : cart) {
			totalPrice=totalPrice+(item.getProduct().getPrice() * item.getQuantity());
		}
		return totalPrice;
	}
}
