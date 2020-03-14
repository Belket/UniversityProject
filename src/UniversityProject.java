import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

public class UniversityProject {
    public static void main(String[] args) {

        ArrayList<String> warriors = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("init.txt")))
        {
            //чтение построчно
            String read_string;
            while((read_string=br.readLine()) != null){
                warriors.add(read_string);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        for(int i=0; i < warriors.size(); i += 6){
            
        }
        Warrior warrior = new Warrior(1000, 100, 85, 185, 12, 1.2);
        System.out.println(warrior.physical_attack());
    }
}
