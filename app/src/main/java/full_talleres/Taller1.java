/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {


    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    
    public static String Convertir_km_seg (int velocidad){
        try {
            //Constantes y variables
            final int Metros_por_km = 1000;
            final int Seg_por_hora = 3600;
            if (velocidad < 0)
                return "Error en la conversion";
            //Operaciones
            double metrosPorsegundos = velocidad * Metros_por_km;
            double metroPorhora = metrosPorsegundos * Seg_por_hora;

                return metrosPorsegundos + " m/s - " + metroPorhora + " m/h."; 
        } 
        catch (Exception e) {
            return "Error en la conversion";
        }
    }

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
     public static float Convertir_cm_lt (double cc){
        try {
            //constantes y variables
            final short cc_por_litro = 1000;
            //Operaciones
            float litros = ((float)cc/cc_por_litro);
            return litros;    
        } 
        catch (Exception e) {
            return 0;
        }
    } 
    

  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
    public static long Convertir_us_cops (int dolares){
    try {
    // Constantes y variable
        final short TRM = 4170;

    //Operaciones
        long conv_dolares = dolares * TRM;
            return conv_dolares;
        
    } 
    catch (Exception e) {
        return -1;
    }

   }
   
    
  
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
    public static float Convertir_cent_far (float tem_grados){
    try {
    //Constantes y variables
    final short nr32 = 32;
    final short nr9_5 = 9/5;

    //Opreaciones
    float F = tem_grados * nr9_5 + nr32;
        return F;
        
    }
     catch (Exception e) {
        return 0;
    }
  }

          

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
    public static int Calcular_segs (short nro_dias,short nro_horas, short nro_min, short nro_seg){
    try {
    //Constantes y varibles
    final int dia_por_seg = 86400;
    final int hora_por_seg = 3600;
    final int min_por_seg = 60;

    //Validar que los datos sean positivos
    if (nro_dias < 0 && nro_horas < 0 && nro_min < 0)
        return -1;
    
    //Operaciones
    long seg_totales = (nro_dias*dia_por_seg)+(nro_horas*hora_por_seg)+(nro_min*min_por_seg)+(nro_seg);
        return (int)seg_totales;

    }
    catch (Exception e) {
        return -1;
    }
  }

   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/
    public static String Calcular_peso_carga (float peso_cargado, float peso_vacio){
    try {
    //Variables y Constantes
        final short kg_por_tonelada = 1000;
    //operaciones 
        float carga_tone = peso_cargado - peso_vacio;
        float carga_kg = carga_tone*kg_por_tonelada;
        
            return carga_kg + " kilos " + "- " + carga_tone + " toneladas ";
        
    }
     catch (Exception e) {
        return ("Error en la función Calcular_peso_carga");
    }
}

   

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
    public static float Calcular_horasxviaje(String destino, short distancia, short velocidad){
    try {
        
        // Calcular las horas necesarias
        float horas = (int) distancia / velocidad;
        return horas;

    } catch (Exception e) {
        // Si ocurre alguna excepción, devolver -1
        return -1;
    }
}

  
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/
    public static float Calcular_combustible (int ruta1, int ruta2, int ruta3, int ruta4){
    try {
    //Variables y constantes
    final float despegue = 1.2f;
    final float aterrizaje = 0.4f;
    final float consumo_por_km = 0.2f/60.8f;
    //Operaciones 
    float combustible_ruta1 = despegue+aterrizaje+(consumo_por_km*ruta1);
    float combustible_ruta2 = despegue+aterrizaje+(consumo_por_km*ruta2);
    float combustible_ruta3 = despegue+aterrizaje+(consumo_por_km*ruta3);
    float combustible_ruta4 = despegue+aterrizaje+(consumo_por_km*ruta4);
    float combustible_total = combustible_ruta1+combustible_ruta2+combustible_ruta4+combustible_ruta3;
        return combustible_total;
        
    }
     catch (Exception e) {
       return -1;
    }
   }

   
   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
    public static double Calcular_peso_luna (byte peso_kilos){
    try {
    //Variables y Constantes
        final float gravedad = 9.81f;
        final float nr1 = 0.165f;
    //Operaciones
        double peso_tierra_new = peso_kilos *gravedad;
        double peso_luna_new = peso_tierra_new *nr1;
        return peso_luna_new; 
    } 
    catch (Exception e) {
       return 0;
  }
   
   
   
}
   
   
   
}
