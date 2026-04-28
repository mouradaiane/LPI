package org.example;

public class Funcionario {

    String nome;
    int funcao;
    int horasTrabalhadas;
    double comissaoDia;

    public double valorHora() {
        switch (funcao) {
            case 1: //cabeleleiro
                return 11;
            case 2: //manicure
                return 10;
            case 3: //lash
                return 12;
            default:
                return 0;
        }
    }
    public double taxaSalao(){
        return comissaoDia*0.40;
    }
    public double aReceberdia(){
        return (valorHora()*horasTrabalhadas)+comissaoDia- taxaSalao();
    }

}
