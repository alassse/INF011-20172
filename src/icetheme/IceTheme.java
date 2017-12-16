/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icetheme;

import blok.interfaces.IImagemBloco;
import blok.interfaces.IImagemChao;
import blok.interfaces.IImagemFundo;
import blok.interfaces.IThemeFactory;

/**
 *
 * @author aluno
 */
public class IceTheme implements IThemeFactory {

    @Override
    public IImagemFundo createImageFundo() {
        return new IceImagemFundo();
    }

    @Override
    public IImagemBloco createImagemBloco() {
        return new IceImagemBloco();
    }

    @Override
    public IImagemChao createImagemChao() {
        return new IceImagemChao();
    }
    
}
