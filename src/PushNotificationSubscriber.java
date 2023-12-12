public class PushNotificationSubscriber implements Subscriber{
    private String deviceID;

    public PushNotificationSubscriber(String deviceID){
        this.deviceID = deviceID;
    }

    public void update(String message){
        System.out.println("Enviando push notification para "+ deviceID 
        + ": " + message);
    }
    
}
