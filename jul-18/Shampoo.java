class Shampoo{

   String brandName;
   int id;
   int quantity;
   String type;
   double price;
   String mgfDate;
   String expDate;

public boolean createShampoo(String brandName,int id,int quantity,String type,double price,String mgfDate,String expDate){
               
                boolean isShampooCreated = false;
                if(brandName!=null && id > 0 && quantity>0 && type!=null && price>0.0 && mgfDate!=null && expDate!=null){
                 this.brandName = brandName;
                 this.id   = id;
                 this.quantity=quantity;
                 this.type=type;
				 this.price=price;
				 this.mgfDate=mgfDate;
				 this.expDate=expDate;
				 
                 isShampooCreated = true ; 
                }
                
                return isShampooCreated ; 
      }
      
public void displayShampooInfo(){
           System.out.println("The brandName is"+this.brandName);
           System.out.println("The id is"+this.id);
           System.out.println("The quantity is"+this.quantity);
		   System.out.println("The type is"+this.type);
		   System.out.println("The price is"+this.price);
		   System.out.println("The mgfDate is"+this.mgfDate);
		   System.out.println("The expDate is"+this.expDate);
           
      }
	

}