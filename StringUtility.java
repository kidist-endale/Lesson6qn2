package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class StringUtility extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("String utility");
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		
		Button btn=new Button("count letters");
		btn.setPrefWidth(120);
		btn.setPrefHeight(50);
		//HBox hb=new HBox(10);
		//hb.getChildren().add(btn);
		grid.add(btn, 0, 0);
		
		Button btn1=new Button("reverse letters");
		btn1.setPrefWidth(120);
		btn1.setPrefHeight(50);
		//HBox hb1=new HBox(10);
		//hb1.getChildren().add(btn);
		grid.add(btn1, 0, 1);
	
		
		
		Button btn2=new Button("remove duplicates");
		btn2.setPrefWidth(120);
		btn2.setPrefHeight(50);
		//HBox hb2=new HBox(10);
		//hb2.getChildren().add(btn);
		grid.add(btn2, 0, 2);
		
		Label l1=new Label("input");
		grid.add(l1, 1, 0);
		
		Label l2=new Label("output");
		grid.add(l2, 1, 2);
		
		
		TextField tf=new TextField();
		grid.add(tf, 1, 1);
		
		TextField tf1=new TextField();
		grid.add(tf1, 1, 2);
		
		
final EventHandler<ActionEvent> h = new EventHandler<ActionEvent>(){
		
		@Override
			public void handle (ActionEvent ae)
			{
				String s=tf.getText();
				String reverse="";
				if(ae.getSource()==btn)
					//System.out.println("hi");
				{
				String s1=Integer.toString(s.length());
				tf1.setText(s1);
			    }
				else if(ae.getSource()==btn1)
				{
					
					
					for(int i=s.length()-1;i>=0;i--)
					{
						reverse+=s.charAt(i);
					}
					tf1.setText(reverse);
				}
				else if(ae.getSource()==btn2)
				{
					
					char ch;
					String  ans=" ";
					
					for(int i=0; i<s.length(); i++)
			        {
			            ch = s.charAt(i);
			            if(ch!=' ')
			                ans = ans + ch;
			            s = s.replace(ch,' '); //Replacing all occurrence of the current character by a space
			        }
			 
					
					tf1.setText(ans);
				}
		   }
		};
		btn.setOnAction(h);
		btn1.setOnAction(h);
		btn2.setOnAction(h);		
				
				
		
		Scene scene=new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	@Override
	public void stop() {
		//clean up resources
	}
	
	
}
