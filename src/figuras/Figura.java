
package figuras;
import java.awt.*;

public abstract class Figura implements Dibujable {
    private Color color;
    private int grosor;

    public Figura() {
        color = Color.BLACK;
        grosor = 1;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    
    
    
}
