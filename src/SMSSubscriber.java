public class SMSSubscriber implements Subscriber{
    private String numeroCelular;

    public SMSSubscriber(String numeroCelular){
        this.numeroCelular = numeroCelular;
    }  

    public void update(String message){
        System.out.println("Enviando SMS para " + numeroCelular + ":" + message);
    }
    
}
