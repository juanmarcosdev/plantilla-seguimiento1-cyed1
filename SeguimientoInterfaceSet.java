public class SeguimientoInterfaceSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        SeguimientoInterfaceSet operaciones = new SeguimientoInterfaceSet();

        // Set<T> resultadoUnion = operaciones.unir(setA, setB);

        scanner.close();
    }

    public <T> Set<T> unir(Set<T> a, Set<T> b) {
        Set<T> resultado = new HashSet<>(a);
        resultado.addAll(b);
        return resultado;
    }

    public <T> Set<T> intersectar(Set<T> a, Set<T> b) {
        Set<T> resultado = new HashSet<>(a);
        resultado.retainAll(b);
        return resultado;
    }

    public <T> Set<T> diferencia(Set<T> a, Set<T> b) {
        Set<T> resultado = new HashSet<>(a);
        resultado.removeAll(b);
        return resultado;
    }
}
