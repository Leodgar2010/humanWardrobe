public class Logic {
    Human human = new Human(true, true, new String[]{"Hat"});
    Wardrobe wardrobe = new Wardrobe("wood", false, true, new String[]{"Pants", "Shoes", "Shirt"});
     Logic () {}

    public void game() {
        wardrobe.repairMeNow();
        if (human.tryToOpen(human.keys, wardrobe.open)) {
            System.out.println("Ваша одежда: " + human.wearing(human.cloth, wardrobe.contain));
            human.travel(human.wishToTravel, wardrobe.roadToNarnia);
        } else {
            System.out.println("Попробуйте в следующий раз");
        }
    }
}
