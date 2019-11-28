/*
 * Copyright 2019 Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class App {

//   Constantes de clase
    public static final String MSG_USR = "Introduce un número por teclado: ";
    public static final String MSG_ERR = "Ha habido un error en el proceso de "
            + "introducción de un número";

//  Definición de metodo, dentro de los metodos van los parametros entre ()
    public static final double obtener(String msgUsr, String msgErr) {

        double numero = 0.0;
        boolean semaforo;

        do {
            Scanner scn = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

            System.out.printf(msgUsr);
            try {
                numero = scn.nextDouble();
                System.out.printf(Locale.ENGLISH, "Numero introducido ...: "
                        + "%.2f%n", numero);
                semaforo = false;

            } catch (Exception e) {
                System.out.println(msgErr);
                semaforo = true;
            }
        } while (semaforo);
        return numero;
    }

    public final void launchApp() {
        System.out.println("INTRODUCCIÓN DE ENTERO");
        System.out.println("======================");
/*
        Llamada de metodo, el orden importa, es decir, MSG_USR hace referencia a 
        msgUsr en el metodo, y MSG_ERR hace referencia a msgErr, el nombre 
        solo es para especificar el orden, si pusiera en la llamada el orden 
        inverso MSG_USR haría referencia a msgErr y viceversa        
*/
        obtener(MSG_USR, MSG_ERR);
    }
}
