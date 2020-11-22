package pkg.owner.interveiw;

public class PreFiXPostFix {
	public static void main(String args[]){
	
	int i=10, j;
	j=++i;
	System.out.println("i="+i+"	"+"j= "+j);
	int k=5, l;
	l=--k;
	System.out.println("k="+k+"	"+"l= "+l);
	
	int m=10, n=0;
	System.out.println("Before m="+m+"	"+"n= "+n);
	n=m++;
	System.out.println("m="+m+"	"+"n= "+n);
	int o=5, p=0;
	System.out.println("Before p="+p+"	"+"o= "+o);
	p=o--;
	System.out.println("p="+p+"	"+"o= "+o);
	
	}

}
