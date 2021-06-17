

public class Main {
    
    public static void main(String[] args) {
    	
 
        double a = 5;
        double b = 3.2;
        double c = 6;
        double d = (a + b + c) / 2;
        
       	Trojuhelnik t = new Trojuhelnik(a, b, c);    
       	
        if(a<0||b<0||c<0) {
        	System.out.println("špatnì"+"\n");
        }
       
        if ( a + b > c && a + c > b && b + c > a   ) {
            System.out.println("trojuhelnik existuje");
        }
        else {
            System.out.println("takový trojuhelnik neexistuje");
            System.out.println("\n"+"konec programu");
           
            System.exit(0);
        }
        
        if (a == b && a == c && b == c) {
            System.out.println("\n"+"trojuhelnik je rovnostranný");
        }
        else {
            if (a == b || b == c || c == a) {
                System.out.println("\n"+"trojuhelnik je rovnoramenný");
            }
            else {
                System.out.println("\n"+"trojuhelnik je obecný");
        }
            }
     
        if (c*c + a*a == b*b || a*a + b*b == c*c || b*b  + c*c == a*a ) {
            System.out.println("\n"+"trojuhelnik má pravý úhel");
            }
        
        else {
        	
            if (a*a + b*b > c*c && c*c + a*a > b*b && b*b + c*c > a*a ) {
                System.out.println("\n"+"trojuhelnik má ostrý úhel");
                }
            
            else {
                System.out.println("\n"+"trojuhelnik má tupý úhel");
    }}
        
        t.vypocetObvodu();
        t.vypocetObsahu(d);
        
        System.out.println("\n"+"konec programu");

  //  assert false; 
    }}
