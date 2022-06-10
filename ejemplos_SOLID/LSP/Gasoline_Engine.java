package LSP;

public class Gasoline_Engine implements Engine{

    private boolean isSparkFire = false;
    
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
            
            throw new RuntimeException("No hubo combustion");
        }

        System.out.println("La combustion a explotado a la gasolina");
        return true;
    }

    @Override
    public boolean exaust(){

        System.out.println("Expulsando gases");
        return true;
    }

    public void firing_spark_plug(){
        
        isSparkFire = true;
        System.out.println("Descargando chispa");

    }
}