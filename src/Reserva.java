public class Reserva implements Pagamento {
    private Cliente cliente;
    private boolean pagamentoAVista;



    public Reserva(Cliente cliente, boolean pagamentoAVista){
        this.cliente = cliente;
        this.pagamentoAVista = pagamentoAVista;
    }


//    @Override
    public double calcularpagamento() {

        return 0;
    }
}
