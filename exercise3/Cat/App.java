public class App {
    public static void main(String[] args) throws Exception {

        Pet myPet = new Pet();

        myPet.meow();
        System.out.println("Her eyes are an attractive shade of " + myPet.eyeColor +".");
        System.out.println("My cat weighs " + myPet.weight + " and stands " + myPet.height +" tall.");     
        System.out.println("My cat is very " + myPet.characteristic +" to me and she also loves to eat " + myPet.food + ".");
     

    }
}
