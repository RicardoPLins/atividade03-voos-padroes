package SERVICE;


public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
    }
    
}
