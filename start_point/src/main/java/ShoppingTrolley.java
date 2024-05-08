import java.util.ArrayList;

public class ShoppingTrolley {
    ArrayList<String> shoppingTrolley = new ArrayList<>();

    public ShoppingTrolley(ArrayList<String> shoppingTrolley){
        this.shoppingTrolley = shoppingTrolley;
    }

    public void addItem(String item) {
        shoppingTrolley.add(item);
    }

    public int numOfItems() {
        return shoppingTrolley.size();
    }

    public boolean checkItem(String item) {
        for (int i=0; i<shoppingTrolley.size(); i++) {
            if (shoppingTrolley.get(i) == item) {
                break;
            } else {
                return false;
            }
        }
        return true;
    }




}

