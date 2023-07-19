/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author ASUS
 */
public class Ejecutor {

    public static void main(String[] args) {

        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();

        String[][] autos = {{"LBC0001", "230.2"},
        {"LBC0002", "330.2"},
        {"LBC0003", "430.2"},
        {"LBC0004", "530.1"},
        {"LBC0005", "130.2"},};

        // 1. guardar en la tabla autos de la base de datos
        Enlace e = new Enlace();

        for (int i = 0; i < autos.length; i++) {

            String placa = autos[i][0];
            String valor = autos[i][1];

            Auto auto = new Auto();
            auto.establecerPlaca(placa);
            auto.establecerValorMatricula(Double.parseDouble(valor));
            e.insertarAuto(auto);

        }

        for (int i = 0; i < e.obtenerDataAuto().size(); i++) {
            System.out.printf("%s\n", e.obtenerDataAuto().get(i));
        }

        // 2. presentar todos los registros de la tabla autos de la base de 
        // datos
    }
}
