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


}