//Luana da Costa Bueno e João Victor Bartolot

import java.time.LocalDate;

public class Escalacao {
    private Time time;
    private Jogador[] jogadores;
    private LocalDate data;

    public Time getTime() { return this.time; }
    public void setTime(Time time) { this.time = time; }

    public Jogador[] getJogadores() { return this.jogadores; }
    public void setJogadores(Jogador[] jogadores) { this.jogadores = jogadores; }

    public LocalDate getData() { return this.data; }
    public void setData(LocalDate data) { this.data = data; }

    public Escalacao(Time time, Jogador[] jogadores, LocalDate data) {
        this.time = time;
        this.jogadores = jogadores;
        this.data = data;
    }

    public void imprimir() {
        System.out.println(this.time.getNome());

        System.out.println("---------------------");

        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.print(" - ");
            System.out.println(this.jogadores[i].getNome());
        }
    }
}
