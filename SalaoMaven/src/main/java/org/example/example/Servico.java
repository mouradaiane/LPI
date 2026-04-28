package org.example.example;

public class Servico {

    String procedimento;
    char tamanho;
    double valor;

    //dependendo do tamanho tem adicional
    public double adicional() {
        if (tamanho=='p') {
            return 0;
        } else if (tamanho == 'm') {
            return valor * 0.10;
        } else if (tamanho == 'g') {
            return valor * 0.20;
        } else {
            System.out.println("Tamanho não preenchido");
            return 0;
        }
    }
    //calcular valor total do serviço
    public double valorTotal () {
        return valor + adicional();
    }
    //Nota Fiscal
    public void notaFiscal () {
        System.out.println ("------------NOTA FISCAL------------");
        System.out.println ("Procedimento: " + procedimento + "\nValor do Procedimento: R$" +valor + "\n Adicional de Tamanho: R$" + adicional() + "\nValor Total: R$" + valorTotal());
    }
}
