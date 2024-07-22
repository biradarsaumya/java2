class Resort{

   String name;
   int id;
   String ownerName;   
   int noOfRooms;
   String area;
   
public Resort(String name,int id,String ownerName,int noOfRooms,String area){
               
                System.out.println("Resort started");
                 this.name = name;
                 this.id   = id;
				 this.ownerName=ownerName
				 this.noOfRooms=noOfRooms
                 this.area     = area ;
                System.out.println("Resort ended"); 
               
      }
      
public void displayGardenInfo(){
           System.out.println("The name is"+this.name);
           System.out.println("The id is"+this.id);
		   System.out.println("The ownerName is"+this.ownerName);
           System.out.println("The noOfRooms "+this.noOfRooms);
		   System.out.println("The area is"+this.area);
           
      }
	

}