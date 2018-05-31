package collections.exercise3;

public class MainDispository {
    public static void main(String[] args) {

        Dispository dispository = new Dispository();
        dispository.addNotification("raped by gorilla", NotificationType.POLICE);
        dispository.addNotification("drunk fell from roof", NotificationType.AMBULANCE);
        dispository.addNotification("fire in church", NotificationType.FIREFIGHTERS);
        dispository.addNotification("prostitute for free", NotificationType.AMBULANCE);
        dispository.addNotification("epilepsy attack", NotificationType.AMBULANCE);
        dispository.addNotification("bank robbery", NotificationType.POLICE);
        System.out.println(dispository);
        System.out.println(dispository.lastNotifications(2));
        System.out.println(dispository.notificationsOfType(NotificationType.POLICE));
    }
}
