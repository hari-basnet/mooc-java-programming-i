
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class Statistics {
    private ArrayList<Point> points;

    public Statistics() {
        this.points = new ArrayList<>();
    }

    public ArrayList<Point> getPoints() {
        return points;
    }
    
    public void addPoints(int points){
        if(points >= 0 && points <= 100){
            this.points.add(new Point(points));
        }
    }
    
    public double calculateAverage(ArrayList<Point> points){
        int sum = 0;
        if(!points.isEmpty()){
            for(Point point : points){
                sum += point.getPoint();
            }
            
        }
        return 1.0 * sum / points.size();
    }
    
    public double passingAverage(){
        
        int sum = 0;
        ArrayList<Integer> passedPoints = new ArrayList<>();
        for(Point p : points){
            if(p.isPass()){
                passedPoints.add(p.getPoint());
                sum += p.getPoint();
            }
        }
        
        if(passedPoints.isEmpty()){
            return 0.0;
        }
        
        return 1.0 * sum / passedPoints.size();
        
    }
    
    public double passPercentage(){
        
        if(points.isEmpty()){
            return 0.0;
        }
        
        ArrayList<Integer> passedPoints = new ArrayList<>();
        for(Point p : points){
            if(p.isPass()){
                passedPoints.add(p.getPoint());
            }
        }
        
        if(passedPoints.isEmpty()){
            return 0.0;
        }
        
        System.out.println(points.size());
        System.out.println(passedPoints.size());
        
        return 1.0 * 100 * passedPoints.size() / points.size();
    }
    
}
