import java.util.*;
class Girias{

   static String name="Om";
   static String ownerName="Basava";
   static String homeAppliance[]={null,null,null,null,null,null};
   static double homeAppliancePrices[]={0.0,0.0,0.0,0.0,0.0,0.0,};
   static int index;
   static int homeAppliancePriceIndex;
   
//add chatName in chatNames index positions(ref)

   public static boolean createhomeApplianceName(String homeAppliance){
     System.out.println("create homeAppliance Name started");
      boolean ishomeApplianceNameCreated=false;
	  //validation
         if(ishomeApplianceName !=null){
          homeAppliances[index]=homeAppliance;
	      index++;
	ishomeApplianceNameCreated=true;
	}else System.out.println("homeAppliance name is null,cannot be determined");
	 System.out.println("create homeAppliance name ended");
	 
   return ishomeApplianceNameCreated;
  }
  
public static boolean addhomeApplianceName(double homeAppliancePrice){
	System.out.println("add home Appliance price started");
	boolean ishomeAppliancePriceAdded=false;
	if(homeAppliance >0.0){
	homeAppliancePrices[homeAppliancePriceIndex]=homeAppliance;
    homeApplianceIndex++;
ishomeAppliancePriceAdded=true;	
	}else System.out.println("price can not be zero");
	return ishomeAppliancePriceAdded;
}
  
  public static void getHomeApplianceNames(){
	 System.out.println("the available homeAppliances are:");
       for(String homeAppliance:homeAppliances)
     System.out.println(homeAppliance);		   
	  
  }
  
public static void getHomeAppliancePrices(){
	System.out.println("the prices are:");
	for(double homeAppliancePrice:homeAppliancePrices)
    System.out.println(homeAppliancePrice);
	
}
public static boolean updateHomeApplianceName(String oldHomeApplianceName,String newHomeApplianceName){
	
  System.out.println("update HomeAppliance name started");
  boolean isHomeApplianceNameUpdated = false;
    for(int index=0; index<HomeApplianceNames.length;index++){
       if(oldHomeApplianceName== HomeApplianceNames[index]){
	     HomeApplianceNames[index]=newHomeApplianceName;
	        isHomeApplianceNameUpdated=true;
}
	
}  
	if(isHomeApplianceNameUpdated==false){
		System.out.println(oldHomeApplianceName+"not found");
		}
		
		System.out.println("udpdateHomeApplianceName ended");
		return isHomeApplianceNameUpdated;
		
		}
		public static boolean deleteHomeApplianceName(String homeApplianceNameTobeDeleted){
	System.out.println("delete HomeAppliance name started");
	  boolean isHomeApplianceNameDeleted=false;
	  int newIndex,oldIndex;
	   for(newIndex=0,oldIndex=0;oldIndex<homeApplianceNames.length; oldIndex++){
		  if(homeApplianceNames[oldIndex]!=homeApplianceNameTobeDeleted){
			  
			  homeApplianceNames[newIndex]=homeApplianceNames[oldIndex];
			  newIndex++;
			  } 
		   }
		   homeApplianceNames=Arrays.copyOf(homeApplianceNames,newIndex);
		   if(homeApplianceNames!=null){
			   isHomeApplianceNameDeleted=true;
		   }
		   if(isHomeApplianceDeleted==false){
			   System.out.println(homeApplianceNameTobeDeleted+"not found");
		   }
	
	System.out.println("delete HomeAppliance name ended");
	return isHomeApplianceNameDeleted;
	}		

}
 


