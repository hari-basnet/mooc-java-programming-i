/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class Point {
    private int point;

    public Point(int point) {
        if(point >= 0 && point <= 100){
            this.point = point;
        }
        
    }

    public int getPoint() {
        return point;
    }
    
    public boolean isPass(){
        return this.point >= 50;
    }
    
}
