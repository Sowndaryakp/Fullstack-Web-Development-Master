class Computer{
    public void playMusic(){
        System.out.println("Playing Music");
    }
    public String getMePen(int cost){
        if(cost>=10)
            return "Pen";
        else
            return "Nothig";
    }
}
public class methodsConcepts {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMePen(5);
        System.out.println(str);
    }
    
}
