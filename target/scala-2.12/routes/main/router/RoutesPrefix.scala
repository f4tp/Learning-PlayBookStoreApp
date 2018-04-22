// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Quad/Documents/Play Projects/play-java-starter-example/conf/routes
// @DATE:Sat Apr 21 13:36:14 BST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
