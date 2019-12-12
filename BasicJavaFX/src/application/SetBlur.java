package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;

class SetBlur {

	@FXML
	private ImageView forestview;

	@FXML
	public void initialize() {
		forestview.setEffect(new GaussianBlur(10));
	}
	
}
