import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("Jureg");

    Shrek c;
    c = new Shrek();
    c.get_cebola();
    c.get_camada();
    c.soma();
    Shrek jureg;
    jureg = new Shrek();
    jureg.set_cebola();
    jureg.set_camada();
    jureg.soma();
  }
}

/*
 * A classe deve conter atributos de pelo menos 2 tipos diferentes (algumas
 * possibilidades: String, int, double, boolean, etc.). A classe deve conter um
 * construtor (pode haver mais de um, com diferentes argumentos). A classe deve
 * conter métodos com prefixo get e set, respectivamente para obter e alterar
 * cada atributo. A classe deve conter um método que implemente alguma operação
 * com um ou mais atributos (por exemplo, um teste de condição, um cálculo, uma
 * operação com strings, etc.).
 */
