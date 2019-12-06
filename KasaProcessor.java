import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class KasaProcessor {
    private Map<String>

    public void countAllItems() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("kasa-items.json").getFile());

        ObjectMapper objectMapper = new ObjectMapper();
        try (Reader reader = new FileReader(file)) {
            KasaItem[] items = objectMapper.readValue(reader, KasaItem[].class);
            int i = 0;
            for(KasaItem m : items){
                i++;
            }
            System.out.println(i);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void nejnizsi() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("kasa-items.json").getFile());

        ObjectMapper objectMapper = new ObjectMapper();
        try (Reader reader = new FileReader(file)) {
            KasaItem[] items = objectMapper.readValue(reader, KasaItem[].class);
            int[] serazeny = new int[items.length];
            for (KasaItem m :items) {
                for (int i = 0; i < items.length; i++){
                    serazeny[i] = items[i].getCurrentPrice();
                }
            Arrays.sort(serazeny);
                for (int j = 0; j < items.length; j++) {
                    System.out.println(serazeny[j]);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void strom(){
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("kasa-items.json").getFile());

        ObjectMapper objectMapper = new ObjectMapper();
        try (Reader reader = new FileReader(file)) {
            KasaItem[] items = objectMapper.readValue(reader, KasaItem[].class);
            for (KasaItem item: KasaItems) {
                String[] categories = items.getCategory().split(">"):
                Map<String, Object> temp = categoryTree;
                for (int i = 0; i < categories.length; i++) {
                    String category = categories[i];
                    if(temp.contains(category)){
                        temp = (Mpa<String, Object>) temp.get(category);
                    }else{
                        temp.put(category, new HashMap<String, Object>());
                    }
                }
            }




    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
