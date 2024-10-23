public class Parrot {
    private String species;
    private String name;
    private int age;
  
  
    public Parrot(String species, String name, int age) {
      this.species = species;
      this.name = name;
      this.age = age;
    }
    
    public void setSpecies(String newSpecies) {
      species = newSpecies;
    }
    
    public void setName(String newName) {
      name = newName;
    }

    public void setAge(int newAge) {
      age = newAge;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }
    
    public String info() {
      return "Parrot! Species: " + species + ", Name: " + name + ", Age: " + age;
    }
  }
  