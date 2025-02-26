package ud5.clasesejercicios.E0825;

public class Punto3D extends Punto {
    int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }


    
    double distancia(Punto3D otroPunto) {
//        Punto3D punto3d = (Punto3D) otroPunto ;
        double parentesisX = Math.pow((this.x - otroPunto.x), 2);
        double parentesisY = Math.pow((this.y - otroPunto.y), 2);
        double parentesisZ = Math.pow((this.z - otroPunto.z), 2);

        return Math.sqrt(parentesisX + parentesisY + parentesisZ);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto3D other = (Punto3D) obj;
        if (z != other.z)
            return false;
        return true;
    }





    

}
