package Arrays;

import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Esprseo", "Iced Coffee", "Macchiato"};
        String menuString = Arrays.toString(menu);

        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));
        System.out.println(menuString);

        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }
}
