public class main {
    
    public static void main(String[] args) {
        Cliente Jackson = new Cliente();
        Jackson.setName("Jackson");

        Conta cc = new ContaCorrente(Jackson);
        Conta poupanca = new ContaPoupanca(Jackson);
        
        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
