class WatchShopRunner{

public static void main(String[] shop){

boolean isAdded=WatchShop.createWatchName("TAG Heuer");
System.out.println("is watch name added:"+isAdded);

isAdded=WatchShop.createWatchName("Blancpin");
System.out.println("is watch name added:"+isAdded);

isAdded=WatchShop.createWatchName("Fast Track");
System.out.println("is watch name added:"+isAdded);

isAdded=WatchShop.createWatchName("Titan");
System.out.println("is watch name added:"+isAdded);

isAdded=WatchShop.createWatchName("Casio");
System.out.println("is watch name added:"+isAdded);

isAdded=WatchShop.createWatchName("Chopard");
System.out.println("is watch name added:"+isAdded);

isAdded=WatchShop.createWatchName("Cartier");
System.out.println("is watch name added:"+isAdded);

isAdded=WatchShop.createWatchName("Panerai");
System.out.println("is watch name added:"+isAdded);

isAdded=WatchShop.createWatchName("Alexander");
System.out.println("is watch name added:"+isAdded);

isAdded=WatchShop.createWatchName("Apple");
System.out.println("is watch name added:"+isAdded);

WatchShop.getWatchNames();

boolean newName=WatchShop.updateWatchName("Apple","Samsung"); 
System.out.println("updated watch is:"+newName);
WatchShop.getWatchNames();

boolean deleteName=WatchShop.deleteWatchName("Apple"); 
System.out.println("deleted watch is:"+deleteName);
WatchShop.getWatchNames();
}
}