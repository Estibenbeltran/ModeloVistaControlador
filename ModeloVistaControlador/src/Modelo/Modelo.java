/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Dairo Estiben Beltrán
 *
 */

// atributos del modelo
public class Modelo { 
    
    private String text;
    private String result;
    
 // Setter y Getter de las propiedades declaradas
    
    public String getText() { 
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String Result) {
        this.result = result;
    }
    
    
    public String Content(){       
        this.result = this.text;
        return this.result;
    }
    
}
