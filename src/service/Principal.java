package service;

import java.util.Scanner;

public class Principal {
    public void Print() {
        ApiProcurar apiProcurar = new ApiProcurar();
        Scanner scanner = new Scanner(System.in);

        System.out.println("serie ou filme:");
        String endereco =scanner.nextLine();
        if (endereco.equalsIgnoreCase("serie")){
            System.out.println("escreva a serie que deseja procurar:");
            var FilmeOuSerie = scanner.nextLine();
            System.out.println(apiProcurar.BusacarApi(FilmeOuSerie));
        } else if (endereco.equalsIgnoreCase("filme")) {
            System.out.println("escreva o filme que deseja procurar:");
            var FilmeOuSerie = scanner.nextLine();
            System.out.println(apiProcurar.BusacarApi(FilmeOuSerie));
        }
        else {
            System.out.println("nenhum dos dois selecionados");
        }


    }
}
