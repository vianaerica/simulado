package com;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class GerenteTest {

    @Test
    public void deveRetornarVerdadeiroQuandoIniciarGerente(){
        int performanceAnual = 5;

        Gerente gerente = new Gerente(performanceAnual);

        assertThat(gerente, is(not(nullValue())));
    }

}