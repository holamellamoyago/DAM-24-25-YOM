package Clases;

import java.util.Scanner;

public class CuentaCorriente {
    Scanner sc = new Scanner(System.in);
    
    String dni; 
    public String nombre;
    private double saldo;
    private String nombreBanco;
    private Gestor gestor;
    
    
    
    public CuentaCorriente(String dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo > 0 ? saldo : 0;
    }

    public CuentaCorriente(String dni, String nombre){
        this(dni, nombre, 0);
    }


    public CuentaCorriente(String dni, double saldo){
        this(dni, null, saldo);
    }


    



    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void sacarDinero() {
        System.out.println("Cuanto dinero te gustaría retirar?");
        double dineroARetirar = sc.nextDouble();

        if (dineroARetirar > this.saldo) {
            System.out.println("No es posible por que estas intentado retirar mas dinero del que dispones");
        } else {
            this.saldo -= dineroARetirar;
            mostrarInformacion();
        }
    }

    public void ingresarDinero(){
        System.out.println("Cuanto dinero te gustaría ingresar?");
        double dineroIngresar = sc.nextDouble();

        if (dineroIngresar <= 0) {
            System.out.println("La cantidad mínima para ingresar dinero es 1$");
        } else{
            this.saldo += dineroIngresar;
            mostrarInformacion();
        }
    }

    void mostrarInformacion(){
        System.out.println("Tu saldo es: " + saldo);
    }



}
