class GymRunner{


public static void main(String[] gym){

boolean isAdded=Gym.createGymEquipmentName("leg press machine");
System.out.println("is gym equipment name added:"+ isAdded);

//boolean isequipmentAdded=Gym.addequipmentPrice(40000.00);
//System.out.println("is leg press machine added:"+isequipmentAdded );

isAdded=Gym.createGymEquipmentName("seated curl machine");
System.out.println("is gym equipment name added:"+ isAdded);

//isequipmentAdded=Gym.addequipmentPrice(5000.00);
//System.out.println("is seated curl machine added:"+ isequipmentAdded);

isAdded=Gym.createGymEquipmentName("dumbbells");
System.out.println("is gym equipment name added:"+ isAdded);

//isequipmentAdded=Gym.addequipmentPrice(60000.00);
//System.out.println("is dumbbells added:"+isequipmentAdded);

isAdded=Gym.createGymEquipmentName("treadmill");
System.out.println("is gym equipment name added:"+ isAdded);

//isequipmentAdded=Gym.addequipmentPrice(5000.00);
//System.out.println("is treadmill  added:"+ isequipmentAdded);

isAdded=Gym.createGymEquipmentName("exercise bike");
System.out.println("is gym equipment name added:"+ isAdded);

//isequipmentAdded=Gym.addequipmentPrice(5000.00);
//System.out.println("is exercise bike added:"+ isequipmentAdded);

isAdded=Gym.createGymEquipmentName("power racks");
System.out.println("is gym equipment name added:"+ isAdded);

//isequipmentAdded=Gym.addequipmentPrice(5000.00);
//System.out.println("is power rack added:"+ isequipmentAdded);

isAdded=Gym.createGymEquipmentName("weight benches");
System.out.println("is gym equipment name added:"+ isAdded);

//isequipmentAdded=Gym.addequipmentPrice(5000.00);
//System.out.println("is weight benches added:"+ isequipmentAdded);

isAdded=Gym.createGymEquipmentName("pull-up bars");
System.out.println("is gym equipment name added:"+ isAdded);

//isequipmentAdded=Gym.addequipmentPrice(5000.00);
//System.out.println("is pull-up bars added:"+ isequipmentAdded);



Gym.getGymEquipmentNames();
//Gym.getequipmentPrices();

boolean newName=Gym.updateGymEquipmentName("leg press machine","Poles");
System.out.println("update gym equipment name:"+newName);

Gym.getGymEquipmentNames();

boolean deleteName=Gym.deleteGymEquipmentName("power racks");
System.out.println("delete gym equipment name:"+deleteName);
Gym.getGymEquipmentNames();

}
}