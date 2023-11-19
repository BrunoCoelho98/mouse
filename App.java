import java.util.*;

public class App {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Scanner sc = new Scanner(System.in);
        System.out.println("Operacoes:\n(0) - Sair\n(1) - Mover\n(2) - Clique direito\n(3) - Clique esquerdo\n(4) - Clique do meio\n(5) - Rolar\n(6) - Mudar Sensibilidade\n(7) - Mudar Senbilidade do scroll\n(8) - Ver sensibilidade do mouse\n(9) - Ver sensibilidade do scroll do mouse");

        while (true) {
            System.out.printf("Posicao: x = %d, y = %d\n", m1.getpos()[0], m1.getpos()[1]);
            int operacao = sc.nextInt();
            
            switch (operacao) {
                case 0:
                    sc.close();
                    System.exit(0);
                case 1:
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    m1.move(x, y);
                    break;
                case 2:
                    System.out.printf("Clique direito: %b\n", m1.rightclick());
                    break;
                case 3:
                    System.out.printf("Clique esquerdo: %b\n", m1.leftclick());
                    break;
                case 4:
                    System.out.printf("Clique do meio: %b\n", m1.middleclick());
                    break;
                case 5:
                    System.out.printf("Rolagem: %d\n", m1.scroll(sc.nextInt()));
                    break;
                case 6:
                    System.out.println("Defina a sensibilidade do mouse\n");
                    m1.setSense(sc.nextInt());
                    break;
                case 7:
                    System.out.println("Defina a sensibilidade da rolagem do mouse\n");
                    m1.setScrollsense(sc.nextInt());
                    break;
                case 8:
                    System.out.printf("Sensibilidade do mouse: %d\n", m1.getSense());
                    break;
                case 9:
                    System.out.printf("Sensibilidade da rolagem do mouse: %d\n", m1.getScrollsense());
                    break;
                default:
                    break;
            }
        }
    }
}
