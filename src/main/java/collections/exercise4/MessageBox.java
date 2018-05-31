package collections.exercise4;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class MessageBox {
    private List<Message> messages = new LinkedList<>();

    public void addMessage(String text){
        Message message = new Message(text, LocalDateTime.now());
        messages.add(message);
    }

    public Message removeLastMessage(){

        System.out.println("Message removed: " + messages.remove(messages.size()-1));
        System.out.println(messages.get(messages.size() - 1));
        return messages.get(messages.size() - 1);
    }

    @Override
    public String toString() {
        return "MessageBox{" +
                "messages=" + messages +
                '}';
    }
}
