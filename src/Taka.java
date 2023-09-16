public class Taka extends Animal{
    private boolean glasses;

    public Taka(String name, int birthYear, boolean glasses)
    {
        super(name, birthYear); // calls Animal's constructor
        this.glasses = glasses;
    }

    public Taka(String name, boolean glasses)
    {
        super(name); // calls Animal's constructor
        this.glasses = glasses;
    }

    public boolean getGlasses()
    {
        return glasses;
    }

    public void setGlasses(boolean glasses)
    {
        this.glasses = glasses;
    }

    public void talk()
    {
        System.out.println("Alon is my best friend");
    }

    public void eat()
    {
        System.out.println("Eating chicken and rice");
    }

    @Override
    public String toString()
    {
        return super.toString() + " | glasses? : " + glasses;
        // this. is optional here as there's no confusion that we're talking
        // about the instance variable/attribute
    }
}
