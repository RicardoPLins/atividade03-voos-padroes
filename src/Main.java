public class Main {
    public static void main(String[] args) {
        // Criando o voo e os diferentes tipos de assinantes
        Voo vooGLO2103 = new Voo("GLO2103");
        EmailSubscriber emailSubscriber = new EmailSubscriber("exemplo@email.com");
        SMSSubscriber smsSubscriber = new SMSSubscriber("+123456789");
        PushNotificationSubscriber pushNotificationSubscriber = new PushNotificationSubscriber("DeviceID123");

        // Adicionando assinantes ao voo
        vooGLO2103.addSubscriber(emailSubscriber);
        vooGLO2103.addSubscriber(smsSubscriber);
        vooGLO2103.addSubscriber(pushNotificationSubscriber);

        // Simulando uma mudança no status do voo
        vooGLO2103.AtualizarStatus("atrasado");
    }
}
