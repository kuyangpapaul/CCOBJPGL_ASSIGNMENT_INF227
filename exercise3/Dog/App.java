public class App {
    public static void main(String[] args) throws Exception {

      
        Cavachon myPet = new Cavachon();

        myPet.bark();
        System.out.println("His eyes are an attractive shade of " + myPet.eyeColor +".");
        System.out.println("My dog weighs " + myPet.weight + " and stands " + myPet.height +" tall.");
        System.out.println("My dog is really " + myPet.characteristic +" with me.");

    }
}
