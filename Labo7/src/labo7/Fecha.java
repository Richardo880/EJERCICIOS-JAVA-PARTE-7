/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo7;

/**
 *
 * @author ricar
 */
//Clase Fecha Java
public class Fecha {
    
    
    private String mesC;
    private int dias;
    
    private int dia;
    private int mes;
    private int año;
    //Constructor por defecto

    public Fecha() {
    }
    //Constructor con parámetros

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public Fecha(int dia, String mesC, int año) {
        this.dia = dia;
        this.mesC = mesC;
        this.año = año;
    }
    
    //setters y getters

    public void setDia(int d) {
        dia = d;
    }

    public void setMes(int m) {
        mes = m;
    }

    public void setAño(int a) {
        año = a;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public String getMesC() {
        return mesC;
    }

    public void setMesC(String mesC) {
        this.mesC = mesC;
    }
    
    
    //Método para comprobar si la fecha es correcta
    
    private String devolverelmes(){
        String elmes;
        switch(mes){
            case 1:
                elmes =  "Enero";
                break;
            case 2:
                elmes =  "Febrero";
                break;
            case 3:
                elmes =  "Marzo";
                break;
            case 4:
                elmes =  "Abril";
                break;
            case 5:
                elmes =  "Mayo";
                break;
            case 6:
                elmes =  "Junio";
                break;
            case 7:
                elmes =  "Julio";
                break;
            case 8:
                elmes =  "Agosto";
                break;
            case 9:
                elmes =  "Septiembre";
                break;
            case 10:
                elmes =  "Octubre";
                break;
            case 11:
                elmes =  "Noviembre";
                break;
            case 12:
                elmes =  "Diciembre";
                break;
            default:
                elmes = "invalido";
                
        }
        return elmes;
    }
    
    
    private int devolvermes(){
        int elmes;
        switch(mesC){
            case "Enero":
                elmes =  1;
                break;
            case "Febrero":
                elmes =  2;
                break;
            case "Marzo":
                elmes =  3;
                break;
            case "Abril":
                elmes =  4;
                break;
            case "Mayo":
                elmes =  5;
                break;
            case "Junio":
                elmes =  6;
                break;
            case "Julio":
                elmes =  7;
                break;
            case "Agosto":
                elmes =  8;
                break;
            case "Septiembre":
                elmes =  9;
                break;
            case "Octubre":
                elmes =  10;
                break;
            case "Noviembre":
                elmes =  11;
                break;
            case "Diciembre":
                elmes =  12;
                break;
            default:
                elmes = 0;
                
        }
        return elmes;
    }
    
    
    
    
    public void imprimirfecha(){
        if(mesC == null){
            if(mes<10){
                System.out.print(getDia()+" - 0"+getMes()+" - "+getAño()+"\n");
                System.out.print(getDia()+" de "+devolverelmes()+" del "+getAño()+"\n");
                System.out.print(getDia()+"/0"+getMes()+"/"+getAño()+"\n");
                
            }else{
                System.out.print(getDia()+" - "+getMes()+" - "+getAño()+"\n");
                System.out.print(getDia()+" de "+devolverelmes()+" del "+getAño()+"\n");
                System.out.print(getDia()+"/"+getMes()+"/"+getAño()+"\n");
            }
            
        }else{
            if(mes<10){
                System.out.print(getDia()+" - 0"+devolvermes()+" - "+getAño()+"\n");
                System.out.print(getDia()+" de "+getMesC()+" del "+getAño()+"\n");
                System.out.print(getDia()+"/0"+devolvermes()+"/"+getAño()+"\n");
            }else{
                System.out.print(getDia()+" - "+devolvermes()+" - "+getAño()+"\n");
                System.out.print(getDia()+" de "+getMesC()+" del "+getAño()+"\n");
                System.out.print(getDia()+"/"+devolvermes()+"/"+getAño()+"\n");
            }
        }
    }
    
} //Fin de la clase Fecha
