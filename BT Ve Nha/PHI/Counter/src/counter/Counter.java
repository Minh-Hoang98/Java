package counter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Counter {

    private Map<Character,Integer> charCounter =
            new HashMap<Character,Integer>();
    
    private Map<String,Integer> wordCounter =
            new HashMap<String,Integer>();
    
    public void display(){
        for ( String key : wordCounter.keySet()){
            System.out.print("{ "+key+" = "+wordCounter.get(key)+" }");
        }
        System.out.println();
        for ( Character key : charCounter.keySet()){
            System.out.print("{ "+key+" = "+charCounter.get(key)+" }");
        }
        System.out.println();
    }
    
    public void analyze(String content){
        for(char ch : content.toCharArray()){
            if(Character.isSpaceChar(ch)) continue;
            if(!charCounter.containsKey(ch)){
                charCounter.put(ch,1);
            } else{
                charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
            }
        }
        StringTokenizer tokenizer = new StringTokenizer(content);
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            if(!wordCounter.containsKey(token)){
                wordCounter.put(token,1);
            }else{
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your content: ");
        String str = scanner.nextLine();
        Counter counter = new Counter();
        counter.analyze(str);
        counter.display();
    }
    
}
