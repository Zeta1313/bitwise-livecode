public class Practice {
    public static void main(String[] args) {
        int color = 0xc42460;
        int mask = 0x0000ff;

        int blue = color & mask;

        System.out.println(Integer.toHexString(blue));

        int mask2 = 0x00ff00;
        int green = (color & mask2) >> 0;

        System.out.println(Integer.toHexString(green));
        
        //int x = 0b1010;
        //int p = 0b1010;

        //int q = x & p;

        //System.out.println (Integer.toBinaryString(q));
        //int y = 0xcf4e;
        //int z = 94;

        //System.out.println(Integer.toHexString(z));
        //System.out.println(Integer.toBinaryString(z));
    }
}