public class Diaria extends Despesa {
    private double qtdeDiaria;

    @Override
    public void calcularDespesa() {
    super.cadastrarDespesa();
        System.out.println("Qual a quantidade de diarias utilizadas?: ");
    this.qtdeDiaria = leitor.nextDouble();
    super.setValorTotal(qtdeDiaria * 50 );

    }

    @Override
    public void listarDespesa() {
        System.out.println(qtdeDiaria + getDescricao() + getValorTotal());

    }

}
