public class BulgariaPackageHandler implements PackageHandler {
    @Override
    public boolean canHandle(Package pack) {

        return pack.getDestination().equals("България");
    }

    @Override
    public void handlePackage(Package pack) {

    }
}
