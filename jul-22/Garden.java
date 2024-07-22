class Garden{

	String name;
    int id;
    String area;
	
public Garden(String name,int id,String area){
               
                System.out.println("Garden started");
                 this.name = name;
                 this.id   = id;
                 this.area = area ;
                System.out.println("Garden ended");
                
                
      }
      
public void displayGardenInfo(){
           System.out.println("The name is"+this.name);
           System.out.println("The id is"+this.id);
           System.out.println("The area is"+this.area);
           
      }
	

}