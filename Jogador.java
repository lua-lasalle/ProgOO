//Luana da Costa Bueno e João Victor Bartolot

public class Jogador {
    private String nome;
    private String sobreNome;
    private Integer idade;
    private Time time;

	public String getNome() { return this.nome; }
	public void setNome(String nome) { this.nome = nome; }


	public String getSobreNome() { return this.sobreNome; }
	public void setSobreNome(String sobreNome) { this.sobreNome = sobreNome; }


    public Integer getIdade() { return this.idade; }
    public void setIdade(Integer idade) { this.idade = idade; }

    public Time getTime() { return this.time; }
    public void setTime(Time time) { this.time = time; }

    public Jogador(String nome, String sobreNome, Integer idade, Time time) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.time = time;
    }

    public void mostrarNomeSobrenome() {
        System.out.println( this.nome + " " + this.sobreNome);
    }

    
}
