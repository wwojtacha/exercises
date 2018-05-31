package collections.exercise3;

import java.time.LocalDateTime;

public class Notification {
    private NotificationType notificationType;
    private String notificationText;
    private LocalDateTime notificationTime;

    public Notification(String notificationText, NotificationType notificationType) {
        this.notificationType = notificationType;
        this.notificationText = notificationText;
        this.notificationTime = LocalDateTime.now();
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public String getNotificationText() {
        return notificationText;
    }

    public LocalDateTime getNotificationTime() {
        return notificationTime;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationType=" + notificationType +
                ", notificationText='" + notificationText + '\'' +
                ", notificationTime=" + notificationTime +
                '}';
    }
}
