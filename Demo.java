package Empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Funcionarios> lista = new Funcionarios().funcionariosLista();

        lista.stream().forEach(funcionarios -> System.out.println(funcionarios));

        System.out.println("********");
        System.out.println("********");


        //lista mulheres
        ArrayList<Funcionarios> list = lista.stream()
                .filter(funcionarios -> funcionarios.getGenero().equals("Feminino"))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Mulheres Da Empresa:");
        list.forEach(System.out::println);



    }
}
