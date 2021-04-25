public abstract class Cliente {
     private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "nome: " + this.nome;
    }

    public String getNome(){
        return nome;
    }
}
