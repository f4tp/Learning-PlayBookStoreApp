// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Quad/Documents/Play Projects/BookStoreApp/conf/routes
// @DATE:Sun Apr 22 11:04:13 BST 2018


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
