public class Droid {
  int batteryLevel;
  String name;

  //constructor method
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  public void performTask(String task){
    batteryLevel = batteryLevel - 10;
    System.out.println(name + " is performing task: " + task);
  }
  //main method
  public static void main(String[] args) {
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.performTask("dancing");
    codey.performTask("coding");
  }
  public String toString(){
    return "Hello, I'm the droid: " +name;
    
  }
}
