public class RabbitTest
{
    public static void main(String[] args)
    {
        System.out.println("Rabbit test class");
        Rabbit whiteRabbit = new Rabbit("Taka", "White");
        System.out.println(whiteRabbit); // default output: Animal@75bd9247
        System.out.println(whiteRabbit.getName() + " is  " + whiteRabbit.getHideColour());
        whiteRabbit.setName("Vihaan's Rabbit"); // a setter allows us to modify an attribute
        System.out.println("Name: " + whiteRabbit.getName() + "| Colour: "+ whiteRabbit.getHideColour() );
        whiteRabbit.talk();
        whiteRabbit.eat();
    }
}