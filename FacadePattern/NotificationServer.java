package FacadePattern;

public class NotificationServer {
    //connect() -> Connection Object
    //authenticate(appID, key) -> AuthToken Object
    //send(AuthToken, message, target)
    //conn.disconnect();
    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, String message, String targetDevice) {
        System.out.println("Sending A Message");
    }
}
