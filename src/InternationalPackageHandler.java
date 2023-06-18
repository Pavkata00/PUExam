public class InternationalPackageHandler implements PackageHandler {
    @Override
    public boolean canHandle(Package pack) {

        return !pack.getDestination().equals("Пловдив") && !pack.getDestination().equals("България");
    }

    @Override
    public void handlePackage(Package pack) {

        System.out.println("Пакет за чужбина: " + pack.getDescription());

    }
}
