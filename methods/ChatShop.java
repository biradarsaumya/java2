import java.util.*;
class ChatShop{

   static String name="Om";
   static String ownerName="Basava";
   static String chatNames[]={null,null,null,null,null,null};
   static double chatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0,};
   static int index;
   static int chatPriceIndex;
   
//add chatName in chatNames index positions(ref)

   public static boolean createChatName(String chatName){
     System.out.println("createChatName started");
      boolean isChatNameCreated=false;
	  //validation
	  
         if(chatName !=null){
          chatNames[index]=chatName;
	      index++;
	isChatNameCreated=true;
	}else System.out.println("chat name is null,cannot be determined");
	 System.out.println("createChatName ended");
	 
   return isChatNameCreated;
  }
  
public static boolean addChatPrice(double chatPrice){
	System.out.println("add chat price started");
	boolean isPriceAdded=false;
	if(chatPrice >0.0){
	chatPrices[chatPriceIndex]=chatPrice;
    chatPriceIndex++;
isPriceAdded=true;	
	}else System.out.println("price can not be zero");
	return isPriceAdded;
}
  
  public static void getChatNames(){
	 System.out.println("the available chats are:");
       for(String chatName:chatNames)
     System.out.println(chatName);		   
	  
  }
  
public static void getPriceAdded(){
	System.out.println("the prices are:");
	for(double chatPrice:chatPrices)
    System.out.println(chatPrice);
	
}
public static boolean updateChatName(String oldChatName,String newChatName){
	
  System.out.println("update chat name started");
  boolean isChatNameUpdated = false;
    for(int index=0; index<chatNames.length;index++){
       if(oldChatName== chatNames[index]){
	     chatNames[index]=newChatName;
	        isChatNameUpdated=true;
}
	
}  
	if(isChatNameUpdated==false){
		System.out.println(oldChatName+"not found");
		}
		
		System.out.println("udpdateChatName ended");
		return isChatNameUpdated;
		
		}
		
public static boolean deleteChatName(String chatNameTobeDeleted){
	System.out.println("delete chat name started");
	  boolean isChatNameDeleted=false;
	  int newIndex,oldIndex;
	   for(newIndex=0,oldIndex=0;oldIndex<chatNames.length; oldIndex++){
		  if(chatNames[oldIndex]!=chatNameTobeDeleted){
			  
			  chatNames[newIndex]=chatNames[oldIndex];
			  newIndex++;
			  } 
		   }
		   chatNames=Arrays.copyOf(chatNames,newIndex);
		   if(chatNames!=null){
			   isChatNameDeleted=true;
		   }
		   if(isChatNameDeleted==false){
			   System.out.println(chatNameTobeDeleted+"not found");
		   }
	
	System.out.println("delete chat name ended");
	return isChatNameDeleted;
	}		
}
 


