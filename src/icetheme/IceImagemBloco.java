/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icetheme;

import blok.interfaces.IImagemBloco;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author aluno
 */
public class IceImagemBloco implements IImagemBloco{

    @Override
    public ImageIcon getImagemBloco() {
        String bloco = "images/player/icebrick.jpg";
        
        return new ImageIcon(bloco);       
    }    
}
