package Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os dados dos funcionários no formato Nome-Gênero,Nome-Gênero,...:");

        String input = scanner.nextLine();
        String[] funcionariosArray = input.split(",");
        List<Funcionarios> lista = new ArrayList<>();

        for (String funcionarioData : funcionariosArray) {
            String[] data = funcionarioData.split("-");
            if (data.length == 2) {
                String nome = data[0].trim();
                String genero = data[1].trim();
                lista.add(new Funcionarios(nome, genero));
            } else {
                System.out.println("Entrada inválida: " + funcionarioData);
            }
        }

        System.out.println("Todos os Funcionários:");
        lista.forEach(System.out::println);

        System.out.println("********");
        System.out.println("Mulheres Da Empresa:");

        List<Funcionarios> listaMulheres = lista.stream()
                .filter(funcionarios -> funcionarios.getGenero().equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());

        listaMulheres.forEach(System.out::println);
    }
}
