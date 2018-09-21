import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Solution {
    
    private Solution() {
        
    }
    
    public static String convertString(final String fileContent) {
        String ret = "";
        Pattern p = Pattern.compile("[^0-9_]");
        Matcher match = p.matcher(fileContent);

        while (match.find()) {
            ret += match.group();
        }
        return ret.toLowerCase();
    }
    
    public static HashMap<String, Integer> generateHashMap(final String input) {
        String[] inputs = input.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i++) {
            int count = 1;
            for (int j = 0; j < inputs.length; j++) {
                if (inputs[i].equals(inputs[j]) && i != j) {
                    count += 1;
                }
            }
            if (map.containsKey(inputs[i])) {
                String a;
            } else {
                map.put(inputs[i], count);
            }
        }
        return map;
    }
    
    public static String fileRead(final String folder, final String name)
        throws Exception {
        BufferedReader br = new BufferedReader(
            new FileReader("D:\\CSPP2 SHIVANI\\6006_CSPP2\\assignments\\m23\\"
                + "Assignment-1\\"
                + folder + "\\" + name));
        String content = "";
        String line;
        try {
            while ((line = br.readLine()) != null) {
                content += line;
            }
        } catch (Exception e) {
                e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return content;
    }
    
    public static void main(final String[] args) throws Exception {
        Similarity sim = new Similarity();
        Scanner s = new Scanner(System.in);
        if (!(s.hasNext())) {
            System.out.println("empty directory");
            return;
        }
        String folder = s.nextLine();
        File file = new File("C:\\Users\\Lenovo\\Desktop\\"
            + "Git Repo\\6042_CSPP2\\" + "cspp2-assignments\\m23\\" + folder);
        String[] str = file.list();
        for (String files : str) {
            String content = fileRead(folder, files);
            String inter = convertString(content);
            HashMap<String, Integer> hashmap = generateHashMap(inter);
            Document d = new Document(files, hashmap);
            sim.addDocument(d);
        }
        sim.documentSimilarity();
    }
}