public class Gasoline_Engine_2 implements Engine{

    private boolean isSparkFire = false;

    public void firing_spark_plug(){
        
        isSparkFire = true;
        System.out.println("Descargando chispa");

    }

    public void shut_spark_plug(){
        
        isSparkFire = false;
    }
    
    @Override
    public boolean intake(){

        System.out.println("Atomisando combustible en piston");
        return true;
    }

    @Override
    public boolean compresion(){

        System.out.println("Comprimiendo mescla de gasolina");
        return true;
    }

    @Override
    public boolean power(){

        if(isSparkFire == false){
            firing_spark_plug();
        }

        System.out.println("La combustion a explotado a la gasolina");
        shut_spark_plug();
        return true;
    }

    @Override
    public boolean exaust(){

        System.out.println("Expulsando gases");
        return true;
    }

   
}