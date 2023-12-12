public class Voo {
    
    private String codigoVoo;

    private String status;
    
    private String aeroportoOrigem;
    private String aeroportoDestino;
    private String horarioPartida;
    private String dataChegada;
    private String horarioChegada;
    private Aeronave aeronave;

    public String AtualizarStatus(String status) {
        return status;
    }

    public String AtualizarHorario(String partida, String chegada) {
        return "partida" + partida + "chegada" +chegada;
    }
}
