public class LocalPackageMachine extends PackageMachine {
    private String destination;
    @Override
    public Package createPackage() {

        return new Package("Описание на пакета за място на доставяне: ", destination);
    }

    public LocalPackageMachine(String destination) {
        this.destination = destination;

    }
}