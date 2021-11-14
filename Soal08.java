/*
package uts_pbo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Human{
    public Integer Weight;
    private Integer Height;

    public Integer getWeight() {
        return Weight;
    }
    public void setWeight(Integer weight) {
        Weight = weight;
    }
    public Integer getHeight() {
        return Height;
    }
    public void setHeight(Integer height) {
        Height = height;
    }    
}

class Person extends Human{
    private String Name;
    private String BirthDate;
    public String Gender;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getBirthDate() {
        return BirthDate;
    }
    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }    
}

public class Soal08{

    public List <Person> ListPerson = new ArrayList<Person>();
    
    public static void main(String[] args) {
        Soal08 q = new Soal08();
        Scanner MyObj = new Scanner(System.in);
        int Data = 3;
        // Untuk Looping / pengulangan
        for (int i=1; i<=Data; i++){
            System.out.println("Data Ke "+i);
            q.Input_Form();
        }
        q.Output_Form();
        
    }
    
    public void Input_Form(){
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=============================");
        System.out.println("Form Personal Information");
        System.out.println("=============================");

        System.out.print("Entering your name:");
        String name = scanner.nextLine();
        person.setName(name);

        System.out.print("Entering your birth date:");
        String birthdate = scanner.nextLine();
        person.setBirthDate(birthdate);
        
        System.out.print("Entering your Gender:");
        String gender = scanner.nextLine();
        person.setGender(gender);
        
        System.out.print("Entering your Weight:");
        String weight = scanner.nextLine();
        Integer weight_convert = Integer.parseInt(weight);
        person.setWeight(weight_convert);

        System.out.print("Entering your Height:");
        String height = scanner.nextLine();
        Integer height_convert = Integer.parseInt(height);
        person.setHeight(height_convert);
        
        ListPerson.add(person);
     
    }
    
    public void Output_Form(){
        Scanner scanner = new Scanner(System.in);
        int i =1;
        for(Person person : ListPerson){
        System.out.println("\n========== Data Ke "+(i++)+" =========");
        System.out.println("Your Personal Information");
        System.out.println("==============================");

        System.out.println("Name: "+ person.getName());
        System.out.println("Birth Date: "+ person.getBirthDate());
        System.out.println("Gender: "+ person.getGender());
        System.out.println("Weight: "+ person.getWeight());
        System.out.println("Height: "+ person.getHeight());
            
        }
        
        scanner.close();   
    
    }
}
*/