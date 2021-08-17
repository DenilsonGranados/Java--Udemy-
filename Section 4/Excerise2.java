public class Excerise2 {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int KiloBytes){
        if (KiloBytes<0){
            System.out.println("Invalid Value");
        }else {
            int MB= KiloBytes/1024;
            int KB= KiloBytes%1024;
            System.out.println(KiloBytes+" KB = "+ MB+ " MB and "+ KB+ " KB");
        }
    }
}
