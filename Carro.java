/*
Exercício 3

Implemente que cada Pessoa possa ter vários objetos do tipo Carro
Implemente os seguintes métodos dentro da classe Pessoa
-getMaisRapido(); retorna o objeto Carro mais rápido que a pessoa tem
-getMaisAntigo(); retorna o objeto Carro mais antigo que a pessoa tem

Entregar códigos (Pessoa.java, Carro.java e Conta.java) em um zip
 */
package objetos6;

public class Carro {
    String marca;
    String modelo;
    int vel_max=0;
    int ano;
    
    Carro(String marc, String model, int velmax, int year){
    marca = marc;
    modelo = model;
    vel_max = velmax;
    ano = year;
    }
    
    
}
