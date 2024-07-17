class GiriasRunner{


public static void main(String[] chat){

boolean isAdded=Girias.createhomeApplianceName("WaterBottle");
System.out.println("is homeAppliance name added:"+ isAdded);

boolean ishomeApplianceAdded=Girias.addhomeApplianceName(200.00);
System.out.println("is WaterBottle  added:"+ ishomeApplianceAdded);

isAdded=Girias.createhomeApplianceName("Water Heater");
System.out.println("is homeAppliance name added:"+ isAdded);

ishomeApplianceAdded=Girias.addhomeApplianceName(5000.00);
System.out.println("is Water Heater added:"+ishomeApplianceAdded );

isAdded=Girias.createhomeApplianceName("Stainless Steel");
System.out.println("is homeAppliance name added:"+ isAdded);

ishomeApplianceAdded=Girias.addhomeApplianceName(6000.00);
System.out.println("is Stainless Steel added:"+ishomeApplianceAdded);

Girias.getHomeApplianceNames();
Girias.getHomeAppliancePrices();

boolean newName=Girias.updateHomeApplianceName("WaterBottle","Stove");
System.out.println("update HomeAppliance name :"+ newName);

Girias.getHomeApplianceNames();
boolean deleteHomeApplianceName=Girias.deleteHomeApplianceName("Water Heater");
System.out.println("deleted HomeAppliance is:"+deleteName);
Girias.getHomeApplianceNames();
}

}