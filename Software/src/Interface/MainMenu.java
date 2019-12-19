package Interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class MainMenu {
  @FXML Button manageDataButton;
  @FXML Button generateSchedule;

  public void pushButtonManageData(javafx.event.ActionEvent event)
      throws IOException {
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("ManageData.fxml"));
    Parent root = loader.load();
    Scene scene = new Scene(root, Launcher.getSizeX(), Launcher.getSizeY());
    Stage menu = (Stage) ((Node) event.getSource()).getScene().getWindow();
    menu.setScene(scene);
    menu.show();
  }

  public void pushButtonGenerateSchedule(ActionEvent event) {
    File webpage = new File("Webpage/examSchedule.html");
    try {
      Desktop.getDesktop().open(webpage);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }

  /* I tried and I failed
  public void pushButtonGenerateScheduleFileTransfer() throws IOException {
    InputStream is = null;
    OutputStream os = null;
    try {
      is = new FileInputStream("Webpage/xml/examList.xml");
      os = new FileOutputStream("files.000webhost.com");
      byte[] buffer = new byte[1024];
      int length;
      while ((length = is.read(buffer)) > 0) {
        os.write(buffer, 0, length);
      }
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    finally {
      is.close();
      os.close();
    }
  }

   */
}


