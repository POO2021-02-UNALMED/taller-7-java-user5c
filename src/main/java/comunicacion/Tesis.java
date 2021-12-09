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
public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencia;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencia = referencia;
        this.interpretacion = interpretacion;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * palabrasPagina * 5;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return this.getOrigen() + "\n"
                + this.getTitulo() + "\n"
                + this.getAutor() + "\n"
                + this.getPaginas() + "\n"
                + idea + "\n"
                + argumentos.length + "\n"
                + conclusion + "\n"
                + referencia;
    }
    
    
}
