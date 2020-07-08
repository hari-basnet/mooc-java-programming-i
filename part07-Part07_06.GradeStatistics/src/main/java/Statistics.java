
import java.util.ArrayList;
import java.util.HashMap;

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
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    private HashMap<String, Integer> gradeMap;

    public Statistics() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.gradeMap = new HashMap<>();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }
    
    public void addPoints(int point){
        if(point >= 0 && point <= 100){
            this.points.add(point);
        }
    }
    
    public void calculateGrade(int point){
        if(point >= 0 && point <= 100){
            if(point < 50){
                this.grades.add(0);
            }else if(point < 60){
                this.grades.add(1);
            }else if(point < 70){
                this.grades.add(2);
            }else if(point < 80){
                this.grades.add(3);
            }else if(point < 90){
                this.grades.add(4);
            }else if(point >= 90){
                this.grades.add(5);
            }else {
                System.out.println("cannot add");
            }
        }
    }
    
    public double calculateAverage(ArrayList<Integer> points){
        int sum = 0;
        if(!points.isEmpty()){
            for(int point : points){
                sum += point;
            }
            
        }
        return 1.0 * sum / points.size();
    }
    
    public double passingAverage(){
        
        int sum = 0;
        ArrayList<Integer> passedPoints = new ArrayList<>();
        for(int p : points){
            if(isPass(p)){
                passedPoints.add(p);
                sum += p;
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
        for(int p : points){
            if(isPass(p)){
                passedPoints.add(p);
            }
        }
        
        if(passedPoints.isEmpty()){
            return 0.0;
        }
        
        System.out.println(points.size());
        System.out.println(passedPoints.size());
        
        return 1.0 * 100 * passedPoints.size() / points.size();
    }
    
    public void calculateNumberOfGrades(){
        
    }
    
    public void gradeDistrubution(){
        
        // populate grade map 
        for(int i = 0; i < 6; i++){
            gradeMap.put(String.valueOf(i), 0);
        }
        
        for(int grade : grades ){
            switch (grade) {
                case 5:
                    {
                        int count = gradeMap.containsKey("5") ? gradeMap.get("5") : 0;
                        gradeMap.put("5", count + 1);
                        break;
                    }
                case 4:
                    {
                        int count = gradeMap.containsKey("4") ? gradeMap.get("4") : 0;
                        gradeMap.put("4", count + 1);
                        break;
                    }
                case 3:
                    {
                        int count = gradeMap.containsKey("3") ? gradeMap.get("3") : 0;
                        gradeMap.put("3", count + 1);
                        break;
                    }
                case 2:
                    {
                        int count = gradeMap.containsKey("2") ? gradeMap.get("2") : 0;
                        gradeMap.put("2", count + 1);
                        break;
                    }
                case 1:
                    {
                        int count = gradeMap.containsKey("1") ? gradeMap.get("1") : 0;
                        gradeMap.put("1", count + 1);
                        break;
                    }
                case 0:
                    {
                        int count = gradeMap.containsKey("0") ? gradeMap.get("0") : 0;
                        gradeMap.put("0", count + 1);
                        break;
                    }
                default:
                    break;
            }
        }
    }
    
    public void printGradeDistribution(){
        
        for(int i = 0; i < gradeMap.size(); i++){
            int valueOfGrade = gradeMap.get(String.valueOf(i));
            System.out.print(i + ": ");
            System.out.println(printStars(valueOfGrade));
        }
    }
    
    public String printStars(int number){
        String stars = "";
        for(int i = 0; i < number; i++){
            stars += "*";
        }
        return stars;
    }
    
    private boolean isPass(int point){
        if(point >= 50){
            return true;
        }
        return false;
    }
}
