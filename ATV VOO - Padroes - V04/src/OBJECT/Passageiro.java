package OBJECT;

import SERVICE.Notificacao;
import SERVICE.Obs;

public class Passageiro implements Obs {
    private String nome;
    private Notificacao selecionarTipoNotificacao;

    public Passageiro(String nome, Notificacao selecionarTipoNotificacao) {
        this.nome = nome;
        this.selecionarTipoNotificacao = selecionarTipoNotificacao;
    }

    @Override
    public void atualizar(Voo voo) {
        System.out.println("Notificando " + nome + " sobre o status do voo: " + voo.getStatus());
        selecionarTipoNotificacao.enviarNotificacao("Alteração no Estado no VOO");
    }

    public String getNome() {
        return nome;
    }
}
