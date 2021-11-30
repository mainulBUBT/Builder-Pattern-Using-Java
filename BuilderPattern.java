/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author MIHAN
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        House igloo = new HouseBuilder().setArea("kjahfalf").setColor("red").setMaterial("bamboo").getHouse();
        System.out.println(igloo);
    }
    
}
