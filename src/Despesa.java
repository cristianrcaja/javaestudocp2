import java.util.Scanner;

public abstract class  Despesa {
    Scanner leitor = new Scanner(System.in);
    private String descricao;

    private double valorTotal;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void cadastrarDespesa(){
        System.out.println("Qual o valor da descrição?: ");
        this.descricao = leitor.nextLine();
        this.valorTotal = 0 ;
    }

    public abstract void calcularDespesa();


    public abstract void listarDespesa();




}
