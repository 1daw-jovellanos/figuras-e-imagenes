
package figuras;

import java.awt.*;


public class Linea extends Figura {
    private int xInicio;
    private int xFin;
    private int yInicio;
    private int yFin;

    public Linea(int xInicio, int yInicio, int xFin , int yFin) {
        this.xInicio = xInicio;
        this.xFin = xFin;
        this.yInicio = yInicio;
        this.yFin = yFin;
    }

    public int getxInicio() {
        return xInicio;
    }

    public void setxInicio(int xInicio) {
        this.xInicio = xInicio;
    }

    public int getxFin() {
        return xFin;
    }

    public void setxFin(int xFin) {
        this.xFin = xFin;
    }

    public int getyInicio() {
        return yInicio;
    }

    public void setyInicio(int yInicio) {
        this.yInicio = yInicio;
    }

    public int getyFin() {
        return yFin;
    }

    public void setyFin(int yFin) {
        this.yFin = yFin;
    }
    
    @Override
    public void dibujar(Graphics g) {
        g.setColor(getColor());
        ((Graphics2D)g).setStroke(new BasicStroke(getGrosor()));
        g.drawLine(xInicio, yInicio, xFin, yFin);
    }

    
}
