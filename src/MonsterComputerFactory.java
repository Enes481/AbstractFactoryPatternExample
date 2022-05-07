public class MonsterComputerFactory implements IFactory{
    @Override
    public Islemci CreateIslemci() {
        return new AMDIslemci();
    }

    @Override
    public Monitor CreateMonitor() {
        return new SamsungMonitor();
    }
}
