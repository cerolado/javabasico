package DIO.anderson.aulaAnato;
public class Aula {
public static void main (String [] args) {
        String primeiroNome = "Anderson";
        String segundoNome = "pereira";
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
    
public static String nomeCompleto (String primerioNome, String segundoNome){
        return "Ola me chamo" + " " + primerioNome + " " + segundoNome;

    }
}
