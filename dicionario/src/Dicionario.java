import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dicionario {
    public static void main(String[] args){
        Map<Integer, Teste> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<3; i++){
            Teste add = new Teste();
            add.setStr(scanner.nextLine());
            map.put(i, add);
        }

        System.out.println("Printar");
        //System.out.println(map.keySet());

        for(int i=0; i<map.size(); i++){
            System.out.println(map.get(i).getStr());
        }
        map.containsValue()
    }



}
