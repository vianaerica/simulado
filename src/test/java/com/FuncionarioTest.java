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

    @Test
    public void deveRetornarOMultiplicadorDoGerente() throws Exception {
        String cargo = "Gerente";
        int performanceAnual = 3;
        int multiplicador;

        Funcionario funcionario = new Funcionario(cargo, performanceAnual);
        multiplicador = funcionario.multiplicadorPorCargo();

        assertThat(multiplicador, is(3));
    }

    @Test
    public void deveRetornarOMultiplicadorDoAnalista() throws Exception {
        String cargo = "Analista";
        int performanceAnual = 3;
        int multiplicador;

        Funcionario funcionario = new Funcionario(cargo, performanceAnual);
        multiplicador = funcionario.multiplicadorPorCargo();

        assertThat(multiplicador, is(2));
    }

    @Test
    public void deveRetornarOMultiplicadorDoTrainee() throws Exception {
        String cargo = "Trainee";
        int performanceAnual = 3;
        int multiplicador;

        Funcionario funcionario = new Funcionario(cargo, performanceAnual);
        multiplicador = funcionario.multiplicadorPorCargo();

        assertThat(multiplicador, is(1));
    }

    @Test (expected = Exception.class)
    public void deveRetornarErroCasoSejaInformadoCargoInvalido() throws Exception {
        String cargo = "a";
        int performanceAnual = 3;

        Funcionario funcionario = new Funcionario(cargo, performanceAnual);
        funcionario.multiplicadorPorCargo();
    }

    @Test
    public void deveRetornarCargoInformado(){
        String cargo = "Trainee";
        int performanceAnual = 3;

        Funcionario funcionario = new Funcionario(cargo, performanceAnual);
        String retornoCargo = funcionario.getCargo();

        assertThat(retornoCargo, is("Trainee"));
    }

    @Test
    public void deveRetornarPerformanceAnual(){
        String cargo = "Trainee";
        int performanceAnual = 3;

        Funcionario funcionario = new Funcionario(cargo, performanceAnual);
        int retornoPerformance = funcionario.getPerformanceAnual();

        assertThat(retornoPerformance, is(3));
    }
}