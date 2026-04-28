package org.example.example;

public class Cliente {

    String nome;
    String horario;
    String data;

    public void agendarHorario (String data, String horario ) {
        this.data = data;
        this.horario = horario;
    }

    public void exibirAgendamento () {
        System.out.println ("Cliente: " + nome
                + "\nHorário: " +horario
                + "\nData: "+ data );
    }

    public void cancelarAgendamento () {
        this.data = null;
        this.horario = null;
    }
}
