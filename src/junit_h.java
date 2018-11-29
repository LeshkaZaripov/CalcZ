

import junit.framework.TestCase;

/**
* Импортируем все классы из пакета для проверки тестовой логики,
* проверки результатов расчета
*/

import static org.junit.Assert.*;

/**
 * Импортируем все классы из пакета проведения для тестирования
 */

import org.junit.*;

/**
* Создаем класс для тестирования расчета
* коммунальных услуг
*/

public class junit_h extends TestCase {

	public Calculations Calculations;

	/**
	* Инициализируем экземпляр класса для тестирования
	*/

  /**
  * Аннотация, указывающая на метод, который будет выполняться перед каждым
  * запуском теста
  */

  @Before

  /**
  * Создаем метод, который будет выполняться перед каждым запуском теста;
  * в нем устанавливаем входные параметры для тестирования.
  */
   public void testinit() {
  /**
  */
  }
/**
  * Аннотация, указывающая на то, что за ней следует тестируемый метод.
  */

  @Test

  /**
  * Объявляем метод, который будем тестировать, а именно
  * расчет стоимости коммунальных услуг.
  */

  public void test() {
  /**
   * * Присваиваем вводным данным значения

  */
	  double Cold_Water = 2;
	  double Electricity = 2;
	  double Gas_House =2;


	  /**
	  * Присваиваем переменной значение 10037.94
	  * (верный/ожидаемый результат расчета коммунальных услуг = 10037.94.)
	  */

  double summary_expected = 10037.94;
  /**

* Присваиваем переменной значени
* реально получившийся результат в ходе прохождения теста
*/

  double summary_actual = Calculations.getPrice_House(Cold_Water, Gas_House, Electricity);

  /**
  * Сравниваем значения верного (ожидаемого) результата
  * и реально получившегося результата;
  * если результаты равны, тест проходит успешно.
  */



  assertEquals(summary_expected,summary_actual);
  }

  /**
   * Аннотация, указывающая на метод, который будет выполняться после каждого
   * прохождения теста.
   */

  @After
  /**
  * Создаем метод, который будет выполняться после каждого прохождения теста
  */

  public void teststop(){
  /**
  */

	  /**
	  * Обнуляем переменную после завершения теста
	  */

Calculations = null;
  }
}
