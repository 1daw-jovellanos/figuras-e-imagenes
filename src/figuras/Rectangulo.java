/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.awt.*;
public class Rectangulo extends FiguraRellenable {
    private int x;
    private int y;
    private int anchura;
    private int altura;

    public Rectangulo(int x, int y, int anchura, int altura) {
        this.x = x;
        this.y = y;
        this.anchura = anchura;
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    @Override
    public void dibujar(Graphics g) {
        if (getColorRelleno() != null) {
            g.setColor(getColorRelleno());
            g.fillRect(x, y, anchura, altura);
        }
        g.setColor(getColor());
        ((Graphics2D)g).setStroke(new BasicStroke(getGrosor()));
        g.drawRect(x, y, anchura, altura);
    }
    
    
}
