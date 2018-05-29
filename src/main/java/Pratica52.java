
import utfpr.ct.dainf.if62c.pratica.Equacao2Grau;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica52 {
    public static void main(String[] args) {
        
       
    try {            
            Equacao2Grau<Integer> eq = new Equacao2Grau<>(150, 20, -100);
            System.out.println(eq.getRaiz1());
            System.out.println(eq.getRaiz2());
            
                                 
            Equacao2Grau<Integer> eq1 = new Equacao2Grau<>(1, 2, 1);
            System.out.println(eq1.getRaiz1());
            System.out.println(eq1.getRaiz2());
            
            Equacao2Grau<Integer> eq2 = new Equacao2Grau<>(2, 0, 4);
            System.out.println(eq2.getRaiz1());
            System.out.println(eq2.getRaiz2());
                       
            eq.setA(0);  
            
            
    } catch (RuntimeException e) {
        System.out.println(e.getLocalizedMessage());
    }
            
   
        
    }
}
