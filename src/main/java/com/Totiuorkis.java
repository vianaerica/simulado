package com;

public class Totiuorkis {

    private int numeroFuncionarios;
    private double margemLucroAnual;

    public Totiuorkis(int numeroFuncionarios, double margemLucroAnual) {
        this.numeroFuncionarios = numeroFuncionarios;
        this.margemLucroAnual = margemLucroAnual;
    }

    public double calculaParticipacaoLucros(int numeroFuncionarios, double margemLucroAnual, Funcionario funcionario) throws Exception{
        double totalFuncionarios, participacaoTotal;
        totalFuncionarios = numeroFuncionarios * 10000.0;

        if(margemLucroAnual < totalFuncionarios){
            throw new Exception("Não haverá participação nos lucros.");
        }
        else{
            participacaoTotal = (funcionario.getPerformanceAnual() * funcionario.multiplicadorPorCargo(funcionario.getCargo()) * (margemLucroAnual*0.40)/numeroFuncionarios);
            return participacaoTotal;
        }
    }
}
