public class PRG02_T03_Ejerc10 {
    public static void main(String[] args){
        float x=4.5f;
        float y=3.0f;
        int i=2;
        int j=(int)(i*x);
        System.out.println("Producto de int por float: j= i*x = "+j);
        double dx=2.0;
        double dz=dx * y;
        System.out.println("Producto de float por double: dz=dx * y = "+dz);
        byte bx=5;
        byte by=2;
        byte bz= (byte) (bx-by);
        System.out.println("byte: "+bx+" - "+by+" = "+bz);
        bx=(byte)-128;
        by=(byte)1;
        bz= (byte) (bx-by);
        System.out.println("byte: "+bx+" - "+by+" = "+bz);
        int bzz=(int)(bx-by);
        System.out.println("byte: "+bx+" - "+by+" = "+bzz);
        short sx=5;
        short sy=2;
        short sz= (short) (sx-sy);
        System.out.println("short: "+sx+" - "+sy+" = "+sz);
        sx=32767;
        sy = 1;
        short szz = (short) (sx + sy);
        System.out.println("short: "+sx+" - "+sy+" = "+szz);
        char cx='\u000F';
        char cy='\u0001';
        int cz=cx-cy;
        System.out.println("char: "+cx+" - "+cy+" = "+cz);
        int z=cx-1;
        System.out.println("char: "+cx+" - "+cy+" = "+z);
        char cxx='\uFFFF';
        System.out.println((int)cxx);
        int zz=cxx;
        System.out.println((short)zz);
        /*short sxx=cxx;
        System.out.println(zz);*/
    }
}