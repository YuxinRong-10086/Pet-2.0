import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PetTester{
    public static void main(String[] args){
        Pet[] pets = new Pet[4];

// Read from data.txt
    try {
    BufferedReader br = new BufferedReader(new FileReader("data.txt"));

        for(int i = 0; i < pets.length; i++){
    String type = br.readLine();
    String name = br.readLine();
    int age = Integer.parseInt(br.readLine());
    String breed = br.readLine();
    int weight = Integer.parseInt(br.readLine());

    if(type.equals("Dog")){
        String service =
        br.readLine();

    pets[i] = new Dog(name,age,breed,weight,service);
    }
    else if(type.equals("Cat")){
    boolean goodMouser =Boolean.parseBoolean(br.readLine());

    pets[i] = new Cat(name,age,breed,weight,goodMouser);
    }
}

        br.close();
        
    }
        catch(Exception e){
        System.out.println("Something went wrong reading the file.");
    }

// Write pets.dat
        try{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("pets.dat"));

        for(Pet pet : pets){
            out.writeObject(pet);
    }

        out.close();

        System.out.println("Pets written to pets.dat");
    }
        catch(Exception e){
        System.out.println("Something went wrong writing the file.");
}

    try{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("pets.dat"));

    for(int i = 0; i < pets.length; i++){
    Pet pet = (Pet)in.readObject();

    System.out.println(pet);
    }

        in.close();
}
    catch(Exception e)
{
    System.out.println("Something went wrong reading pets.dat");
        }
    }
}
