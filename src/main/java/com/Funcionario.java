package com;

public class Funcionario {

    private String cargo;
    private int performanceAnual;

    public Funcionario(String cargo, int performanceAnual) {
        this.cargo = cargo;
        this.performanceAnual = performanceAnual;
    }

    public int multiplicadorPorCargo() throws Exception {
        if(this.cargo.equals("Trainee")){
            return 1;
        } else if (this.cargo.equals("Analista")){
            return 2;
        } else if (this.cargo.equals("Gerente")){
            return 3;
        }
        else {
            throw new Exception("Cargo inválido.");
        }
    }

    public int getPerformanceAnual() {
        return performanceAnual;
    }

    public String getCargo() { return cargo; }
}