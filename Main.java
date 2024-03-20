abstract class Animal {
protected String species;
protected int age;
public Animal(String species, int age) {
this.species = species;
this.age = age;
}
public abstract void sound();
@Override
public String toString() {
return "Species: " + species + ", Age: " + age;
}
@Override
public boolean equals(Object obj) {
if (this == obj) return true;
if (obj == null || getClass() != obj.getClass()) return false; Animal animal = (Animal) obj;
if (age != animal.age) return false;
return species.equals(animal.species);
}
}
// Mammal.java
class Mammal extends Animal {
private String habitat;
public Mammal(String species, int age, String habitat) { super(species, age);
this.habitat = habitat;
}
public void sound() {
System.out.println("Mammal sound");
}
}
// Bird.java
class Bird extends Animal {
private String featherColor;
public Bird(String species, int age, String featherColor) {
super(species, age);
this.featherColor = featherColor;
}
public void sound() {
System.out.println("Bird sound");
}
}
// Parrot.java
class Parrot extends Bird {
private boolean canSpeak;
public Parrot(String species, int age, String featherColor, boolean canSpeak) { super(species, age, featherColor);
this.canSpeak = canSpeak;
}
public void sound() {
System.out.println("Parrot sound");
}
}
// Main.java
public class Main {
public static void main(String[] args) {
// Create instances and demonstrate Object class methods
// Example 1: Creating instances of Animal, Mammal, Bird, and Parrot
Animal mammal = new Mammal("Lion",5,"Jungle");
Animal bird = new Bird("Eagle",3,"Brown");
Animal parrot = new Parrot("African Grey",2,"Grey",true);
// Example 2: Using toString method
System.out.println(mammal.toString());
System.out.println(bird.toString());
System.out.println(parrot.toString());
// Example 3: Using equals method
Animal anotherLion = new Mammal("Lion",5,"Savanna");
System.out.println("Is mammal equal to anotherLion? " +mammal.equals(anotherLion)); Animal anotherParrot = new Parrot("African Grey",2,"Grey",true); System.out.println("Is parrot equal to anotherParrot? "+parrot.equals(anotherParrot));
}
}