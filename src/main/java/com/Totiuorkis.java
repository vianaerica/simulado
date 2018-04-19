package com;

public class Totiuorkis {

    private int numeroFuncionarios;
    private double margemLucroAnual;

    public Totiuorkis(int numeroFuncionarios, double margemLucroAnual) {
        this.numeroFuncionarios = numeroFuncionarios;
        this.margemLucroAnual = margemLucroAnual;
    }

    public void calculaParticipacaoLucros(int numeroFuncionarios, double margemLucroAnual) throws Exception{
        double total;
        total = numeroFuncionarios * 10000.0;

        if(margemLucroAnual < total){
            throw new Exception("Não haverá participação nos lucros.");
        }
    }
}
