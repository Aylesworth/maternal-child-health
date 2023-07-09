package io.github.aylesw.mch.frontend;

import io.github.aylesw.mch.frontend.common.UserIdentity;
import io.github.aylesw.mch.frontend.controller.ScreenManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            UserIdentity.updateUserIdentity();
        } catch (Exception e) {
            return;
        }

        ScreenManager.getMainStage().show();
        ScreenManager.setHeaderBar();
        ScreenManager.setNavBar();
    }
}
