/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomCompenent;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author HieuHoang
 */
public class MyPanel extends JPanel{

    /**
     * @return the borderSize
     */
    public int getBorderSize() {
        return borderSize;
    }

    /**
     * @param borderSize the borderSize to set
     */
    public void setBorderSize(int borderSize) {
        this.borderSize = borderSize;
    }

    /**
     * @return the firstColor
     */
    public Color getFirstColor() {
        return firstColor;
    }

    /**
     * @param firstColor the firstColor to set
     */
    public void setFirstColor(Color firstColor) {
        this.firstColor = firstColor;
    }

    /**
     * @return the endColor
     */
    public Color getEndColor() {
        return endColor;
    }

    /**
     * @param endColor the endColor to set
     */
    public void setEndColor(Color endColor) {
        this.endColor = endColor;
    }

    /**
     * @return the fX
     */
    public int getfX() {
        return fX;
    }

    /**
     * @param fX the fX to set
     */
    public void setfX(int fX) {
        this.fX = fX;
    }

    /**
     * @return the fY
     */
    public int getfY() {
        return fY;
    }

    /**
     * @param fY the fY to set
     */
    public void setfY(int fY) {
        this.fY = fY;
    }

    /**
     * @return the eX
     */
    public int geteX() {
        return eX;
    }

    /**
     * @param eX the eX to set
     */
    public void seteX(int eX) {
        this.eX = eX;
    }

    /**
     * @return the eY
     */
    public int geteY() {
        return eY;
    }

    /**
     * @param eY the eY to set
     */
    public void seteY(int eY) {
        this.eY = eY;
    }
    private Color firstColor = Color.white;
    private Color endColor = Color.black;
    private int fX=0;
    private int fY=0;
    private int eX=0;
    private int eY=0;
    private  int borderSize=0;
    public MyPanel() {
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(fX, fY, firstColor, eX, eY, endColor);
        g2d.setPaint(gp);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), borderSize, borderSize);
        super.paintComponent(g); 
        
    }
    
}
