import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.StringTokenizer;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author lwc626
 */
public class Solution12 {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		MyInputReader in = new MyInputReader(inputStream);
		MyOutputWriter out = new MyOutputWriter(outputStream);
		Insertion_Sort solver = new Insertion_Sort();
		int testCount = Integer.parseInt(in.next());
		for (int i = 1; i <= testCount; i++)
			solver.solve(i, in, out);
		out.close();
	}
}

class Insertion_Sort {
	public void solve(int testNumber, MyInputReader in, MyOutputWriter out) {
        int n = in.nextInt() ;
        int[] A = new int[ n ] ;
        IOUtils.readIntArrays(in, A);
        out.printLine( reverse_pair(out,A, 0 , n-1) );
	}

    private long reverse_pair(MyOutputWriter out,int[] a , int l , int r) {
        if( l == r ) return 0 ;
        int m = ( l + r ) / 2 ;
        long ret = reverse_pair( out,a , l , m ) ;
        ret += reverse_pair( out,a , m+1 , r ) ;

        //out.printLine( l , r );
        //IOUtils.printIntArrays(out , a );
        int [] tmp = new int[ r - l + 1];
        int nl = l , nr = m+1 , n = 0;
        while ( nl <= m && nr <= r ){
            if( a[nl] <= a[nr] ){
                tmp[n++] = a[nl++] ;
                ret += nr - m -1 ;
            }else{
                tmp[n++] = a[nr++] ;
            }
        }
        while ( nl <= m ) { tmp[ n ++ ] = a[ nl ++ ]; ret += nr-m-1;}
        while ( nr <= r ) tmp[ n ++ ] = a[ nr ++ ];
        System.arraycopy( tmp , 0 , a , l, n );
        return ret;
    }
}

class MyInputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public MyInputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
    
    }

class MyOutputWriter {
    private final PrintWriter writer;

    public MyOutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(outputStream);
    }

    public MyOutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

    public void print(Object...objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0)
                writer.print(' ');
            writer.print(objects[i]);
        }
    }

    public void printLine(Object...objects) {
        print(objects);
        writer.println();
    }

    public void close() {
        writer.close();
    }

}

class IOUtils {
    public static void readIntArrays( MyInputReader in,int[]... arrays ){
        for(int i = 0 ; i < arrays[0].length; i++ )
            for( int j = 0 ; j < arrays.length ; j ++ )
                arrays[j][i] = in.nextInt();
    }
    }

public class jhhj {

}
