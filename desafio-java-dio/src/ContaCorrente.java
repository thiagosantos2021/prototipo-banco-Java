/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thiago
 */
public class ContaCorrente extends Conta{
    
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    
    @Override
    public void ImprimirExtrato(){
        System.out.println("Extrato Conta Corrente");
        super.InformacoesConta();
    }
}
