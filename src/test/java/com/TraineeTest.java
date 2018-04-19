package com;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class TraineeTest {

    @Test
    public void deveRetornarVerdadeiroQuandoIniciarTrainee(){
        int performanceAnual = 3;

        Trainee trainee = new Trainee(performanceAnual);

        assertThat(trainee, is(not(nullValue())));
    }

}