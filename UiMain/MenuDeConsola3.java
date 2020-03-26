package UiMain;
import java.util.*;
import Personas.Cso;
import Personas.Repartidor;
import Procesos.Manufactura;
import java.io.FileNotFoundException;
import javafx.application.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
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
    Scene registro,inicio,masVendido,hacerPedido,hacerDulce,ganancias, asignarSueldo,programadores,menu,archivo,ayuda,procesos,Ayuda;
    static int flagUsu=1;
    static int flagContra=1;
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
					flagUsu=1;
				}else {
					flagUsu=0;
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
					flagContra=1;
				}else {
					flagContra=0;
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
				if(flagUsu==1 && flagContra==1) {
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
        BorderPane total =new BorderPane();
        
        BorderPane progra =new BorderPane();
        Label label3 = new Label("BIENVENIDO ESTOS SON NUESTROS PROGRAMADORES, DE CLICK SOBRE EL NOMBRE PARA CONOCER MÁS DETALLES");
        Button boton7 =new Button ("Ir a los Menús");
        progra.setTop(label3);
        
        GridPane programa =new GridPane();
        programa.setPadding(new Insets(10,10,10,10));
        programa.setAlignment(Pos.CENTER);
        Button junior =new Button("Junior Muñoz");
        Button aleja =new Button("Alejandra Muñoz");
        Button jonathan =new Button("Jonathan Lopez");
        Button jake =new Button("Jakelin Correa");
        Button juan =new Button("Juan José Salazar");
        Button volver =new Button("Volver a los programadores");
        programa.add(junior,0,0);
        programa.add(aleja,1,0);
        programa.add(jonathan,2,0);
        programa.add(jake,3,0);
        programa.add(juan,4,0);
        
        //descripcion sistema
        GridPane descripcion =new GridPane();
        Label descrip =new Label ("DESCRIPCIÓN DEL SISTEMA");
        Label descri=new Label ("Este programa esta desarollado para una empresa que produce dulce y los distribuye a sus respetivos clientes");
        descri.setMaxWidth(300);
        descri.setWrapText(true);
        descrip.setMaxWidth(300);
        descrip.setWrapText(true);
        descripcion.add(descrip,0,0);
        descripcion.add(descri,0,1);
        descripcion.add(boton7, 0,2 );
        descripcion.setAlignment(Pos.BOTTOM_LEFT);
        
        //imagenen
        Image imagenes = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce.jpg"));
		ImageView imagenV= new ImageView(imagenes);
		imagenV.setFitHeight(60);
		imagenV.setFitWidth(60);
		Label ima = new Label("",imagenV);
		
		Image imagen1 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce1.jpg"));
		ImageView imagenV1= new ImageView(imagen1);
		imagenV1.setFitHeight(60);
		imagenV1.setFitWidth(60);
		Label ima1 = new Label("",imagenV1);
		
		Image imagen2 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce2.jpg"));
		ImageView imagenV2= new ImageView(imagen2);
		imagenV2.setFitHeight(60);
		imagenV2.setFitWidth(60);
		Label ima2 = new Label("",imagenV2);
		
		Image imagen3 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce3.jpg"));
		ImageView imagenV3= new ImageView(imagen3);
		imagenV3.setFitHeight(60);
		imagenV3.setFitWidth(60);
		Label ima3 = new Label("",imagenV3);
		
		Image imagen4 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce4.jpg"));
		ImageView imagenV4= new ImageView(imagen4);
		imagenV4.setFitHeight(60);
		imagenV4.setFitWidth(60);
		Label ima4 = new Label("",imagenV4);
		
		Image imagen5 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce5.jpg"));
		ImageView imagenV5= new ImageView(imagen5);
		imagenV5.setFitHeight(60);
		imagenV5.setFitWidth(60);
		Label ima5 = new Label("",imagenV5);
		
		GridPane Ima =new GridPane();
		Ima.add(ima, 0, 0);
		Ima.setAlignment(Pos.BOTTOM_RIGHT);
		total.setRight(Ima);
        total.setTop(progra);
        total.setCenter(programa);
        total.setBottom(descripcion);
        
        
        ima.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				total.setRight(ima1);

			}
		});
        ima1.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				total.setRight(ima2);

			}
		});
        ima2.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				total.setRight(ima3);

			}
		});
        ima3.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				total.setRight(ima4);

			}
		});
        ima4.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				total.setRight(ima5);

			}
		});
        ima5.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				total.setRight(ima);

			}
		});
        
        //biografia cada uno
        junior.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				BorderPane junior =new BorderPane();
				Label juni =new Label("Hola soy Junior, tengo 21 años y soy estudiante de Ingeniería de Sistemas e informática en la universidad Nacional de Colombia,soy aficionado del volleyball y los videojuegos.");
				juni.setMaxWidth(400);
				juni.setWrapText(true);
				juni.setFont(new Font("Arial",20)); 
				junior.setCenter(juni);
				junior.setBottom(volver);
				Scene junior1=new Scene(junior,500,200);
				window.setScene(junior1);
			}
		});
        aleja.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				BorderPane aleja =new BorderPane();
				Label Aleja =new Label("Hola soy Alejandra,tengo 19 años.Soy estudiante de la Universidad Nacional de Colombia, actualmente estoy estudiando ingenieria de sistemas.Una de las cosas que más me apasinan son los idiomas.");
				Aleja.setMaxWidth(400);
				Aleja.setWrapText(true);
				Aleja.setFont(new Font("Arial",20)); 
				aleja.setCenter(Aleja);
				aleja.setBottom(volver);
				Scene aleja1=new Scene(aleja,500,200);
				window.setScene(aleja1);
			}
		});
        jonathan.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				BorderPane jonathan =new BorderPane();
				Label jona =new Label("Hola soy Jonathan,  tengo 21 años.Soy estudiante de la Universidad Nacional de Colombia.  A parte de la informática me gustan los idiomas.");
				jona.setMaxWidth(400);
				jona.setWrapText(true);
				jona.setFont(new Font("Arial",20)); 
				jonathan.setCenter(jona);
				jonathan.setBottom(volver);
				Scene jonathan1=new Scene(jonathan,500,200);
				window.setScene(jonathan1);
			}
		});
        jake.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				BorderPane jake =new BorderPane();
				Label jakel =new Label("Hola soy Jakelin, tengo 18 años y soy estudiante de Ingeniería de Sistemas e informática en la universidad Nacional de Colombia.");
				jakel.setMaxWidth(400);
				jakel.setWrapText(true);
				jakel.setFont(new Font("Arial",20)); 
				jake.setCenter(jakel);
				jake.setBottom(volver);
				Scene jake1=new Scene(jake,500,200);
				window.setScene(jake1);
			}
		});
        juan.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				BorderPane juan =new BorderPane();
				Label jose =new Label("Hola soy Juan José,tengo 18 años.Soy estudiante de Ingeniería de Sistemas en la Universidad Nacional de Colombia.  Me gusta jugar basketball y tenis de mesa");
				jose.setMaxWidth(400);
				jose.setWrapText(true);
				jose.setFont(new Font("Arial",20)); 
				juan.setCenter(jose);
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
        //procesos
        BorderPane hacerpedido=new BorderPane();
        
        
        //menu
        BorderPane Menu =new BorderPane();
        Button archivos =new Button("Archivos");
        Button anterior =new Button("Anterior");
        Button ayuda =new Button("Ayuda");
        String Proce[]= {"Dulce Mas Vendido","Hacer Pedido","Hacer Dulce","Ganancias","Asignar Sueldo"};
        ComboBox combo = new ComboBox(FXCollections.observableArrayList(Proce));
        combo.setPromptText("Procesos y consultas");
        HBox menu1 =new HBox(archivos,combo,ayuda);
        Menu.setTop(menu1);
        Label bienvenida =new Label("Hola, bienvenido, recuerda que acabas de ingresar a una empresa de dulces, esperamos tengas una buena experiencia y disfrutes tus pedidos");
        bienvenida.setMaxWidth(400);
        bienvenida.setWrapText(true);
        bienvenida.setFont(new Font("Times New Roman",15));  
        combo.valueProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue arg0, String arg1, String texto) {
				if(texto.contentEquals("Hacer Pedido")) {
					System.out.println(texto);
				}
			}
        });
        Alert a2=new Alert(AlertType.NONE);
        combo.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if(combo.getValue().equals("Dulce Mas Vendido")){


                    /*GridPane gp1=new GridPane();
                    Label lbl=new Label("Nombre");
                    TextField nombre=new TextField();
                    nombre.setText(new ProductoMasVendido().ejecutar_str());
                    nombre.setEditable(false);
                    Label lbls=new Label("Cantidad");
                    TextField cantidad=new TextField();
                    cantidad.setText(new ProductoMasVendido().ejecutar_int());
                    cantidad.setEditable(false);
                    gp1.add(lbl,0,0);
                    gp1.add(lbls,0,1);
                    gp1.add(nombre,1,0);
                    gp1.add(cantidad,1,1);
                    Menu.setCenter(gp1);
                    //Menu.setStyle("-fx-border-color : black; -fx-border-width : 0 5 ");*/
                }else if(combo.getValue().equals("Hacer Pedido")){
                    GridPane gp2=new GridPane();
                    Label lbl2=new Label("Producto:");
                    Label lbl3=new Label("Cantidad:");

                    TextField txt1=new TextField();
                    TextField txt2=new TextField();
                    Button btn1=new Button("Confirmar");
                    gp2.add(lbl2,0,0);
                    gp2.add(lbl3,0,1);
                    gp2.add(txt1,1,0);
                    gp2.add(txt2,1,1);
                    gp2.add(btn1,1,2);
                    gp2.setAlignment(Pos.CENTER);
                    gp2.setPadding(new Insets(10,10,10,10));
                    gp2.setVgap(8);
                    gp2.setHgap(8);
                    Menu.setCenter(gp2);
                }
                else if(combo.getValue().equals("Hacer Dulce")){
                    GridPane gp2=new GridPane();
                    Label lbl2=new Label("Dulce a hacer ");

                    TextField txt1=new TextField();
                    Button btn1=new Button("Confirmar");
                    gp2.add(lbl2,0,0);
                    gp2.add(txt1,1,0);
                    gp2.add(btn1,1,2);
                    gp2.setAlignment(Pos.CENTER);
                    gp2.setPadding(new Insets(10,10,10,10));
                    gp2.setVgap(8);
                    gp2.setHgap(8);
                    Menu.setCenter(gp2);
                    btn1.setOnAction(new EventHandler<ActionEvent>() {
            			public void handle(ActionEvent event) {
            				String p;
            				String tip=txt1.getText();
            				CrearDulce cd =new CrearDulce();
            				p=cd.ejecutar1(tip);
            				a2.setAlertType(AlertType.CONFIRMATION);
            				a2.setHeaderText("Se han creado dulces");
            				a2.setContentText(p);
            				a2.show();
            			}
            		});
                }
            }
        });
        Menu.setCenter(bienvenida);
        Menu.setBottom(anterior);
        Menu.setAlignment(anterior, Pos.BOTTOM_RIGHT);
        
        //boton anterior
        anterior.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(programadores);
			}
		});
        
        //boton ayuda 
        ayuda.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(Ayuda);
			}
		});

        BorderPane ayuda1 =new BorderPane();
        Label ayuda2 =new Label("Estos son nuestros programadores");
        ayuda2.setFont(new Font("Times New Roman",15));
        ayuda1.setTop(ayuda2);
        Label ayuda3=new Label("Maria Alejandra Muñoz Alarcón");
        Label ayuda4=new Label("Junior Antonio Muñoz Henao");
        Label ayuda5=new Label("Jonathan Mauricio Lopéz Pérez");
        Label ayuda6=new Label("Jakelin Daiana Correa Palacio");
        Label ayuda7=new Label("Juan José Salazar Cardona");
        VBox programador =new VBox(ayuda3,ayuda4,ayuda5,ayuda6,ayuda7);
        GridPane ayuda8 =new GridPane();
        ayuda8.add(programador,0,0);
        ayuda8.setAlignment(Pos.CENTER);
        ayuda1.setCenter(ayuda8);
        Button regresar =new Button("Regresar");
        ayuda1.setBottom(regresar);
        regresar.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(menu);
			}
		});
        
        
        
        //intento cambio de imagenes va en programadores
        
        
        
		
		/*Image imagenes1 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce3.jpg"));
		ImageView imagenV1= new ImageView(imagenes1);
		imagenView.setFitHeight(200);
		imagenView.setFitWidth(100);
		Label ima1 = new Label("",imagenV1);
		
		/*Image imagenes2 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce4.jpg"));
		ImageView imagenV2= new ImageView(imagenes2);
		imagenView.setFitHeight(200);
		imagenView.setFitWidth(100);
		Label ima2 = new Label("",imagenV2);
		
		Image imagenes3 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce5.jpg"));
		ImageView imagenV3= new ImageView(imagenes3);
		imagenView.setFitHeight(200);
		imagenView.setFitWidth(100);
		Label ima3 = new Label("",imagenV3);
		*/
        
		
		
		VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,vista,label2);
        registro = new Scene(layout1, 500, 200);
        
        
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
        layout8.getChildren().addAll(total);
        programadores = new Scene(layout8, 650, 150);
        
        VBox layout9 = new VBox(20);
        layout9.getChildren().addAll(Menu);
        menu = new Scene(layout9, 500, 200);
        
        VBox layout10 = new VBox(20);
        layout10.getChildren().addAll(ayuda1);
        Ayuda= new Scene(layout10,400,150);
        
        window.setScene(registro);
        window.setTitle("COLOR BOX");
        window.show();
	}

}
