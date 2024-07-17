import java.util.*;
class WatchShop{

static String watchName[]={null,null,null,null,null,null};
static int index;

    public static boolean createWatchName(String watchName){

         System.out.println("create watch name started");
           boolean isWatchNameCreated=false;
		   
              if(watchName!=null){
                 watchNames[index]=watchName;
                 index++;
           iswatchNameCreated=true;
             }else System.out.println("gold name is null,can not be determined");
        System.out.println("create watch name ended");
		return iswatchNameCreated;
}
         public static void getWatchNames(){
		   System.out.println("the available watches are:");
		    for(String watchName:watchNames)
			 System.out.println(watchName);
			 }

public static boolean updateWatchName(String oldWatchName,String newWatchName){

         System.out.println("update watch name started");
		   boolean isWatchNameUpdated=false;
		    for(int index=0; index<watchNames.length; index++){
			 if(oldWatchName==watchNames[index]){
			    watchNames[index]=newWatchName;
				 isWatchNameUpdated=true;
				 }
			   }
			  if(isWatchNameUpdated==false){
			   System.out.println(oldWatchName+"not found");
			  }
		 System.out.println("update watch name ended");
           return isWatchNameUpdated;
}
public static boolean deleteWatchName(String watchNameTobeDeleted){
	System.out.println("delete Watch name started");
	  boolean isWatchNameDeleted=false;
	  int newIndex,oldIndex;
	   for(newIndex=0,oldIndex=0;oldIndex<watchNames.length; oldIndex++){
		  if(watchNames[oldIndex]!=watchNameTobeDeleted){
			  
			  watchNames[newIndex]=watchNames[oldIndex];
			  newIndex++;
			  } 
		   }
		   watchNames=Arrays.copyOf(watchNames,newIndex);
		   if(watchNames!=null){
			   isWatchNameDeleted=true;
		   }
		   if(isWatchNameDeleted==false){
			   System.out.println(WatchNameTobeDeleted+"not found");
		   }
	
	System.out.println("delete Watch name ended");
	return isWatchNameDeleted;
	}		
     
}