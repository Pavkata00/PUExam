public class PlovdivPackageHandler implements PackageHandler {
    @Override
    public boolean canHandle(Package pack) {

        return pack.getDestination().equals("Пловдив");
    }

    @Override
    public void handlePackage(Package pack) {

    }
}