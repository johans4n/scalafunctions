package co.s4n.tallers4n

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FuncioneSpec extends AnyFlatSpec with Matchers {

  "El área de un triángulo rectángulo de lados 0 0 " should " 0 " in {
    Funciones.areaTrianguloRectangulo(0, 0) shouldEqual 0
  }

  "El área de un triángulo rectángulo de lados 2 2 " should " 2 " in {
    Funciones.areaTrianguloRectangulo(2, 2) shouldEqual 2
  }

  "El área de un triángulo rectángulo de lados -2 2 " should " 2 " in {
    Funciones.areaTrianguloRectangulo(-2, 2) shouldEqual 2
  }

  "El área de un circulo de radio 1 " should " Pi " in {
    Funciones.areaDeUnCirculo(1) shouldEqual Math.PI
  }

  "El área de un circulo de radio 0 " should " 0 " in {
    Funciones.areaDeUnCirculo(0) shouldEqual 0
  }

  "El área de un circulo de radio -1 " should " 1 " in {
    Funciones.areaDeUnCirculo(0) shouldEqual 0
  }

  "El factorial de 2 " should " 2 " in {
    Funciones.factorial(2) shouldEqual 2
  }

  "El factorial de 5 " should " 120 " in {
    Funciones.factorial(5) shouldEqual 120
  }

  "El fibonacci de 2" should " 1 " in {
    Funciones.func(2) shouldEqual 1
  }

  "El fibonacci de 3 " should " 2 " in {
    Funciones.func(3) shouldEqual 2
  }

  "El fibonacci de 9 " should " 34 " in {
    Funciones.func(9) shouldEqual 34
  }

  "La función factorial(2) recursiva de cola" should " 2 " in {
    Funciones.factorialTailrec(2) shouldEqual 2
  }

  "La función factorial(7) recursiva de cola" should " 5040 " in {
    Funciones.factorialTailrec(7) shouldEqual 5040
  }

  "La función calSalario(100000,50000) " should " 50000" in {
    Funciones.calSalario(100000, 50000) shouldEqual 50000
  }

  "La función genCalSalario5(200000,20000) " should " 190000" in {
    Funciones.calSalario5(200000, 20000) shouldEqual 190000
  }

  "La función genCalSalario5(230000, 10000) " should " 231500" in {
    Funciones.calSalario5(230000, 10000) shouldEqual 231500
  }

  "La función genCalSalario20(1300000, 20000) " should " 1540000" in {
    Funciones.calCalario20(1300000, 20000) shouldEqual 1540000
  }

  "La función genCalSalario20(440000, 75000) " should " 453000" in {
    Funciones.calCalario20(440000, 75000) shouldEqual 453000
  }

  "La función calSalarioBonoClausura(230000,74000) " should " 167500" in {
    Funciones.calSalarioBonoClausura(230000, 74000) shouldEqual 167500
  }

  "La función calSalarioBonoClausura(140000,24000) " should " 123000" in {
    Funciones.calSalarioBonoClausura(140000, 24000) shouldEqual 123000
  }

}
