// @GENERATOR:play-routes-compiler
// @SOURCE:D:/My Documents/Play Projects/BookStoreApp/conf/routes
// @DATE:Sun Apr 29 11:31:39 BST 2018


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
