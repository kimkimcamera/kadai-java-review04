package animal;

public class Review04 {

    public static void main(String[] args) {
        
        Animal animal01 = new Animal("田中 太郎", 25);
        animal01.say();
        
        Human hobby01 = new Human();
        hobby01.setHobby("電車");
        hobby01.think ();

        
        Animal animal02 = new Animal("鈴木 次郎", 30);
        animal02.say();
        
        Human hobby02 = new Human();
        hobby02.setHobby("野球");
        hobby02.think ();
        
        Animal animal03 = new Animal("佐藤 花子", 20);
        animal03.say();
        
        Human hobby03 = new Human();
        hobby03.setHobby ("映画");
        hobby03.think ();

    }

}
