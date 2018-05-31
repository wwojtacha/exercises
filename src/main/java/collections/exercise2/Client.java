package collections.exercise2;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Random;

public class Client {
    private String name;
    private Instant arrivalTime;
    boolean isPrior = false;

    public Client(String name, Instant arrivalTime, boolean isPrior) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.isPrior = isPrior;
    }


    public Client(String name, boolean isPrior) {
        this.name = name;
        this.arrivalTime = Instant.now();
        this.isPrior = isPrior;
    }

    public String getName() {
        return name;
    }

    public Instant getArrivalTime() {
        return arrivalTime;
    }

    public boolean isPrior() {
        return isPrior;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", isPrior=" + isPrior +
                '}';
    }
}
