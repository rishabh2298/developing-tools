// JAVA Boiler Plate

import java.util.*;
import java.io.*;

class Main{
    	
    static class FastReader{
        
    	BufferedReader br;
    	StringTokenizer st;
    		
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
    	}
        
    	String next(){
            while (st == null || !st.hasMoreElements()){
                try { 
                    st = new StringTokenizer(br.readLine()); 
                }
                catch (IOException e) { 
                    e.printStackTrace(); 
                }
            }
            
            return st.nextToken();
    	}
        
    	int nextInt() { 
            return Integer.parseInt(next()); 
        }
        
    	long nextLong() { 
            return Long.parseLong(next()); 
        }
        
    	double nextDouble(){ 
            return Double.parseDouble(next()); 
        }
        
    	String nextLine(){
      	    String str = "";
      	    try { s
                tr = br.readLine(); 
            }
      	    catch (IOException e) {
                e.printStackTrace(); 
            }
      	    return str;
    	}
  	}

    
    public static void main(String[] args){
        // code here
        
    }
    
}
