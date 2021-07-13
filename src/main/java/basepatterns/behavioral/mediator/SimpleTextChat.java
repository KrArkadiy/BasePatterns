package main.java.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void addUsertoChat(User user){
        users.add(user);
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u : users){
            if(u!= user){
                u.getMessage(message);
            }
        }
        admin.getMessage(message);
    }
}
