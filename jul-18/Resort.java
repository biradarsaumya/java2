class Resort{

   String name;
   int id;
   String ownerName;   
   int noOfRooms;
   String area;
   
public boolean createResort(String name,int id,String ownerName,int noOfRooms,String area){
               
                boolean isResortGCreated = false;
                if(name!=null && id > 0 && ownerName!=null && noOfRooms > 0 && area!=null){
                 this.name = name;
                 this.id   = id;
				 this.ownerName=ownerName
				 this.noOfRooms=noOfRooms
                 this.area     = area ;
                 
                 isResortCreated = true ; 
                }
                
                return isResortCreated ; 
      }
      
public void displayGardenInfo(){
           System.out.println("The name is"+this.name);
           System.out.println("The id is"+this.id);
		   System.out.println("The ownerName is"+this.ownerName);
           System.out.println("The noOfRooms "+this.noOfRooms);
		   System.out.println("The area is"+this.area);
           
      }
	

}