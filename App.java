import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        KasaProcessor kasaProcessor = new KasaProcessor();
        Scanner SCANNER = new Scanner(System.in);
        int hodnota = SCANNER.nextInt();
        if (hodnota == 1) {
            kasaProcessor.countAllItems();
        } else if (hodnota == 2) {
            kasaProcessor.nejnizsi();
        }else if (hodnota == 3) {
            kasaProcessor.strom();
        }
    }
}

