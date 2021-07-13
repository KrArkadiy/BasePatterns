package main.java.basepatterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
    SimpleTextChat simpleTextChat = new SimpleTextChat();
    User admin = new Admin(simpleTextChat, "Admin");
    User user = new SimpleUser("User1",simpleTextChat);
    User user1 = new SimpleUser("User2", simpleTextChat);

    simpleTextChat.setAdmin(admin);
    simpleTextChat.addUsertoChat(user);
    simpleTextChat.addUsertoChat(user1);

    user.sendMessage("Hello I'm User 1!!");
    admin.sendMessage("Roger that. I am admin");
    }
}
