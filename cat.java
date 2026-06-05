public class Cat extends Pet implements Adoptable{
    private boolean goodMouser;
    //How can I make the ccode work without the constructor?
    public Cat(String name, int age, String breed, int weight, boolean goodMouser){
        setName(name);
        setAge(age);
        setBreed(breed);
        setWeight(weight);

        this.goodMouser = goodMouser;

        addPet();
    }

        // abstract method
        public String getSpecies(){
        return "Cat";
        }

    // interface method
    public double calculateAdoptionFee(){
    double fee = BASE_FEE;

    if (goodMouser){
    fee = fee + 15;
    }

    return fee;
    }

    public boolean isGoodMouser(){
        return goodMouser;
    }

    public void setGoodMouser(boolean goodMouser){
        this.goodMouser = goodMouser;
    }

    public String toString(){
        return super.toString() + ", Good Mouser: " + goodMouser + ", Adoption Fee: $" + calculateAdoptionFee();
    }
}
