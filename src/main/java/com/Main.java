package com;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numeroFuncionarios, performanceFuncionario;
        double margemLucroAnual;
        String cargo;

        System.out.print("\n          *** TOTIUORKIS ***");
        System.out.print("\n*** Calcule a participação nos lucros ***");
        System.out.print("\n");
        do {
            System.out.print("\nDigite o número de funcionários da empresa: ");
            numeroFuncionarios = scanner.nextInt();
            if(numeroFuncionarios <= 0){
                System.out.print("\nValor inválido. Preencha o número novamente.");
            }
        }while(numeroFuncionarios <= 0);

        do {
            System.out.print("\nDigite a margem de lucro deste ano da empresa: R$");
            margemLucroAnual = scanner.nextDouble();
            if (margemLucroAnual <= 0){
                System.out.print("\nValor inválido. Preencha o lucro novamente.");
            }
        }while(margemLucroAnual <= 0);

        do {
            System.out.print("\nDigite o cargo do funcionário (Trainee/Analista/Gerente): ");
            cargo = scanner.next();
            if (cargo.equals(" ") || cargo.equals(null)){
                System.out.print("\nEste campo não pode ser vazio. Por gentileza, preencha novamente.");
            }
        }while (cargo.equals(" ") || cargo.equals(null));

        do {
            System.out.print("\nDigite a performance do funcionário neste ano (de 1 a 5): ");
            performanceFuncionario = scanner.nextInt();
            if(performanceFuncionario < 1 || performanceFuncionario > 5){
                System.out.print("\nValor inválido. Preencha a performance novamente.");
            }
        }while (performanceFuncionario < 1 || performanceFuncionario > 5);

        Totiuorkis totiuorkis = new Totiuorkis(numeroFuncionarios, margemLucroAnual);
        Funcionario funcionario = new Funcionario(cargo, performanceFuncionario);

        double participacaoLucros = totiuorkis.calculaParticipacaoLucros(numeroFuncionarios, margemLucroAnual, funcionario);
        System.out.print("\nO valor da participação nos lucros deste funcionário será: R$" + participacaoLucros);
    }
}