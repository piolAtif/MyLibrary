import person.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Record {
    String fileName;

    Record(String fileName) throws IOException {
        this.fileName = fileName;
    }

    public Person[] read() throws IOException {
        Person []people = new Person[500];
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
           String sCurrentLine;
            int counter = 0;
            while((sCurrentLine = br.readLine()) != null){
                Guests p = new Guests(sCurrentLine.toString());
                people[counter] = p.setGuestDetail();
                counter++;
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return people;
    }
}
