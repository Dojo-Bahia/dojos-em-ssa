/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.linguagil.dojobahia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author serge
 */
public class Buteco {
    private List<String> clientesSentados = new ArrayList();

    public String atender(String cliente) {
        if (clientesSentados.size() < 3) {
            clientesSentados.add(cliente);
            return "bebendo";
        } else {
            return "esperando";
        }

    }
}
