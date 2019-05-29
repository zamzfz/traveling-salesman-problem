/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author nuzul
 */
public class Coba {
    
    public static int[] swap(int data[], int left, int right){
        
        int temp = data[left]; 
        data[left] = data[right]; 
        data[right] = temp; 
  
        return data; 
    } 
    
    public static int[] reverse(int data[], int left, int right){
        // Reverse the sub-array 
        while (left < right) { 
            int temp = data[left]; 
            data[left++] = data[right]; 
            data[right--] = temp; 
        }
        // Return the updated array 
        return data;
    } 
    
    public static boolean nextPermutation(Vector<Integer> array){
        int i = array.size()-1;
        while (i > 0 && array.get(i-1) >= array.get(i))
            i--;
        if (i <= 0)
            return false;

        int j = array.size()-1;
        while (array.get(j) <= array.get(i-1))
            j--;

        Collections.swap(array, i-1, j);

        j = array.size()-1;
        
        while (i < j) {
        Collections.swap(array, i, j);
            i++;
            j--;
        }
    
    return true;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass city = new NewClass();
        city.add(1, 3);
        city.add(2, 6);
        city.add(7, 9);
        city.add(5, 4);
        
        Vector<Integer> tour = new Vector<Integer>(city.get_tour());
        double bestScore = city.score(tour);
        Vector<Integer> best_tour = new Vector<Integer>(tour);
        
        do { 
            double tmp = city.score(tour);
            if(tmp < bestScore){
                bestScore = tmp;
                best_tour = tour;
            }
            System.out.println(tour +" = "+tmp);
        } while (nextPermutation(tour));
            
            System.out.println("Paling Maksimal : ");
            
            System.out.println(best_tour +" = "+bestScore);
    }
    
}
