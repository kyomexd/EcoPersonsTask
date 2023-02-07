package ecopersons;

import java.util.ArrayList;
import java.util.List;

public class PersonAnalyzer {

    public static List<Person> getEcoPersons(List<Person> persons, int maxValue) {
        List<Person> ecoPersons = new ArrayList<>();
        if (!persons.isEmpty()) {
            Person person;
            for (Person value : persons) {
                person = value;
                if (PersonAnalyzer.isEco(maxValue, person)) {
                    ecoPersons.add(person);
                }
            }
        }
        return ecoPersons;
    }

    public static boolean isEco(int maxValue, Person person) {
        if (person.getWaterCount() < maxValue 
                && person.getGasCount1() + person.getGasCount2() < maxValue 
                && person.getElectroCount1() + person.getElectroCount2() < maxValue) {
            return true;
        }
        return false;
    }
}
