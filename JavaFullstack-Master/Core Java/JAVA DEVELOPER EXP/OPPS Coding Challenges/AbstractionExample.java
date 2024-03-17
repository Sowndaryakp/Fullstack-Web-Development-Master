
abstract class RemoteControl {
    public abstract void  turnOn();
    public abstract void turnOff();
    public abstract increaseVolume();
    public abstract decreaseVolume();
}
class TVRemoteControl extends RemoteControl{
    @Override
    public void turnOn(){
        System.out.println("Turned ON");
    }

    @Override 
    public void turnOff(){
        System.out.println("Turned OFF");
    }

    @Override
    public void increaseVolume(){
        System.out.println("Incresaed Volume");
    }

    @Override
    public void decreaseVolume(){
        System.out.println("Decrease Volume");
    }
}
public Class AbstractionExample{
    public static void main(String[] args){
        TVRemoteControl rc = new TVRemoteControl();
        rc.turnOn();
        rc.turnOff();
        rc.increaseVolume();
        rc.decreaseVolume();
    }
}
