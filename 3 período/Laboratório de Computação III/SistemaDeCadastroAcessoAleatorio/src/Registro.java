import java.io.IOException;

public interface Registro extends Comparable, Cloneable{

    void setCodigo(int codigo);
    int getCodigo();
    String getString(); //retorna um campo string qualquer (nome, título, descricao, etc)

    byte[] getByteArray() throws IOException;
    void setByteArray(byte[] b) throws IOException;

    int compareTo(Object b);
    Object clone() throws CloneNotSupportedException;
}
