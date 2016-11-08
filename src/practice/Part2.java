/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ryan Schissel
 */
public class Part2 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Gone in 60 Seconds", "Dominic Sena", true);
          Movie m2 = new Movie("Gone in 60 Seconds", "H.B. Halicki", false);
          Movie m3 = new Movie("Gone in 60 Seconds", "Dominic Sena", true);
          Movie m4 = new Movie("Ace Ventura: Pet Detective", "Tom Shadyac", false);
          
          Map<String, Movie> movieMap = new HashMap<>();          
          movieMap.put("Gone in 60 Seconds", m1);
          movieMap.put("Gone in  60 Seconds", m2);
          movieMap.put("Gone in 60 Seconds", m3);
          movieMap.put("Ace Ventura: Pet detective", m4);
          
          Collection values = movieMap.values();
          for(Object value : values){
              System.out.println(value);
          }
    }
}
