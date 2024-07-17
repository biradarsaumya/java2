import java.util.Arrays;
class Gym{

   static String name="Om";
   static String ownerName="Basava";
   static String gymEquipmentNames[]={null,null,null,null,null,null,null,null};
   //static double equipmentPrices[]={0.0,0.0,0.0,0.0,0.0,0.0,};
   static int index;
   //static int gymEquipmentIndex;
   
//add chatName in chatNames index positions(ref)

   public static boolean createGymEquipmentName(String gymEquipmentName){
     System.out.println("createGymEquipmentName started");
      boolean isGymEquipmentNameCreated=false;
	  //validation
         if(gymEquipmentName !=null){
          gymEquipmentNames[index]=gymEquipmentName;
	      index++;
	isGymEquipmentNameCreated=true;
	}else System.out.println(" Gym Equipment name is null,cannot be determined");
	 System.out.println("createGymEquipmentName ended");
	 
   return isGymEquipmentNameCreated;
  }
  
//public static boolean addequipmentPrice(double equipmentPrice){
	//System.out.println("add equipment price started");
	//boolean isEquipmentPriceAdded=false;
	//if(equipmentPrice >0.0){
	//equipmentPrices[equipmentPriceIndex]=equipment;
//equipmentPriceIndex++;
//isEquipmentPriceAdded=true;	
	//}else System.out.println("price can not be zero");
	//return isEquipmentPriceAdded ;
//}
  
  public static void getGymEquipmentNames(){
	 System.out.println("the available gym equipments are:");
       for(String gymEquipmentName:gymEquipmentNames)
     System.out.println(gymEquipmentName);		   
	  
  }
  
//public static void getEquipmentPrices(){
	//System.out.println("the prices are:");
	//for(double equipmentPrice:equipmentPrices)
    //System.out.println(equipmentPrice);
	
//}
public static boolean updateGymEquipmentName(String oldGymEquipmentName,String newGymEquipmentName){
	
  System.out.println("update GymEquipmentName started");
  boolean isGymEquipmentNameUpdated = false;
    for(int index=0; index<gymEquipmentNames.length;index++){
       if(oldGymEquipmentName==gymEquipmentNames[index]){
	     gymEquipmentNames[index]=newGymEquipmentName;
	        isGymEquipmentNameUpdated=true;
}
	
}  
	if(isGymEquipmentNameUpdated==false){
		System.out.println(oldGymEquipmentName+"not found");
		}
		
		System.out.println("udpdateGymEquipmentName ended");
		return isGymEquipmentNameUpdated;
		
		}
		
public static boolean deleteGymEquipmentName(String gymEquipmentNameTobeDeleted){
	
	System.out.println("delete GymEquipmentName started");
	 boolean isGymEquipmentNameDeleted=false;
	  int newIndex,oldIndex;
	  for(newIndex=0,oldIndex=0;oldIndex<gymEquipmentNames.length;oldIndex++){
		  if(gymEquipmentNames[oldIndex]!=gymEquipmentNameTobeDeleted){
			 gymEquipmentNames[newIndex]=gymEquipmentNames[oldIndex];
			 newIndex++;
		  }
		 }
		gymEquipmentNames=Arrays.copyOf(gymEquipmentNames,newIndex);
		   if(gymEquipmentNames!=null){
			   isGymEquipmentNameDeleted=true;
		   }
		   if(isGymEquipmentNameDeleted==false){
			   System.out.println(gymEquipmentNameTobeDeleted+"not found");
		   } 
	System.out.println("delete GymEquipmentName ended");
	return isGymEquipmentNameDeleted;
	
	
	
	
	
	
	
	
}

}
 


