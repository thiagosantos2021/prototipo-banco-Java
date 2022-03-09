/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author thiago
 */
public interface OperacoesConta {
    void Sacar(double valor);
    
    void Depositar(double valor);
    
    void Transferir(double valor, Conta contaDestino);
    
    void ImprimirExtrato();
}
