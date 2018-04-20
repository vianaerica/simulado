package com;

public class Funcionario {

    private String cargo;
    private int performanceAnual;
    private int multiplicador;

    public Funcionario(String cargo, int performanceAnual) {
        this.cargo = cargo;
        this.performanceAnual = performanceAnual;
    }

    public int getPerformanceAnual() {
        return performanceAnual;
    }

    public int multiplicadorPorCargo(String cargo) throws Exception {
        if(cargo.equals("Trainee")){
            return 1;
        } else if (cargo.equals("Analista")){
            return 2;
        } else if (cargo.equals("Gerente")){
            return 3;
        }
        else {
            throw new Exception("Cargo inválido.");
        }
    }

    public String getCargo() {
        return cargo;
    }
}
