class Shampoo{

   String brandName;
   int id;
   int quantity;
   String type;
   double price;
   String mgfDate;
   String expDate;
   
public Shampoo(String brandName,int id,int quantity,String type,double price,String mgfDate,String expDate){
	
    System.out.println("Shampoo started");
	   
	   this.brandName=brandName;
	   this.id=id;
	   this.quantity=quantity;
	   this.type=type;
	   this.price=price;
	   this.mgfDate=mgfDate;
	   this.expDate=expDate;
	   
	System.out.println("Shampoo ended");
}
	
	
public void displayShampooInfo(){
	System.out.println("the brand Name is:"+this.brandName);
	System.out.println("the id is:"+this.id);
	System.out.println("the quantity is"+this.quantity);
	System.out.println("the type is:"+this.type);
	System.out.println("the price is:"+this.price);
	System.out.println("the mgfDate is:"+this.mgfDate);
	System.out.println("the expDate is:"+this.expDate);
	
}
}