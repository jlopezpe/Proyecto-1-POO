package UiMain;
import java.util.*;
import Personas.Cso;
import Personas.Repartidor;
import Procesos.Manufactura;
import java.io.FileNotFoundException;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.geometry.*;
import javafx.scene.text.Font;
import java.io.FileInputStream;

public class MenuDeConsola1 extends Application {
	Stage window;
    Scene registro,inicio,masVendido,hacerPedido,hacerDulce,ganancias, asignarSueldo,programadores,menu,archivo,ayuda,procesos;
    static int flagIngreso=0;
    ArrayList<OpcionDeMenu> opciones=new ArrayList<OpcionDeMenu>();
	public void anadirOpcion(OpcionDeMenu op) {
		opciones.add(op);
	}
	public boolean logIn(String usuario,String contra) {
		if(usuario.equals("usuario") && contra.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
    public static void main(String[] args) {
    	Cso cso= new Cso("Diego Armando Maradona",1000000);
	    Repartidor rep1=new Repartidor("Roberto","Repartidor","abc123");
	    Repartidor rep2=new Repartidor("Alberto","Repartidor","def123");
	    Manufactura.CrearDulce("chocolate");
	    Manufactura.CrearDulce("chocolate");
	    Manufactura.CrearDulce("chocolate");
	    Manufactura.CrearDulce("chocolate");
	    Manufactura.CrearDulce("caramelo");
	    Manufactura.CrearDulce("caramelo");
	    Manufactura.CrearDulce("caramelo");
	    Manufactura.CrearDulce("caramelo");
	    Manufactura.CrearDulce("gomitas");
	    Manufactura.CrearDulce("gomitas");
	    Manufactura.CrearDulce("gomitas");
	    Manufactura.CrearDulce("gomitas");
	    MenuDeConsola menu=new MenuDeConsola();
	    OpcionDeMenu hp=new hacerPedido();
	    menu.anadirOpcion(hp);
		OpcionDeMenu cd=new CrearDulce();
		menu.anadirOpcion(cd);
		OpcionDeMenu as=new AsignarSueldo();
		menu.anadirOpcion(as);
		OpcionDeMenu gan=new Ganancia();
		menu.anadirOpcion(gan);
		OpcionDeMenu pdm=new ProductoMasVendido();
		menu.anadirOpcion(pdm);
        launch(args);
    }
	public void start(Stage primaryStage) throws FileNotFoundException {
		window=primaryStage;
		//registro
		Label label1 = new Label("BIENVENIDO POR FAVOR REGISTRESE CORRECTAMENTE EN LOS BOTONES SIGUIENTES");
		Label usuario = new Label("Usuario");
		Label contra = new Label("Contraseña");
		TextField text1= new TextField();
		TextField text2= new TextField();
		Alert a1=new Alert(AlertType.NONE);
		text1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String usu=text1.getText();
				if (usu.equals("usuario")) {
					flagIngreso=1;
				}else {
					flagIngreso=0;
					a1.setAlertType(AlertType.ERROR);
					a1.setContentText("Ingrese el nombre de usuario correcto.");
					a1.show();
				}
			}
		});
		text2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String contra=text2.getText();
				if (contra.equals("12345")) {
					flagIngreso=1;
				}else {
					flagIngreso=0;
					a1.setAlertType(AlertType.ERROR);
					a1.setContentText("Ingrese la contraseña correcta.");
					a1.show();
				}
			}
		});
		
		Image imagen = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce.jpg"));
		ImageView imagenView= new ImageView(imagen);
		//imagenView.setFitHeight(200);
		//imagenView.setFitWidth(100);
		Label label2 = new Label("",imagenView);
        Button boton1 = new Button("Ingresar");
        boton1.setPrefWidth(80);
        boton1.setOnAction(new EventHandler<ActionEvent>() {
        	String usu=text1.getText();
        	String contra=text2.getText();
			public void handle(ActionEvent event) {
				//System.out.print(usu);
				if(flagIngreso==1) {
					window.setScene(programadores);
				}
				else {
					a1.setAlertType(AlertType.ERROR);
					a1.setContentText("Ingrese los datos de ingreso validos,o de la tecla Enter en cada espacio.");
					a1.show();
				}
			}
		});
        label1.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				label1.setStyle("-fx-text-fill: blue;");
				
			}
		});
		label1.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				label1.setStyle("-fx-text-fill: purple;");
				
			}
		});
        GridPane vista =new GridPane();
        vista.setPadding(new Insets(10,10,10,10));
        vista.setVgap(8);
        vista.setHgap(8);
        vista.add(usuario, 0, 0);
        vista.add(text1, 1, 0);
        vista.add(contra, 0, 1);
        vista.add(text2, 1, 1);
        vista.add(boton1, 1, 2);
        vista.setAlignment(Pos.CENTER);
        
        //programadores
        BorderPane progra =new BorderPane();
        Label label3 = new Label("BIENVENIDO ESTOS SON NUESTROS PROGRAMADORES, DE CLICK SOBRE EL NOMBRE PARA CONOCER MÁS DETALLES");
        Button boton7 =new Button ("Ir a los Menús");
        progra.setTop(label3);
        progra.setBottom(boton7);
        GridPane programa =new GridPane();
        programa.setPadding(new Insets(10,10,10,10));
        programa.setAlignment(Pos.CENTER);
        Button junior =new Button("Junior Muñoz");
        Button aleja =new Button("Alejandra Muñoz");
        Button jonathan =new Button("Jonathan Lopez");
        Button jake =new Button("Jakeline Correa");
        Button juan =new Button("Juan José");
        Button volver =new Button("Volver a los programadores");
        programa.add(junior,0,0);
        programa.add(aleja,1,0);
        programa.add(jonathan,2,0);
        programa.add(jake,3,0);
        programa.add(juan,4,0);
        progra.setCenter(programa);
        // CAMBIAR COLOR Y YA
        label3.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				label3.setStyle("-fx-text-fill: blue;");
				
			}
		});
		label3.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				label3.setStyle("-fx-text-fill: yellow;");
				
			}
		});
        
        //biografia cada uno
        junior.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				BorderPane junior =new BorderPane();
				junior.setCenter(new Label("Hola soy junior muñoz, tengo 21 años"));
				junior.setBottom(volver);
				Scene junior1=new Scene(junior,500,200);
				window.setScene(junior1);
			}
		});
        aleja.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				BorderPane aleja =new BorderPane();
				aleja.setCenter(new Label("Hola soy junior muñoz, tengo 21 años"));
				aleja.setBottom(volver);
				Scene aleja1=new Scene(aleja,500,200);
				window.setScene(aleja1);
			}
		});
        jonathan.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				BorderPane jonathan =new BorderPane();
				jonathan.setCenter(new Label("Hola soy junior muñoz, tengo 21 años"));
				jonathan.setBottom(volver);
				Scene jonathan1=new Scene(jonathan,500,200);
				window.setScene(jonathan1);
			}
		});
        jake.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				BorderPane jake =new BorderPane();
				jake.setCenter(new Label("Hola soy junior muñoz, tengo 21 años"));
				jake.setBottom(volver);
				Scene jake1=new Scene(jake,500,200);
				window.setScene(jake1);
			}
		});
        juan.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				BorderPane juan =new BorderPane();
				juan.setCenter(new Label("Hola soy junior muñoz, tengo 21 años"));
				juan.setBottom(volver);
				Scene juan1=new Scene(juan,500,200);
				window.setScene(juan1);
			}
		});
        
        
        //boton volver 
        volver.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(programadores);
			}
		});
        //inicio
        GridPane inicio1 =new GridPane();
        //Label bienvenida = new Label("Estos son nuestros programadores");
        Button boton2 =new Button("Dulce Mas Vendido");
        Button boton3 =new Button("Hacer Pedido");
        Button boton4 =new Button("Hacer Dulce");
        Button boton5 =new Button("Ganancias");
        Button boton6 =new Button("Asignar Sueldo");
        inicio1.add(boton2,0, 0);
        inicio1.add(boton3,1, 0);
        inicio1.add(boton4,2, 0);
        inicio1.add(boton5,3, 0);
        inicio1.add(boton6,4, 0);
        //inicio1.setAlignment(Pos.TOP_LEFT);
        //Crear que los botones cambien a la escena
        boton2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(masVendido);
			}
		});
        boton3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(hacerPedido);
			}
		});
        boton4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(hacerDulce);
			}
		});
        boton5.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(ganancias);
			}
		});
        boton6.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(asignarSueldo);
			}
		});
        
        boton7.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(menu);
			}
		});
        
      //menu
        BorderPane Menu =new BorderPane();
        Button archivos =new Button("Archivos");
        Button procesos =new Button("Procesos y Consultas");
        Button ayuda =new Button("Ayuda");
        HBox menu1 =new HBox(archivos,procesos,ayuda);
        Menu.setTop(menu1);
        GridPane menu2 = new GridPane();
        Label bienvenida =new Label("Hola, bienvenido, recuerda que acabas de ingresar a una empresa de dulces,por favor llena los campos a continuacion");
        bienvenida.setMaxWidth(Double.MAX_VALUE);
        bienvenida.setMaxHeight(Double.MAX_VALUE);
        bienvenida.setFont(new Font("Times New Roman",15)); 
        Label producto = new Label ("Producto");
        Label cantidad = new Label("Cantidad");
        TextField canti =new TextField();
        TextField produ =new TextField();
        menu2.add(producto,1,0);
        menu2.add(produ,2,0);
        menu2.add(cantidad,1,1);
        menu2.add(canti,2,1);
        menu2.setAlignment(Pos.CENTER);
        menu2.setPadding(new Insets(30,10,10,10));
        menu2.setVgap(8);
        menu2.setHgap(8);
        Menu.setBottom(menu2);
        Menu.setCenter(bienvenida);
        
        //procesos y consultas
        procesos.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(inicio);
			}
		});
        

        
		VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,vista,label2);
        registro = new Scene(layout1, 500, 200);
        
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(inicio1);
        inicio= new Scene (layout2,500,200);
        
        VBox layout3 = new VBox(20);
        layout3.getChildren().addAll();
        masVendido= new Scene (layout3,500,200);
        
        VBox layout4 = new VBox(20);
        layout4.getChildren().addAll();
        hacerPedido= new Scene (layout4,500,200);
        
        VBox layout5 = new VBox(20);
        layout5.getChildren().addAll();
        hacerDulce= new Scene (layout5,500,200);
        
        VBox layout6 = new VBox(20);
        layout6.getChildren().addAll();
        ganancias= new Scene (layout6,500,200);
        
        VBox layout7 = new VBox(20);
        layout7.getChildren().addAll();
        asignarSueldo= new Scene (layout7,500,200);
        
        VBox layout8 = new VBox(20);
        layout8.getChildren().addAll(progra);
        programadores = new Scene(layout8, 650, 100);
        
        VBox layout9 = new VBox(20);
        layout9.getChildren().addAll(Menu);
        menu = new Scene(layout9, 500, 200);
        
        window.setScene(registro);
        window.setTitle("COLOR BOX");
        window.show();
	}

}
