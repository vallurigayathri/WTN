class Box
{
double width;
double height;
double depth;
Box(double w, double h, double d) {
width = w;
height = h;
depth = d;
}
public double volume() {
return width * height * depth;
}
}
class Main {
public static void main(String args[]) {
Box mybox1 = new Box(10, 20, 15);
double vol;
vol = mybox1.volume();
System.out.println("Volume is " + vol);
}
}
