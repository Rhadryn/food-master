package io;

import com.thoughtworks.xstream.XStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import model.Dish;

/**
 * Reads and writes Dish objects from an XML file into an ArrayList
 * @author Joshua Bryant
 */
public class DishIO {
    XStream xstream;
    
    /**
     * Reads Dish objects from the XML file at filename
     * @param filename the location of the XML file
     * @return ArrayList of Dish objects read
     * @throws FileNotFoundException 
     */
    public ArrayList<Dish> readDishes(String filename) 
            throws FileNotFoundException{
        ArrayList<Dish> dishes = new ArrayList<>();

        //Try opening the file and reading into the array
        try{
            FileInputStream input = new FileInputStream(filename);
            dishes = (ArrayList<Dish>)xstream.fromXML(input);
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            throw e;
        }
        return dishes;
    }
    
    /**
     * Writes Dish objects to the XML file at filename
     * @param dishes the ArrayList of Dish objects to write
     * @param filename the location of the XML file
     * @throws FileNotFoundException 
     */
    public void writeDishes(ArrayList<Dish> dishes, String filename) 
            throws FileNotFoundException{

        //Try opening the file and writing the array
        try{
            FileOutputStream output = new FileOutputStream(filename);
            xstream.toXML(dishes, output);
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
