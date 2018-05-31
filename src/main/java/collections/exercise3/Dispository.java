package collections.exercise3;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Dispository {
    private Map<Integer, Notification> notifications = new HashMap<>();
    private int id = 0;

    public void addNotification(String text, NotificationType notificationType){
        Notification notification = new Notification(text, notificationType);
        notifications.put(id++, notification);
    }

    public List<Notification> lastNotifications(int number){
//        List<Notification> lastNotifications = new ArrayList<>();
//        for (int i = notifications.size() - 1; i > notifications.size() - (number+1); i--){
//            lastNotifications.add(notifications.get(i));
//        }
//        System.out.println(lastNotifications);
//        return lastNotifications;

        //używając stream i komparatora. HashMap nie daje pewności utrzymania kolejności
        return notifications.values().stream()
                .sorted((x,y) -> y.getNotificationTime().compareTo(x.getNotificationTime())) //sortowanie od max do min
                .limit(number).collect(Collectors.toList());
    }

    public List<Notification> notificationsOfType(NotificationType type){
        return notifications.values().stream().filter(n -> n.getNotificationType() == type).collect(Collectors.toList());

    }


    @Override
    public String toString() {
        return "Dispository{" +
                "notifications=" + notifications +
                ", id=" + id +
                '}';
    }
}
