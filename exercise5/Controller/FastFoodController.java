package Controller;

import javax.swing.text.html.ImageView;

import Model.Greenwich;
import Model.Jollibee;
import Model.MangInasal;
import Model.Mcdo;
import Model.Wendys;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import Model.*;

public class FastFoodController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Greenwich greenwich = new Greenwich();
    Mcdo mcdo = new Mcdo();
    Jollibee jollibee = new Jollibee();
    MangInasal mangInasal = new MangInasal();
    Wendys wendys = new Wendys();

    public void initialize() {

        greenwich.setFlavor("Hawaiian");
        greenwich.setTaste("Very Delicous");

        mcdo.setFlavor("Chicken ALA KING");
        mcdo.setTaste("Sulit sa budget");

        jollibee.setFlavor("Aloha Champ");
        jollibee.setTaste("Masarap");

        mangInasal.setFlavor("Spicy Pecho");
        mangInasal.setTaste("Very masarap");

        wendys.setFlavor("Bacon Mushroom");
        wendys.setTaste("Very Goods sa lasa");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("The Greenwich " + greenwich.getFlavor() + " is " + greenwich.getTaste());
        }
        if (sourceButton == btn2) {
            alert.setContentText("The Mcdo " + mcdo.getFlavor() + " is " + mcdo.getTaste());
        }
        if (sourceButton == btn3) {
            alert.setContentText("The Jollibee " + jollibee.getFlavor() + " is " + jollibee.getTaste());
        }
        if (sourceButton == btn4) {
            alert.setContentText("The MangInasal " + mangInasal.getFlavor() + " is " + mangInasal.getTaste());       
        }
        if (sourceButton == btn5) {
            alert.setContentText("The Wendys " + wendys.getFlavor() + " is " + wendys.getTaste());

        }

        alert.showAndWait();

    }
}