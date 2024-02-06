package design.pattern;

//we want to charge a modern smartphone using an old charger with a different interface.
//In this scenario, the modern smartphone is the Target interface, the old charger is the Adaptee, and the Adapter allows the old charger to charge the smartphone.

//Target interface
interface Smartphone {
 void charge();
}

//Adaptee (existing class)
class OldCharger {
 public void chargeWithOldPlug() {
     System.out.println("Charging with old charger");
 }
}

//Adapter class implementing the Target interface
class ChargerAdapter implements Smartphone {
 private OldCharger oldCharger;

 public ChargerAdapter(OldCharger oldCharger) {
     this.oldCharger = oldCharger;
 }

 @Override
 public void charge() {
     // Adapting the chargeWithOldPlug of OldCharger to the charge of Smartphone
     oldCharger.chargeWithOldPlug();
 }
}

//Client code
public class AdapterRealLifeExample {
 public static void main(String[] args) {
     // Using the Adapter Pattern in a real-life scenario
     OldCharger oldCharger = new OldCharger();
     Smartphone smartphone = new ChargerAdapter(oldCharger);

     // The client charges the smartphone using the old charger
     smartphone.charge();
 	}
}