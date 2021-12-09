/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion;

/**
 *
 * @author camilo
 */
public class Alfabeto extends Pictograma {
    private String[] letra;
    private String interpretacion;

    public Alfabeto(String origen, String[] letra, String interpretacion) {
        super(origen);
        this.letra = letra;
        this.interpretacion = interpretacion;
    }

    public String[] getLetra() {
        return letra;
    }

    public void setLetra(String[] letra) {
        this.letra = letra;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int cantidadLetras() {
        return 0;
    }
    
}
