public class Transporte extends Despesa {
    private double kmPercorrida;
    private double valorPedagios;

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagios() {
        return valorPedagios;
    }

    public void setValorPedagios(double valorPedagios) {
        this.valorPedagios = valorPedagios;
    }

    @Override
    public void calcularDespesa() {
        System.out.println("Qual é a kilometragem percorrida?: ");
        this.kmPercorrida = leitor.nextDouble();
        System.out.println("Qual valor gasto com pedagios?: ");
        this.valorPedagios = leitor.nextDouble();
        super.setValorTotal((this.kmPercorrida * 3) + this.valorPedagios);


    }

    @Override
    public void listarDespesa() {
        System.out.println(super.getDescricao() + super.getValorTotal() +
                this.getValorPedagios() + this.getKmPercorrida());


    }
}
