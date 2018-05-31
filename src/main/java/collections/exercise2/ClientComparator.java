package collections.exercise2;

import java.util.Comparator;

public class ClientComparator implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        if(o1.isPrior && !o2.isPrior) return -1;
        if(!o1.isPrior && o2.isPrior) return 1;
        return o1.getArrivalTime().compareTo(o2.getArrivalTime());
    }
}
