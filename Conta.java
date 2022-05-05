/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos6;

/**
 *
 * @author cadua
 */
public class Conta {
    public static int qntdDep = 0;
    public static int qntdSaq = 0;
    public double saldo = 100;
    public Pessoa dono;
    
    Conta(Pessoa donoP){
        dono = donoP;
        if(dono != null){
    donoP.registrarConta(saldo,this);
        }
    }
    
    public void Depositar(double deposito){
        if(deposito>0){
        saldo = saldo+deposito;
        System.out.println("Valor do depósito: "+deposito);
        System.out.println("Novo saldo: "+saldo);
        qntdDep++;
        System.out.println("Depósitos nessa conta: "+qntdDep+"\n");
        }
        else{
        System.out.println("Deposito: "+deposito);
        System.out.println("Erro! Valor invalido!");
        System.out.println("Saldo Atual: "+saldo);
        }
        }
    
        public void Sacar(double valor){
        System.out.println("Sacando: "+valor);
    if(valor<0){
        System.out.println("Erro! Valor negativo.");
    }
    else{
        if(valor>saldo){
            System.out.println("Saldo Insuficiente para saque!");
        }
        else{
    saldo = saldo-valor;
        System.out.println("Seu novo saldo é: "+saldo);
        qntdSaq++;
        System.out.println("Saques nessa conta: "+qntdSaq+"\n");
            }
        }
    }
    
    public double getSaldo(){
        System.out.println("Saldo: "+saldo+"\n");
        return this.saldo;
    }
    
    public Pessoa getDono(){
        System.out.println("\nDono da conta: "+dono.nome);
        return dono;
    }
}
