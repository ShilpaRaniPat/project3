import java.util.Scanner;
public class ArrOfPlacesAndVowel {


        public static void main(String[] args) {
            String[] places = new String[5];
            for(int j = 0; j< 5; j++){
                Scanner sc = new Scanner(System.in);
                places[j] = sc.nextLine();
            }
            for (int i = 0; i < 5; i++) {
                String str = places[i];
                str = str.replaceAll("[aeiou]", "");
                places[i] = str;
            }
            for (int i = 0; i < places.length; i++) {
                System.out.println("Place Name without Vowels: " + i + places[i]);
            }
        }
    }





