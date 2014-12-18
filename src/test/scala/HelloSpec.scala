import org.specs2._
import org.specs2.runner._
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class HelloSpec extends Specification { def is = s2"""

  Hello should be specified
   Hello does ... $hello

"""

  def hello = pending    

}
