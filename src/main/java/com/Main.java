package com;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numeroFuncionarios, performanceFuncionario;
        double margemLucroAnual;
        String cargo;

        System.out.print("\n*** TOTIUORKIS ***");
        System.out.print("\n*** Calcule a participação nos lucros ***");
        System.out.print("\n");
        System.out.print("\nDigite o número de funcionários da empresa: ");
        numeroFuncionarios = scanner.nextInt();
        System.out.print("\nDigite a margem de lucro deste ano da empresa: R$");
        margemLucroAnual = scanner.nextDouble();
        System.out.print("\nDigite o cargo do funcionário (Trainee/Analista/Gerente): ");
        cargo = scanner.next();
        System.out.print("\nDigite a performance do funcionário neste ano (de 1 a 5): ");
        performanceFuncionario = scanner.nextInt();

        Totiuorkis totiuorkis = new Totiuorkis(numeroFuncionarios, margemLucroAnual);
        Funcionario funcionario = new Funcionario(cargo, performanceFuncionario);

        double participacaoLucros = totiuorkis.calculaParticipacaoLucros(numeroFuncionarios, margemLucroAnual, funcionario);
        System.out.print("\n");
        System.out.print("O valor da participação nos lucros deste funcionário será: R$" + participacaoLucros);
    }
}