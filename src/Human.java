import java.util.ArrayList;
import java.util.Arrays;

public class Human {
    String [] cloth;
    Boolean keys;
    Boolean wishToTravel;

        Human(boolean keys, boolean wishToTravel, String[] cloth){
        this.cloth = cloth;
        this.keys =keys;
        this.wishToTravel= wishToTravel;
    }

    public boolean tryToOpen (boolean open,boolean keys){
        if (open || keys){
            System.out.println("Шкаф открылся");
            return true;

        }else {
            System.out.println("Шкаф закрыт");
            return false;
        }
    }
    public void travel(boolean roadToNarnia, boolean wishToTravel) {
        if (roadToNarnia && wishToTravel) {
            System.out.println("Добро пожаловать в Нарнию");
        } else {
            System.out.println("Через шкаф не попутешествовать");
        }
    }
    public ArrayList<String> wearing(String[] contain, String[] wear) {
        ArrayList <String> result = new ArrayList<>();
        result.addAll(Arrays.asList(contain));
        result.addAll(Arrays.asList(wear));
        return  result;
    }

}
