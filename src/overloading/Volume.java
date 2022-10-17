package overloading;

public class Volume {
    public void getVolume(int l) {
        double cube = Math.pow(l, 3);
        System.out.println("The volume of the cube is " + cube);
    }

    public void getVolume(int l, int b, int w) {
        int cuboid = l * b * w;
        System.out.println("The volume of the cuboid is " + cuboid);
    }

    public void getVolume(int r, int h) {
        double cylinder = Math.PI * Math.pow(r, 2) * h;
        System.out.println("The volume of the cylinder is " + Math.round(cylinder));
    }

    public static void main(String[] args) {
        Volume shape = new Volume();
        shape.getVolume(2);
        shape.getVolume(2, 3);
        shape.getVolume(2, 3, 4);
    }

}
