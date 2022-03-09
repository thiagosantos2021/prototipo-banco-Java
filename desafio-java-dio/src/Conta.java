/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago
 */
public abstract class Conta implements OperacoesConta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    
    @Override
    public void Sacar(double valor) {
        //saldo = saldo - valor;
        saldo -= valor;
    }

    @Override
    public void Depositar(double valor) {
        //saldo = saldo + valor;
        saldo += valor;
    }

    @Override
    public void Transferir(double valor, Conta contaDestino) {
        Sacar(valor);
        contaDestino.Depositar(valor);
    }
    
    protected void InformacoesConta(){
    System.out.println(String.format("Titular: %s", cliente.getNome()));
    System.out.println(String.format("Agencia: %d", agencia));
    System.out.println(String.format("Numero: %d", numero));
    System.out.println(String.format("Saldo: %.2f", saldo));   
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
