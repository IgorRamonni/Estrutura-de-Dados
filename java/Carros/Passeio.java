public class Passeio extends Automovel {

    private int nrAssentos = 5;
    private String tipoVeiculo = "Hatch";
    private int qtdPortas = 4;

    public int getNrAssentos() {
        return nrAssentos;
    }

    public void setNrAssentos(int nrAssentos) {
        this.nrAssentos = nrAssentos;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public Passeio(int nrAssentos, String tipoVeiculo, int qtdPortas) {
        this.nrAssentos = nrAssentos;
        this.tipoVeiculo = tipoVeiculo;
        this.qtdPortas = qtdPortas;
    }

}
