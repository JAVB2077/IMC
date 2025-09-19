/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imc;

/**
 *
 * @author killer
 */
public class Patient {
    private String name;
    private float waight;
    private float height;
    private char sex;

    public Patient() {
    }

    public Patient(String name, float waight, float height, char sex) {
        this.name = name;
        this.waight = waight;
        this.height = height;
        this.sex = sex;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the waight
     */
    public float getWaight() {
        return waight;
    }

    /**
     * @param waight the waight to set
     */
    public void setWaight(float waight) {
        this.waight = waight;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", waight=" + waight + ", height=" + height + ", sex=" + sex + '}';
    }
    
}
