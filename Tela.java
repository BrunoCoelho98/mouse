public class Tela {
    private static int sizex;
    private static int sizey;

    public Tela(int sizex, int sizey) {
        Tela.sizex = sizex;
        Tela.sizey = sizey;
    }

    public static int getSizex() {
        return sizex;
    }

    public static int getSizey() {
        return sizey;
    }
    
}
