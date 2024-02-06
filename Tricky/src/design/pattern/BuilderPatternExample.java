package design.pattern;
//Builder Pattern says that "construct a complex object from simple objects using step-by-step approach
//-It provides clear separation between the construction and representation of an object.
//-It provides better control over construction process.
//-It supports to change the internal representation of objects.

//Product: Computer
class Computer {
 private String cpu;
 private String memory;
 private String storage;
 private String graphicsCard;

 public Computer(String cpu, String memory, String storage, String graphicsCard) {
     this.cpu = cpu;
     this.memory = memory;
     this.storage = storage;
     this.graphicsCard = graphicsCard;
 }

 public void displayInfo() {
     System.out.println("Computer Specifications: ");
     System.out.println("CPU: " + cpu);
     System.out.println("Memory: " + memory);
     System.out.println("Storage: " + storage);
     System.out.println("Graphics Card: " + graphicsCard);
 }
}

//Builder interface
interface ComputerBuilder {
 void buildCPU(String cpu);
 void buildMemory(String memory);
 void buildStorage(String storage);
 void buildGraphicsCard(String graphicsCard);
 Computer getResult();
}

//Concrete Builder: GamingComputerBuilder
class GamingComputerBuilder implements ComputerBuilder {
 private Computer computer;

 public GamingComputerBuilder() {
     this.computer = new Computer("High-Performance CPU", "32GB RAM", "1TB SSD", "NVIDIA GeForce RTX 3080");
 }

 @Override
 public void buildCPU(String cpu) {
     // Overriding the CPU for gaming computers
     computer.displayInfo(); 
 }

 @Override
 public void buildMemory(String memory) {
     // Overriding the memory for gaming computers
     computer.displayInfo(); 
 }

 @Override
 public void buildStorage(String storage) {
     // Overriding the storage for gaming computers
     computer.displayInfo(); 
 }

 @Override
 public void buildGraphicsCard(String graphicsCard) {
     // Overriding the graphics card for gaming computers
     computer.displayInfo(); 
 }

 @Override
 public Computer getResult() {
     return computer;
 }
}

//Director
class ComputerDirector {
 public void construct(ComputerBuilder builder) {
     builder.buildCPU("Standard CPU");
     builder.buildMemory("16GB RAM");
     builder.buildStorage("500GB HDD");
     builder.buildGraphicsCard("Integrated Graphics");
 }
}

//Client code
public class BuilderPatternExample {
 public static void main(String[] args) {
     ComputerDirector director = new ComputerDirector();

     // Constructing a gaming computer
     ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
     director.construct(gamingComputerBuilder);
     Computer gamingComputer = gamingComputerBuilder.getResult();

     // Displaying information about the constructed gaming computer
     gamingComputer.displayInfo();
 }
}

/*
Create ComputerBuilder interface
Create 2 abstract classes CD and Company
Create 2 implementation classes of Company: Sony and Samsung
Create the CDType class
Create the CDBuilder class
Create the BuilderDemo class
 */
