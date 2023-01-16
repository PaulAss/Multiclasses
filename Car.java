public class Car extends Machine{
  @Override // This a class and it check to see if you are overriding a method.
  public void start(){ //This method has overridden the method in the parent class.
    System.out.println("Car started....");
  }
  
  public void wipeWindShield(){
    System.out.println("Wiping wind shield....");
  }
  public void showInfo(){
    System.out.println("Car name: "+name);
  }
}