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
public class House {
    private String material;
    private String area;
    private String color;

    public House(String material, String area, String color) {
        this.material = material;
        this.area = area;
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" + "material=" + material + ", area=" + area + ", color=" + color + '}';
    }
    
    
    
}
