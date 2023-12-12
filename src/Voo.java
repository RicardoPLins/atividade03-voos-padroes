import java.util.ArrayList;
import java.util.List;

// Publisher
public class Voo {
    
    private String codigoVoo;

    private List<Subscriber> subscribers;

    private String status;
    
    private String aeroportoOrigem;
    private String aeroportoDestino;
    private String horarioPartida;
    private String dataChegada;
    private String horarioChegada;
    private Aeronave aeronave;

    public Voo(String codigoVoo){
        this.codigoVoo = codigoVoo;
        this.subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

      public void notifySubscribers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
    

    public void AtualizarStatus(String status) {
        String message = "Status de voo" + codigoVoo +"alterado para: "+ status;
        notifySubscribers(message);
    }

    public String AtualizarHorario(String partida, String chegada) {
        return "partida" + partida + "chegada" +chegada;
    }
}
