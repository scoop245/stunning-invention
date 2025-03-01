package Lesson9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Les9 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, List<String>> songWords = new HashMap<String, List<String>>();
//        String separator = File.separator;
//        String path = separator + "D:" + separator + "song.txt";
        File file = new File("song.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.replaceAll("[,?!-.]", "").toLowerCase();
            String[] splited = line.split("\\s+");
            for (String word : splited) {
                List<String> sameWords = songWords.get(word.trim());
                if (sameWords != null) {
                    sameWords.add(word.trim());
                } else {
                    sameWords = new ArrayList<String>();
                    sameWords.add(word.trim());
                    songWords.put(word.trim(), sameWords);
                }
            }
            System.out.println(String.format("Amount of unique words: %s", songWords.size()));
            int bigestSize = 0;
            String bigestSizeKey = "";
            for (String key : songWords.keySet()) {
                List<String> sameWords = songWords.get(key);
                System.out.println(String.format("%s appeared in text %s times", key, sameWords.size()));
                if (sameWords.size() > bigestSize) {
                    bigestSize = sameWords.size();
                    bigestSizeKey = key;
                }
            }
            System.out.println(String.format("The most frequente word is: %s", bigestSizeKey));
        }
    }
}
