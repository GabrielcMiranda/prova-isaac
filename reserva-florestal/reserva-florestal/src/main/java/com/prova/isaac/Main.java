package com.prova.isaac;

public class Main {
    public static void main(String[] args) {
        EspecieCSV.insertData();
        AreaCSV.insertData();
        AvistamentoCSV.insertData();
        Reservatorio r1  = new Reservatorio();
        r1.home();
        }
    }