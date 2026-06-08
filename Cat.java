public class Cat extends Pet implements Adoptable{
    private boolean goodMouser;
    //How can I make the code work without the constructor?
    public Cat(String name, int age, String breed, int weight, boolean goodMouser){
        super(name,age,breed,weight);
        
        this.goodMouser = goodMouser;
    }

        // abstract method
        @Override
        public String getSpecies(){
        return "Cat";
        }

    // interface method
    @Override
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
