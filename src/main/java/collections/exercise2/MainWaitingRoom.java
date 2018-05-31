package collections.exercise2;

import java.time.Instant;

public class MainWaitingRoom {
    public static void main(String[] args) {
        Client client1 = new Client("Roman", Instant.now().plusSeconds(10),false);
        Client client2 = new Client("Barbara", false);
        Client client3 = new Client("Alojzy", Instant.now().plusSeconds(20), true);
        Client client4 = new Client("Heniek", false);
        Client client5 = new Client("Anita", Instant.now().minusSeconds(30), false);
        Client client6 = new Client("Mariola", true);

        WaitingRoom waitingRoom = new WaitingRoom();
        waitingRoom.addClient(client1);
        waitingRoom.addClient(client2);
        waitingRoom.addClient(client3);
        waitingRoom.addClient(client4);
        waitingRoom.addClient(client5);
        waitingRoom.addClient(client6);

        System.out.println(waitingRoom);
        waitingRoom.printPrioritizedClients();

        System.out.println(waitingRoom.getNextClient());
        System.out.println(waitingRoom.getNextClient());
        System.out.println(waitingRoom.getNextClient());
        System.out.println(waitingRoom.getNextClient());
        System.out.println(waitingRoom.getNextClient());
        System.out.println(waitingRoom.getNextClient());
        System.out.println(waitingRoom.getNextClient()); //Optional zwróci empty a nie rzuci wyjątkiem

        System.out.println(waitingRoom);
        waitingRoom.printPrioritizedClients();
    }
}
