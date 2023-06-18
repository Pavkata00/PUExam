public class InternationalPackageMachine extends PackageMachine {
    private String destination;
    @Override
    public Package createPackage() {

        return new Package("Описание на пакета за международна доставка: ", destination);
    }

    public InternationalPackageMachine(String destination) {
        this.destination = destination;
    }
}