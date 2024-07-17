class GoldShopRunner{

public static void main(String[] shop){

boolean isAdded=GoldShop.createGoldName("Necklace");
System.out.println("is gold name added:"+isAdded);

isAdded=GoldShop.createGoldName("Earing");
System.out.println("is gold name added:"+isAdded);

isAdded=GoldShop.createGoldName("Chain");
System.out.println("is gold name added:"+isAdded);

isAdded=GoldShop.createGoldName("Ring");
System.out.println("is gold name added:"+isAdded);

isAdded=GoldShop.createGoldName("Braclate");
System.out.println("is gold name added:"+isAdded);

isAdded=GoldShop.createGoldName("SingarChain");
System.out.println("is gold name added:"+isAdded);

isAdded=GoldShop.createGoldName("Bangles");
System.out.println("is gold name added:"+isAdded);


GoldShop.getGoldNames();

boolean newName=GoldShop.updateGoldName("Chain","Nose Ring"); 
System.out.println("updated gold is:"+newName);
GoldShop.getGoldNames();

boolean deleteName=GoldShop.deleteGoldName("Chain"); 
System.out.println("deleted gold is:"+deleteName);
GoldShop.getGoldNames();

}



}