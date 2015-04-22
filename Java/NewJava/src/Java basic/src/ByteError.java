
public class ByteError {
	public static void main (String args[]){
		char h[]={
				'0','1','2','3','4','5','6','7',
				'8','9','a','b','c','d','e','f'
		};
		byte b=(byte)0xf1;
		byte c=(byte)(b>>4);
		byte d=(byte)(b>>>4);
		byte e =(byte)((b&0xff)>>4);
		System.out.println("       b=0x"+h[(b>>4)&0x0f1+h[b&0x0f]]);
		System.out.println("     b>>4=0x"+h[(c>>4)&0x0f]+h[c&0x0f]);
		System.out.println("     b>>>4=0x"+h[(d>>4)&0x0f]+h[d&0x0f]);
		System.out.println("   (b&0xff)>>4=0x"+h[(e>>4)&0x0f]+h[e&0x0f]);
		
	}


}
