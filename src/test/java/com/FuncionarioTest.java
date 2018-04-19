package com;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class FuncionarioTest {

    @Test
    public void deveRetornarVerdadeiroQuandoIniciarFuncionario() {
        String cargo = "Trainee";
        int performanceAnual = 3;

        Funcionario funcionario = new Funcionario(cargo, performanceAnual);

        assertThat(funcionario, is(not(nullValue())));
    }

}