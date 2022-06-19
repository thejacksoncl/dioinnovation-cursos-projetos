import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getName() {
        return nome;
    }
    
    public void setName(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void  setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
