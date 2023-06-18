public interface PackageHandler {
    boolean canHandle(Package pack);
    void handlePackage(Package pack);
}
