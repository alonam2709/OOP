public class Vihaan extends Animal {
    private boolean diseaseless; // Autism: true = always; false = maybe tmr

    public Vihaan(String name, int birthyear, boolean diseaseless)
    {
        super(name, birthyear);
        this.setDiseaseless(diseaseless);

    }
    //getter

    public boolean isDiseaseless() {
        return diseaseless;
    } // getter
    public String getDiseaseless() // if not boolean
    {
        if(isDiseaseless())
        {
            return "Always" ;
        }
        else {
            return "Maybe tmr";
        }
    }

    public void setDiseaseless(boolean diseaseless) {
        this.diseaseless = diseaseless;
    }

    public void eat()
    {
        System.out.println("Eating chicken from the cafeteria");
    }
    public void talk()
    {
        System.out.println("Hi I am Vihaan and I like to play handball");
    }
    @Override
    public String toString()
    {
        return super.toString() + " | Any Diseases? : " + getDiseaseless();
        // this. is optional here as there's no confusion that we're talking
        // about the instance variable/attribute
    }
}
