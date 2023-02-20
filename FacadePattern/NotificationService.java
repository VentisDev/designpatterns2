package FacadePattern;

public class NotificationService {
    public void send(String message, String target) {
        var server= new NotificationServer();
        var connection = server.connect("ip: 146.2.4.27.0");
        var authToken = server.authenticate("appId", "key");
        server.send(authToken, message, target);
        connection.disconnect();
    }
}
