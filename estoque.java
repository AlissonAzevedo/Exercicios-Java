public class estoque {

    private double precoCompra;
    private double precoVenda;
    private String loteProduto;
    private String nomeProduto;
    private String marcaProduto;

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getLoteProduto() {
        return loteProduto;
    }

    public void setLoteProduto(String loteProduto) {
        this.loteProduto = loteProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    @Override
    public String toString(){
        String s = "";
        s += "nomeProduto: " + nomeProduto+" ";
        s += "loteProduto: " + loteProduto+" ";
        s += "marcaProduto: " + marcaProduto+" ";
            return s;
    }
}
