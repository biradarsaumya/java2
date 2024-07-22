class AtmMachine{

   String name;
   int id;
   String type;
   
	
public AtmMachine(String name,int id,String type){
               
                
                System.out.println("AtmMachine started");
                 this.name = name;
                 this.id   = id;
                 this.type = type ;
                System.out.println("AtmMachine ended"); 
                 
                }
                
                
      
public void displayAtmMachineInfo(){
           System.out.println("The name is"+this.name);
           System.out.println("The id is"+this.id);
           System.out.println("The type is"+this.type);
           
      }
	

}