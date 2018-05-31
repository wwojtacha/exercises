package collections.exercise4;

public class MainMessage {
    public static void main(String[] args) {
        MessageBox messageBox = new MessageBox();
        messageBox.addMessage("nie bij konia");
        messageBox.addMessage("pod biedronką");
        messageBox.addMessage("w niedziele handlowe");

        System.out.println(messageBox);
        messageBox.removeLastMessage();
    }
}
