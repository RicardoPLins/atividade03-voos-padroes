package SERVICE;

public class NotificacaoSMS implements Notificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
