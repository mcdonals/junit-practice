/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iloveyouboss;

import java.util.*;

/**
 *
 * Clone of code from "Pragmatic Unit Testing" by Hunt, Thomas, Langr
 */
public class ScoreCollection {

    private final List<Scoreable> scores = new ArrayList<>();
    
    public void add(Scoreable scoreable) {
        scores.add(scoreable);
    }
    
    public int arithmeticMean() {
        int total = scores.stream().mapToInt(Scoreable::getScore).sum();
        return total / scores.size();
    }   
}
