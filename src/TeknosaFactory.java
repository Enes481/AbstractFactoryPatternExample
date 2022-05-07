public class TeknosaFactory implements IFactory{
    @Override
    public Islemci CreateIslemci() {
        return new IntelISlemci();
    }

    @Override
    public Monitor CreateMonitor() {
        return new SamsungMonitor();
    }
}
