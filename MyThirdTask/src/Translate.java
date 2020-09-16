import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Translate {
    public static void  main(String[] args) throws IOException {
        {

            Map<String, String> map = new HashMap<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            map.put("дождь", "rain");
            map.put("дождливо", "rainy");
            map.put("снег", "snow");
            map.put("снежно", "snowy");
            map.put("солнце", "sun");
            map.put("солнечно", "sunny");
            map.put("ветер", "wind");
            map.put("ветрено", "windy");
            map.put("облачно", "cloudy");
            map.put("холодно", "cold");

            System.out.println("Введите для ваше слово для перевода: ");

            String myWord = reader.readLine();
            for (String string : myWord.split(", ")) {
                if (map.containsKey(string)){
                    System.out.print("Перевод: " + map.get(string)+ "\n" + "");
                }else {
                    System.out.println("Нет такого слова");
                }
            }
        }
    }
}
