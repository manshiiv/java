public class boxvolume {
    int l;
    int b;
    int h ;
//parameterized consturctor
boxvolume(int l, int b,int h){
    this.l= l;
    this.b= b;
    this.h = h ;
    
}
}
class volume{
    public static void main (String []args){
        boxvolume v= new boxvolume(4,5,6);
        System.out.println("volume of box :" +v.l*v.b*v.h );
    }
}