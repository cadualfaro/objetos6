/*

Pessoa pode possuir 2 contas. Inicialmente não tem nenhuma conta. Criar método registrarConta.
Verificar em qual atributo registrar. Verificar se a Pessoa já não tem 2 contas
Conta só tem um dono

Modifique o código da Pessoa com duas Contas para funcionar com qualquer número de contas
Modifique o método getSaldoTotal( ), que retorna o valor somado de todas as contas da pessoa

Como contabilizar quantos depósitos e quantos saques foram feitos em uma conta? Adapte a classe Conta
para conseguirmos saber a quantidade de depósitos/saques.
Crie um método (no projeto principal) que compara se o nome de duas pessoas é igual. 
Dica: use o método ‘equals’ da classe String

Implemente que cada Pessoa possa ter vários objetos do tipo Carro
Implemente os seguintes métodos dentro da classe Pessoa
-getMaisRapido(); retorna o objeto Carro mais rápido que a pessoa tem
-getMaisAntigo(); retorna o objeto Carro mais antigo que a pessoa tem

Entregar códigos (Pessoa.java, Carro.java e Conta.java) em um zip
 */
package objetos6;

import java.util.Scanner;

public class Objetos6 {

    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        double valor = 100;
        Pessoa p1 = new Pessoa();
        System.out.println("Qual o nome do dono da conta 1?");
        p1.nome = my_scan.next();
        Pessoa p2 = new Pessoa();
        System.out.println("Qual o nome do dono da conta 2?");
        p2.nome = my_scan.next();
        if(p1.nome.equals(p2.nome)){
        System.out.println("Nomes iguais\n");
        }
        else{
        System.out.println("Nomes diferentes\n");
        }
        
        Pessoa dono1 = p1;
        Pessoa dono2 = p2;
        
        Conta c1 = new Conta(dono1);
        System.out.println("Conta 1 registrada para: "+p1.nome);
        Conta c2 = new Conta(dono2);
        System.out.println("Conta 2 registrada para: "+p2.nome);
        Conta c3 = new Conta(dono2);
        System.out.println("Conta 3 registrada para: "+p2.nome);
        Conta c4 = new Conta(dono1);
        System.out.println("Conta 4 registrada para: "+p1.nome);
        Conta c5 = new Conta(dono1);
        System.out.println("Conta 5 registrada para: "+p1.nome);
        
        Carro car1 = new Carro("Fiat", "Uno", 400, 1995);
        Carro car2 = new Carro("Fiat", "Dos", 500, 2000);
        Carro car3 = new Carro("Fiat", "Tres", 600, 2005);
        
        p1.registrarCarro(car1);
        p1.registrarCarro(car2);
        p1.registrarCarro(car3);
        
        p1.getMaisRapido();
        p1.getMaisAntigo();
        
        c5.getDono();
        c2.getDono();
        p1.getSaldo(c1);
        p1.getSaldo(c2);
        p1.getSaldoTotal();
        p2.getSaldoTotal();
        c1.Depositar(valor);
        c1.Depositar(valor);
        c1.Sacar(valor);
        c1.Sacar(valor);
    }
    
}
