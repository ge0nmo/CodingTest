import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int count = 0;                        
        for(int i = 0; i < 8; i++)
        {
            String str = br.readLine();    
            for(int j = 0; j < str.length(); j++)
            {
                if((i + j) % 2 == 0 && str.charAt(j) == 'F')
                {
                    count++;
                }
            }                       
        }
                
        System.out.println(count);
    }
}