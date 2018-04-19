package com;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class AnalistaTest {

    @Test
    public void deveRetornarVerdadeiroQuandoIniciarAnalista(){
        int performanceAnual = 3;

        Analista analista = new Analista(performanceAnual);

        assertThat(analista, is(not(nullValue())));
    }

}