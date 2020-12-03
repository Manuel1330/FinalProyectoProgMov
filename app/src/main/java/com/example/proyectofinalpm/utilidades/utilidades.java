package com.example.proyectofinalpm.utilidades;

public class utilidades {

    //Constantes campos tabla Exposiciones
    public static final String TABLA_EXPOSICIONES="EXPOSICIONES";
    public static final String CAMPO_ID_EXPOSICION="IdExposicion";
    public static final String CAMPO_NOMBRE_EXP="NombreExp";
    public static final String CAMPO_DESCRIPCION="Descripcion";
    public static final String CAMPO_FECHA_INICIO="FechaInicio";
    public static final String CAMPO_FECHA_FIN="FechaFin";

    public static final String CREAR_TABLA_EXPOSICIONES="CREATE TABLE " +
            ""+TABLA_EXPOSICIONES+" ("+CAMPO_ID_EXPOSICION+" " +
            "INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_NOMBRE_EXP+" VARCHAR(10), "+
            CAMPO_DESCRIPCION+" VARCHAR(10), "+CAMPO_FECHA_INICIO+" DATE, "+
            CAMPO_FECHA_FIN+" DATE)";

    //Constantes campos tabla Artistas
    public static final String TABLA_ARTISTAS="ARTISTAS";
    public static final String CAMPO_DNI_PASAPORTE="DniPasaporte";
    public static final String CAMPO_NOMBRE="Nombre";
    public static final String CAMPO_DIRECCION="Direccion";
    public static final String CAMPO_POBLACION="Poblacion";
    public static final String CAMPO_PROVINCIA="Provincia";
    public static final String CAMPO_PAIS="Pais";
    public static final String CAMPO_MOVIL_TRABAJO="MovilTrabajo";
    public static final String CAMPO_MOVIL_PERSONAL="MovilPersonal";
    public static final String CAMPO_TELEFONO_FIJO="TelefonoFijo";
    public static final String CAMPO_EMAIL="Email";
    public static final String CAMPO_WEB_BLOG="WebBlog";
    public static final String CAMPO_FECHA_NACIMIENTO="FechaNacimiento";

    public static final String CREAR_TABLA_ARTISTAS="CREATE TABLE " +
            ""+TABLA_ARTISTAS+" ("+CAMPO_DNI_PASAPORTE+" " + "VARCHAR(10), "+
            CAMPO_NOMBRE+" VARCHAR(10), "+
            CAMPO_DIRECCION+" VARCHAR(10), "+
            CAMPO_POBLACION+" VARCHAR(10), "+
            CAMPO_PROVINCIA+" VARCHAR(10), "+
            CAMPO_PAIS+" VARCHAR(10), "+
            CAMPO_MOVIL_TRABAJO+" INTEGER, "+
            CAMPO_MOVIL_PERSONAL+" INTEGER, "+
            CAMPO_TELEFONO_FIJO+" INTEGER, "+
            CAMPO_EMAIL+" VARCHAR(10), "+
            CAMPO_WEB_BLOG+" VARCHAR(10), "+
            CAMPO_FECHA_NACIMIENTO+" DATE, "+
            "PRIMARY KEY ("+CAMPO_DNI_PASAPORTE+"))";

    //Constantes campos tabla Exponen
    public static final String TABLA_EXPONEN="EXPONEN";

    public static final String CREAR_TABLA_EXPONEN="CREATE TABLE " +
            ""+TABLA_EXPONEN+" ("+CAMPO_ID_EXPOSICION+" " +
            "INTEGER, "+CAMPO_DNI_PASAPORTE+" VARCHAR(10), "+
            "PRIMARY KEY ("+CAMPO_ID_EXPOSICION+", "+CAMPO_DNI_PASAPORTE+")," +
            "FOREIGN KEY ("+CAMPO_ID_EXPOSICION+") REFERENCES "+TABLA_EXPOSICIONES+" ("+CAMPO_ID_EXPOSICION+"), " +
            "FOREIGN KEY ("+CAMPO_DNI_PASAPORTE+") REFERENCES "+TABLA_ARTISTAS+" ("+CAMPO_DNI_PASAPORTE+"))";

    //Constantes campos tabla Trabajos
    public static final String TABLA_TRABAJOS="TRABAJOS";
    public static final String CAMPO_NOMBRE_TRAB="NombreTrab";
    public static final String CAMPO_DESCRIPCION_TRABAJO="DescripcionTrabajo";
    public static final String CAMPO_TAMANIO ="Tamaño";
    public static final String CAMPO_PESO="Peso";
    public static final String CAMPO_FOTO="Foto";

    public static final String CREAR_TABLA_TRABAJOS="CREATE TABLE " +
            ""+TABLA_TRABAJOS+" ("+CAMPO_NOMBRE_TRAB+" " + "VARCHAR(10), "+
            CAMPO_DESCRIPCION_TRABAJO+" VARCHAR(10), "+
            CAMPO_TAMANIO +" VARCHAR(10), "+
            CAMPO_PESO+" VARCHAR(10), "+
            CAMPO_DNI_PASAPORTE+" VARCHAR(10), "+
            CAMPO_FOTO+" VARCHAR(10), "+
            "PRIMARY KEY ("+CAMPO_NOMBRE_TRAB+")," +
            "FOREIGN KEY ("+CAMPO_DNI_PASAPORTE+") REFERENCES "+TABLA_ARTISTAS+" ("+CAMPO_DNI_PASAPORTE+"))";


    //Constantes campos tabla Comentarios
    public static final String TABLA_COMENTARIOS="COMENTARIOS";
    public static final String CAMPO_COMENTARIO="Comentario";

    public static final String CREAR_TABLA_COMENTARIOS="CREATE TABLE " +
            ""+TABLA_COMENTARIOS+" ("+CAMPO_ID_EXPOSICION+" " + "INTEGER, "+
            CAMPO_NOMBRE_TRAB+" VARCHAR(10), "+
            CAMPO_COMENTARIO+" VARCHAR(10), "+
            "PRIMARY KEY ("+CAMPO_ID_EXPOSICION+")," +
            "FOREIGN KEY ("+CAMPO_ID_EXPOSICION+") REFERENCES "+TABLA_EXPOSICIONES+" ("+CAMPO_ID_EXPOSICION+"), " +
            "FOREIGN KEY ("+CAMPO_NOMBRE_TRAB+") REFERENCES "+TABLA_TRABAJOS+" ("+CAMPO_NOMBRE_TRAB+"))";

}
