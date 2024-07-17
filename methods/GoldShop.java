import java.util.*;
class GoldShop{

static String goldNames[]={null,null,null,null,null,null};
static int index;

    public static boolean createGoldName(String goldName){

         System.out.println("create gold name started");
           boolean isGoldNameCreated=false;
		   
              if(goldName!=null){
                 goldNames[index]=goldName;
                 index++;
           isGoldNameCreated=true;
             }else System.out.println("gold name is null,can not be determined");
        System.out.println("create gold name ended");
		return isGoldNameCreated;
}
         public static void getGoldNames(){
		   System.out.println("the available golds are:");
		    for(String goldName:goldNames)
			 System.out.println(goldName);
			 }

public static boolean updateGoldName(String oldGoldName,String newGoldName){

         System.out.println("update gold name started");
		   boolean isGoldNameUpdated=false;
		    for(int index=0; index<goldNames.length; index++){
			 if(oldGoldName==goldNames[index]){
			    goldNames[index]=newGoldName;
				 isGoldNameUpdated=true;
				 }
			   }
			  if(isGoldNameUpdated==false){
			   System.out.println(oldGoldName+"not found");
			  }
		 System.out.println("update gold name ended");
           return isGoldNameUpdated;
}
public static boolean deleteGoldName(String GoldNameTobeDeleted){
	System.out.println("delete Gold name started");
	  boolean isGoldNameDeleted=false;
	  int newIndex,oldIndex;
	   for(newIndex=0,oldIndex=0;oldIndex<GoldNames.length; oldIndex++){
		  if(goldNames[oldIndex]!=goldNameTobeDeleted){
			  
			  goldNames[newIndex]=goldNames[oldIndex];
			  newIndex++;
			  } 
		   }
		   goldNames=Arrays.copyOf(goldNames,newIndex);
		   if(goldNames!=null){
			   isGoldNameDeleted=true;
		   }
		   if(isGoldNameDeleted==false){
			   System.out.println(goldNameTobeDeleted+"not found");
		   }
	
	System.out.println("delete chat name ended");
	return isChatNameDeleted;
	}		
     
}