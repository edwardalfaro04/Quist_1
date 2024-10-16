/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edu04
 */
import java.util.*;
public class NewClass {
    public  static void main(String[] args){
        
        Discrete_FitnessFunction funcionAdaptacion = new Discrete_FitnessFunction();
        Discrete_PSO_Swarm swarm = new Discrete_PSO_Swarm(funcionAdaptacion);
        swarm.init();
        
        for(int i =0; i<10; i++){
            swarm.evolve();
        }
        
        //Mostrar mejor solucion 
        for(Allocation asignacion : swarm.getBestPosition())
            System.out.println(asignacion);
        
       //mostrar nueva velocidad
       // Mostrar la nueva velocidad de cada elemento en la lista
    
        
        
    }
    
}