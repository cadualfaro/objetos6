/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos6;

import java.util.ArrayList;

/**
 *
 * @author cadua
 */
public class Pessoa {
    public ArrayList<Conta>contas = new ArrayList<>(); //Inicializa variável conta do tipo ArrayList
    public ArrayList<Carro>carros = new ArrayList<>();
    public String nome;
    public double saldo;
    double soma = 0;
    String donoCar;
    int i, k;
    Carro veloz, old;
    
    
    void registrarConta(double saldo,Conta conta){
    this.saldo = saldo;
    contas.add(conta);
    }
    
        public double getSaldo(Conta SaldoConta){
        System.out.println("Saldo: "+saldo+"\n");
        return this.saldo;
    }
    
    public double getSaldoTotal(){
    for(int i=0; i < contas.size();i++){
    soma = soma + saldo;
    }
    System.out.println("Saldo total de "+nome+": "+soma+"\n");
    return soma;
    }
    
    void registrarCarro(Carro car){
    donoCar = this.nome;
    carros.add(car);
        System.out.println("Carro registrado");
    }
    
    void getMaisRapido(){
        veloz = carros.get(carros.size()-1);
        
    for(i=0; i<carros.size();i++){
        if(this.carros.get(i).vel_max > veloz.vel_max){
            veloz = this.carros.get(i);
        }
    }
    
    if(this.carros.get(0).vel_max == veloz.vel_max){
            System.out.println("Todos os carros tem a mesma velocidade");
    }
    else{
    System.out.println("Carro mais rapido: "+veloz.marca+" "+veloz.modelo);
    }
    }
    
    void getMaisAntigo(){
        old = carros.get(carros.size()-1);
        
    for(i=0; i<carros.size();i++){
        if(this.carros.get(i).ano < old.ano){
            old = this.carros.get(i);
        }
    }
    
    if(this.carros.get(carros.size()-1).ano == old.ano){
            System.out.println("Todos os carros tem o mesmo ano de fabricação");
    }
    else{
    System.out.println("Carro mais antigo: "+old.marca+" "+old.modelo);
    }
    }

    
}
