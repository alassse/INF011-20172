/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icetheme;

import blok.interfaces.IImagemFundo;
import javax.swing.ImageIcon;

/**
 *
 * @author aluno
 */
public class IceImagemFundo implements IImagemFundo{

    @Override
    public ImageIcon getImagemFundo() {
        String fundo = "images/player/icebackground.jpg";
        
        return new ImageIcon(fundo);  
    }
    
}
