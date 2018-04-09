/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.awt.Color;
import java.util.*;

public class Main {
    
    public void run() {
        final int k = 20;
        List<Figura> figuras = new ArrayList<>();
        Figura f = new Linea(2*k, 12*k, 18*k, 12*k);
        f.setColor(Color.GREEN);
        figuras.add(f);
    }

    public static void main(String[] args) {
        new Main().run();
    }
    
}
