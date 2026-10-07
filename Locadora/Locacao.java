public class Locacao {
    
    private Cliente cliente;
    private Veiculo veiculo;
    private String dataLocacao;
    private String dataDevolucao;

    public Locacao(Cliente cliente, Veiculo veiculo, String dataLocacao, String dataDevolucao) {

            if (veiculo.isDisponivel()) {
                System.out.println("Pode alugar");
                veiculo.setDisponivel(false);
                } else {
                    System.out.println("O carro já tá ocupado.");
            };
        
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
    };


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}