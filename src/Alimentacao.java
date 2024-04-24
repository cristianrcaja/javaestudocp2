public class Alimentacao extends Despesa {

    private String nomeRestaurante;

    private int qtdeRefeicoes;

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public int getQtdeRefeicoes() {
        return qtdeRefeicoes;
    }

    public void setQtdeRefeicoes(int qtdeRefeicoes) {
        this.qtdeRefeicoes = qtdeRefeicoes;
    }

    @Override
    public void cadastrarDespesa() {
        super.cadastrarDespesa();
        System.out.println("Qual o nome do restaurante?: ");
        this.nomeRestaurante = leitor.next();
        System.out.println("Qual a quantidade de refeições?: ");
        this.qtdeRefeicoes = leitor.nextInt();

    }

    @Override
    public void calcularDespesa() {
    super.setValorTotal(this.qtdeRefeicoes * 18);

    }

    @Override
    public void listarDespesa() {
        System.out.println("O nome do restaurante é:" + this.getNomeRestaurante() + "\n A quantidade de refeições é: "
                + this.getQtdeRefeicoes() + "\n O valor total é: " +
                super.getValorTotal() + "\n A descrição é: " +  super.getDescricao());

    }

}
