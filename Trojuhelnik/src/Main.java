

public class Main {
    
    public static void main(String[] args) {
    	
 
        double a = 5;
        double b = 3.2;
        double c = 6;
        double d = (a + b + c) / 2;
        
       	Trojuhelnik t = new Trojuhelnik(a, b, c);    
       	
        if(a<0||b<0||c<0) {
        	System.out.println("�patn�"+"\n");
        }
       
        if ( a + b > c && a + c > b && b + c > a   ) {
            System.out.println("trojuhelnik existuje");
        }
        else {
            System.out.println("takov� trojuhelnik neexistuje");
            System.out.println("\n"+"konec programu");
           
            System.exit(0);
        }
        
        if (a == b && a == c && b == c) {
            System.out.println("\n"+"trojuhelnik je rovnostrann�");
        }
        else {
            if (a == b || b == c || c == a) {
                System.out.println("\n"+"trojuhelnik je rovnoramenn�");
            }
            else {
                System.out.println("\n"+"trojuhelnik je obecn�");
        }
            }
     
        if (c*c + a*a == b*b || a*a + b*b == c*c || b*b  + c*c == a*a ) {
            System.out.println("\n"+"trojuhelnik m� prav� �hel");
            }
        
        else {
        	
            if (a*a + b*b > c*c && c*c + a*a > b*b && b*b + c*c > a*a ) {
                System.out.println("\n"+"trojuhelnik m� ostr� �hel");
                }
            
            else {
                System.out.println("\n"+"trojuhelnik m� tup� �hel");
    }}
        
        t.vypocetObvodu();
        t.vypocetObsahu(d);
        
        System.out.println("\n"+"konec programu");

  //  assert false; 
    }}
