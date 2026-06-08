import java.io.Serializable;

public abstract class Pet implements Serializable{
    private static final long serialVersionUID = 1L;

    private static int totalPets = 0;

        private String name;
        private int age;
        private String breed;
        private int weight;
    public Pet(String name, int age, String breed, int weight){
        this.name = name;
        this.age = age;
        this.breed = breed;
        setWeight(weight);

        totalPets++;
    }

    public abstract String getSpecies();


    public static int getTotalPets(){
        return totalPets;
    }

    public String getName(){
         return name;
    }

    public int getAge(){
        return age;
    }

    public String getBreed(){
        return breed;
    }

    public int getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setWeight(int weight){
        if(weight <= 0){
            throw new IllegalArgumentException( "Weight must be greater than 0.");
    }
    
        this.weight = weight;
    }

    public String toString(){
        return getSpecies() + ": " + name + ", Age: " + age + ", Breed: " + breed + ", Weight: " + weight;
    }
}
