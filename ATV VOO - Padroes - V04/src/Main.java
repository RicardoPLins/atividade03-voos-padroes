import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import OBJECT.Aeronave;
import OBJECT.Passageiro;
import OBJECT.Voo;
import SERVICE.Notificacao;
import SERVICE.NotificacaoEmail;
import SERVICE.NotificacaoSMS;
import OBJECT.StatusVoo;

public class Main {
    
    private static Aeronave a1boing737 = new Aeronave(162, "Boeing 737 MAX 8,");
    private static Aeronave a2boing737 = new Aeronave(162, "Boeing 737 MAX 8,");
    private static Aeronave a3boing737 = new Aeronave(162, "Boeing 737 MAX 8,");

    private static Notificacao email = new NotificacaoEmail();
	private static Notificacao sms = new NotificacaoSMS();

	static List<Voo> voos = new ArrayList<>();

	    public static void main(String[] args) {
            LocalDateTime origem1 = LocalDateTime.now().plusHours(1);
            LocalDateTime destino1 = origem1.plusHours(3);
            LocalDateTime origem2 = LocalDateTime.now().plusHours(2);
            LocalDateTime destino2 = origem2.plusHours(3);
            LocalDateTime origem3 = LocalDateTime.now().plusHours(3);
            LocalDateTime destino3 = origem3.plusHours(3);


            Voo vooGLO2101 = new Voo( "GLO2101", "REC", "NAT", origem1, destino1, a1boing737);
            Voo vooGLO2102 = new Voo( "GLO2102", "THE", "FOR", origem2, destino2, a2boing737);
            Voo vooGLO2103 = new Voo( "GLO2103", "JPA", "BSB", origem3, destino3, a3boing737);
            voos.add(vooGLO2101);
            voos.add(vooGLO2102);
            voos.add(vooGLO2103);



            Passageiro passageiro1 = new Passageiro("Ricardo", email);
            Passageiro passageiro2 = new Passageiro("Arthur", sms);
            vooGLO2101.adicionarObservador(passageiro1);
		    vooGLO2101.adicionarObservador(passageiro2);

            Passageiro passageiro3 = new Passageiro("Thalyson", email);
            Passageiro passageiro4 = new Passageiro("Miguel", sms);
            vooGLO2101.adicionarObservador(passageiro3);
		    vooGLO2101.adicionarObservador(passageiro4);

            Passageiro passageiro5 = new Passageiro("Leandro", email);
            Passageiro passageiro6 = new Passageiro("Anthunes", sms);
            vooGLO2101.adicionarObservador(passageiro5);
		    vooGLO2101.adicionarObservador(passageiro6);

        

            vooGLO2101.atualizarStatus(StatusVoo.CONFIRMADO);
            vooGLO2102.atualizarStatus(StatusVoo.CANCELADO);

            vooGLO2103.atualizarStatus(StatusVoo.MUDANCA_PORTAO);
            Scanner scanner = new Scanner(System.in);
        

            
    }
}

