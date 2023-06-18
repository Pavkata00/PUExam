import java.util.ArrayList;
import java.util.List;

public class Office {
    private static Office instance;
    private List<PackageHandler> handlers;

    private Office() {
        // Инициализация на офиса
        handlers = new ArrayList<>();
        handlers.add(new PlovdivPackageHandler());
        handlers.add(new BulgariaPackageHandler());
        handlers.add(new InternationalPackageHandler());
    }

    public static synchronized Office getInstance() {
        if (instance == null) {
            instance = new Office();
        }
        return instance;
    }

    public Package acceptRequest(String destination) {
        Package pack = createPackage(destination);
        if (pack != null) {
            // Разпределяне на заявката към съответните гишета за обработка
            for (PackageHandler handler : handlers) {
                if (handler.canHandle(pack)) {
                    handler.handlePackage(pack);
                    break;
                }
            }
        }
        return pack;

    }

    private Package createPackage(String destination) {
        PackageMachine packageMachine;
        if (destination.equals("Пловдив")) {
            packageMachine = new LocalPackageMachine("Пловдив");
        } else if (destination.equals("България")) {
            packageMachine = new LocalPackageMachine("България");
        } else {
            packageMachine = new InternationalPackageMachine("Чужбина");
        }

        return packageMachine.createPackage();
    }
}