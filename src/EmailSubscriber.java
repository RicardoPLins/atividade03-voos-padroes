public class EmailSubscriber implements Subscriber{
    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    public void update(String message) {
        System.out.println("Enviado para email: " + email +":" + message);
    }
    
}
