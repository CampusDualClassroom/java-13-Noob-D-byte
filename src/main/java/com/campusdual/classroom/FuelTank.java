package com.campusdual.classroom;

public class FuelTank {

    private int actualFuel = 10;//modifico actualFuel a private para que sexa accesible através da misma clase

    public void showDetails() {

        System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
    }

    public int getActualFuel() {

        return this.actualFuel;
    }

    public void setActualFuel(int novoFuel) { //crear un setter en ella que impida
        // el acceso directo a la modificación del valor de su propiedad actualFuel

        if (novoFuel < 0) {
            System.out.println("Non se pode introducir un valor negativo ");
        } else {
            this.actualFuel = novoFuel;
        }
    }
}
