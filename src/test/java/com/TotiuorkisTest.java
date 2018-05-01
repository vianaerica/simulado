package com;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class TotiuorkisTest {

    @Test (expected = Exception.class)
    public void deveRetornarErroSeMargemLucroMenorQueValorMinimoDefinido() throws Exception {
        int numeroFuncionarios = 2;
        double margemLucroAnual = 100;

        Totiuorkis totiuorkis = new Totiuorkis(numeroFuncionarios, margemLucroAnual);

        totiuorkis.calculaParticipacaoLucros(numeroFuncionarios, margemLucroAnual, null);
    }

    @Test
    public void deveRetornarParticipacaoLucrosCalculada() throws Exception {
        int numeroFuncionarios = 10;
        double margemLucroAnual = 200500.0;
        int performanceAnual = 1;
        double participacaoLucro;

        Funcionario funcionario = new Funcionario("Trainee", performanceAnual);

        Totiuorkis totiuorkis = new Totiuorkis(numeroFuncionarios, margemLucroAnual);

        participacaoLucro = totiuorkis.calculaParticipacaoLucros(numeroFuncionarios, margemLucroAnual, funcionario);

        assertThat(participacaoLucro, is(8020.0));
    }
}