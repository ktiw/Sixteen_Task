//public class Pet {
//    public String name;
//    public int hunger;
//    public int happiness;
//
//    public Pet(String name, int hunger, int happiness) {
//        this.name = name;
//        this.hunger = hunger;
//        this.happiness = happiness;
//        System.out.println("Активирован обьект" + "\n");
//    }
//    // ООП: Полиморфизм
//    public void makeSound(){
//        System.out.println("Питомец издает какой-то звук."+ "\n");
//    }
//
//    public void feed() {
//        this.hunger = this.hunger - 20;
//    if(hunger < 0) {
//        hunger = 0;
//        System.out.println("Козявка наелся");
//    }
//        this.happiness = this.happiness + 10;
//    if (happiness > 100) {
//        happiness = 100;
//        System.out.println("Он уже запредельно счастлив!!!");
//    }
//        System.out.println(this.name + " поела. " + " Голод: " + this.hunger + " Счастье " + this.happiness + "\n");
//    }
//    public void play () {
//        this.hunger = hunger + 10;
//        if(hunger < 0) {
//            hunger = 0;
//        }
//        happiness = happiness + 20;
//        if (happiness > 100) {
//            happiness = 100;
//            System.out.println("Он уже запредельно счастлив!!!");
//        }
//        System.out.println(this.name + " Поиграла. " + "Голод: " + this.hunger + " Счастье " + this.happiness + "\n");
//    }
//    public void displayStatus() {
//        System.out.println("--- Состояние питомца ---");
//        System.out.println(this.name + ":" + " Голод: " + this.hunger + " Счастье: " + this.happiness + "\n");
//    }
//}