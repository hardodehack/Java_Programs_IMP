public class DeadLockAno {


public static void main(String[] args) {
final String r1="Hardik";
final String r2="Patel";

Thread t1 = new Thread(){
public void run(){
synchronized(r1){
System.out.println("T1 R1");
synchronized(r2){
System.out.println("T1 R2(R1)");
}
}
}
};

Thread t2 = new Thread(){
public void run(){
synchronized(r2){
System.out.println("T2 R2");
synchronized(r1){
System.out.println("T2 R1(R2)");
}
}

}
};
t2.start();
t1.start();
/*try {
t1.join();
} catch (InterruptedException e) {
e.printStackTrace();
}*/

}
}
