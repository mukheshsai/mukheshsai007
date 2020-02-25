class Box
{
 float l,b,h;
 float volume()
 {
  float v=l*b*h;
  return v;
 }
void set(float length,float breadth,float height)
{
 l=length;
 b=breadth;
 h=height;
}
}
public class TestBox
{
 public static void main(String ar[])
{
 Box b1=new Box();
 b1.set((float)5.5,(float)33.3,(float)1.0);
 float v=b1.volume();
 System.out.println(v);
}
}