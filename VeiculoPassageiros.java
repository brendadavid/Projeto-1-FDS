public class VeiculoPassageiros extends Veiculo {
    private int nroPassageiros;

    public VeiculoPassageiros(String placa, String marca, String modelo, int ano, double valor, int nroPassageiros) {
        super(placa, marca, modelo, ano, valor);
        this.nroPassageiros = nroPassageiros;
    }

    public int getNroPassageiros() {
        return nroPassageiros;
    }

    public void setNroPassageiros(int nroPassageiros) {
        this.nroPassageiros = nroPassageiros;
    }

    @Override
    public String toString() {
        return "VeiculoPassageiros [ano=" + ano + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa
                + ", valor=" + valor + ", nroPassageiros=" + nroPassageiros + "]";
    }
}
