package OBJECT;

import java.util.List;

public class Aeronave {
    private String modelo;
    private Integer assentosDisponiveis;
    private List<Voo> voos;

    public Aeronave(int assentosDisponiveis, String modelo) {
        this.assentosDisponiveis = assentosDisponiveis;
        this.modelo = modelo;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }

    public String getModelo() {
        return modelo;
    }
    public Integer getAssentosDisponiveis(){
        return assentosDisponiveis;
    }

    public void adicionarVoo(Voo voo) {
        if (voos.contains(voo)) {
            System.out.println("Este voo existe.");
        } else {
            voos.add(voo);
            voo.setAeronave(this);
        }
    }

    public void removerVoo(Voo voo) {
        if (voos.contains(voo)) {
            voos.remove(voo);
            voo.setAeronave(null);
        } else {
            System.out.println("Este voo não existe.");
        }
    }

}
