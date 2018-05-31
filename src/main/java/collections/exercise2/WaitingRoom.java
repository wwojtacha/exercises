package collections.exercise2;

import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class WaitingRoom {
    private PriorityQueue<Client> clients = new PriorityQueue<>();


        public void addClient(Client client){
        clients.add(client);
        }

        public Optional<Client> getNextClient(){ // Optional uchroni przed rzuceniem wyjątkiem
        return Optional.ofNullable(clients.poll());
        }

        public void printPrioritizedClients(){
        List<Client> sortedList = clients.stream().sorted(new ClientComparator()).collect(Collectors.toList());
            System.out.println(sortedList);
        }

    @Override
    public String toString() {
        return "WaitingRoom{" +
                "clients=" + clients +
                '}';
    }
}
