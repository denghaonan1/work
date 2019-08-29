public class TheftproofDoor extends Door implements Lock,DoorBell{
public void lockUp(){
    System.out.println("插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙");
}
public void openLock(){
    System.out.println("差劲钥匙右三圈锁开了");
}
public void opne(){
    System.out.println("用力推门开了");
}
public void close(){
    System.out.println("轻轻拉门关了");
}
public  void takePictures(){
    System.out.println("...");
}
}
