import java.util.Scanner;

public class Pet {
    // Private data fields
    private String name;
    private String type;
    private int age;

    // Default Constructor
    public Pet() {
        this.setName("Pet Name");
        this.setType("Animal");
        this.setAge(0);
    }

    // Custom Constructor
    public Pet(String name, String type, int age) {
        this.setName(name);
        this.setType(type);
        this.setAge(age);
    }

    // Setters (mutator methods)
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0; // Ensuring age is not negative
        }
    }

    // Getters (accessor methods)
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public int getAge() {
        return this.age;
    }

    // speak() method
    public String speak() {
        if (this.type.equalsIgnoreCase("dog")) {
            return "BARK!";
        } else if (this.type.equalsIgnoreCase("cat")) {
            return "MEROWWW!";
        }  else if (this.type.equalsIgnoreCase("bird")) {
            return "Chirp!";
        } else if (this.type.equalsIgnoreCase("Pet Name")) {
            return "Yowl";
        } else {
            return "default sound.";
        }
    }

    // toString method
    public String toString() {
        String output = "Pet information:\n";
        output += "Type: " + this.getType() + "\n";
        output += "Name: " + this.getName() + "\n";
        output += "Sound: " + this.speak() + "\n";
        output += "Age: " + this.getAge() + "\n";
        return output;
    }
}
