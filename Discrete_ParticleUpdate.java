/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author edu04
 */

import java.util.*;
import java.util.Random;

public class Discrete_ParticleUpdate {

    private Discrete_PSO_Swarm swarm;
    private Object getBestPosition;
    
    
/**
 * Particle update strategy
 * 
 * Every Swarm.evolve() itereation the following methods are called
 * 		- begin(Swarm) : Once at the begining of each iteration
 * 		- update(Swarm,Particle) : Once for each particle
 * 		- end(Swarm) : Once at the end of each iteration
 * 
 

    Discrete_PSO_Swarm swarm;

    //A random weight r1.
    private final double WEIGHT_R1 = 0.2d;
    //The cognitive acceleration coefficient c1.
    private final double COGNIT_COEFFICIENT = 0.5d;

    //A random weight r2.
    private final double WEIGHT_R2 = 0.2d;
    //The social coefficient
    private final double SOCIAL_COEFFICIENT = 0.5d;

    
    /**
    public Discrete_ParticleUpdate() {
    }
    Update particle's velocity and position */
    
    
    
 public Discrete_ParticleUpdate() {
 }   
    
    //Update particle's velocity and position */
    public void update(Discrete_PSO_Swarm swarm, Discrete_Particle particle) {
    this.swarm = swarm;

//realizar una modificacion aleatoria 
List<Allocation> position = particle.getBestPosition();
ContainerVm vm = null;
int cont = 0;
for(Allocation asignacion : position){
    Random random = new Random();
    int randomNumber =random.nextInt(swarm.getVms().size());
    vm = swarm.getVms().get(randomNumber);
    asignacion.setVm(vm);
}

boolean vmExiste = false;
for(Allocation asignacion : position){
    if( vm.getId()== asignacion.getVm().getId()) {
        vmExiste = true;
        break;
    }
}
    if(!vmExiste){
    Random random = new Random();
     int randomNumber =random.nextInt(swarm.getVms().size());
     ContainerHost host = swarm.getHosts().get(randomNumber);
     
     boolean hostExiste = false;
for(Allocation asignacion : position){
    if( host.getId()== asignacion.getHost().getId()){
        vmExiste = true;
        break;
    }
    
    cont++;
    if(cont>1)
        break;
}
}
 
        // Obtener la lista de velocidades de la partícula
        List<Allocation> velocity = particle.getVelocity();

        // Crear una instancia de Random para la generación de números aleatorios
        Random random = new Random();

        // Recorrer la lista de velocidades y modificar cada una aleatoriamente
        for (int i = 0; i < velocity.size(); i++) {
            Allocation velocidad = velocity.get(i);
            
             // Aplicar cambios aleatorios a los atributos de Allocation
            // Por ejemplo, cambiar el Container a uno aleatorio, si tiene sentido en tu contexto
            Container randomContainer = obtenerContainerAleatorio(random); // Simula un cambio en Container

            // Crear una nueva instancia de Allocation con los valores modificados
            Allocation nuevaVelocidad = new Allocation(randomContainer, velocidad.getVm(), velocidad.getHost());

            // Reemplazar la antigua velocidad con la nueva en la lista
            velocity.set(i, nuevaVelocidad);
}
            // Mostrar la nueva velocidad de cada elemento en la lista
        System.out.println("Nuevas velocidades de la partícula:");   
        for (Allocation nuevaVelocidad : velocity)
        System.out.println(nuevaVelocidad);  // Esto llama al método toString() de cada Allocation
    
   
        }
    

    
      // Simula la obtención de un nuevo Container de manera aleatoria
    private Container obtenerContainerAleatorio(Random random) {
        int nuevoId = random.nextInt(100);  // Genera un ID aleatorio
        return new Container();  // Crear y devolver un nuevo Container
    }
}

        
  
        
        

        
    


   

   
            
            
        
       
    
 





    
   












    
    


        
        

    



