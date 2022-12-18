/**
 * @author Samuel Acosta Fernandez
 * @date 09/02/2022
 * @version 01
 */
package modelo;


public class Modelo {
    
    // VENTANA PRINCIPAL
    private String[] textoVentanaPrincipal;
    private String[] textoPanelesVentanaPrincipal;
    private String[] textoOpcionesMenu;
    private String[] textoOpcionesMenuImages;
    private String[] tipoOpciones;
    private String[] textoLogos;
    
    //VENTANA INFO
    private String[] textoDatosInfo;
    // OPCIONES
    private String[] textoPanelesOpciones;
    private String textoOpciones;

    // CONEXION
    private String[] textoDatosConexion;
    private String archivo = "mokedb";
    private String ip = "localhost";
    private String user = "root";
    private String password = "";
    
    // INFO
    private String[] textoOpcionesInfo;
    private String[] textoOpcionesInfoImages;
    
    // CONFIGURACIÓN
    private String[] textoOpcionesConfig;
    private String[] textoOpcionesConfigImages;

    public Modelo(){
        
        // VENTANA PRINCIPAL
        textoVentanaPrincipal = new String[]{"MOKE APP"};
        textoPanelesVentanaPrincipal = new String[]{"NORTE", "OESTE", "CENTRAL"};
        textoOpcionesMenu = new String[]{"Subir Archivo", "Descargar Archivo", "Eliminar Archivo", "Crear Carpeta", "Eliminar Carpeta"};
        textoOpcionesMenuImages = new String[]{"subir_fichero", "descargar_fichero", "eliminar_fichero", "crear_carpeta", "eliminar_carpeta", "eliminar_carpeta", "eliminar_carpeta"};
        tipoOpciones = new String[]{"FTP_Moke", "Mail_Moke", "Configuracion_Moke", "Moke_Info"};
        textoLogos= new String[]{"MOKE APP", "FTP MOKE", "Mail MOKE", "Configuracion MOKE", "MOKE INFO"};
        textoOpcionesInfo = new String[]{"Subir Archivo", "Descargar Archivo", "Eliminar Archivo", "Crear Carpeta", "Eliminar Carpeta"};
        textoOpcionesInfoImages = new String[]{"subir_fichero", "descargar_fichero", "eliminar_fichero", "crear_carpeta", "eliminar_carpeta"};
        textoOpcionesConfig = new String[]{"Reestablecer Contraseña", "Cambiar Correo Corporativo", "Soporte Técnico"};
        textoOpcionesConfigImages = new String[]{"password", "gmail", "soporte"};
        
        // LOGIN
        textoPanelesOpciones = new String[]{"arribaTexto", "medioUsuarios", "abajoFondo"};
        textoOpciones = "Seleccione una opcion";

        // CONEXION
        textoDatosConexion = new String[]{"jdbc:mysql://" + ip + "/" + archivo + "?serverTimezone=UTC", user, password, "com.mysql.cj.jdbc.Driver"};
        
        //VENTANA INFO
        textoDatosInfo = new String[] {"Subir Archivos: El usuario podr� subir archivos\n",
        		 "El usuario podr� descargar archivos de otros usuarios (no tiene permitido descargar carpetas)\n",
        		 "El usuario podr� crear carpetas donde subir los Archivos.\n",
        		 "El usuario podr� renombrar las carpetas y archivos subidos por �l.\n",
        		 "El usuario podr� borrar las carpetas creadas por �l.",
        		 "El usuario podr� acceder a un apartado de correo electr�nico donde podr� enviar correos a otros usuarios\n"};
    }
    
    public String[] getTextoVentanaPrincipal(){
        return textoVentanaPrincipal;
    }
    
    public String[] getTextoPanelesVentanaPrincipal(){
        return textoPanelesVentanaPrincipal;
    }
    
    public String[] getTextoOpcionesMenu(){
        return textoOpcionesMenu;
    }
    
    public String[] getTextoOpcionesMenuImages(){
        return textoOpcionesMenuImages;
    }
    
    public String[] getTipoOpciones(){
        return tipoOpciones;
    }
    
    public String[] getTextoPanelesOpciones(){
        return textoPanelesOpciones;
    }
    
    public String[] getTextoLogos(){
        return textoLogos;
    }
    
    public String getTextoOpciones(){
        return textoOpciones;
    }

    public String[] getTextoDatosConexion(){
        return textoDatosConexion;
    }

<<<<<<< Updated upstream
	public String[] getTextoDatosInfo() {
		return textoDatosInfo;
	}

	public void setTextoDatosInfo(String[] textoDatosInfo) {
		this.textoDatosInfo = textoDatosInfo;
	}
    
    
=======
    public String[] getTextoOpcionesInfo(){
        return textoOpcionesInfo;
    }
    
    public String[] getTextoOpcionesInfoImages(){
        return textoOpcionesInfoImages;
    }
    
    public String[] getTextoOpcionesConfig(){
        return textoOpcionesConfig;
    }
    
    public String[] getTextoOpcionesConfigImages(){
        return textoOpcionesConfigImages;
    }
>>>>>>> Stashed changes
    
}
