public class TakaTestClass
    {
        public static void main(String[] args) {
            System.out.println("Taka test class");
            // complete this class -- use AnimalExample and ZebraTest as inspiration
            System.out.println();
            Taka Green = new Taka("Mr Green", 2006, true);
            System.out.println(Green); // this tests toString()
            Green.setGlasses(false);
            System.out.println(Green);
            Green.talk();
            Green.eat();

            Taka Blue = new Taka("Mr.Blue", 2021, true);
            System.out.println(Blue);
            Blue.talk();
            Blue.eat();
        }
    }
