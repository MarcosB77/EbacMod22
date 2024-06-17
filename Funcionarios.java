package Empresa;

import java.util.List;

public class Funcionarios {

    private String nome;

    private String genero;

    private String cargo;

    private int idade;

    public Funcionarios(String nome, String genero, String cargo, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.cargo = cargo;
        this.idade = idade;

    }

    public Funcionarios() {
        this.nome = nome;
        this.genero = genero;
        this.cargo = cargo;
        this.idade = idade;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public List<Funcionarios> funcionariosLista(){


    Funcionarios funcionarios1 = new Funcionarios("Lukas Santos", "Masculino","Admistração",44);
    Funcionarios funcionarios2 = new Funcionarios("Isabela Gomes", "Feminino","TI",27);
    Funcionarios funcionarios3 = new Funcionarios("Janaina Oliveira", "Feminino","Admistração",29);
    Funcionarios funcionarios4 = new Funcionarios("Anna Costa","Feminino","Admistração",34);
    return List.of(funcionarios1,funcionarios2,funcionarios3,funcionarios4);



    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", cargo='" + cargo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
