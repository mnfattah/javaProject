package firstpackage;

import java.util.HashMap;
import java.util.Set;

public class OccuranceOfWordPractice {

    public static HashMap<String, Integer> getTheOccurencesOfWords(String data) {
        String updatedData = data.replace(".", "");
        String[] arrayOfIndividualWord = updatedData.split(" ");

        HashMap<String, Integer> mapIfOccurance = new HashMap<>();

        for (int i = 0; i < arrayOfIndividualWord.length; i++) {
            Integer previousCount = mapIfOccurance.get(arrayOfIndividualWord[i]);
            if (previousCount == null) {
                previousCount = 0;
            }

            mapIfOccurance.put(arrayOfIndividualWord[i], previousCount + 1);
        }

        System.out.println(mapIfOccurance);
        return mapIfOccurance;
    }

    public static void main(String[] args) {

        //2. from a given sentence, find out their occurrences

        String data = "Today is Sunday. Sunday is a good day. I play soccer on Sunday.";
        HashMap<String, Integer> mapOfOccurences = getTheOccurencesOfWords(data);

        //3. from a given sentence, find out the dupes in the map

        // creating a keyset of word_map
        Set<String> word_set = mapOfOccurences.keySet();

        // We are iterating in word set
        for (String word : word_set) {

            // if word matched then checking occurrence
            if (mapOfOccurences.get(word) > 1)

                // here we are printing the duplicate words
                System.out.println(word);
        }

        //mapOfOccurences

    }

}
