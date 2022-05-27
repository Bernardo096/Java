/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_07;

import javax.swing.JOptionPane;

/**
 *
 * @author 5152742
 */
public class Carro extends MeioTransporte {

    public int Quilometragem;

    public void mover() {
        JOptionPane.showMessageDialog(null, Descricao + " entrou em movimento");
    }
}
