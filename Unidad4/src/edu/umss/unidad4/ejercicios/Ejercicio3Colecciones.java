package edu.umss.unidad4.ejercicios;

import java.util.*;

public class Ejercicio3Colecciones {
    public static void main(String[] args) {
        // ArrayList
        /*System.out.println("======= Ejemplos de ArrayList ========");
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Hola mundo");
        arrayList1.add(10);
        arrayList1.add(13.5);

        arrayList1.remove("Hola mundo");

        for (Object elemento : arrayList1) {
            System.out.println(elemento);
        }

        System.out.println("El primer elemento es " + arrayList1.get(0));
        System.out.println("El tamaño es " + arrayList1.size());

        System.out.println("ArrayList genérico");
        // Colecciones genéricas
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Uno");
        cadenas.add("Dos");
        cadenas.add("Tres");

        for (String cadena : cadenas) {
            System.out.println(cadena);
        }

        // Ejercicio:
        // Crear un ArrayList<String> que almacene 5 nombres de personas
        // Mostrar los nombres en pantalla
        // e introducirlos a través de la consola
        // 8:20

        /*ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduzca un nombre");
            nombres.add(scanner.next());
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }*/

        /*System.out.println("======== Pilas =========");
        Stack<String> pilaElementos = new Stack<>();
        pilaElementos.push("Uno");
        pilaElementos.push("Dos");
        pilaElementos.push("Tres");

        System.out.println(pilaElementos.get(0));

        System.out.println("El primer elemento en la pila es " + pilaElementos.pop());
        System.out.println("El segundo elemento en la pila es " + pilaElementos.pop());
        System.out.println("El tercer elemento en la pila es " + pilaElementos.pop());

        System.out.println("===== Sets ========");
        System.out.println("HashSet");
        HashSet<String> strings = new HashSet<>();
        strings.add("Uno");
        strings.add("Dos");
        strings.add("Uno");
        strings.add("Tres");

        for (String elemento : strings) {
            System.out.println(elemento);
        }

        System.out.println();
        System.out.println("TreeSet");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Uno");
        treeSet.add("Dos");
        treeSet.add("Dos");
        treeSet.add("Tres");

        for (String elemento : treeSet) {
            System.out.println(elemento);
        }

        System.out.println("El tamaño del set es " + treeSet.size());*/

        System.out.println("===== HashMap =======");
        System.out.println();

        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Lunes", 1);
        hashMap1.put("Martes", 2);
        hashMap1.put("Miercoles", 3);
        hashMap1.put("Jueves", 4);
        hashMap1.put("Viernes", 5);
        hashMap1.put("Sabado", null);

        String llave = "Miercoles";
        System.out.println("La llave es " + llave + " y el valor es " + hashMap1.get(llave));
        System.out.println("La llave es Jueves y el valor es " + hashMap1.get("Jueves"));
        System.out.println("La llave es Sabado y el valor es " + hashMap1.get("Sabado"));

        for (Map.Entry<String, Integer> elemento : hashMap1.entrySet()) {
            System.out.println("Llave: " + elemento.getKey() + " valor: " + elemento.getValue());
        }

        System.out.println("===== Hashtable =======");
        System.out.println();

        Hashtable<String, String> personas = new Hashtable<>();
        personas.put("12345", "Juan Perez");
        personas.put("01020", "Marco Gomez");
        personas.put("19121", "Martha Lopez");
        //personas.put("11223", null);  No es valido

        System.out.println(personas.get("12345"));

        for (Map.Entry<String, String> elemento : personas.entrySet()) {
            System.out.println("Llave: " + elemento.getKey() + " valor: " + elemento.getValue());
        }
    }
}
