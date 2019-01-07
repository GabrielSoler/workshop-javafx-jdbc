package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuSellerAction() {
		System.out.println("onMenuSellerAction");
	}
	
	@FXML
	public void onMenuDepatmentAction() {
		System.out.println("onMenuDepatmentAction");
	}
	
	@FXML
	public void onMenuAboutAction() {
		System.out.println("onMenuAboutAction");
	}
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	
	
}
