package proyectos;

public class ProyectoCaja {

    //atributos:
    int width;
    int height;
    int deep;

    //constructores:
    public ProyectoCaja() {

    }

    public ProyectoCaja(int width, int height, int deep) {
        this.width = width;
        this.height = height;
        this.deep = deep;
    }

    //metodos:
    public int volumenCaja(int width, int height, int deep) {
        int volumeBox = width * height * deep;
        System.out.println("volumeBox = " + volumeBox);
        return volumeBox;
    }
}
