public class VeiculoUtilitario extends Veiculo {
    private int capCargaTon;
    private int nroeixos;

    public VeiculoUtilitario(String placa, String marca, String modelo, int ano, double valor, int capCargaTon,
            int nroeixos) {
        super(placa, marca, modelo, ano, valor);
        this.capCargaTon = capCargaTon;
        this.nroeixos = nroeixos;
    }

    public int getCapCargaTon() {
        return capCargaTon;
    }

    public void setCapCargaTon(int capCargaTon) {
        this.capCargaTon = capCargaTon;
    }

    public int getNroeixos() {
        return nroeixos;
    }

    public void setNroeixos(int nroeixos) {
        this.nroeixos = nroeixos;
    }

    @Override
    public String toString() {
        return "VeiculUtilitario [ano=" + ano + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa
                + ", valor=" + valor + ", capCargaTon=" + capCargaTon + ", nroeixos=" + nroeixos + "]";
    }
}