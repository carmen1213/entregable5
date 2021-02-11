public class seguridad {
    public static int CantidadContra;
    public static String esFuerte() {
        if (CantidadContra>8){
            return "La contraseña es segura: ";
        }else{
            return "La contraseña es debil: ";
        }
    }
}
