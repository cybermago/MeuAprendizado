package estrutura;

public class Carro{
    private String marca;
    private String cor;
    private Carro modelo;
    private Carro chassi;
    private int ano;
    private Carro preco_mercado;
    private double tanque;

    @Override
    public String toString() {
        return "Carro{" +
                "marca=" + marca +
                ", cor=" + cor +
                ", modelo=" + modelo +
                ", chassi=" + chassi +
                ", ano=" + ano +
                ", preco_mercado=" + preco_mercado +
                ", tanque=" + tanque +
                '}';
    }

    public  Carro(String marca, String cor, Carro modelo, Carro chassi, int ano) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.chassi = chassi;
        this.ano = ano;
    }

    public Carro() {

    }

    double getCapacidadeTanque(){
        return tanque;
    }

    double calctanque(double valorcombustivel){
        return tanque = valorcombustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Carro getModelo() {
        return modelo;
    }

    public void setModelo(String s) {
        this.modelo = modelo;
    }

    public Carro getChassi() {
        return chassi;
    }

    public void setChassi(Carro chassi) {
        this.chassi = chassi;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Carro getPreco_mercado() {
        return preco_mercado;
    }

    public void setPreco_mercado(Carro preco_mercado) {
        this.preco_mercado = preco_mercado;
    }
}
