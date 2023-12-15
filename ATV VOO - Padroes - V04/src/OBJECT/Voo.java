package OBJECT;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import SERVICE.Obs;

public class Voo {
    private String NumVoo;
    private String aeroportoOrigem;
    private String aeroportoDestino;
    private LocalDateTime horarioPartida;
    private LocalDateTime horarioChegada;
    private StatusVoo status;
    private Aeronave aeronave;

    private List<Obs> observadores = new ArrayList<>();

    public Voo(String n, String Origem, String Destino, LocalDateTime partida, LocalDateTime chegada, Aeronave aeronave) {
        this.NumVoo = n;
        this.aeroportoOrigem = Origem;
        this.aeroportoDestino = Destino;
        this.horarioChegada = chegada;
        this.horarioPartida = partida;
        this.aeronave = aeronave;
    }

    public void adicionarObservador(Passageiro passageiro) {
        if (aeronave != null && observadores.size() < aeronave.getAssentosDisponiveis()) {
            observadores.add(passageiro);
            System.out.println("Passageiro " + passageiro.getNome() + " adicionado ao " + this.getNumVooString());
        } else {
            System.out.println("Não foi possível adicionar o observador (Passageiro) ao voo. Capacidade máxima atingida.");
        }
    }

    public void removerObservador(Obs observador) {
        observadores.remove(observador);
    }

    public void atualizarStatus(StatusVoo status) {
        this.status = status;
        notificarObservadores();
    }

    public StatusVoo getStatus() {
        return this.status;
    }

    public String getNumVooString() {
        return this.NumVoo;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public void notificarObservadores() {
        for (Obs observador : observadores) {
            observador.atualizar(this);
        }
    }

    public void setStatusNotifyAtrasado(StatusVoo novoStatus, LocalDateTime novaPartida, LocalDateTime novaChegada) {
        this.status = novoStatus;
        this.horarioChegada = novaChegada;
        this.horarioPartida = novaPartida;
        notificarObservadores();
    }

    public void setStatusNotify(StatusVoo status) {
        this.status = status;
        notificarObservadores();
    }
}
