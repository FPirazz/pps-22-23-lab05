package u05lab.ex1

import org.junit.Test

class ListTest {

  import u05lab.ex1.List.*
  val testList = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil()

  /** todo */
  @Test
  def testZipRight(): Unit = {}

  @Test
  def testPartition(): Unit =
    println(testList.partition(_ > 2))


}
