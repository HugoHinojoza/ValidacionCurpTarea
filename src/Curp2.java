
    import java.util.*;
    public class Curp2 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String[] CURP;
            CURP = new String[0];
            System.out.println("Escriba su CURP");
            CURP[0] = s.nextLine();
            validacionCurp.main(new String[]{CURP[0]});
        }
    }

