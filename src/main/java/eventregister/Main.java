package eventregister;

import eventregister.manager.EventManager;
import eventregister.manager.UserManager;
import eventregister.model.Event;
import eventregister.model.EventType;
import eventregister.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        try {
//            Event event = new Event("WineFest", "Dilijan", false, 4000, EventType.FESTIVAL);
//            eventManager.addEvent(event);
//            System.out.println(event);
            eventManager.showEvents();
            List<Event> allEvents = eventManager.showEvents();
            for (Event event : allEvents) {
                System.out.println(event);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        UserManager userManager = new UserManager();
        try {
//            User user = new User("Hasmik", "Sarhatyan", "hs@mail", 10);
//            userManager.addUser(user);
//            System.out.println(user);
            userManager.showUsers();
            List<User> allUsers = userManager.showUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
