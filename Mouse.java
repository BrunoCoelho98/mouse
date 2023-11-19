public class Mouse {
    private int posx;
    private int posy;
    private int sense;
    private int scrollsense;

    Tela tela = new Tela(1920, 1080);
    
    public Mouse(){
        this.posx = 0;
        this.posy = 0;
        this.sense = 1;
        this.scrollsense = 1;
    }


    public int[] getpos(){
            int[] position = {this.posx+960, this.posy+540};
            return position;
        }

    public int getSense() {
        return sense;
    }


    public void setSense(int sense) {
        this.sense = sense;
    }

    public int getScrollsense() {
        return scrollsense;
    }


    public void setScrollsense(int scrollsense) {
        this.scrollsense = scrollsense;
    }


    public void move(int movex, int movey){
        this.posx += movex*this.sense;
        this.posy += movey*this.sense;
        if (this.posx > Tela.getSizex()/2){
            this.posx = Tela.getSizex()/2;
        } else if (this.posx < -Tela.getSizex()/2){
            this.posx = -Tela.getSizex()/2;
        }
        if (this.posy > Tela.getSizey()/2){
            this.posy = Tela.getSizey()/2;
        } else if (this.posy < -Tela.getSizey()/2){
            this.posy = -Tela.getSizey()/2;
        }
    }

    public int scroll(int movement){
        return movement*scrollsense;
    }

    public boolean rightclick(){
        return true;
    }  
    
    public boolean leftclick(){
        return true;
    }   

    public boolean middleclick(){
        return true;
    }  
    

}