public class Dog extends Pet implements Adoptable{
    private String service;
    
    //How can I make the ccode work without the constructor?
    public Dog(String name, int age, String breed, int weight, String service){
        super(name,age,breed,weight);
        this.service = service;

    }

    // Required abstract method
    @Override
    public String getSpecies(){
         return "Dog";
    }

    // Required interface method
    @Override
    public double calculateAdoptionFee(){
        double fee = BASE_FEE + (getWeight() * 2);

    if (!service.equals("none")){
        fee = fee - 20;
    }

    return fee;
    }

    public String getService(){
        return service;
    }   

    public void setService(String service){
        this.service = service;
    }

        public String toString()
    {
        return super.toString() + ", Service: " + service + ", Adoption Fee: $" + calculateAdoptionFee();
    }
}
