class Product {

String pcode;
String pname;
double price;



public void setProductDetails(String productCode,String productName,double productPrice){
	pcode = productCode;
	pname = productName;
	price = productPrice;
}

public double getPrice(){
  return price;
}


public void displayProduct(){
 System.out.println("Product Code"+pcode);
 System.out.println("Product Name "+pname);
 System.out.println("Product price "+price);
}
}



public class Main{
 public static void main(String[] args){
   Product product1 = new Product();
   product1.setProductDetails("P001", "Product",100.0);

   Product product2 = new Product();
   product2.setProductDetails("P002", "Product",50.0);


   Product product3 = new Product();
   product3.setProductDetails("P003", "Product",150.0);

Product lowestPriceProduct=product1;


if(product2.getPrice()<lowestPriceProduct.getPrice()){
 lowestPriceProduct=product2;
}
if(product3.getPrice()<lowestPriceProduct.getPrice()){
 lowestPriceProduct=product3;
}


System.out.println("\n Product with  the lowest price");
lowestPriceProduct.displayProduct();
}
}

