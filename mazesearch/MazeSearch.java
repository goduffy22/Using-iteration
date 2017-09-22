/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazesearch;

/**
 *
 * @author Laura
 */
public class MazeSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maze labyrinth = new Maze();
        
        System.out.println(labyrinth);
        
        if (labyrinth.traverse (0,0))
            System.out.println("\n" + "The maze was successfully traversed!");
        else 
            System.out.println("There is no possible path.");
        
        System.out.println (labyrinth);
    }
    
}
