package collections.exercise4;

import java.time.LocalDateTime;

public class Message {
    private String messageText;
    private LocalDateTime receptionDate;

    public Message(String messageText, LocalDateTime receptionDate) {
        this.messageText = messageText;
        this.receptionDate = receptionDate;
    }

    public String getMessageText() {
        return messageText;
    }

    public LocalDateTime getReceptionDate() {
        return receptionDate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageText='" + messageText + '\'' +
                ", receptionDate=" + receptionDate +
                '}';
    }
}
