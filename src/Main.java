import models.App;
import views.AppView;
import controllers.AppController;

public class Main {

    public static void main(String[] args) {

        App model = new App();
        AppView view = new AppView(model);
        AppController controller = new AppController(model, view);
        controller.runApp();

    }
}
