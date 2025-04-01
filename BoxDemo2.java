class Box{
 double width;
 double height;
 double depth;
 void volume(){
 System.out.print("volume is");
 System.out.println(width*heght*depth");
}
}

class BoxDemo2{
 public static void main(string args[]){
 Box mybox1 = new box();
 Box mybox2 = new box();

 mybox1.width = 10;
 mybox1.height = 20;
 mybox1.depth = 15;

 mybox2.width = 3;
 mybox2.height = 6;
 mybox2.depth = 9;
 

 mybox1.volume();
 mybox2.volume();
}
}