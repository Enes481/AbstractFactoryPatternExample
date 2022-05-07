
public class Main {

    public static void main(String [] args){
        IFactory iFactory = new MonsterComputerFactory();
        Islemci islemci = iFactory.CreateIslemci();
        Monitor monitor = iFactory.CreateMonitor();

        Computer computer = new Computer();
        computer.islemci=islemci;
        computer.monitor =monitor;
    }
}
