import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Teclado {

	private static BufferedReader in = new BufferedReader(
			new InputStreamReader(System.in, Charset.forName("ISO-8859-1")));
	private static String charset = "ISO-8859-1";

	public static String readLine() {

		int ch;
		String r = "";
		boolean done = false;
		while (!done) {
			try {
				ch = System.in.read();
				if (ch < 0 || (char) ch == '\n')
					done = true;
				else if ((char) ch != '\r')
					r = r + (char) ch;
			} catch (java.io.IOException e) {
				done = true;
			}
		}
		return r;
	}

	public static int readInt() {

		while (true) {
			try {
				return Integer.valueOf(readLine().trim()).intValue();
			} catch (NumberFormatException e) {
				System.out.println("Erro ao converter para inteiro. Tente novamente!");
			}
		}
	}

	public static float readFloat() {

		while (true) {
			try {
				return Float.valueOf(readLine().trim()).floatValue();
			} catch (NumberFormatException e) {
				System.out.println("Erro ao converter para float. Tente novamente!");
			}
		}
	}

	// métodos adicionais

	public static void setCharset(String charset_) {
		charset = charset_;
		in = new BufferedReader(new InputStreamReader(System.in, Charset.forName(charset)));
	}

	public static void print() {
	}

	public static void print(int x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	public static void print(double x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	public static void print(String x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	public static void print(boolean x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	public static void print(char x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(x);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	// println

	public static void println() {
	}

	public static void println(int x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	public static void println(double x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	public static void println(String x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	public static void println(boolean x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	public static void println(char x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.println(x);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	public static void printf(String formato, double x) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.printf(formato, x);// "%.2f"
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
	}

	// métodos de leitura

	public static double readerDouble() {
		double d = -1;
		try {
			d = Double.parseDouble(readerString().trim().replace(",", "."));
		} catch (Exception e) {
		}
		return d;
	}

	public static double readerDouble(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
		return readerDouble();
	}

	public static float readerFloat() {
		return (float) readerDouble();
	}

	public static float readerFloat(String str) {
		return (float) readerDouble(str);
	}

	public static int readerInt() {
		int i = -1;
		try {
			i = Integer.parseInt(readerString().trim());
		} catch (Exception e) {
		}
		return i;
	}

	public static int readerInt(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
		return readerInt();
	}

	public static String readerString() {
		String s = "";
		char tmp;
		try {
			do {
				tmp = (char) in.read();
				if (tmp != '\n' && tmp != ' ' && tmp != 13) {
					s += tmp;
				}
			} while (tmp != '\n' && tmp != ' ');
		} catch (IOException ioe) {
			System.out.println("lerPalavra: " + ioe.getMessage());
		}
		return s;
	}

	public static String readerString(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
		return readerString();
	}

	public static String readerLine() {
		String s = "";
		char tmp;
		try {
			do {
				tmp = (char) in.read();
				if (tmp != '\n' && tmp != 13) {
					s += tmp;
				}
			} while (tmp != '\n');
		} catch (IOException ioe) {
			System.out.println("lerPalavra: " + ioe.getMessage());
		}
		return s;
	}

	public static String readerLine(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
		return readLine();
	}

	public static char readerChar() {
		char resp = ' ';
		try {
			resp = (char) in.read();
		} catch (Exception e) {
		}
		return resp;
	}

	public static char readerChar(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
		return readerChar();
	}

	public static boolean readerBoolean() {
		boolean resp = false;
		String str = "";

		try {
			str = readerString();
		} catch (Exception e) {
		}

		if (str.equals("true") || str.equals("TRUE") || str.equals("t") || str.equals("1") || str.equals("verdadeiro")
				|| str.equals("VERDADEIRO") || str.equals("V")) {
			resp = true;
		}

		return resp;
	}

	public static boolean readerBoolean(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
		return readerBoolean();
	}

	public static void pause() {
		try {
			in.read();
		} catch (Exception e) {
		}
	}

	public static void pause(String str) {
		try {
			PrintStream out = new PrintStream(System.out, true, charset);
			out.print(str);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Erro: charset invalido");
		}
		pause();
	}
}