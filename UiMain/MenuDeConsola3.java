package UiMain;
import java.util.*;

import Excepciones.cincuentaMas;
import Excepciones.contrasenaIncorrecta;
import Excepciones.dulceEquivocado;
import Excepciones.usuarioIncorrecto;
import Personas.Cliente;
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
import javafx.scene.shape.Rectangle;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.geometry.*;
import javafx.scene.text.Font;
import java.io.FileInputStream;

public class MenuDeConsola extends Application {
	Stage window;
    Scene registro,inicio,masVendido,hacerPedido,hacerDulce,ganancias, asignarSueldo,programadores,menu,archivo,ayuda,procesos,Ayuda,Archivo;
    static int flagUsu=0;
    static int flagContra=0;
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
	public void verificarContrasena(String contrasena)throws contrasenaIncorrecta {
		if(contrasena.equals("12345")) {

			flagContra=1;
		}
		else {
			flagContra=0;
			throw new contrasenaIncorrecta();
		}
	}
	public void verificarUsuario(String usuario)throws usuarioIncorrecto {
		if(usuario.equals("usuario")) {
			flagUsu=1;
		}
		else {
			flagUsu=0;
			throw new usuarioIncorrecto();
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
				try {
					verificarUsuario(usu);
				}
				catch(usuarioIncorrecto us) {
					a1.setAlertType(AlertType.ERROR);
					a1.setContentText(us.getMessage());
					a1.show();
				}
			}
		});
		text2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				String contra=text2.getText();
				try {
					verificarContrasena(contra);
				}
				catch(contrasenaIncorrecta el) {
					a1.setAlertType(AlertType.ERROR);
					a1.setContentText(el.getMessage());
					a1.show();
				}
			}
		});

		Image imagen = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce.jpeg"));
		ImageView imagenView= new ImageView(imagen);
		
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
				
				else if(flagContra==0){
					try {
						verificarContrasena(contra);
					}
					catch(contrasenaIncorrecta el) {
						a1.setAlertType(AlertType.ERROR);
						a1.setContentText(el.getMessage());
						a1.show();
					}
					
				}
				else if(flagUsu==0){
					try {
						verificarUsuario(usu);
					}
					catch(usuarioIncorrecto us) {
						a1.setAlertType(AlertType.ERROR);
						a1.setContentText(us.getMessage());
						a1.show();
					}
					
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
        GridPane Total= new GridPane();
        BorderPane total =new BorderPane();
        GridPane total1 =new GridPane();
        
        BorderPane progra =new BorderPane();
        Label label3 = new Label("BIENVENIDO ESTOS SON NUESTROS PROGRAMADORES, DE CLICK SOBRE EL NOMBRE PARA CONOCER MÁS DETALLES");
        label3.setMaxWidth(600);
        label3.setWrapText(true);
        label3.setFont(new Font("Times New Roman",18)); 
        progra.setTop(label3);
        
        Button junior =new Button("Junior Muñoz");
        junior.setPrefWidth(150);
        Button aleja =new Button("Alejandra Muñoz");
        aleja.setPrefWidth(150);
        Button jonathan =new Button("Jonathan Lopez");
        jonathan.setPrefWidth(150);
        Button jake =new Button("Jakelin Correa");
        jake.setPrefWidth(150);
        Button juan =new Button("Juan José Salazar");
        juan.setPrefWidth(150);
        
        VBox Progra3 =new VBox(junior,aleja);
        VBox Progra1 =new VBox(jonathan,jake);
        VBox Progra2=new VBox(juan);
        VBox Progra=new VBox(Progra1,Progra2,Progra3);
        
        //descripcion sistema
        Button volver =new Button("Volver a los programadores");
        Button boton7 =new Button ("Ir a los Menús");
        
        BorderPane Volver =new BorderPane();
        Volver.setBottom(boton7);
        
        GridPane descripcion =new GridPane();
        Label descrip =new Label ("DESCRIPCIÓN DEL SISTEMA");
        Label descri=new Label ("Este programa esta desarollado para una empresa que produce dulce y los distribuye a sus respetivos clientes.");
        descrip.setMaxWidth(800);
        descrip.setWrapText(true);
        descrip.setFont(new Font("Times New Roman",20)); 
        descri.setMaxWidth(500);
        descri.setWrapText(true);
        descri.setFont(new Font("Times New Roman",18)); 
        descripcion.add(descrip,0,0);
        descripcion.add(descri,0,1);
        descripcion.setVgap(8);
        descripcion.setHgap(8);
        descripcion.setAlignment(Pos.BOTTOM_LEFT);
        descrip.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				descrip.setStyle("-fx-text-fill: blue;");
				
			}
		});
        descrip.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				descrip.setStyle("-fx-text-fill: green;");
				
			}
		});
        
        
        
        //imagenes
        Image imagenes = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce.jpeg"));
		ImageView imagenV= new ImageView(imagenes);
		imagenV.setFitHeight(120);
		imagenV.setFitWidth(100);
		Label ima = new Label("",imagenV);
		
		BorderPane Imagenes =new BorderPane();
        Imagenes.setCenter(ima);
		
		Image imagen1 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce1.jpeg"));
		ImageView imagenV1= new ImageView(imagen1);
		imagenV1.setFitHeight(120);
		imagenV1.setFitWidth(100);
		Label ima1 = new Label("",imagenV1);
		
		Image imagen2 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce2.jpeg"));
		ImageView imagenV2= new ImageView(imagen2);
		imagenV2.setFitHeight(120);
		imagenV2.setFitWidth(100);
		Label ima2 = new Label("",imagenV2);
		
		Image imagen3 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce3.jpeg"));
		ImageView imagenV3= new ImageView(imagen3);
		imagenV3.setFitHeight(120);
		imagenV3.setFitWidth(100);
		Label ima3 = new Label("",imagenV3);
		
		Image imagen4 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce4.jpeg"));
		ImageView imagenV4= new ImageView(imagen4);
		imagenV4.setFitHeight(120);
		imagenV4.setFitWidth(100);
		Label ima4 = new Label("",imagenV4);
		
		Image imagen5 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\dulce5.jpeg"));
		ImageView imagenV5= new ImageView(imagen5);
		imagenV5.setFitHeight(120);
		imagenV5.setFitWidth(100);
		Label ima5 = new Label("",imagenV5);
		
		Image imagen6 = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\color.jpeg"));
		ImageView imagenV6= new ImageView(imagen6);
		imagenV6.setFitHeight(150);
		imagenV6.setFitWidth(150);
		Label color = new Label("",imagenV6);

		total.setTop(progra);
		total.setLeft(Progra);
		total.setCenter(color);
		total.setBottom(Volver);
		total.setPadding(new Insets(10,10,10,10));
		// boton cerrar app
		Image cierra = new Image(new FileInputStream(System.getProperty("user.dir") + "\\src\\imagenes\\exit.jpeg"));
		ImageView cierraV= new ImageView(cierra);
		cierraV.setFitHeight(50);
		cierraV.setFitWidth(50);
        Button cerra=new Button();
        BorderPane cerrar =new BorderPane();
        cerrar.setRight(cerra);
        BorderPane.setAlignment(cerra, Pos.BOTTOM_RIGHT);
        cerra.setGraphic(cierraV);
        cerra.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.close();
			}
		});
		// boton cerrar con imagen
		
		total1.add(descripcion, 0, 0);
		total1.add(Imagenes, 0, 4);
		total1.setPadding(new Insets(10,10,10,10));
		total1.setVgap(10);
        total1.setHgap(10);
		total1.setAlignment(Pos.BASELINE_RIGHT);
		
		Total.add(total, 0, 0);
		Total.add(total1, 1, 0);
		Total.add(cerrar, 2, 0);
		Total.setAlignment(Pos.CENTER);
        
        
        ima.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				Imagenes.setCenter(ima1);

			}
		});
        ima1.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				Imagenes.setCenter(ima2);

			}
		});
        ima2.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				Imagenes.setCenter(ima3);

			}
		});
        ima3.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				Imagenes.setCenter(ima4);

			}
		});
        ima4.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				Imagenes.setCenter(ima5);

			}
		});
        ima5.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				Imagenes.setCenter(ima);

			}
		});

       
    
        // CAMBIAR COLOR Y YA
        label3.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				label3.setStyle("-fx-text-fill: yellow;");
				
			}
		});
		label3.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				label3.setStyle("-fx-text-fill: blue;");
				
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

        //menu
        BorderPane Menu =new BorderPane();
        Menu.setPadding(new Insets (10,10,10,10));
        Button archivos =new Button("Archivos");
        Button anterior =new Button("Ir al inicio");
        Button ayuda =new Button("Ayuda");
        String Proce[]= {"Dulce Mas Vendido","Hacer Pedido","Hacer Dulce","Ganancias","Asignar Sueldo"};
        ComboBox<String> combo = new ComboBox(FXCollections.observableArrayList(Proce));
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
                    GridPane gp1=new GridPane();
                    Label nombre=new Label();
                    nombre.setText(new ProductoMasVendido().ejecutar1());
                    nombre.setDisable(false);
                    gp1.add(nombre,1,0);
                    Menu.setCenter(gp1);
                    //Menu.setStyle("-fx-border-color : black; -fx-border-width : 0 5 ");
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
                    btn1.setOnAction(new EventHandler<ActionEvent>() {
            			public void handle(ActionEvent event) {
            				String p;
            				String tip=txt1.getText();
            				String cantidad=txt2.getText();
            				try {
            					Cliente.verificarTipo(tip);
            				}
            				catch(dulceEquivocado dul) {
            					Alert n3= new Alert(AlertType.ERROR);
            					n3.setContentText(dul.getMessage());
            					n3.show();
            				}
            				try {
            					int numEntero=-1;
            					try {
            						numEntero = Integer.parseInt(cantidad);
            					}
            					catch(NumberFormatException inte) {
            						Alert duli=new Alert(AlertType.ERROR);
            						duli.setContentText("Ingrese una cantidad válida");
            					}
            					Cliente.verificarCantidad(numEntero);
            				}
            				catch(cincuentaMas cin) {
            					Alert n3= new Alert(AlertType.ERROR);
            					n3.setContentText(cin.getMessage());
            					n3.show();
            				}
            			}
            		});
                }
                else if(combo.getValue().equals("Hacer Dulce")){
                    GridPane gp2=new GridPane();
                    Label lbl1=new Label ("Qué tipo de dulce la gustaría crear, por favor escriba como se muestran las opciones \n --chocolate \n --gomitas \n --caramelo");
                    lbl1.setMaxWidth(600);
                    lbl1.setWrapText(true);
                    lbl1.setFont(new Font("Times New Roman",15)); 
                    Label lbl2=new Label("Dulce que deesea hacer ");
                    lbl2.setFont(new Font("Times New Roman",13)); 
                    TextField txt1=new TextField();
                    txt1.setMaxWidth(150);
                    Button btn1=new Button("Confirmar");
                    gp2.add(lbl1,0,0);
                    gp2.add(lbl2,0,1);
                    gp2.add(txt1,0,2);
                    gp2.add(btn1, 0, 3);
                    gp2.setPadding(new Insets(10,10,10,10));
                    gp2.setVgap(8);
                    gp2.setHgap(8);
                    gp2.setAlignment(Pos.CENTER);
                    Menu.setCenter(gp2);
                    btn1.setOnAction(new EventHandler<ActionEvent>() {
            			public void handle(ActionEvent event) {
            				String p;
            				String tip=txt1.getText();
            				try {
            					Cliente.verificarTipo(tip);
            					CrearDulce cd =new CrearDulce();
                				p=cd.ejecutar1(tip);
                				Alert a3=new Alert(AlertType.INFORMATION);
                				a3.setHeaderText("Información");
                				a3.setContentText("Estamos verificando, espere un momento, recuerde que nuestra empresa hará 50 ejemplares del tipo de dulce que haya escogido por defecto de la máquina.\nPor favor no presione ninguna tecla.");
                				a3.show();
                				try {
                	                // Wait for 5 secs
                	                Thread.sleep(10000);
                	                if (a3.isShowing()) {
                	                    Platform.runLater(() -> a3.close());
                	                }
                	            } catch (Exception exp) {
                	                exp.printStackTrace();
                	            }
                				a2.setAlertType(AlertType.INFORMATION);
                				
                				a2.setHeaderText("Se han creado dulces");
                				a2.setContentText(p);
                				a2.show();
            				}
            				catch(dulceEquivocado dul) {
            					Alert n3= new Alert(AlertType.ERROR);
            					n3.setContentText(dul.getMessage());
            					n3.show();
            				}
            			}
            		});
                }
                else if(combo.getValue().equals("Asignar Sueldo")){
                    GridPane gp2=new GridPane();
                    Label lbl2=new Label("Ingrese el nombre de trabajador ");
                    Label lbl3=new Label("Ingrese el cargo del trabajador ");
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
                    btn1.setOnAction(new EventHandler<ActionEvent>() {
            			public void handle(ActionEvent event) {
            				String p;
            				String nom=txt1.getText();
            				String car=txt2.getText();
            				AsignarSueldo as =new AsignarSueldo();
            				p=as.ejecutar1(nom,car);
            				a2.setAlertType(AlertType.CONFIRMATION);
            				a2.setHeaderText("Se ha asignado un sueldo");
            				a2.setContentText(p);
            				a2.show();
            			}
            		});
                    
                }
                else if(combo.getValue().equals("Ganancias")){
                    GridPane gp2=new GridPane();
                    Label lbl2=new Label("De click a Confirmar para mostrar las ganancias de la empresa");
                    //Label lbl3=new Label("Ingrese el cargo del trabajador ");

                    Button btn1=new Button("Confirmar");
                    gp2.add(lbl2,0,0);
                    //gp2.add(lbl3,0,1);
                    gp2.add(btn1,1,2);
                    gp2.setAlignment(Pos.CENTER);
                    gp2.setPadding(new Insets(10,10,10,10));
                    gp2.setVgap(8);
                    gp2.setHgap(8);
                    Menu.setCenter(gp2);
                    btn1.setOnAction(new EventHandler<ActionEvent>() {
            			public void handle(ActionEvent event) {
            				String p;
            				Ganancia ga =new Ganancia();
            				p=ga.ejecutar1();
            				a2.setAlertType(AlertType.CONFIRMATION);
            				a2.setHeaderText("Se ha ejecutado Ganancia");
            				a2.setContentText(p);
            				a2.show();
            			}
            		});
                    
                }
            
        }});
        
	
        Menu.setCenter(bienvenida);
       

        //boton ayuda 
        ayuda.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(Ayuda);
			}
		});

        //ayuda
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
        //Archivo
        archivos.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(Archivo);
			}
		});
      
        BorderPane archivo=new BorderPane();
        Label color1 = new Label("Color Box",imagenV6);
        color1.setFont(new Font("Times New Roman",25));
        archivo.setCenter(color1);
        archivo.setBottom(anterior);
        Menu.setAlignment(anterior, Pos.BOTTOM_LEFT);

        //boton anterior
        anterior.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				window.setScene(programadores);
			}
		});
        
        
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
        layout8.getChildren().addAll(Total);
        programadores = new Scene(layout8, 900, 300);
        
        VBox layout9 = new VBox(20);
        layout9.getChildren().addAll(Menu);
        menu = new Scene(layout9, 600, 300);
        
        VBox layout10 = new VBox(20);
        layout10.getChildren().addAll(ayuda1);
        Ayuda= new Scene(layout10,400,150);
        
        VBox layout11 = new VBox(20);
        layout11.getChildren().addAll(archivo);
        Archivo= new Scene(layout11,500,200);
        
        
        window.setScene(registro);
        window.setTitle("COLOR BOX");
        window.show();
	}

}
