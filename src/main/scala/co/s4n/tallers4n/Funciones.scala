package co.s4n.tallers4n

import scala.annotation.tailrec

object Funciones {
  /**
   * Ejercicio 1 Defina una función literal llamada areaTrianguloRectangulo
   * que se encargue de calcular el área de un triángulo rectángulo. Recibe los dos
   * lados rectos.
   *
   * @param a lado 'a' del triangulo
   * @param b lado 'b' del triangulo
   */
  val areaTrianguloRectangulo = (a: Int, b: Int) => math.abs((a * b) / 2)

  /**
   * Ejercicio 2. . Defina una función literal con un tipo basado funciones valoresa
   * llamada areaDeUnCirculo.
   *
   */
  val areaDeUnCirculo = new Function1[Double, Double] {
    def apply(r: Double) = math.Pi * r * r
  }

  /**
   * Ejercicio 3. Defina una función literal llamada calSalario que reciba dos
   * parámetros de tipo Double (devengado y deducciones) y que retorna el valor
   * clásico del salario de una persona:
   *
   * @param deven salario devengado
   * @param deduc deducciones
   */
  val calSalario = (deven: Double, deduc: Double) => deven - deduc

  /**
   * Ejericio 4. Defina una función literal llamada calSalarioBono que reciba
   * dos parámetros de tipo Double (devengado y deducciones) y calcule el salario
   * con el siguiente valor.
   *
   * @param deven salario devengado
   * @param deduc deducciones
   */
  val calSalarioBono = (deven: Double, deduc: Double) => calSalario(deven * 1.10, deduc)

  /**
   * Ejercicio 5. Defina una función llamada compSalario que recibe tres parámet-
   * ros: el primero una función de tipo (Double,Double)=>Double y las otras dos
   * son: devengado y deducciones. Prueba esta función pasado las dos funciones
   * anteriores calSalario y calSalarioBono.
   *
   * @param deven salario devengado
   * @param deduc deducciones
   */
  def compSalario(f: (Double, Double) => Double, deven: Double, deduc: Double): Double = f(deven, deduc)

  /**
   * Ejercicio 6. Defina una función llamada genCalSalarioBono esta función se
   * encarga de generar funciones que computan diferente bonos.
   *
   * @param bono Es una variable la cual se le termina aplicando al salario devengado
   */
  def genCalSalarioBono(bono: Double): (Double, Double) => Double = (deven: Double, dedu: Double) => (deven + (deven * bono)) - dedu

  /**
   * Ejercicio 7. Utilizando la función generadora de funciones genCalSalarioBono
   * cree la función literal calSalario5 que da un bono del 5 %.
   */
  val calSalario5 = genCalSalarioBono(0.05)

  /**
   * Ejercicio 8. Utilizando la función generadora de funciones genCalSalarioBono
   * cree la función literal calCalario20 que da un bono del 20 %.
   */
  val calCalario20 = genCalSalarioBono(0.2)

  /**
   * Ejercicio 9. Declare una función calSalarioBonoClausura que reciba dos
   * parámetros (devengados y deducciones) y que aplique la siguiente fórmula:
   * devengado × bono − deducciones
   * Donde bono es una valor declarado externamente (Una clausura).
   *
   * @param deven salario devengado
   * @param deduc deducciones
   */
  val bono = 0.05

  def calSalarioBonoClausura(deven: Double, dedu: Double): Double = (deven + (deven * bono)) - dedu

  /**
   * Ejercicio 10. Utilizando la función compSalario aplique la función utilizando
   * como primer parámetro calSalarioBonoClausura y calculado varios salarios
   * diferentes.
   *
   * @param calSalarioBonoClausura Es una función la cual aplicará la tranformación a deven y a dedu
   * @param deven                  salario devengado
   * @param deduc                  deducciones
   */
  val deven = 10000
  val dedu = 2000
  compSalario(calSalarioBonoClausura, deven, dedu)

  /**
   * Ejercicio 11. Utilizando la función genCalSalarioBono cree una función lit-
   * eral calCalario15 que se obtiene a través de la aplicación parcial de genCalSalarioBono
   * con un valor 0,15
   */
  val calCalario15 = genCalSalarioBono(0.15)(_, _)

  /**
   * Ejercicio 12. Utilizando la función genCalSalarioBono cree una función lit-
   * eral calCalario100 que se obtiene a través de la aplicación parcial de genCalSalarioBono
   * con un valor 2,00.
   */
  val calCalario100 = genCalSalarioBono(2.00)(_, _)

  /**
   * Ejercicio 15. Implementar la función de factorial utilizando recursividad Scala.
   *
   * @param n el número al cual le deseamos sacar el factorial
   */
  def factorial(n: Int): Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case _ => n * factorial(n - 1)
    }
  }

  /**
   * Ejercicio 16.
   * Esta función realiza la obtención de un número en la serie de fibonacci
   *
   * @param n Corresponde a la posición dentro de la serie
   */
  def func(n: Int): Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case _ => func(n - 1) + func(n - 2)
    }
  }

  /**
   * Ejercicio 17. Reescriba la función de factorial para que se ejecute bajo recur-
   * sividad de cola.
   *
   * @param n n es el número al cual le sacaremos el factorial
   */

  def factorialTailrec(n: Int): Int = {
    def factor(n: Int, acum: Int): Int = {
      if (n == 0) acum
      else factor(n - 1, n * acum)
    }

    factor(n, 1)
  }

}
