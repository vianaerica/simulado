package com;

public class Funcionario {

    private String cargo;
    private int performanceAnual;

    public Funcionario(String cargo, int performanceAnual) {
        this.cargo = cargo;
        this.performanceAnual = performanceAnual;
    }

    public int getPerformanceAnual() {
        return performanceAnual;
    }

    public int multiplicadorPorCargo(String cargo) {
        return 0;
    }

    public String getCargo() {
        return cargo;
    }
}
