class ChatShopRunner{


public static void main(String[] chat){

boolean isAdded=ChatShop.createChatName("Panipuri");
System.out.println("is chat name added:"+ isAdded);

boolean ischatAdded=ChatShop.addChatPrice(40.00);
System.out.println("is panipuri added:"+ ischatAdded);

isAdded=ChatShop.createChatName("Sevpuri");
System.out.println("is chat name added:"+ isAdded);

ischatAdded=ChatShop.addChatPrice(50.00);
System.out.println("is sevpri added:"+ ischatAdded);

isAdded=ChatShop.createChatName("Masalpuri");
System.out.println("is chat name added:"+ isAdded);

ischatAdded=ChatShop.addChatPrice(60.00);
System.out.println("is masalpuri added:"+ischatAdded);


ChatShop.getChatNames();
ChatShop.getPriceAdded();


boolean newName=ChatShop.updateChatName("Masalpuri","Kachori");
System.out.println("updated chat is:"+newName);
ChatShop.getChatNames();

boolean deleteName=ChatShop.deleteChatName("Sevpuri");
System.out.println("deleted chat is:"+deleteName);
ChatShop.getChatNames();

}
}