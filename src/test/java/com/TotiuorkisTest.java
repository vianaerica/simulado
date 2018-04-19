package com;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class TotiuorkisTest {

    @Test
    public void deveRetornarVerdadeiroQuandoIniciarTotiuorkis(){
        int numeroFuncionarios = 1000;
        double margemLucroAnual = 12000.0;

        Totiuorkis totiuorkis = new Totiuorkis(numeroFuncionarios, margemLucroAnual);

        assertThat(totiuorkis, is(not(nullValue())));
    }

    @Test (expected = Exception.class)
    public void deveRetornarErroSeMargemLucroMenorQueValorMinimoDefinido() throws Exception {
        int numeroFuncionarios = 2;
        double margemLucroAnual = 100;

        Totiuorkis totiuorkis = new Totiuorkis(numeroFuncionarios, margemLucroAnual);

        totiuorkis.calculaParticipacaoLucros(numeroFuncionarios, margemLucroAnual);
    }

    @Test
    public void deveRetornarParticipacaoLucrosCalculada() throws Exception {
        int numeroFuncionarios = 10;
        double margemLucroAnual = 200500;
        //int performanceAnual = 1;

        //Trainee funcionario = new Trainee(performanceAnual);

        Totiuorkis totiuorkis = new Totiuorkis(numeroFuncionarios, margemLucroAnual);

        totiuorkis.calculaParticipacaoLucros(numeroFuncionarios, margemLucroAnual);
    }
}