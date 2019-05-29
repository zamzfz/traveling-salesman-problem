/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author nuzul
 */
public class NewClass {
    private Vector<Point> city = new Vector<Point>();
    
    public void add(int x, int y){
        Point p = new Point(x,y);
        city.add(p);
    }
    
    public int size(){
        return this.city.size();
    }
    
    public double ditsBetween(int i, int j){
        return Point.distance(city.get(i).x,city.get(i).y,city.get(j).x,city.get(j).y);
    }
    
    public double score(Vector<Integer> tour){
        double result = this.ditsBetween(tour.get(0), tour.get(this.size()-1));
        for (int i = 1; i < size()-1; ++i) {
            result+=ditsBetween(tour.get(i-1),tour.get(i));
        }
        return result;
    }
    
    public Vector<Integer> get_tour(){
        Vector<Integer> tour = new Vector<Integer>();
        tour.setSize(this.size());
        for (int i = 0; i < this.size(); i++) {
            tour.set(i, i);
        }
        return tour;
    }
    
  
}
