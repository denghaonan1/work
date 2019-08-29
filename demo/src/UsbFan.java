public class UsbFan implements UsbInterface{
    @Override
    public void service(){
        System.out.println("链接USB接口，获得电流，风扇开始转动");
    }
}
