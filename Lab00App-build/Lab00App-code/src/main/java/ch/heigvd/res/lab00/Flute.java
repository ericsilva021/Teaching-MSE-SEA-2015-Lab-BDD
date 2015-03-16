/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

import ch.heigvd.res.lab00.IInstrument;

/**
 *
 * @author alex
 */
class Flute implements IInstrument {

    public Flute() {
    }

    @Override
    public String play() {
        return "pouet";
    }

    @Override
    public int getSoundVolume() {
        return 2;
    }

    @Override
    public String getColor() {
        return "golden";
    }
    
}
