public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String cpf){
        super(nome);

        this.cnpj = cnpj;
    }

    @Override
    public String toString(){
        return  "Nome: " + super.getNome() +
                "CNPJ: " + this.cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }
}
