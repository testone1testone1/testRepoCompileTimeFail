import org.scalatest.flatspec.AnyFlatSpec

class ExampleTest extends AnyFlatSpec {
  "Method returnOne" should "return 1" in {
    assert(Example.returnOne() == 1)
  }
}
