package com.d.thefinalproyect.more;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateUtils {
    /**
     * Conversion de un mes a su valor numerorico.
     * Ejemplo: Enero -> 01
     * @param mes
     * @return 
     */
    private static int obtenerMesNumerico(String mes) {
        switch (mes.toLowerCase()) {
            case "enero": return 1;
            case "febrero": return 2;
            case "marzo": return 3;
            case "abril": return 4;
            case "mayo": return 5;
            case "junio": return 6;
            case "julio": return 7;
            case "agosto": return 8;
            case "septiembre": return 9;
            case "octubre": return 10;
            case "noviembre": return 11;
            case "diciembre": return 12;
            default: throw new NumberFormatException("Mes inválido");
        }
    }

    /**
     * Obtenemos el dia correspondiente del mes para comprobar
     * @param mes
     * @param year
     * @return 
     */
    private static int obtenerDiasEnMes(int mes, int year) {
        switch (mes) {
            case 4: case 6: case 9: case 11:
                return 30; // Meses con 30 días
            case 2:
                return esBisiesto(year) ? 29 : 28; // Febrero
            default:
                return 31; // Meses con 31 días
        }
    }

    /**
     * Saber si un anio es visiesto
     * @param year
     * @return 
     */
    private static boolean esBisiesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    /**
     * Validar si una fecha es correcta.
     * 
     * @param day
     * @param month
     * @param year
     * @return 
     */
    public static boolean validateDate(String day, String month, String year) {
        try {
            // Convertir los parámetros a enteros
            int diaNum = Integer.parseInt(day);
            int mesNum = obtenerMesNumerico(month);
            int anioNum = Integer.parseInt(year);

            // Verificar límites del año y mes
            if (anioNum < 0 || mesNum < 1 || mesNum > 12 || diaNum < 1) {
                return false;
            }

            // Días máximos según el mes
            int diasMaximos = obtenerDiasEnMes(mesNum, anioNum);

            // Verificar si el día está en el rango permitido
            return diaNum <= diasMaximos;
        } catch (NumberFormatException e) {
            return false; // Retorna false si algún parámetro no es numérico.
        }
    }
    
    /**
     * Obtenemos la fecha actual en un formato de texto
     * @return 
     */
    public static String obtenerFechaActual() {
        LocalDate fecha = LocalDate.now();
        
        String dia = String.valueOf(fecha.getDayOfMonth());
        String mes = fecha.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        String año = String.valueOf(fecha.getYear());
        
        return "Hoy es " + dia + " de " + mes + " del " + año;
    }
}
