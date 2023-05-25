package apps.actions;

import java.util.HashMap;

public class Actions {
    public static HashMap<Integer, String> actions = new HashMap<Integer, String>();

    public void setActions (){
        actions.put(1, "Выбрана музыка");
        actions.put(2, "Фильм начался");
        actions.put(3, "Игра запущена");
    }
}
