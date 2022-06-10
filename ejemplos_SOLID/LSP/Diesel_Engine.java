public class Diesel_Engine implements Engine{
    
    @Override
    public boolean intake(){

        System.out.println("Dispersando disel en piston");
        return true;
    }

    @Override
    public boolean compresion(){

        System.out.println("Comprimiendo disel");
        return true;
    }

    @Override
    public boolean power(){

        System.out.println("La precion ha explotado al disel");
        return true;
    }

    @Override
    public boolean exaust(){

        System.out.println("Expulsando gases");
        return true;
    }
}


