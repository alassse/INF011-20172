/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icetheme;

import blok.interfaces.IImagemChao;
import javax.swing.ImageIcon;
/**
 *
 * @author aluno
 */
public class IceImagemChao implements IImagemChao{

    @Override
    public ImageIcon getImagemChao() {
        String chao = "images/player/iceground.jpg";
        
        return new ImageIcon(chao);      
    }
    
}
