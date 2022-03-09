/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago
 */
public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.setNome("Thiago");
        
        Conta cc = new ContaCorrente(cliente);
        cc.Depositar(300);
        Conta cp = new ContaPoupanca(cliente);
        cc.Transferir(100, cp);
        
        cc.ImprimirExtrato();
        cp.ImprimirExtrato();
    }
}
