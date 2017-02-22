/*This project involves a simple Droid (robot)
 that can be activated, charged, and hover above ground. 
 This project creates some baseline behaviors of the droid.
*/

public class Droid{ 
  // instance variable
  int batteryLevel; 
  // constructor
  public Droid(){ 
  //100 is the maximun percentage the battery can be charged  
    batteryLevel = 100;
  }
  
  public void activate() { 
    System.out.println("Activated. Ready for your command!");
    
    batteryLevel = batteryLevel - 5;
    
    System.out.println("Battery level is " + batteryLevel + " percent");
  }
  
  public void chargeBattery(int hours){
    System.out.println("Droid charging.....");
    
    batteryLevel = batteryLevel + hours;
    
    if ( batteryLevel == 100){
      batteryLevel = 100;
      System.out.println("Battery Full " + batteryLevel + " percent");
    }
    else{
      System.out.println("Battery level is " + batteryLevel + " percent");
    }
  }
  public int checkBatteryLevel(){
    System.out.println("Battery level is " + batteryLevel + " percent");
    
    return batteryLevel;
  }
  
  public void hover(int feet){
    if ( feet > 2){
      System.out.println("Error! i cannot hover above 2 feet");
    }
    else {
      System.out.println("Hovering.....");
      
      batteryLevel = batteryLevel - 20;
      
      System.out.println("Battery level is " + batteryLevel + " percent");
    }
  }
  public static void main(String[] args){
      //object Mega is name of droid
      Droid Mega = new Droid();
      Mega.activate();
      //5 is for the amount of hours battery will be charging
      Mega.chargeBattery(5);
      //2 is for the altitude the droid is hovering in feet
      Mega.hover(2);
  }
}
