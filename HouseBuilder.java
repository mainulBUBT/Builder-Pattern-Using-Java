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
public class HouseBuilder {
    private String material;
    private String area;
    private String color;

    public HouseBuilder setMaterial(String material) {
        this.material = material;
        return this;
    }

    public HouseBuilder setArea(String area) {
        this.area = area;
        return this;
    }

    public HouseBuilder setColor(String color) {
        this.color = color;
        return this;
    }
    
    public House getHouse()
    {
        return new House(material, area, color);
    }
}
