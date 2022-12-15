public class Logic {
    Human human = new Human(true, true, new String[]{"Hat"});
    Wardrobe wardrobe = new Wardrobe("wood", false, true, new String[]{"Pants", "Shoes", "Shirt"});
    Interaction interaction = new Interaction();
    Logic () {}

    public void game() {
        wardrobe.repairMeNow();
        if (interaction.tryToOpen(human.keys, wardrobe.open)) {
            System.out.println("Ваша одежда: " + interaction.wearing(human.cloth, wardrobe.contain));
            interaction.travel(human.wishToTravel, wardrobe.roadToNarnia);
        } else {
            System.out.println("Попробуйте в следующий раз");
        }
    }
}
