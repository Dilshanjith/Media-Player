import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.event.ActionEvent;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    MediaPlayer player;

    @FXML
    private MediaView mediaView;

    @FXML
    private Button playBtn;

    @FXML
    void btnclick(ActionEvent event) {

    }

    @FXML
    void OpenSongMenu(ActionEvent event) {
        try {


            System.out.println("open song clicked");
            FileChooser chooser = new FileChooser();
            File file = chooser.showOpenDialog(null);

            Media m = new Media(file.toURI().toURL().toString());

            player = new MediaPlayer(m);
            mediaView.setMediaPlayer(player);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void play(ActionEvent event) {
        MediaPlayer.Status status = player.getStatus();

        if (status == MediaPlayer.Status.PLAYING) {
            player.pause();
            playBtn.setText("play");
        } else {
            player.play();
            playBtn.setText("pause");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            playBtn.setGraphic(new ImageView(new Image(new FileInputStream("src/icon/play.png"))));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}